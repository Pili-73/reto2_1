package clases;

public class Empleado {

	private int id;
	private String nombre;
	private int antiguedad;
	private int sueldo;
	private String cargo;
	
	public Empleado() {
		super();
	}

	public Empleado(int id, String nombre, int antiguedad, String cargo) {
		this.id = id;
		this.nombre = nombre;
		this.antiguedad = antiguedad;
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
	
	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
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
		return nombre;
	}
	
	public int calcularSueldo() {
		int sueldo = 0;
		if (antiguedad < 5) {
			sueldo = 1000;
		} else if (antiguedad < 11) {
			sueldo = 1200;
		} else {
			sueldo = 1500;
		}
		return sueldo;
	}
}
