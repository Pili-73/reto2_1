package clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tienda {

	private int id;
	private String nombre;
	private Empleado gerente;
	private List<Producto> producto;
	
	public int getId() {
		return id;
	}
	public Tienda() {
		this.producto = new ArrayList<Producto>();
	}
	
	public Tienda(int id, String nombre, Empleado gerente, List<Producto> producto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.gerente = gerente;
		this.producto = new ArrayList<Producto>();
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
	public Empleado getGerente() {
		return gerente;
	}
	public void setGerente(Empleado gerente) {
		this.gerente = gerente;
	}
	public List<Producto> getProducto() {
		return producto;
	}
	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}
	public void venderProducto(Producto prod) {
		Iterator<Producto> iter = producto.iterator();
		while (iter.hasNext()) {
			Producto produc = iter.next();
			if (produc == prod) {
				iter.remove();
			}
			
		}
	}
	
	public void anadirProducto(Producto prod) {
		producto.add(prod);
	}

	@Override
	public String toString() {
		int tamano;
		if (producto == null) {
			tamano = 0;
		} else {
			tamano = producto.size();
		}
		return id + " - " + nombre + " " + gerente + " " + tamano;
	}

}
