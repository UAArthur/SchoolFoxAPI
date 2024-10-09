package net.hauntedstudio.response.tables;

import org.json.JSONArray;
import org.json.JSONObject;

public class Conversations {

    private int count;

    public JSONArray results;

    public Conversations(int count, JSONArray results) {
        this.count = count;
        this.results = results;
    }

    public int getCount() {
        return count;
    }

    public JSONArray getResults() {
        return results;
    }
}
