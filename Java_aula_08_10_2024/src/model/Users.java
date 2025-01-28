package model;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Users {

	public static final String SECRET = "marcelo@gmail.com;12345;1+1=;www.arqtreinamento.com.br";
	private Long idUsers;
	private String name;
	private String email;
	private String password;

	public Users(Long idUsers, String name, String email, String password) {
		super();
		this.idUsers = idUsers;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public Users() {
		super();
	}

	public Long getIdUsers() {
		return idUsers;
	}

	public void setIdUsers(Long idUsers) {
		this.idUsers = idUsers;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String gerarCriptografia(String senha) throws Exception {
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		senha = senha + SECRET;
		md5.update((senha).getBytes());
		BigInteger hash = new BigInteger(1, md5.digest());
		String resposta1 = hash.toString(16);

		MessageDigest md52 = MessageDigest.getInstance("MD5");
		String senha2 = "estacio de sa 1973" + SECRET;
		md5.update((senha2).getBytes());
		BigInteger hash2 = new BigInteger(1, md52.digest());
		String resposta2 = hash2.toString(16);

		MessageDigest md53 = MessageDigest.getInstance("MD5");
		String senha3 = "Turma de java" + SECRET;
		md5.update((senha3).getBytes());
		BigInteger hash3 = new BigInteger(1, md53.digest());
		String resposta3 = hash3.toString(16);

		return resposta1 + resposta2 + resposta3;
	}

	public static void main(String[] args) {
		try {
			Users users = new Users();
			users.setPassword("123456");

			System.out.println(users.gerarCriptografia(users.getPassword()));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
