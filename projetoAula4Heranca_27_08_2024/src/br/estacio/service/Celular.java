package br.estacio.service;

public class Celular extends EletroEletronico {

	@Override
	public Double gerarPrecoFinal() {
		return getPreco() - (getPreco() * 30.) / 100.;
	}
}
