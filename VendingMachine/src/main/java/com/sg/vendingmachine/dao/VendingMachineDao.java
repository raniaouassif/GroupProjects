package com.sg.vendingmachine.dao;

import com.sg.vendingmachine.dto.Item;

import java.util.List;

public interface VendingMachineDao {

    Item buyItem(String itemName, Item item);

    List<Item> getAllItems();

    Item getItem(String itemName);


}
