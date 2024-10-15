package net.hauntedstudio.response.auth.schoolfox;

import org.json.JSONObject;

public class User {
    private String relatedActorId;
    private String applicationType;
    private boolean hasQuietTime;
    private String lastLogin;
    private String email;
    private String title;
    private String firstName;
    private String lastName;
    private String phoneNumber1Country;
    private String phoneNumber1;
    private String phoneNumber2Country;
    private String phoneNumber2;
    private String actorType;
    private String actorTypeString;
    private String languageCode;
    private String appLanguageCode;
    private boolean emailNotificationsEnabled;
    private boolean termsAndPrivacyAccepted;
    private boolean multipleRolesEnabled;
    private String applicationRating;
    private String askForRatingOnDate;
    private String ratingComment;
    private String quietHoursFromUtc;
    private String quietHoursToUtc;
    private boolean quietOnWeekends;
    private boolean isDemoAccount;
    private boolean hasExternalProfile;
    private boolean openForParentsDiscussions;
    private String twoFactorAuthStatus;
    private boolean twoFactorAuthActive;
    private boolean isRegistrationCompleted;
    private String id;
    private String createdAt;
    private String createdBy;
    private String updatedAt;
    private String updatedBy;
    private boolean deleted;
    private String version;
    private boolean isActive;

    public User(JSONObject json) {
        this.relatedActorId = json.getString("relatedActorId");
        this.applicationType = json.getString("applicationType");
        this.hasQuietTime = json.getBoolean("hasQuietTime");
        this.lastLogin = json.getString("lastLogin");
        this.email = json.getString("email");
        //Why tf was this removed?
//        this.title = json.getString("title");
        this.firstName = json.getString("firstName");
        this.lastName = json.getString("lastName");
        this.phoneNumber1Country = json.optString("phoneNumber1Country", null);
        this.phoneNumber1 = json.optString("phoneNumber1", null);
        this.phoneNumber2Country = json.optString("phoneNumber2Country", null);
        this.phoneNumber2 = json.optString("phoneNumber2", null);
        this.actorType = json.getString("actorType");
        this.actorTypeString = json.getString("actorTypeString");
        this.languageCode = json.getString("languageCode");
        this.appLanguageCode = json.getString("appLanguageCode");
        this.emailNotificationsEnabled = json.getBoolean("emailNotificationsEnabled");
        this.termsAndPrivacyAccepted = json.getBoolean("termsAndPrivacyAccepted");
        this.multipleRolesEnabled = json.getBoolean("multipleRolesEnabled");
        this.applicationRating = json.getString("applicationRating");
        this.askForRatingOnDate = json.getString("askForRatingOnDate");
        this.ratingComment = json.optString("ratingComment", null);
        this.quietHoursFromUtc = json.optString("quietHoursFromUtc", null);
        this.quietHoursToUtc = json.optString("quietHoursToUtc", null);
        this.quietOnWeekends = json.getBoolean("quietOnWeekends");
        this.isDemoAccount = json.getBoolean("isDemoAccount");
        this.hasExternalProfile = json.getBoolean("hasExternalProfile");
        this.openForParentsDiscussions = json.getBoolean("openForParentsDiscussions");
        this.twoFactorAuthStatus = json.getString("twoFactorAuthStatus");
        this.twoFactorAuthActive = json.getBoolean("twoFactorAuthActive");
        this.isRegistrationCompleted = json.getBoolean("isRegistrationCompleted");
        this.id = json.getString("id");
        this.createdAt = json.getString("createdAt");
        this.createdBy = json.getString("createdBy");
        this.updatedAt = json.getString("updatedAt");
        this.updatedBy = json.getString("updatedBy");
        this.deleted = json.getBoolean("deleted");
        this.version = json.getString("version");
        this.isActive = json.getBoolean("isActive");
    }

}