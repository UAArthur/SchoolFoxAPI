package net.hauntedstudio.response.inventory;

import java.util.List;

public class InventoryResponse {
    private List<InventoryItem> inventory;

    public InventoryResponse(List<InventoryItem> inventory) {
        this.inventory = inventory;
    }

    public List<InventoryItem> getInventory() {
        return inventory;
    }

    public void setInventory(List<InventoryItem> inventory) {
        this.inventory = inventory;
    }
}
