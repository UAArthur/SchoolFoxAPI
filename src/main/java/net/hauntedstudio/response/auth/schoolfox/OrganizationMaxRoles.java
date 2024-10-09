package net.hauntedstudio.response.auth.schoolfox;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OrganizationMaxRoles {
    private Map<String, String> roles;

    // Constructor that initializes the roles from a JSONObject
    public OrganizationMaxRoles(JSONObject json) {
        roles = new HashMap<>();

        // Iterate through the keys in the JSON object
        Iterator<String> keys = json.keys();
        while (keys.hasNext()) {
            String organizationId = keys.next();
            String role = json.getString(organizationId);
            roles.put(organizationId, role);
        }
    }

    // Getter for roles
    public Map<String, String> getRoles() {
        return roles;
    }

    // Method to get a specific role by organization ID
    public String getRoleByOrganizationId(String organizationId) {
        return roles.get(organizationId);
    }

    // Method to set a role for a specific organization ID
    public void setRole(String organizationId, String role) {
        roles.put(organizationId, role);
    }
}
