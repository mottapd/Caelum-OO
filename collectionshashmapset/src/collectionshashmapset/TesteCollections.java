package collectionshashmapset;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TesteCollections {

	public static void main(String[] args) {
		System.out.println("iniciando...");
		
		testaLinkedList();
		testaArrayList();
		testaHashSet();
		testaHashMap();
		
	}

	public static void testaLinkedList() {
	}
	
	public static void testaArrayList() {
		Collection<String> teste = new ArrayList<>();

		int total = 900000;

		long inicio = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			teste.add(Integer.toString(i));
		}
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto - ADD: " + tempo);
		// -------------------------------------------------------------
		inicio = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			teste.contains(Integer.toString(i));
		}
		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.println("Tempo gasto - CONTAINS: " + tempo);
	}
	
	public static void testaHashSet() {
		Collection<String> teste = new HashSet<>();

		int total = 900000;

		long inicio = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			teste.add(Integer.toString(i));
		}
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto - ADD: " + tempo);
		// -------------------------------------------------------------
		inicio = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			teste.contains(Integer.toString(i));
		}
		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.println("Tempo gasto - CONTAINS: " + tempo);
	}

	public static void testaHashMap() {
		Map<String, Integer> teste = new HashMap<String, Integer>();

		int total = 900000;

		System.out.println("testando MAP");

		long inicio = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			teste.put(Integer.toString(i), i);
		}
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto - PUT: " + tempo);

		inicio = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			if (!teste.containsKey(Integer.toString(i))) {
				System.out.println("nao existe");
			}
		}
		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.println("Tempo gasto - CONTAINS: " + tempo);
	}
}
