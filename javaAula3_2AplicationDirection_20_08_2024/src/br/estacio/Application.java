package br.estacio;

import br.estacio.model.Pessoa;

public class Application {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Marcelo");
		pessoa.setIdade(21);
		pessoa.registrarCNH();
		pessoa.registrarTitulo();
		System.out.println(pessoa.getQuantidadeDocumento());
	}
}
