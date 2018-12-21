package prototipo1;

import java.util.LinkedList;
import java.util.Scanner;

public class Principal {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcao = 0;
		LinkedList<Item> inv = new LinkedList<Item>();
		Item item1 = new Item("Poção de HP", 100);
		Item item2 = new Item("Poção de MP", 100);
		Item item3 = new Item("Antídoto", 200);
		Item item4 = new Item("Elixir", 250);
		Cliente cliente = new Cliente(inv);
		Loja loja = new Loja(inv);
		
		loja.inventario.add(item1);
		loja.inventario.add(item2);
		loja.inventario.add(item3);
		loja.inventario.add(item4);
		
		while(opcao != 4) {
			loja.menu();
			opcao = s.nextInt();
			
			switch (opcao) {
			case 1:
				cliente.comprar(loja);
				break;
				
			case 2:
				cliente.vender();
				break;
				
			case 3:
				cliente.listarInventario();
				break;
				
			case 4:
				System.out.println("Você saiu da loja.");
				break;

			default:
				System.out.println("Opção inválida!");
				break;
			}
		}
		
	}
}
