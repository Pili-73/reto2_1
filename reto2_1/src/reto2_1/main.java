package reto2_1;
import java.util.Scanner;

import util.Funciones;

public class main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int opcion=0;
		
		do {
			System.out.println("1- Ver Tiendas");
			System.out.println("2- Comprar");
			System.out.println("3- Mostrar Compras");
			System.out.println("4- Realizar una queja");
			System.out.println("5- Salir");
			opcion= Funciones.dimeEntero("Seleccione opción para interactuar:", sc);
		}while(opcion==5);
	}

}
