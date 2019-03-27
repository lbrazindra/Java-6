package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {

		GuardadorDeReferencias guardador = new GuardadorDeReferencias();

		Conta cc = new ContaCorrente(11, 1111);
		guardador.adiciona(cc);

		Conta cc2 = new ContaCorrente(22, 2222);
		guardador.adiciona(cc2);
		
		Cliente cliente = new Cliente();
		cliente.setNome("Lucca Braz Barros");
		guardador.adiciona(cliente);

		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = (Conta) guardador.getReferencia(0);
		System.out.println(ref.getNumero());
		Conta ref2 = (Conta) guardador.getReferencia(1);
		System.out.println(ref2.getNumero());
		Cliente ref3 = (Cliente) guardador.getReferencia(2);
		System.out.println(ref3.getNome());
		
	}
}