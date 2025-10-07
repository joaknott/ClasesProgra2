package Clubsocial;

public abstract class Socio {
	
	int dni;
	String nombre;
	String fechaNacimiento;
	String fechaIngreso;
	int contAsistencias = 0;
	
	/* CONSTRUCTOR */
	
	public Socio(int dni, String nombre, String fechaNacimiento, String fechaIngreso) {
		this.dni = dni;
		this.nombre=nombre;
		this.fechaIngreso = fechaIngreso;
		this.fechaNacimiento = fechaNacimiento;
	}

	/* METODOS */

	
	public double aPagarMensual() { //ABS
		//TODO
	}
	
	public int totalAsistencias() {//ABS
		//TODO
	}
	
	public void registrarActividad(String actividad, String fecha) {//ABS
		//TODO	
	}
}
