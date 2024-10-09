package net.hauntedstudio;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import net.hauntedstudio.response.auth.schoolfox.*;
import org.json.JSONObject;

import java.security.SecureRandom;
import java.util.Base64;
import java.util.Map;

public class SchoolFoxAuthentication {

    private static final SecureRandom secureRandom = new SecureRandom();

    public static UserResponse login(String username, String password) {
        String authJson = new JSONObject(Map.of("username", username, "password", password, "applicationType", "SchoolFox")).toString();
        JSONObject response = (JSONObject) SchoolFoxRequestManager.postRequest("/api/users/login", authJson);

        if (response != null) {
            UserResponse userResponse = new UserResponse();
            userResponse.setToken(response.getString("token"));
            userResponse.setUser(new User(response.getJSONObject("user"))); // Convert to User
            userResponse.setAllTokens(new AllTokens(response.getJSONObject("allTokens"))); // Convert to AllTokens
            userResponse.setAllRelatedActorTypeIds(new AllRelatedActorTypeIds(response.getJSONObject("allRelatedActorTypeIds"))); // Convert to AllRelatedActorTypeIds
            userResponse.setOrganizationMaxRoles(new OrganizationMaxRoles(response.getJSONObject("organizationMaxRoles"))); // Convert to OrganizationMaxRoles
            userResponse.setAutoLogoutMinutes(response.getInt("autoLogoutMinutes"));
            userResponse.setTwoFactorAuthPassed(response.getBoolean("twoFactorAuthPassed"));
            userResponse.setGoStudentTutoringAskOnDate(response.optString("goStudentTutoringAskOnDate", null)); // Handle null gracefully

            return userResponse;
        }
        return null;
    }


    // To be implemented
    //SSO Login
    public static String createSSOJwtToken(String baseurl, int tenantId) {
        String header = "{\"scope\":\"roster-core.readonly openid untis-profile\",\"tenantId\":\"" + tenantId + "\",\"response_type\":\"code\",\"redirect_uri\":\"" + baseurl + "api/users/login/untis/proceed\",\"state\":\""+generateBase64UrlString(16)+"\",\"nonce\":\""+generateBase64UrlString(16)+"\",\"client_id\":\"Schoolfox\"}";

        String encodedHeader = Base64.getUrlEncoder().withoutPadding().encodeToString(header.getBytes());
        String encodedPayload = Base64.getUrlEncoder().withoutPadding().encodeToString("{}".getBytes());

        return (encodedHeader + "." + encodedPayload + ".").replace(".e30.", "");
    }

    public static String generateBase64UrlString(int byteSize) {
        // Generate random bytes
        byte[] randomBytes = new byte[byteSize];
        secureRandom.nextBytes(randomBytes);

        // Encode to base64
        String base64 = Base64.getEncoder().encodeToString(randomBytes);

        return base64.replace('+', '-').replace('/', '_').replaceAll("=*$", "");
    }
}
