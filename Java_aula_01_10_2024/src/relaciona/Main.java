package relaciona;

public class Main {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente(10, "jose", new Endereco(2001, "22795220", "Campo Grande"));
		
		System.out.println(cliente);
	}
}
