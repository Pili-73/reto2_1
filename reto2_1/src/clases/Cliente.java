package clases;

<<<<<<< HEAD
public class Cliente {

}
=======
import java.util.ArrayList;
import java.util.HashMap;
<<<<<<< HEAD
=======
import java.util.Iterator;
>>>>>>> branch 'main' of https://github.com/Pili-73/reto2_1.git
import java.util.List;
import java.util.Map;

public class Cliente {
	
	private int id;
	private String nombre;
	private Map<Tienda, List<Producto>> compras;
	
	
	public Cliente() {
		this.compras = new HashMap<Tienda, List<Producto>>();
		
	}

	public Cliente(Map<Tienda, List<Producto>> compras, int id, String nombre) {
		super();
		this.compras = compras;
		this.id = id;
		this.nombre = nombre;
	}
	
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

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + "]";
	}

	public void comprarProducto(Tienda tienda, Producto producto) {
		 compras.put(tienda, producto);
	}
	
	public void gastoTotal() {
		Tienda tienda;
		Producto valor;
		double suma = 0;
		Iterator<Integer> claves = compras.keySet().iterator();
		while (claves.hasNext()) {
			tienda = claves.next();
			valor = compras.get(tienda);
			suma += valor.precio;

		}
	}
	

}


/*Y por último tendremos a los clientes que compran los productos de las tiendas, de los que tenemos el nombre
y lista de compras. La lista de compras será un HashMap donde la clave será la tienda y el valor una lista de
productos que se compran en esa tienda. Tendrá un método de comprar producto, que recibirá la tienda y el
producto a comprar. Y otro método de gasto total que devolverá el importe de todas las compras que haya
realizado.*/
>>>>>>> branch 'main' of https://github.com/Pili-73/reto2_1.git
