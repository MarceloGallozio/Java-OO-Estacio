package br.estacio;

import br.estacio.input.UsuariosInput;
import br.estacio.model.Usuarios;

public class Main {
	public static void main(String[] args) {
		UsuariosInput input = new UsuariosInput();
		Usuarios usuarios = new Usuarios(Integer.parseInt(input.lerId()), input.lerNome(), input.lerEmail(), input.lerCpf());
		System.out.println(usuarios);
	}
	
	/* OU
	public static void main(String[] args) {
		UsuariosInput input = new UsuariosInput();
		Usuarios usuarios = new Usuarios(input.lerId(null), input.lerNome(), input.lerEmail(), input.lerCpf());
		System.out.println(usuarios);
	}
	
	public static void main(String[] args) {
		UsuariosInput input = new UsuariosInput();
		Usuarios usuarios = new Usuarios();
			usuarios.setId(null);
			usuarios.setNome(input.lerNome();
			usuarios.setEmail(input.lerEmail();
			usuarios.setCpf(input.lerCpf();
		System.out.println(usuarios);
	}
	*/
}
