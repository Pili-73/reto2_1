package clases;

import java.util.HashMap;
import java.util.Map;

public class Cliente {
	
	private int id;
	private String nombre;
	private Map<Integer, List<Producto>> compras = new HashMap<Integer, List<Producto>>();

	

}


/*Y por último tendremos a los clientes que compran los productos de las tiendas, de los que tenemos el nombre
y lista de compras. La lista de compras será un HashMap donde la clave será la tienda y el valor una lista de
productos que se compran en esa tienda. Tendrá un método de comprar producto, que recibirá la tienda y el
producto a comprar. Y otro método de gasto total que devolverá el importe de todas las compras que haya
realizado.*/