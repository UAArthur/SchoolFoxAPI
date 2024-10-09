package net.hauntedstudio;

import net.hauntedstudio.response.ConfigResponse;
import net.hauntedstudio.response.auth.schoolfox.*;
import net.hauntedstudio.response.auth.untis.UntisSchool;
import net.hauntedstudio.response.auth.untis.UntisSchoolResponse;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SchoolFox {
    private final ConfigResponse config;
    private static SchoolFox instance = null;

    public SchoolFox() {
        instance = this;
        this.config = this.getSchoolfoxConfig();
    }


    public UserResponse login(String username, String password) {
        return SchoolFoxAuthentication.login(username, password);
    }

    // Gets the SchoolFox configuration
    public ConfigResponse getSchoolfoxConfig() {
        JSONObject response = (JSONObject) SchoolFoxRequestManager.getRequest("https://my.schoolfox.app", "/config.json", null);

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

    public static UntisSchoolResponse searchSchools(String query) {
        // Use the universal request method
        Object response = SchoolFoxRequestManager.getRequest("https://api.schoolfox.com", "/api/Schools/Untis/Find", "name=" + query);

        List<UntisSchool> schools = new ArrayList<>();
        if (response instanceof JSONArray) {
            JSONArray responseArray = (JSONArray) response;
            for (int i = 0; i < responseArray.length(); i++) {
                JSONObject schoolJson = responseArray.getJSONObject(i);
                UntisSchool schoolItem = new UntisSchool();
                schoolItem.tenantId = schoolJson.getInt("tenantId");
                schoolItem.untisName = schoolJson.getString("untisName");
                schoolItem.name = schoolJson.getString("name");
                schoolItem.address = schoolJson.getString("address");
                schoolItem.postCode = schoolJson.getString("postCode");
                schoolItem.city = schoolJson.getString("city");
                schoolItem.country = schoolJson.getString("country");

                schools.add(schoolItem);
            }
        } else {
            throw new RuntimeException("Unexpected response type.");
        }

        return new UntisSchoolResponse(schools);
    }

    public ConfigResponse getConfig() {
        return this.config;
    }
    public static SchoolFox getInstance() {
        return instance;
    }
}
