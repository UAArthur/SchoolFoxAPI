package net.hauntedstudio.response.auth.schoolfox;

import org.json.JSONObject;

public class AllTokens {
    private String parent;

    public AllTokens(JSONObject json) {
        this.parent = json.getString("parent");
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }
}
