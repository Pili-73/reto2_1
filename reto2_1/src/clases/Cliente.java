package clases;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cliente {
	
	private int id;
	private String nombre;
	private Map<Tienda, List<Producto>> compras = new HashMap<Tienda, List<Producto>>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Map<Tienda, List<Producto>> getCompras() {
		return compras;
	}
	public void setCompras(Map<Tienda, List<Producto>> compras) {
		this.compras = compras;
	}

	

}


/*Y por último tendremos a los clientes que compran los productos de las tiendas, de los que tenemos el nombre
y lista de compras. La lista de compras será un HashMap donde la clave será la tienda y el valor una lista de
productos que se compran en esa tienda. Tendrá un método de comprar producto, que recibirá la tienda y el
producto a comprar. Y otro método de gasto total que devolverá el importe de todas las compras que haya
realizado.*/