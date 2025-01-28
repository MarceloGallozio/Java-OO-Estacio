package br.estacio.sample;

public class Cliente {
	private Integer id;
	private String nomeCliente;

	public Cliente() {

	}

	public Cliente(Integer id, String nomeCliente) {
		super();
		this.id = id;
		this.nomeCliente = nomeCliente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

}
