package relaciona;

public class Endereco {

	private Integer idEndereco;
	private String cep;
	private String cidade;

	public Endereco() {
		super();
	}

	public Endereco(Integer idEndereco, String cep, String cidade) {
		super();
		this.idEndereco = idEndereco;
		this.cep = cep;
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Endereco [idEndereco=" + idEndereco + ", cep=" + cep + ", cidade=" + cidade + "]";
	}

	public Integer getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Integer idEndereco) {
		this.idEndereco = idEndereco;
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
