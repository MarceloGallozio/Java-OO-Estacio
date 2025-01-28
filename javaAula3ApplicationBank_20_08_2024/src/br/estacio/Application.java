package br.estacio;

import br.estacio.model.Conta;

public class Application {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setId(10L);
		conta.setName("Ana Gallozio");
		conta.setSaldo(50000.);
		conta.setDeposito(90.);
		conta.depositar();
		System.out.println(conta.getName());
		System.out.println(conta.getSaldo());
	}
}
