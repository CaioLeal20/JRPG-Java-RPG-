package prototipo1;

import java.util.LinkedList;
import java.util.Scanner;

public class Cliente {
	private int dinheiro = 1000;
	LinkedList<Item> inventario;
	Scanner s = new Scanner(System.in);

	public Cliente(LinkedList<Item> inventario) {
		this.inventario = new LinkedList<Item>();
	}

	public int getDinheiro() {
		return dinheiro;
	}

	public void comprar(Loja loja) {
		System.out.println("=====================COMPRAR======================\n");
		System.out.println("Seu dinheiro: " + this.dinheiro + "\n");

		loja.listarInventario();

		System.out.println("\n==================================================");
		int opcao = s.nextInt();

		if (opcao == loja.inventario.size()) {

		} else if (opcao < 0 || opcao > (loja.inventario.size()+1)) {
			System.out.println("Opção inválida!");

		} else {
			if (this.dinheiro >= loja.inventario.get(opcao-1).getPreco()) {
				this.inventario.add(loja.inventario.get(opcao-1));
				this.dinheiro = this.dinheiro - loja.inventario.get(opcao - 1).getPreco();

			} else {
				System.out.println("Você não tem dinheiro suficiente para comprar este item!\n");
			}
		}

	}

	public void vender() {
		int opcao = 0; 

		System.out.println("======================VENDER======================\n");
		System.out.println("Dinheiro: " + this.dinheiro + "\n");

		for (int i = 0; i < this.inventario.size(); i++) {
			System.out.println("[" + (i+1) + "] " + inventario.get(i));
		}

		System.out.println("["+(this.inventario.size()+1)+"] Voltar");
		System.out.println("\n==================================================");
		opcao = s.nextInt();

		if (opcao == (inventario.size()+1)) {

		} else if (opcao < 0 || opcao > (inventario.size()+1)) {
			System.out.println("Opção inválida!");

		} else {
			this.dinheiro = this.dinheiro + this.inventario.get((opcao - 1)).getPreco();
			this.inventario.remove((opcao-1));
		}
	}

	public void listarInventario() {
		System.out.println("====================INVENTARIO====================\n");
		System.out.println("Dinheiro: " + this.dinheiro + "\n");

		for (int i = 0; i < inventario.size(); i++) {
			System.out.println(inventario.get(i).getNome());
		}

		System.out.println("\n==================================================");	
	}

}
