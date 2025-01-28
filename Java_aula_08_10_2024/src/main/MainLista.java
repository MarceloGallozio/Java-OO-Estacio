package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MainLista {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();

		lista.add(10);
		lista.add(20);
		lista.add(30);
		lista.add(40);
		lista.add(5);

		System.out.println(lista.size());

		Collections.sort(lista);

		Integer n = 5;
		if (lista.contains(n)) {
			System.out.println(lista.indexOf(n));
			System.out.println(lista.get(lista.indexOf(n)));		
		} else {
			System.out.println("Elemento nao Existe");
		}
		
		System.out.println("Saida...");
		
		for(Integer resp : lista) {
			System.out.println(resp);
		}
		
		Map<String,Object> mapa1 = new HashMap<String,Object>();
		Map<String,Object> mapa = new TreeMap<String,Object>();
		mapa.put("key-1", LocalDateTime.now());
		mapa.put("key-2", LocalDate.now());
		mapa.put("key-3", new Double(500.06));
		mapa.put("key-4", Boolean.TRUE);
		
		System.out.println(mapa.get("key-1"));
		
		for(String chave : mapa.keySet()) {
			System.out.println("A chave do mapa e :" + chave);
			System.out.println("Valor:" + mapa.get(chave));
		}
	}
}
