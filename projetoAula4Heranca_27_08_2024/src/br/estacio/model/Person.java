package br.estacio.model;

public class Person {
	private String name;
	private String email;

	// set e get
	// construtor vazio e cheio
	// toString
	public Person(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + "]";
	}

}
