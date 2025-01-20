package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Funciones {
	public static boolean esInt(String texto) {
		try {
			Integer.parseInt(texto);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean esDouble(String texto) {
		try {
			Double.parseDouble(texto);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static int dimeEntero(String texto, Scanner sc) {
		int num = 0;
		do {
			try {
				System.out.println(texto);
				String s = sc.nextLine();
				num = Integer.parseInt(s);
				return num;
			} catch (Exception e) {
				System.out.println("Formato inválido");
			}
		} while (true);
	}

	public static double dimeDouble(String texto, Scanner sc) {
		double num = 0;
		try {
			System.out.println(texto);
			String s = sc.nextLine();
			num = Double.parseDouble(s);
		} catch (Exception e) {
			System.out.println("Formato inválido");
		}
		return num;
	}

	public static int factorial(int num) {
		int fact = 1;
		for (int i = 2; i <= num; i++) {
			fact *= num;
		}
		return fact;
	}

	public static boolean esPrimo(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void divisores(int num) {
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					System.out.print(i);
					if (i != num) {
						System.out.print(", ");
					}
				}
			}
		}
		System.out.println();
	}

	public static void escalera(int num) {
		if (num == 0) {
			System.out.println("__");
		} else if (num > 0) {
			for (int j = 0; j < num; j++) {
				System.out.print(" ");
			}
			System.out.println("_");
			for (int i = num - 1; i >= 0; i--) {
				for (int k = 0; k < i; k++) {
					System.out.print(" ");
				}
				System.out.println("_|");
			}
		} else if (num < 0) {
			num = num * (-1);
			System.out.println("_");
			for (int j = 1; j <= num; j++) {
				for (int k = 0; k < j; k++) {
					System.out.print(" ");
				}
				System.out.println("|_");
			}
		}
	}

	public static LocalDate dimeFecha(String texto, Scanner sc) {

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		do {
			try {
				System.out.println(texto);
				String fechaTexto = sc.nextLine();
				LocalDate fecha = LocalDate.parse(fechaTexto, formato);
				return fecha;
			} catch (Exception e) {
				System.out.println("Fecha no válida");
			}
		} while (true);

	}
	
	public static void mostrarIntArray(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i]);
			if (i != v.length - 1){
				System.out.print(", ");
			}
		}
		System.out.println();
	}
	
	public static void mostrarStringArray(String[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i]);
			if (i != v.length - 1){
				System.out.print(", ");
			}
		}
		System.out.println();
	}
	
	public static int buscarNum (int[] v, int  num) {
		int cont = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] == num) {
				cont++;
			}
		}
		return cont;
	}
	
	public static boolean estaEnArray(int[] v, int num) {
		if (buscarNum(v, num) == 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public static int[] rellenarSinRepetir(int [] v, int min, int max) {
		Random r = new Random();
		int num;
		for (int i = 0; i < v.length; i++) {
			num = r.nextInt(min, max);
			if (Funciones.estaEnArray(v, num)) {
				i--;
			} else {
				v[i] = num;
			}
		}
		return v;
	}
	
	static void muestraListaInt(List<Integer> lista) {
		Iterator<Integer> nombreIterator = lista.iterator();
		while (nombreIterator.hasNext()) {
			int elemento = nombreIterator.next();
			if (nombreIterator.hasNext()) {
				System.out.print(elemento + ", ");
			}
			else {
				System.out.println(elemento);
			}

		}
	}

}
