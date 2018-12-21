package build1;

import java.util.LinkedList;
import java.util.Scanner;

public class MainClass {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		int option = 0;
		LinkedList<Item> inv = new LinkedList<Item>();
		Item item1 = new Item("HP Potion", 100);
		Item item2 = new Item("MP Potion", 100);
		Item item3 = new Item("Antidote", 200);
		Item item4 = new Item("Elixir", 250);
		Costumer costumer = new Costumer(inv);
		Shop shop = new Shop(inv);
		
		shop.inventory.add(item1);
		shop.inventory.add(item2);
		shop.inventory.add(item3);
		shop.inventory.add(item4);
		
		while(option != 4) {
			shop.menu();
			option = s.nextInt();
			
			switch (option) {
			case 1:
				costumer.buy(shop);
				break;
				
			case 2:
				costumer.sell();
				break;
				
			case 3:
				costumer.showInventory();
				break;
				
			case 4:
				System.out.println("You left the shop.");
				break;

			default:
				System.out.println("Invalid option!");
				break;
			}
		}
		
	}
}
