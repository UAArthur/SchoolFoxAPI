package net.hauntedstudio.response.tables;

import java.util.Date;

//
public class Conversation {
    private String topic;
    private String notes;
    private String lastMessagePreview;
    private Date lastMessageDate;
    private String creatorFirstName;
    private String creatorLastName;
    private boolean isClosed;
    private String organizationId;
    private int numberOfParticipants;
    private int numberOfAttachments;
    private boolean isReadOnlyForMembers;
    private String conversationUserRole;
    private boolean isOrganizationPowerUser;
    private boolean muteConversation;
    private String lastReadMessageId;
    private boolean hasUnreadMessages;
    private boolean hasUserGroups;
    private int numberOfUserGroups;
    private boolean pinned;
    private String id;
    private Date createdAt;
    private String createdBy;
    private Date updatedAt;
    private String updatedBy;
    private boolean deleted;
    private String version;
    private boolean isActive;

    // Getters and Setters
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getLastMessagePreview() {
        return lastMessagePreview;
    }

    public void setLastMessagePreview(String lastMessagePreview) {
        this.lastMessagePreview = lastMessagePreview;
    }

    public Date getLastMessageDate() {
        return lastMessageDate;
    }

    public void setLastMessageDate(Date lastMessageDate) {
        this.lastMessageDate = lastMessageDate;
    }

    public String getCreatorFirstName() {
        return creatorFirstName;
    }

    public void setCreatorFirstName(String creatorFirstName) {
        this.creatorFirstName = creatorFirstName;
    }

    public String getCreatorLastName() {
        return creatorLastName;
    }

    public void setCreatorLastName(String creatorLastName) {
        this.creatorLastName = creatorLastName;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    public int getNumberOfAttachments() {
        return numberOfAttachments;
    }

    public void setNumberOfAttachments(int numberOfAttachments) {
        this.numberOfAttachments = numberOfAttachments;
    }

    public boolean isReadOnlyForMembers() {
        return isReadOnlyForMembers;
    }

    public void setReadOnlyForMembers(boolean readOnlyForMembers) {
        isReadOnlyForMembers = readOnlyForMembers;
    }

    public String getConversationUserRole() {
        return conversationUserRole;
    }

    public void setConversationUserRole(String conversationUserRole) {
        this.conversationUserRole = conversationUserRole;
    }

    public boolean isOrganizationPowerUser() {
        return isOrganizationPowerUser;
    }

    public void setOrganizationPowerUser(boolean organizationPowerUser) {
        isOrganizationPowerUser = organizationPowerUser;
    }

    public boolean isMuteConversation() {
        return muteConversation;
    }

    public void setMuteConversation(boolean muteConversation) {
        this.muteConversation = muteConversation;
    }

    public String getLastReadMessageId() {
        return lastReadMessageId;
    }

    public void setLastReadMessageId(String lastReadMessageId) {
        this.lastReadMessageId = lastReadMessageId;
    }

    public boolean isHasUnreadMessages() {
        return hasUnreadMessages;
    }

    public void setHasUnreadMessages(boolean hasUnreadMessages) {
        this.hasUnreadMessages = hasUnreadMessages;
    }

    public boolean isHasUserGroups() {
        return hasUserGroups;
    }

    public void setHasUserGroups(boolean hasUserGroups) {
        this.hasUserGroups = hasUserGroups;
    }

    public int getNumberOfUserGroups() {
        return numberOfUserGroups;
    }

    public void setNumberOfUserGroups(int numberOfUserGroups) {
        this.numberOfUserGroups = numberOfUserGroups;
    }

    public boolean isPinned() {
        return pinned;
    }

    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
