package Ejercicio58;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Diccionario {

	private Map<String, List<String>> mapa;
	
	public Diccionario() {
		mapa = new HashMap<>();
	}
	
	public void cargarDiccionario(List<String> palabras) {
		//Se recorre la lista
		
		for ( int i = 0; i < palabras.size(); i++) {
			String letra = palabras.get(i).substring(0,1).toUpperCase();
			if ( mapa.containsKey(letra)) {
				mapa.get(letra).add(palabras.get(i));
			}else {
				List<String> x = new ArrayList<>();
				x.add(palabras.get(i));
				mapa.put(letra, x);
			}
		}
	}
	
	public void borrarDiccionario() {
		mapa.clear();
	}
	
	public void imprimirPalabras(String letras) {
		if (mapa.containsKey(letras)) {
			System.out.println("Hay " + mapa.get(letras).size() + " palabra que empieza por " + letras);
			for (int i = 0; i < mapa.get(letras).size(); i++) {
				System.out.println("\t > " + mapa.get(letras).get(i));
				}

		} else {
			System.out.println("No hay palabras que empiezen por la letra " + letras);
			}
	}
}
