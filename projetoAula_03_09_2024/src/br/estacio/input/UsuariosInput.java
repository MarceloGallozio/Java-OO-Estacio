package br.estacio.input;

import java.util.Scanner;

public class UsuariosInput {
	
	// CONVETER PARA INT "Interger.parseInt()"
	// OU "new Integer()"
	public String lerId() {
		System.out.println("Entre com Id:");
		Scanner in = new Scanner(System.in);
		return in.nextLine();
	}
	
	public String lerNome() {
		System.out.println("Entre com Nome:");
		Scanner in = new Scanner(System.in);
		return in.nextLine();
	}
	
	public String lerEmail() {
		System.out.println("Entre com Email:");
		Scanner in = new Scanner(System.in);
		return in.nextLine();
	}
	
	public String lerCpf() {
		System.out.println("Entre com CPF:");
		Scanner in = new Scanner(System.in);
		return in.nextLine();
	}
}
