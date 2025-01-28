package br.estacio.main;

public class AlunoPeriodo implements EstrategiaAvaliacao {

	private String nome;
	private Double nota;
	
	public AlunoPeriodo(String nome, Double nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}

	public AlunoPeriodo() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		return "AlunoPeriodo [nome=" + nome + ", nota=" + nota + "]";
	}

	@Override
	public Double calculo(Double... nota) {

		return nota[0];
	}

}
