
package reto2_1;

import java.util.ArrayList;
import java.util.HashMap;
<<<<<<< HEAD
import java.util.Iterator;
=======
>>>>>>> branch 'main' of https://github.com/Pili-73/reto2_1.git
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import clases.Cliente;
import clases.Empleado;
import clases.Producto;
import clases.Tienda;
import util.Funciones;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		//generar 20 empleados, 5 tiendas y un cliente
		List<Empleado> empleados = new ArrayList<Empleado>();
		generarEmpleados(empleados, r);
		
		List<Tienda> tiendas = new ArrayList<Tienda>();
		generarTiendas(tiendas, empleados, r);
		for (Tienda tienda2 : tiendas) {
			reponerTienda(tienda2, r);
		}
		
		Cliente cliente = generarCliente();
		System.out.println(cliente);
		
		//mostrar menu y elegir opcion
		int opcion = 0;
		do {
			opcion = Funciones.dimeEntero("Elije una opcion\s\n"
					+ "1. Ver tiendas\s\n"
					+ "2. Comprar\s\n"
					+ "3. Mostrar compras\s\n"
					+ "4. Realizar una queja\s\n"
					+ "5. Salir", sc);
			
			switch (opcion) {
			case 1:
				mostrarTiendas(tiendas);
				break;
			case 2:
				//comprar
				Tienda tienda = pedirTienda(tiendas, sc);		
				
				//elijo producto
				Producto producto = null;
				List<Producto> productos = tienda.getProducto();
				int nRandom = r.nextInt(1, productos.size() + 1);
				for (Producto prod : productos) {
					if (prod.getId() == nRandom) {
						producto = prod;
					}
				}
				cliente.comprarProducto(tienda, producto);		//NO ELIMINA EL PRODUCTO DE LA LISTA***********
				tienda.venderProducto(producto);				//HACE COSAS RARAS***************
				break;
			case 3:
<<<<<<< HEAD
				
				System.out.println();
=======
				//mostrar compras
>>>>>>> branch 'main' of https://github.com/Pili-73/reto2_1.git
				break;
			case 4:
<<<<<<< HEAD
				
=======
				//realizar queja
				funcionesP.realizarQueja(tiendas, empleados);
>>>>>>> branch 'main' of https://github.com/Pili-73/reto2_1.git
				break;
			case 5:
				break;
			default:
				System.out.println("Entre 1 y 5");
				break;
			}
		} while (opcion != 5);
	}


	

	public static void generarEmpleados(List<Empleado> empleados, Random r) {
		int antiguedad;
		for (int i = 1; i <= 20; i++) {
			antiguedad = r.nextInt(1,21);
			Empleado nuevo = new Empleado(i, "Empleado" + i, antiguedad, "trabajador");
			empleados.add(nuevo);
		}
	}
	
	public static void generarTiendas(List<Tienda> tiendas, List<Empleado> empleados, Random r) {
		Empleado gerente = null;
		int id_gerente;
		for (int i = 1; i <= 5; i++) {
			id_gerente = r.nextInt(1,21);
			for (Empleado empleado : empleados) {
				if (empleado.getId() == id_gerente) {
					gerente = empleado;
					empleado.setCargo("gerente");
				}
			}
			Tienda tienda = new Tienda(i, "Tienda" + i, gerente, null);
			tiendas.add(tienda);
		}
	}
	
	public static void reponerTienda(Tienda tienda, Random r) {
		int nRandom = r.nextInt(5, 11);
		int id;
		double precio;
		List<Producto> lista = new ArrayList<Producto>();
		
		for (int i = 0; i < nRandom; i++) {
			id = r.nextInt(1,100);
			precio = Math.round(r.nextDouble(10,101)*100)/100.0;
			Producto producto = new Producto(id, "Producto" + id, precio);
			
			//si no había lista, usa la nueva y la mete
			if (tienda.getProducto() == null) {
				lista.add(producto);
				tienda.setProducto(lista);
				
			//si había lista, la coge, añade el producto y la vuelve a meter
			} else {
				lista = tienda.getProducto();
				lista.add(producto);
				tienda.setProducto(lista);
			}
		}
	}
	
	public static void mostrarTiendas(List<Tienda> tiendas) {
		for (Tienda tienda : tiendas) {
			System.out.println(tienda);
		}
	}
	
	public static Cliente generarCliente() {
		Map<Tienda, List<Producto>> compras = new HashMap<Tienda, List<Producto>>();		
		Cliente cliente = new Cliente(compras, 1, "Pepe");
		return cliente;
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
<<<<<<< HEAD
	
	public static void mostrarCompras(Map<Tienda, List<Producto>> compras, Cliente cliente){
		Tienda clave;
		List<Producto> valor;
		Iterator<Tienda> claves = compras.keySet().iterator(); 
		while(claves.hasNext()) { 
			clave = claves.next(); 
			valor = compras.get(clave);
			System.out.println(clave.getId() + " - " + valor.size());
		}
		cliente.gastoTotal();
	
	}
=======
>>>>>>> branch 'main' of https://github.com/Pili-73/reto2_1.git

}
