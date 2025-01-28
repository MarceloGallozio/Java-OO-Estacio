package Main;

import jdbc.ClienteDAO;
import model.Cliente;

public class Main {
	
	public static void main(String[] args) {
		try {
			ClienteDAO dao = new ClienteDAO();
			  Cliente cliente = new Cliente(2, "nana", "nana@gmail.com");
			int resp = dao.save(cliente);
			
			for(Cliente cli : dao.findAll()) {
				System.out.println(cli);
			}
			
			if(resp == 1) {
				System.out.println("Dados Gravados");
			} else {
				System.out.println("Deu ruim");
			}
		}catch (Exception ex){
			ex.printStackTrace();
		}
	}
}
