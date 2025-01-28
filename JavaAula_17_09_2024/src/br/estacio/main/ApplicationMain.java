package br.estacio.main;

import java.text.NumberFormat;

public class ApplicationMain {
	public static void main(String[] args) {
		AlunoPeriodo aluno = new AlunoPeriodo("Marcelo", 9.8);
		System.out.println(aluno.getNome());
		System.out.println(aluno.calculo(aluno.getNota()));
		
		AlunoMercado alunoMercado = new AlunoMercado("Marcelo", 10., 9.9, 9.8);
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		nf.setMinimumFractionDigits(2);
		Double soma = alunoMercado.calculo(alunoMercado.getNota(),alunoMercado.getParticipa(),alunoMercado.getProjeto());
		System.out.println(alunoMercado.getNome());	
		System.out.println(nf.format(soma));
	}
}
