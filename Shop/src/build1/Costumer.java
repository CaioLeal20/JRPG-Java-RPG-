package build1;

import java.util.LinkedList;
import java.util.Scanner;

public class Costumer {
	private int money = 1000;
	LinkedList<Item> inventory;
	Scanner s = new Scanner(System.in);

	public Costumer(LinkedList<Item> inventory) {
		this.inventory = new LinkedList<Item>();
	}

	public int getMoney() {
		return money;
	}

	public void buy(Shop shop) {
		int option = 0;

		System.out.println("=======================Buy========================\n");
		System.out.println("Your money: " + this.money + "\n");

		shop.showInventory();

		System.out.println("\n==================================================");
		option = s.nextInt();

		if (option == (shop.inventory.size()+1)) {

		} else if (option < 0 || option > (shop.inventory.size()+1)) {
			System.out.println("Invalid option!");

		} else {
			if (this.money >= shop.inventory.get(option-1).getPrice()) {
				this.inventory.add(shop.inventory.get(option-1));
				this.money = this.money - shop.inventory.get(option - 1).getPrice();

			} else {
				System.out.println("You don't have enough money to buy this item!\n");
			}
		}

	}

	public void sell() {
		int option = 0; 

		System.out.println("=======================SELL========================\n");
		System.out.println("Money: " + this.money + "\n");

		for (int i = 0; i < this.inventory.size(); i++) {
			System.out.println("[" + (i+1) + "] " + inventory.get(i));
		}

		System.out.println("["+(this.inventory.size()+1)+"] Exit");
		System.out.println("\n==================================================");
		option = s.nextInt();

		if (option == (inventory.size()+1)) {

		} else if (option < 0 || option > (inventory.size()+1)) {
			System.out.println("Invalid option!");

		} else {
			this.money = this.money + this.inventory.get((option - 1)).getPrice();
			this.inventory.remove((option-1));
		}
	}

	public void showInventory() {
		System.out.println("====================INVENTORY====================\n");
		System.out.println("Money: " + this.money + "\n");

		for (int i = 0; i < inventory.size(); i++) {
			System.out.println(inventory.get(i).getName());
		}

		System.out.println("\n==================================================");	
	}

}
