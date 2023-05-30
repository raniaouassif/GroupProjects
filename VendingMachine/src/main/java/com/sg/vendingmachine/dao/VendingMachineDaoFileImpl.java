package com.sg.vendingmachine.dao;

import com.sg.vendingmachine.dto.Item;

import java.util.List;

public class VendingMachineDaoFileImpl implements VendingMachineDao {
    
    private final String INVENTORY_FILE;
    public static final String DELIMITER = "::";
    public VendingMachineDaoFileImpl() {
        INVENTORY_FILE = "inventory.txt";
    }
    public VendingMachineDaoFileImpl(String inventoryFile) {
        INVENTORY_FILE = inventoryFile;
    }


    @Override
    public Item buyItem(String itemName, Item item) {
        return null;
    }

    @Override
    public List<Item> getAllItems() {
        return null;
    }

    @Override
    public Item getItem(String itemName) {
        return null;
    }
}
