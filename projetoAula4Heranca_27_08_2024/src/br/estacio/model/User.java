package br.estacio.model;

public class User extends Person {
	private Long id;
	private String status;

	public User() {

	}

	public User(String name, String email, Long id, String status) {
		super(name, email);
		this.id = id;
		this.status = status;
	}// Herança

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", status=" + status + ", getName()=" + getName() + ", getEmail()=" + getEmail()
				+ "]";
	}

}
