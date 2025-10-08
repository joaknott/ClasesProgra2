package HomeSolutionMain;

public class Tarea {
	
	String titulo;
	String descripcion;
	Double diasNecesarios;
	Empleado responsable;
	String fechaFinalizacionReal;
	
	/* CONSTRUCTOR*/
	
	public Tarea(String titulo, String descripcion, Double diasNecesarios, Empleado responsable, String fechaFinalizacionReal) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.diasNecesarios = diasNecesarios;
		this.responsable = responsable;
		this.fechaFinalizacionReal = fechaFinalizacionReal;
	}
	
	/* METODOS */
	
	public boolean estaFinalizada() {
		//TODO
	}
	
	public double calcularCosto() {
		//TODO
	}
	
	public void cambiarResponsable(Empleado empleado) { //INDICA QUIEN ES EL RESPONSABLE ENTONCES LO CAMBIA EN EL MAIN
		this.responsable = empleado;
	}

}
