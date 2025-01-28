package relaciona;

public class Cliente {

	private Integer idCliente;
	private String nome;
	private Endereco endereco;

	public Cliente() {
		super();
	}

	public Cliente(Integer idCliente, String nome, Endereco endereco) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", endereco=" + endereco + "]";
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
