package HomeSolutionMain;

import java.util.HashMap;
import java.util.Map;


public class Proyecto {
	
	int id;
	Cliente cliente;
	Map<String, Tarea> tareas;
	String fechaInicio, FechaEstimada;
	boolean finalizado;
	
	double costoAcumulado = 0;
	boolean huboRetraso = false;
	

	/* CONSTRUCTOR */
	
	public Proyecto(int id, Cliente cliente, String fechaInicio, String fechaEstimada, Boolean finalizado, Empleado empleadoResponsable) {
		this.id = id;
		this.cliente = cliente;
		this.tareas = new HashMap<>();
		this.fechaInicio = fechaInicio;
		this.FechaEstimada = fechaEstimada;
	}
	

	/* METODOS DE EMPLEADOS */
	
	public void completarTarea(String tituloTarea, double diasRealizados) {
	    Tarea tarea = tareas.get(tituloTarea);
	    
	    if (tarea == null) {
	        System.out.println("TAREA INVALIDA");
	        return;
	    }
	    
	    if (tarea.responsable != null) {
	        double horas = tarea.diasNecesarios * 8;
	        costoAcumulado += horas * tarea.responsable.retrasoAcumulado;
	    }

	    if (diasRealizados > tarea.diasNecesarios) {
	        double retraso = diasRealizados - tarea.diasNecesarios;
	        tarea.responsable.agregarRetraso(retraso);
	        huboRetraso = true;
	    }

	    System.out.println("TAREA '" + tarea.titulo + "' COMPLETADA! EMPLEADO RESPONSABLE = " + tarea.responsable.Nombre);
	}

	
	public double CalcularCostoTotal() { //35% adicional si no detecta un retraso y 25% adicional si detecta un retraso.
		
		double total = costoAcumulado *1.35;
		if (huboRetraso) total *= 0.75;
		return total;
	}
	
	
	public void asignarMenorRetrasoAtarea(String tituloTarea, Map<String, Empleado> empleados) { 
		
		Tarea tarea = tareas.get(tituloTarea);
		if(tarea == null) {
			System.out.println("TAREA INVALIDA O NO ENCONTRADA");
			return;
		}
		
		Empleado empleadoMasRapido = null; //no sabemos cual es, arranca en null
		
		for(Empleado e: empleados.values()) {
			if (empleadoMasRapido == null || e.retrasoAcumulado < empleadoMasRapido.retrasoAcumulado) {
				empleadoMasRapido= e;
			}
		}
		
		if(empleadoMasRapido == null) {
			System.out.println("NO HAY EMPLEADOS RAPIDOS O NO ESTA DISPONIBLE");
		}
		
		tarea.cambiarResponsable(empleadoMasRapido);
		System.out.println("EMPLEADO RESPONSABLE CAMBIADO CON EXITO");
	}
	/* ESTE PARAMETRO PARECE UN TANTO COMPLICADO, PERO ES QUE NECESITAMOS DARLE REFERENCIA DE LOS EMPLEADOS Y UN INDICE PAR QUE LO ASIGNE */
	
	
	/* METODOS DE TAREAS */
	
	public void ActualizarEstadoFinalizado() { //IMPLEMENTAMOS ACUMULADOR BOOLEANO
		
		boolean todasTareasFinalziadas = true;
		
		for(Tarea t: tareas.values()) {
			todasTareasFinalziadas = todasTareasFinalziadas && t.estaFinalizada();
		}
		this.finalizado = todasTareasFinalziadas;
	}
	
	public boolean EstaFinalizado() {
		//TODO
	}
	
	public void AgregarTarea(Tarea t) { //O(1)
		tareas.put(t.titulo, t);
		
		if(t.responsable != null) {
			costoAcumulado = t.diasNecesarios*8 * t.responsable.calcularCostoPorHora();
			
			if(t.responsable.retrasoAcumulado > 0) {
				huboRetraso = true;
			}
		}
	}
	
	public void EliminarTarea(Tarea t) {
	}
	
	public Tarea getTarea(String titulo) { //O(1)
		return tareas.get(titulo);
	}
	


}
