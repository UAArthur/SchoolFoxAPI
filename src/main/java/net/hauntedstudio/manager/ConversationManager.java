package net.hauntedstudio.manager;

import net.hauntedstudio.SchoolFoxRequestManager;
import net.hauntedstudio.response.tables.Conversation;
import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

public class ConversationManager {

    public List<Conversation> getConversations(String organizationId) {
        String endpoint = "tables/Conversations";
        String params = "$inlinecount=allpages&$top=50&$filter=" + URLEncoder.encode("(Deleted eq false and OrganizationId eq '" + organizationId + "')", StandardCharsets.UTF_8);

        Object response = SchoolFoxRequestManager.getRequest(endpoint, params, true);

        List<Conversation> conversations = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.GERMANY);
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC")); // Set time zone to UTC

        if (response instanceof JSONObject responseObject) {
            JSONArray results = responseObject.getJSONArray("results");
            for (int i = 0; i < results.length(); i++) {
                JSONObject itemJson = results.getJSONObject(i);
                Conversation conversation = new Conversation();

                conversation.setTopic(itemJson.optString("topic", ""));
                conversation.setNotes(itemJson.optString("notes", ""));
                conversation.setLastMessagePreview(itemJson.optString("lastMessagePreview", ""));

                // Parse the lastMessageDate
                try {
                    conversation.setLastMessageDate(dateFormat.parse(itemJson.optString("lastMessageDate")));
                } catch (ParseException e) {
                    throw new RuntimeException("Failed to parse lastMessageDate", e);
                }

                conversation.setCreatorFirstName(itemJson.optString("creatorFirstName", ""));
                conversation.setCreatorLastName(itemJson.optString("creatorLastName", ""));
                conversation.setClosed(itemJson.optBoolean("isClosed", false));
                conversation.setOrganizationId(itemJson.optString("organizationId", ""));
                conversation.setNumberOfParticipants(itemJson.optInt("numberOfParticipants", 0));
                conversation.setNumberOfAttachments(itemJson.optInt("numberOfAttachments", 0));
                conversation.setReadOnlyForMembers(itemJson.optBoolean("isReadOnlyForMembers", false));
                conversation.setConversationUserRole(itemJson.optString("conversationUserRole", ""));
                conversation.setOrganizationPowerUser(itemJson.optBoolean("isOrganizationPowerUser", false));
                conversation.setMuteConversation(itemJson.optBoolean("muteConversation", false));
                conversation.setLastReadMessageId(itemJson.optString("lastReadMessageId", ""));
                conversation.setHasUnreadMessages(itemJson.optBoolean("hasUnreadMessages", false));
                conversation.setHasUserGroups(itemJson.optBoolean("hasUserGroups", false));
                conversation.setNumberOfUserGroups(itemJson.optInt("numberOfUserGroups", 0));
                conversation.setPinned(itemJson.optBoolean("pinned", false));
                conversation.setId(itemJson.optString("id", ""));

                // Parse createdAt
                try {
                    conversation.setCreatedAt(dateFormat.parse(itemJson.optString("createdAt")));
                } catch (ParseException e) {
                    throw new RuntimeException("Failed to parse createdAt", e);
                }

                conversation.setCreatedBy(itemJson.optString("createdBy", ""));

                // Parse updatedAt
                try {
                    conversation.setUpdatedAt(dateFormat.parse(itemJson.optString("updatedAt")));
                } catch (ParseException e) {
                    throw new RuntimeException("Failed to parse updatedAt", e);
                }

                conversation.setUpdatedBy(itemJson.optString("updatedBy", ""));
                conversation.setDeleted(itemJson.optBoolean("deleted", false));
                conversation.setVersion(itemJson.optString("version", ""));
                conversation.setActive(itemJson.optBoolean("isActive", true));

                conversations.add(conversation);
            }
        } else {
            throw new RuntimeException("Unexpected response type: " + response.getClass().getName());
        }

        return conversations;
    }
}
