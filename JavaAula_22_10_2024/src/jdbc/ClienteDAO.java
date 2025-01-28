package jdbc;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class ClienteDAO extends DAO{

	public Integer save(Cliente c) throws Exception {
	try {
		open();
		stmt = con.prepareStatement("insert into cliente values (?,?,?)");
		stmt.setInt(1, c.getId());
		stmt.setString(2, c.getNome());
		stmt.setString(3, c.getEmail());
		stmt.executeUpdate();
		stmt.close();
		close();
		return 1;
	} catch(Exception ex) {
		ex.printStackTrace();
		return -1;
	}
	}
	
	public List<Cliente> findAll() throws Exception {
	try {
		open();
		stmt = con.prepareStatement("SELECT * FROM cliente");
		rs = stmt.executeQuery();
		List<Cliente> lista = new ArrayList<Cliente>();
		while(rs.next()) {
			Cliente cliente = new Cliente();
			cliente.setId(rs.getInt("id"));
			cliente.setNome(rs.getString("nome"));
			cliente.setNome(rs.getString("email"));
			lista.add(cliente);
		}
			close();
		return lista;
	} catch (Exception ex) {
		ex.printStackTrace();
		return null;
	}
	}
}
