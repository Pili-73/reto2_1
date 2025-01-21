import java.util.List;
import java.util.Random;
import java.util.Scanner;

import clases.Empleado;
import clases.Tienda;
import util.Funciones;

public class funcionesP {
	
	
	public static void realizarQueja(List<Tienda> tiendas, List<Empleado> empleados) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		Tienda tienda = pedirTienda(tiendas, sc);
		int id_gerente = 0;
		Empleado nuevo;
		do {
			id_gerente = r.nextInt(1,21);
			for (Empleado empleado : empleados) {
				if (empleado.getId() == id_gerente) {
					nuevo = empleado;
					empleado.setCargo("gerente");
					break;
				}
			}
		} while (true);
		
		tienda.setGerente(nuevo);
	}
	
	public static void mostrarTiendas(List<Tienda> tiendas) {
		for (Tienda tienda : tiendas) {
			System.out.println(tienda);
		}
	}
	
	public static Tienda pedirTienda(List<Tienda> tiendas, Scanner sc) {
		int id = 0;
		do {
			mostrarTiendas(tiendas);
			id = Funciones.dimeEntero("Escribe el id de una tienda", sc);
		} while (id > 5 || id < 1);
		for (Tienda tienda : tiendas) {
			if (tienda.getId() == id) {
				return tienda;
			}
		}
		return null;
	}
	
	
	
}
