package build1;

import java.util.LinkedList;

public class Shop {
	LinkedList<Item> inventory;
	
	public Shop(LinkedList<Item> inventory) {
		this.inventory = new LinkedList<Item>();
	}
	
	public void menu() {
		System.out.println("=======================SHOP=======================\n");
		System.out.println("[1] Buy\n[2] Sell\n[3] Inventory\n[4] Exit");
		System.out.println("\n==================================================");
	}
	
	public void showInventory() {
		for (int i = 0; i < inventory.size(); i++) {
			System.out.println("[" + (i+1) + "] " + inventory.get(i));
		}
		
		System.out.println("["+(inventory.size()+1)+"] Exit");
	}

}
