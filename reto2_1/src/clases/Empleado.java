package clases;

public class Empleado {
	
	private int id;
	private String nombre;
	private int sueldo;
	private String cargo;
	
	public Empleado() {
		super();
	}

	public Empleado(int id, String nombre, int sueldo, String cargo) {
		this.id = id;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.cargo = cargo;
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
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", sueldo=" + sueldo + ", cargo=" + cargo + "]";
	}
	
	public 
}
