package EjerciciosExcepciones;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SacoNumeros {
	Scanner sc = new Scanner(System.in);
	private List<Integer> lista = new ArrayList<>();

	public void addNumero(Integer n) {
		lista.add(n);

	}

	public Integer getNumeros(Integer pos) {

		try {
			return lista.get(pos);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}

	public BigDecimal division() {
		Integer d = 0;
		BigDecimal bd;
		int i;
		try {

			for (i = 0; i < lista.size() - 1; i++) {
				if (i == lista.size()) {
					break;
				} else {
					d = lista.get(i) / lista.get(i + 1);

				}

			}
			bd = BigDecimal.valueOf(d);
			return bd;

		} catch (ArithmeticException e) {
			return null;
		}

	}

	@Override
	public String toString() {
		return "SacoNumeros [lista=" + lista + "]";
	}

}
