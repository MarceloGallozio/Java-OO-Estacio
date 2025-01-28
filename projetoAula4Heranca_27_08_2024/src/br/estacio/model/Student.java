package br.estacio.model;

public class Student extends Person {
	private String matricula;
	private String name;

	public Student(String matricula, String name) {
		super();
		this.matricula = matricula;
		this.name = name;
	}

	public Student() {
		super();
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [matricula=" + matricula + ", name=" + name + "]";
	}
}
