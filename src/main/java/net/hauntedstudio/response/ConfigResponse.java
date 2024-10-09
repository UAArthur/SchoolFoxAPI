package net.hauntedstudio.response;

public class ConfigResponse {
    private String version;
    private String applicationType;
    private String applicationTypeShort;
    private String baseURL;
    private boolean hideDontHaveInvitationCode;
    private String apmURL;
    private String environment;
    private boolean bipSsoEnabled;
    private boolean univentionSsoEnabled;
    private boolean untisSsoEnabled;

    //Getters
    public String getVersion() {
        return version;
    }

    public String getApplicationType() {
        return applicationType;
    }

    public String getApplicationTypeShort() {
        return applicationTypeShort;
    }

    public String getBaseURL() {
        return baseURL;
    }

    public boolean isHideDontHaveInvitationCode() {
        return hideDontHaveInvitationCode;
    }

    public String getApmURL() {
        return apmURL;
    }

    public String getEnvironment() {
        return environment;
    }

    public boolean isBipSsoEnabled() {
        return bipSsoEnabled;
    }

    public boolean isUniventionSsoEnabled() {
        return univentionSsoEnabled;
    }

    public boolean isUntisSsoEnabled() {
        return untisSsoEnabled;
    }

    //Setters
    public void setVersion(String version) {
        this.version = version;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    public void setApplicationTypeShort(String applicationTypeShort) {
        this.applicationTypeShort = applicationTypeShort;
    }

    public void setBaseURL(String baseURL) {
        this.baseURL = baseURL;
    }

    public void setHideDontHaveInvitationCode(boolean hideDontHaveInvitationCode) {
        this.hideDontHaveInvitationCode = hideDontHaveInvitationCode;
    }

    public void setApmURL(String apmURL) {
        this.apmURL = apmURL;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public void setBipSsoEnabled(boolean bipSsoEnabled) {
        this.bipSsoEnabled = bipSsoEnabled;
    }

    public void setUniventionSsoEnabled(boolean univentionSsoEnabled) {
        this.univentionSsoEnabled = univentionSsoEnabled;
    }

    public void setUntisSsoEnabled(boolean untisSsoEnabled) {
        this.untisSsoEnabled = untisSsoEnabled;
    }

}
