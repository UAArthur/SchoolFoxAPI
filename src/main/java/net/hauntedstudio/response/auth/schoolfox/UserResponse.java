package net.hauntedstudio.response.auth.schoolfox;


import net.hauntedstudio.response.tables.Schools;

public class UserResponse {

    private String token;
    private User user;
    private AllTokens allTokens;
    private AllRelatedActorTypeIds allRelatedActorTypeIds;
    private OrganizationMaxRoles organizationMaxRoles;
    private int autoLogoutMinutes;
    private boolean twoFactorAuthPassed;
    private String goStudentTutoringAskOnDate;
    private Schools schools;

    // Getters and Setters

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public AllTokens getAllTokens() {
        return allTokens;
    }

    public void setAllTokens(AllTokens allTokens) {
        this.allTokens = allTokens;
    }

    public AllRelatedActorTypeIds getAllRelatedActorTypeIds() {
        return allRelatedActorTypeIds;
    }

    public void setAllRelatedActorTypeIds(AllRelatedActorTypeIds allRelatedActorTypeIds) {
        this.allRelatedActorTypeIds = allRelatedActorTypeIds;
    }

    public OrganizationMaxRoles getOrganizationMaxRoles() {
        return organizationMaxRoles;
    }

    public void setOrganizationMaxRoles(OrganizationMaxRoles organizationMaxRoles) {
        this.organizationMaxRoles = organizationMaxRoles;
    }

    public int getAutoLogoutMinutes() {
        return autoLogoutMinutes;
    }

    public void setAutoLogoutMinutes(int autoLogoutMinutes) {
        this.autoLogoutMinutes = autoLogoutMinutes;
    }

    public boolean isTwoFactorAuthPassed() {
        return twoFactorAuthPassed;
    }

    public void setTwoFactorAuthPassed(boolean twoFactorAuthPassed) {
        this.twoFactorAuthPassed = twoFactorAuthPassed;
    }

    public String getGoStudentTutoringAskOnDate() {
        return goStudentTutoringAskOnDate;
    }

    public void setGoStudentTutoringAskOnDate(String goStudentTutoringAskOnDate) {
        this.goStudentTutoringAskOnDate = goStudentTutoringAskOnDate;
    }

    public Schools getSchools() {
        return schools;
    }

    public void setSchools(Schools schools) {
        this.schools = schools;
    }
}
