package br.estacio.model;

public class Conta {

	private Long id;

	private String name;

	private Double saldo;

	private Double deposito;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getDeposito() {
		return deposito;
	}

	public void setDeposito(Double deposito) {
		this.deposito = deposito;
	}

	public void depositar() {
		if (this.deposito >= 0.) {
			this.saldo += this.deposito;
		} else {
			System.out.println("O deposito deve ser positivo");
		}
	}
}
