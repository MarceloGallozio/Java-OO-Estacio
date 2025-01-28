package br.estacio.model;

public class Pessoa {
	private String nome;
	private Integer quantidadeDocumento=0;
	private Integer idade;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidadeDocumento() {
		return quantidadeDocumento;
	}

	public void setQuantidadeDocumento(Integer quantidadeDocumento) {
		this.quantidadeDocumento = quantidadeDocumento;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	
	public void registrarCNH() {
		if(this.idade > 16) {
			this.quantidadeDocumento++;
		}
	}
	
	public void registrarTitulo() {
		if(this.idade > 16) {
			this.quantidadeDocumento++;
		}
	}
}
