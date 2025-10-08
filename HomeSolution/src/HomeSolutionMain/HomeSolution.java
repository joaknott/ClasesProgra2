package HomeSolutionMain;


import java.util.HashMap;
import java.util.Map;

public class HomeSolution {
	
	private Map<Integer, Proyecto> proyectos = new HashMap<>();
	private Map<Integer, Empleado> empleados = new HashMap<>();
	
	/* LO DEJAMOS EN HASHMAP PARA BUSCAR EN O(1)*/

	/* -------------------------------------------------------------------METODOS DE EMPLEADO-----------------------------------------------------------------------  */
	
	public void RegistrarNuevoEmpleado(boolean asignado, String nombre, int legajo, double valorPorHora){//No hace falta moverlo a Proyecto a menos que necesitemos que cada proyecto tenga su propia lista privada de empleados.
		if (empleados.containsKey(legajo)) {
			System.out.println("EMPLEADO YA REGISTRADO CON EL LEGAJO :  "+ legajo);
		}
		
		Empleado nuevo = new Empleado(asignado, nombre, legajo, valorPorHora);
		
		empleados.put(legajo, nuevo); //esto tambien es O(1) DE HECHO
		
		System.out.println("NUEVO EMPLEADO REGISTRADO! NOMBRE: "+ nombre+ "LEGAJO : "+ legajo);
		
	}
	
	public void AsignarNuevoEmpleadoATarea(Empleado empleado, Tarea tarea) {
		if(tarea.responsable.equals(empleado)) {
			System.out.println("EMPLEADO YA ASIGNADO!");
			return;
		}
		tarea.cambiarResponsable(empleado);
		System.out.println("EMPLEADO ASIGNADO CON EXITO!");
		
	}
	
	public void ReAsignarEmpleado(int idProyecto, String tituloTarea, int legajoNuevoEmpleado) {
		
		Proyecto proyecto = proyectos.get(idProyecto); // O(1)
		Empleado nuevo = empleados.get(legajoNuevoEmpleado);
		
		if (proyecto == null || nuevo == null) {
			System.out.println("Proyecto o empleado inexistente");
			return;
		}
		
		Tarea tarea = proyecto.getTarea(tituloTarea);
		
		if(tarea == null) {
			System.out.println("Tarea inexistente");
			return;
		}
		
		tarea.cambiarResponsable(nuevo);
		System.out.println("Empleado reasignado con exito! ahora" + tituloTarea + "esta a cargo de : " + nuevo);
	}
	
	/* -------------------------------------------------------------------METODOS DE PROYECT0-----------------------------------------------------------------------  */
	
	public void RegistrarNuevoProyecto(int id, Cliente cliente, String fechaInicio, String fechaEstimada, Boolean finalizado, Empleado empleadoResponsable) {
		if(proyectos.containsKey(id)) {
			System.out.println("PROYECTO YA REGISTRADO CON LA ID : "+ id);
		}
		
		Proyecto proyectoNuevo = new Proyecto(id, cliente, fechaInicio, fechaEstimada, finalizado, empleadoResponsable);
		
		proyectos.put(id, proyectoNuevo);
		
		System.out.println("NUEVO PROYECTO REGISTRADO! id: "+ id+ "EMPLEADO RESPONSABLE : "+ empleadoResponsable);
	}
	
	public double costoProyecto(Proyecto proyecto) {
		return proyecto.CalcularCostoTotal();
	}
	
	
	public void EliminarProyectoPorID(int idProyecto) { //O(1) TAMBIEN AL SOLO USAR ESE INDICE
		if(!proyectos.containsKey(idProyecto)) {
			System.out.println("NO EXISTE UN PROYECTO CON LA ID : "+ idProyecto);
			return;
		}
		
		proyectos.remove(idProyecto);
		System.out.println("PROYECTO ELIMINADO CON EXITO! ID : "+ idProyecto);
	}
	
	public void mostrarProyectosPorEstado(boolean finalizados) { //Muestra los proyectos por estado
		System.out.println(finalizados? "PROYECTOS FINALIZADOS": "PROYECTOS PENDIENTES");
		
		for(Proyecto p: proyectos.values()) {
			if(p.finalizado ==finalizados) {
				System.out.println("ID"+ p.id+ " CLIENTE: " + p.cliente.nombre);
			}
			
		}
		
	}
	
	

    	
	
	
	
	
	
	
	
	
	
			
	

}
