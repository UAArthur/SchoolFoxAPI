package net.hauntedstudio;

import net.hauntedstudio.manager.ConfigManager;
import net.hauntedstudio.manager.ConversationManager;
import net.hauntedstudio.manager.InventoryManager;
import net.hauntedstudio.manager.SchoolManager;
import net.hauntedstudio.response.ConfigResponse;
import net.hauntedstudio.response.auth.schoolfox.*;
import net.hauntedstudio.response.auth.untis.UntisSchool;
import net.hauntedstudio.response.auth.untis.UntisSchoolResponse;
import net.hauntedstudio.response.inventory.InventoryItem;
import net.hauntedstudio.response.inventory.InventoryResponse;
import net.hauntedstudio.response.tables.Conversation;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.*;

public class SchoolFox {
    private final ConfigResponse config;
    private static SchoolFox instance = null;
    public UserResponse user;
    private final ConfigManager configManager;
    private final InventoryManager inventoryManager;
    private final ConversationManager conversationManager;
    private final SchoolManager schoolManager;

    public SchoolFox(String username, String password) {
        instance = this;
        this.configManager = new ConfigManager();
        this.inventoryManager = new InventoryManager();
        this.conversationManager = new ConversationManager();
        this.schoolManager = new SchoolManager();
        //Load Config file
        this.config = configManager.getSchoolfoxConfig();

        //Login
        this.user = SchoolFoxAuthentication.login(username, password);
    }

    //  Idk what this is doing???????
    // Implemented, but don't know what to do with it.
    public JSONArray getSeenHints() {
        return (JSONArray) SchoolFoxRequestManager.getRequest("api/Users/SeenHints", null, true);
    }

    public ConfigResponse getConfig() {
        return this.config;
    }

    public UserResponse getUser() {
        return user;
    }

    public InventoryManager getInventoryManager() {
        return inventoryManager;
    }

    public ConversationManager getConversationManager() {
        return conversationManager;
    }

    public SchoolManager getSchoolManager() {
        return schoolManager;
    }

    public static SchoolFox getInstance() {
        return instance;
    }
}
