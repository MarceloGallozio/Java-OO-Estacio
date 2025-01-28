package br.estacio.main;

public class Main {

	public static void main(String[] args) {
		EstrategiaApresentacao aluno = new Aluno();
		aluno.display();
		
		EstrategiaApresentacao coordenador = new Coordenador();
		coordenador.display();
		
		EstrategiaApresentacao professor = new Professor();
		professor.display();
		
		
		
		EstrategiaApresentacao estrategia[] = new EstrategiaApresentacao[3];
		estrategia[0] = new Aluno();
		estrategia[1] = new Professor();
		estrategia[2] = new Coordenador();
		
		for(int i=0; i<3; i++) {
			estrategia[i].display();
		}
	}
}
