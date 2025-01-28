package br.estacio.service;

public class Tablet extends EletroEletronico {

	@Override
	public Double gerarPrecoFinal() {
		return getPreco() - (getPreco() * 20.) / 100.;
	}
}
