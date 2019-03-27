package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {
	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

//		Cliente cliente = new Cliente();
//		lista.add(cliente);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		System.out.println("Tamanho: " + lista.size());
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());

		lista.remove(0);

		System.out.println("Tamanho: " + lista.size());

		Conta cc3 = new ContaCorrente(33, 311);
		lista.add(cc3);

		Conta cc4 = new ContaCorrente(33, 322);
		lista.add(cc4);

		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}

		System.out.println("-------");

		for (Conta o : lista) {
			System.out.println(o);
		}
		System.out.println("");
		ArrayList<Conta> novaLista1 = new ArrayList<Conta>(lista);
		ArrayList novaLista2 = new ArrayList(lista);
		System.out.println("");

//		ArrayList lista = new ArrayList(26); //capacidade inicial
//		lista.add("RJ");
//		lista.add("SP");
//		System.out.println(lista.size());
//		//outros estados
//		ArrayList nova = new ArrayList(lista); //criando baseado na primeira lista
//		System.out.println(nova.size());
//		nova.add("Teste");
//		nova.add("Teste2");
//		System.out.println(nova.size());
//		System.out.println();
	}
}
