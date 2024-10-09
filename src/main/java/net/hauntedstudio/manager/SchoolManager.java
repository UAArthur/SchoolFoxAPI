package net.hauntedstudio.manager;

import net.hauntedstudio.SchoolFox;
import net.hauntedstudio.SchoolFoxRequestManager;
import net.hauntedstudio.response.tables.School;
import net.hauntedstudio.response.auth.untis.UntisSchool;
import net.hauntedstudio.response.auth.untis.UntisSchoolResponse;
import net.hauntedstudio.response.tables.Schools;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class SchoolManager {


    public Schools getSchoolInformation() {
        List<School> listSchools = new ArrayList<>();
        SchoolFox.getInstance().getUser().getOrganizationMaxRoles().getRoles().keySet().forEach(key -> {
            JSONObject response = (JSONObject) SchoolFoxRequestManager.getRequest("tables/Schools/" + key, null, true);
            School school = new School(response);
            listSchools.add(school);
        });
        SchoolFox.getInstance().getUser().setSchools(new Schools(listSchools));
        return SchoolFox.getInstance().getUser().getSchools();
    }

    public static UntisSchoolResponse searchSchools(String query) {
        Object response = SchoolFoxRequestManager.getRequest("https://api.schoolfox.com/", "api/Schools/Untis/Find", "name=" + query, false);

        List<UntisSchool> schools = new ArrayList<>();
        if (response instanceof JSONArray responseArray) {
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
}
