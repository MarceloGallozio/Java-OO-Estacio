package br.estacio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import br.estacio.model.Person;
import br.estacio.model.Student;
import br.estacio.model.User;

public class Main {

	public static void main(String[] args) {
		Person person = new Person("Nana", "nana@gmail.com");
		System.out.println(person);

		Student student = new Student("001", "Marcelo");
		System.out.println(student);

		User user = new User();
		user.setEmail("nanaemomo@gmail.com");
		user.setName("Nanamo");

		List<String> names = new ArrayList<String>();
		names.add("nana");
		names.add("marcelo");
		names.add("junior");
		names.add("clea");
		Collections.sort(names, Collections.reverseOrder());
		System.out.println(names);

		List<String> names2 = new ArrayList<String>();
		names2.add("nana");
		names2.add("marcelo");
		names2.add("junior");
		names2.add("clea");
		Collections.sort(names2);
		System.out.println(names2);

		Set<String> names3 = new TreeSet<String>();
		System.out.println(names3.add("marcelo"));
		System.out.println(names3.add("marcelo"));
		System.out.println(names3.add("carlos"));
		System.out.println(names3.size());
		System.out.println(names3);

		Map<String, String> mapa = new HashMap<String, String>();

		mapa.put("nome", "belem");
		mapa.put("cep", "722000");
		mapa.put("cpf", "022295");
		System.out.println(mapa.get("nome"));
	}
}
