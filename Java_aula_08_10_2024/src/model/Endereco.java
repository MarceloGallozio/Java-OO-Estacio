package model;

public class Endereco {

	private String cep;
	private String cidade;

	public Endereco(String cep, String cidade) {
		super();
		this.cep = cep;
		this.cidade = cidade;
	}

	public Endereco() {
		super();
	}

	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", cidade=" + cidade + "]";
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
