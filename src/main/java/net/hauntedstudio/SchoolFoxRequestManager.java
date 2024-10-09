package net.hauntedstudio;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class SchoolFoxRequestManager {
    static String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/97.0.4692.99 Safari/537.36 OPR/83.0.4254.46";
    private static final boolean printRequests = false;

    /**
     * Sends a GET request to the specified endpoint with parameters.
     *
     * @param endpoint The API endpoint to send the request to.
     * @param params   The query parameters to include in the request.
     * @return The response from the server as an Object (JSONArray or JSONObject).
     */
    public static Object getRequest(String endpoint, String params) {
        return getRequest(SchoolFox.getInstance().getConfig().getBaseURL(), endpoint, params);
    }

    /**
     * Sends a GET request to the specified base URL and endpoint with parameters.
     *
     * @param baseurl  The base URL of the API.
     * @param endpoint The API endpoint to send the request to.
     * @param params   The query parameters to include in the request.
     * @return The response from the server as an Object (JSONArray or JSONObject).
     */
    public static Object getRequest(String baseurl, String endpoint, String params) {
        HttpURLConnection connection = null;
        BufferedReader reader = null;

        try {
            URL url = new URL(baseurl + endpoint + (params != null ? "?" + params : ""));
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", userAgent);

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));

                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                // Detect if the response is a JSON array or a JSON object
                String responseString = response.toString().trim();
                if (responseString.startsWith("[")) {
                    return new JSONArray(responseString);
                } else if (responseString.startsWith("{")) {
                    return new JSONObject(responseString);
                } else {
                    throw new RuntimeException("Unexpected response format: " + responseString);
                }
            } else {
                throw new RuntimeException("Failed to fetch data: HTTP error code : " + responseCode);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) reader.close();
                if (connection != null) connection.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Sends a POST request to the specified endpoint with parameters.
     *
     * @param endpoint The API endpoint to send the request to.
     * @param jsonInput The JSON input to send in the request body.
     * @return The response from the server as an Object (JSONArray or JSONObject).
     */
    public static Object postRequest(String endpoint, String jsonInput) {
        return postRequest(SchoolFox.getInstance().getConfig().getBaseURL(), endpoint, jsonInput);
    }

    /**
     * Sends a POST request to the specified base URL and endpoint with parameters.
     *
     * @param baseurl  The base URL of the API.
     * @param endpoint The API endpoint to send the request to.
     * @param jsonInput The JSON input to send in the request body.
     * @return The response from the server as an Object (JSONArray or JSONObject).
     */
    public static Object postRequest(String baseurl, String endpoint, String jsonInput) {
        HttpURLConnection connection = null;
        BufferedReader reader = null;

        try {
            URL url = new URL(baseurl + endpoint);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("User-Agent", userAgent);
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            // Send the request body
            if (jsonInput != null) {
                connection.getOutputStream().write(jsonInput.getBytes(StandardCharsets.UTF_8));
            }

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));

                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                // Detect if the response is a JSON array or a JSON object
                String responseString = response.toString().trim();
                if (responseString.startsWith("[")) {
                    return new JSONArray(responseString);
                } else if (responseString.startsWith("{")) {
                    return new JSONObject(responseString);
                } else {
                    throw new RuntimeException("Unexpected response format: " + responseString);
                }
            } else {
                throw new RuntimeException("Failed to fetch data: HTTP error code : " + responseCode);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) reader.close();
                if (connection != null) connection.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
