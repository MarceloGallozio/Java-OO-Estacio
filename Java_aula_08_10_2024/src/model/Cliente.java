package model;

public class Cliente {

	private Long idCliente;
	private String nome;
	private String email;
	// Cliente tem endereço um endereço Um pra Um
	private Endereco endereco;
	
	public Cliente(Long idCliente, String nome, String email) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.email = email;
	}

	public Cliente(Long idCliente, String nome, String email, Endereco endereco) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}

	public Cliente() {
		super();
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", email=" + email + "]";
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
