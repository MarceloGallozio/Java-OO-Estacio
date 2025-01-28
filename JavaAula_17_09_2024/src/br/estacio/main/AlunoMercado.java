package br.estacio.main;

public class AlunoMercado implements EstrategiaAvaliacao {

	private String nome;
	private Double nota;
	private Double projeto;
	private Double participa;

	public AlunoMercado(String nome, Double nota, Double projeto, Double participa) {
		super();
		this.nome = nome;
		this.nota = nota;
		this.projeto = projeto;
		this.participa = participa;
	}

	public AlunoMercado() {
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

	public Double getProjeto() {
		return projeto;
	}

	public void setProjeto(Double projeto) {
		this.projeto = projeto;
	}

	public Double getParticipa() {
		return participa;
	}

	public void setParticipa(Double participa) {
		this.participa = participa;
	}
	
	

	@Override
	public String toString() {
		return "AlunoMercado [nome=" + nome + ", nota=" + nota + ", projeto=" + projeto + ", participa=" + participa
				+ "]";
	}

	@Override
	public Double calculo(Double... nota) {

		return nota[0] + nota[1] + nota[2];
	}

}
