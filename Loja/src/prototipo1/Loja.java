package prototipo1;

import java.util.LinkedList;

public class Loja {
	LinkedList<Item> inventario;
	
	public Loja(LinkedList<Item> inventario) {
		this.inventario = new LinkedList<Item>();
	}
	
	public void menu() {
		System.out.println("=======================LOJA=======================\n");
		System.out.println("[1] Comprar\n[2] Vender\n[3] Inventário\n[4] Sair");
		System.out.println("\n==================================================");
	}
	
	public void listarInventario() {
		for (int i = 0; i < inventario.size(); i++) {
			System.out.println("[" + (i+1) + "] " + inventario.get(i));
		}
		
		System.out.println("["+(inventario.size()+1)+"] Sair");
	}

}
