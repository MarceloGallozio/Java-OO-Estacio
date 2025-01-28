package model;

public class Cliente {
	
	private Integer id;
	private String email;
	private String nome;
	
	public Cliente(Integer id, String email, String nome) {
		super();
		this.id = id;
		this.email = email;
		this.nome = nome;
	}
	
	public Cliente() {
		super();
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", email=" + email + ", nome=" + nome + "]";
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
