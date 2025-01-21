
package clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
		List<Producto> lista;
		if (tienda.getProducto() == null) {
			lista = new ArrayList<Producto>();
		} else {
			lista = tienda.getProducto(); 
		}
		lista.add(producto);
		compras.put(tienda, lista);
		System.out.println(compras);
	}
	
	public void gastoTotal() {
		Tienda tienda;
		List<Producto> listaProd;
		double suma = 0;
		Iterator<Tienda> claves = compras.keySet().iterator();
		while (claves.hasNext()) {
			tienda = claves.next();
			listaProd = tienda.getProducto();
			for (Producto producto : listaProd) {
				suma += producto.getPrecio();
			}

		}
	}

}
