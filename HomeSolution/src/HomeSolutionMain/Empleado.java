package HomeSolutionMain;

public class Empleado {
	
	private boolean Asignado;
	public String Nombre;
	private Integer legajo;
	public double ValorPorHora;
	double retrasoAcumulado; //ADICION NUEVA! DEBIDO A QUE QUEREMOS AÑADIR AL EMPLEADO CON MENOS RETRASOS ACUMULADOS Y SIN ESTO NO HABRIA REFERENCIA
	
	
	/* CONSTRUCTOR */
	
	public Empleado(boolean asignado, String nombre, Integer legajo, double valorPorHora) {
		this.Asignado = asignado;
		this.Nombre = nombre;
		this.legajo = legajo;
		this.ValorPorHora = valorPorHora;
	}
	
	/* METODOS */
	
	public void asignarTarea() {
		//TODO
	}
	
	public void liberarTarea() {
		//TODO
	}
	
	public double calcularCostoPorHora() {
		//TODO
	}
	
	public boolean estaAsignado(Proyecto p) {
		//TODO
	}
	
	public void agregarRetraso(double dias) {
		this.retrasoAcumulado += dias;
	}
	
	public Integer obtenerLegajo() {
		return legajo;
	}
	
	
	
	

}
