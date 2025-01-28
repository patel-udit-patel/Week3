package com.inventory_management_system;

//This is the controller class for inventory management
public class InventoryManagementSystem {
        public static void main(String[] args) {
            Inventory inventory = new Inventory();
            inventory.addItemAtBeginning("Laptop", 101, 10, 75000);
            inventory.addItemAtEnd("Mouse", 102, 50, 500);
            inventory.addItemAtPosition("Keyboard", 103, 30, 1500, 2);
            inventory.displayInventory();

            System.out.println("Total Inventory Value: " + inventory.calculateTotalValue());

            inventory.updateQuantity(102, 60);
            inventory.displayInventory();

            inventory.removeItem(101);
            inventory.displayInventory();
        }
}

