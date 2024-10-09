package net.hauntedstudio.manager;

import net.hauntedstudio.SchoolFoxRequestManager;
import net.hauntedstudio.response.ConfigResponse;
import org.json.JSONObject;

public class ConfigManager {

    // Gets the SchoolFox configuration file
    public ConfigResponse getSchoolfoxConfig() {
        JSONObject response = (JSONObject) SchoolFoxRequestManager.getRequest("https://my.schoolfox.app", "/config.json", null, false);

        ConfigResponse config = new ConfigResponse();
        config.setVersion(response.getString("version"));
        config.setApplicationType(response.getString("applicationType"));
        config.setApplicationTypeShort(response.getString("applicationTypeShort"));
        config.setBaseURL(response.getString("baseURL"));
        config.setHideDontHaveInvitationCode(response.getBoolean("hideDontHaveInvitationCode"));
        config.setApmURL(response.getString("apmURL"));
        config.setEnvironment(response.getString("environment"));
        config.setBipSsoEnabled(response.getBoolean("bipSsoEnabled"));
        config.setUniventionSsoEnabled(response.getBoolean("univentionSsoEnabled"));
        config.setUntisSsoEnabled(response.getBoolean("untisSsoEnabled"));

        return config;
    }
}
