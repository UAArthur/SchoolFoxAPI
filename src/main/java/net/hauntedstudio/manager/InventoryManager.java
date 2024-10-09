package net.hauntedstudio.manager;

import net.hauntedstudio.SchoolFoxRequestManager;
import net.hauntedstudio.response.inventory.InventoryItem;
import net.hauntedstudio.response.inventory.InventoryResponse;
import org.json.JSONArray;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    // All Classes that are bound to the user
    public InventoryResponse getInventory() throws ParseException {
        Object response = SchoolFoxRequestManager.getRequest("api/Common/Inventory", null, true);

        List<InventoryItem> inventory = new ArrayList<>();
        if (response instanceof JSONArray responseArray) {
            for (int i = 0; i < responseArray.length(); i++) {
                JSONObject itemJson = responseArray.getJSONObject(i);
                InventoryItem item = new InventoryItem();

                item.setName(itemJson.optString("name", "Unknown"));
                item.setItemType(itemJson.optString("itemType", "Unknown"));
                item.setApplicationType(itemJson.optString("applicationType", "Unknown"));
                item.setSchoolClassId(itemJson.optString("schoolClassId", ""));
                item.setSchoolClassName(itemJson.optString("schoolClassName", ""));
                item.setSchoolId(itemJson.optString("schoolId", ""));
                item.setSchoolOrganizationType(itemJson.optString("schoolOrganizationType", ""));
                item.setSchoolRegion(itemJson.optString("schoolRegion", ""));
                item.setSchoolYearStart(itemJson.optInt("schoolYearStart", 0));
                item.setSchoolHolder(itemJson.optString("schoolHolder", "")); // Updated to use optString
                item.setPurchasedFeature(itemJson.optString("purchasedFeature", ""));

                String dateStr = itemJson.optString("purchasedUntil", "2099-12-31T23:59:59Z");
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
                item.setPurchasedUntil(sdf.parse(dateStr));

                item.setSpecialLicense(itemJson.optString("specialLicense", ""));
                item.setSchoolTerminated(itemJson.optBoolean("isSchoolTerminated", false));
                item.setHasUnreadNews(itemJson.optBoolean("hasUnreadNews", false));
                item.setHasUnreadMessages(itemJson.optBoolean("hasUnreadMessages", false));
                item.setHasUnreadDiscussions(itemJson.optBoolean("hasUnreadDiscussions", false));
                item.setMigrationPending(itemJson.optBoolean("migrationPending", false));
                item.setSchoolClassPictureId(itemJson.optInt("schoolClassPictureId", 0));
                item.setPrincipalMessagingActivated(itemJson.optBoolean("isPrincipalMessagingActivated", false));
                item.setTeacherRole(itemJson.optString("teacherRole", ""));
                item.setCanCreateClasses(itemJson.optString("canCreateClasses", ""));
                item.setFoxAdmin(itemJson.optBoolean("isFoxAdmin", false));
                item.setSchoolValid(itemJson.optBoolean("isSchoolValid", false));
                item.setConnectedToPrincipal(itemJson.optBoolean("isConnectedToPrincipal", false));
                item.setColorCode(itemJson.optString("colorCode", ""));
                item.setHasTeamClass(itemJson.optBoolean("hasTeamClass", false));
                item.setTeamClass(itemJson.optBoolean("isTeamClass", false));
                item.setTestOrganization(itemJson.optBoolean("isTestOrganization", false));
                item.setOrganizationParticipantsType(itemJson.optString("organizationParticipantsType", ""));
                item.setCreatedBy(itemJson.optString("createdBy", ""));
                item.setUpdatedBy(itemJson.optString("updatedBy", ""));
                item.setActive(itemJson.optBoolean("isActive", true));
                item.setId(itemJson.optString("id", ""));
                item.setVersion(itemJson.optString("version", ""));
                item.setCreatedAt(itemJson.optString("createdAt", ""));
                item.setUpdatedAt(itemJson.optString("updatedAt", ""));
                item.setDeleted(itemJson.optBoolean("deleted", false));

                inventory.add(item); // Add the item to the inventory list
            }
        }

        return new InventoryResponse(inventory);
    }

    // All Classes that are bound to the user and are archived
    public InventoryResponse getArchivedInventory() throws ParseException {
        Object response = SchoolFoxRequestManager.getRequest("api/Common/ArchivedInventory", null, true);

        List<InventoryItem> inventory = new ArrayList<>();
        if (response instanceof JSONArray responseArray) {
            for (int i = 0; i < responseArray.length(); i++) {
                JSONObject itemJson = responseArray.getJSONObject(i);
                InventoryItem item = new InventoryItem();

                item.setName(itemJson.optString("name", "Unknown"));
                item.setItemType(itemJson.optString("itemType", "Unknown"));
                item.setApplicationType(itemJson.optString("applicationType", "Unknown"));
                item.setSchoolClassId(itemJson.optString("schoolClassId", ""));
                item.setSchoolClassName(itemJson.optString("schoolClassName", ""));
                item.setSchoolId(itemJson.optString("schoolId", ""));
                item.setSchoolOrganizationType(itemJson.optString("schoolOrganizationType", ""));
                item.setSchoolRegion(itemJson.optString("schoolRegion", ""));
                item.setSchoolYearStart(itemJson.optInt("schoolYearStart", 0));
                item.setSchoolHolder(itemJson.optString("schoolHolder", "")); // Updated to use optString
                item.setPurchasedFeature(itemJson.optString("purchasedFeature", ""));

                String dateStr = itemJson.optString("purchasedUntil", "2099-12-31T23:59:59Z");
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
                item.setPurchasedUntil(sdf.parse(dateStr));

                item.setSpecialLicense(itemJson.optString("specialLicense", ""));
                item.setSchoolTerminated(itemJson.optBoolean("isSchoolTerminated", false));
                item.setHasUnreadNews(itemJson.optBoolean("hasUnreadNews", false));
                item.setHasUnreadMessages(itemJson.optBoolean("hasUnreadMessages", false));
                item.setHasUnreadDiscussions(itemJson.optBoolean("hasUnreadDiscussions", false));
                item.setMigrationPending(itemJson.optBoolean("migrationPending", false));
                item.setSchoolClassPictureId(itemJson.optInt("schoolClassPictureId", 0));
                item.setPrincipalMessagingActivated(itemJson.optBoolean("isPrincipalMessagingActivated", false));
                item.setTeacherRole(itemJson.optString("teacherRole", ""));
                item.setCanCreateClasses(itemJson.optString("canCreateClasses", ""));
                item.setFoxAdmin(itemJson.optBoolean("isFoxAdmin", false));
                item.setSchoolValid(itemJson.optBoolean("isSchoolValid", false));
                item.setConnectedToPrincipal(itemJson.optBoolean("isConnectedToPrincipal", false));
                item.setColorCode(itemJson.optString("colorCode", ""));
                item.setHasTeamClass(itemJson.optBoolean("hasTeamClass", false));
                item.setTeamClass(itemJson.optBoolean("isTeamClass", false));
                item.setTestOrganization(itemJson.optBoolean("isTestOrganization", false));
                item.setOrganizationParticipantsType(itemJson.optString("organizationParticipantsType", ""));
                item.setCreatedBy(itemJson.optString("createdBy", ""));
                item.setUpdatedBy(itemJson.optString("updatedBy", ""));
                item.setActive(itemJson.optBoolean("isActive", true));
                item.setId(itemJson.optString("id", ""));
                item.setVersion(itemJson.optString("version", ""));
                item.setCreatedAt(itemJson.optString("createdAt", ""));
                item.setUpdatedAt(itemJson.optString("updatedAt", ""));
                item.setDeleted(itemJson.optBoolean("deleted", false));

                inventory.add(item);
            }
        }

        return new InventoryResponse(inventory);
    }
}
