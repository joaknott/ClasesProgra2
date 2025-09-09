package TADS;

import java.util.ArrayList;

public class Materia implements MateriaTAD{
	
	//Definimos atributos principales
	
	private String Nombre;
	private String Coordinador;
	private ArrayList<Comision> Comisiones;
	
	private static class Alumno //clase interna Alumno
	{
		Integer libretas;
		String Nombre;
		
		Alumno(Integer libretas, String Nombre){ //Constructor
			this.libretas = libretas;
			this.Nombre = Nombre;		
		}
	}
	
	
	private static class Comision //clase interna Comision
	{
		String Nombre;
		ArrayList<String> Docentes;
		ArrayList<Alumno> Alumnos;
		
		Comision(String Nombre){ //Constructor
			this.Nombre = Nombre;
			this.Docentes = new ArrayList<>();
			this.Alumnos = new ArrayList<>();
		}
		public String getNombre() {
			return Nombre;
		}
		public void setNombre(String nombre) {
	        this.Nombre = nombre;
	    }
		
	}
	
	public Materia(String Nombre) { //Constructor MATERIA
		this.Nombre = Nombre;
		this.Coordinador = null;
		this.Comisiones = new ArrayList<>();
		
		
	}

	//implementamos metodos de la interfaz
	
	@Override
	public void AgregarComision(String NombreComision) {
		for(Comision c: Comisiones) {
			if(c.Nombre.equals(NombreComision)) {
				throw new IllegalArgumentException("LA COMISION YA EXISTE"+ NombreComision);
			}
			Comisiones.add(new Comision(NombreComision));
			
		}
	}

	@Override
	public void CambiarCoordinador(String NombreDocente) {
		for(Comision c: Comisiones) {
			if(c.Docentes.equals(Coordinador)) {
				this.Coordinador = NombreDocente;
				return;
			}
		}
		throw new IllegalArgumentException("ESTE DOCENTE NO PERTENECE A NINGUNA COMISION = "+ NombreDocente);
	
	}

	@Override
	public ArrayList<String> ObtenerDocentes(String NombreComision) {
		for (Comision c: Comisiones) {
			if(c.Docentes.equals(NombreComision)) {
				return new ArrayList<>(c.Docentes);
			}
		}
		throw new IllegalArgumentException("NO EXISTE LA COMISION "+ NombreComision);
	}
	

	@Override
	public ArrayList<Integer> ObtenerLibretas(String NombreComision) {
		for (Comision c: Comisiones) {
			if(c.Nombre.equals(NombreComision)) {
				ArrayList<Integer> libretas = new ArrayList<>();
				for (Alumno a: c.Alumnos) {
					libretas.add(a.libretas);
				}
				return libretas;
			}
		}
		throw new IllegalArgumentException("NO EXISTE LA COMISION " + NombreComision);
	}

	@Override
	public void AgregarDocenteAcomision(String NombreDocente, String NombreComision) {
	    for (Comision c : Comisiones) {
	        if (c.getNombre().equals(NombreComision)) {  
	            if (c.getNombre().contains(NombreDocente)) { 
	                throw new IllegalArgumentException("EL DOCENTE YA ESTA EN LA COMISION " + NombreComision);
	            }
	            c.setNombre(c.getNombre() + NombreDocente);
	            return; //PREGUNTAR AL PROFE ACERCA DE ESO (SETTER Y .ADD)
	        }
	    }
	    throw new IllegalArgumentException("NO EXISTE LA COMISION " + NombreComision);
	}


	
	@Override
	public void AgregarAlumnoAcomision(String NombreAlumno, String NombreComision, Integer Libreta) {
		for(Comision c: Comisiones) {
			if(c.Nombre.equals(NombreComision)) {
				for(Alumno a: c.Alumnos) {
					if (a.libretas.equals(Libreta)) {
						throw new IllegalArgumentException("ESTE ALUMNO YA TIENE LA LIBRETA"+ Libreta);	
					}
				}
				c.Alumnos.add(new Alumno(Libreta, NombreAlumno));
				return;
			}
			
		}
		throw new IllegalArgumentException("NO EXISTE LA COMISION "+ NombreComision);
	}
		

	@Override
	public String getNombre() {
		return Nombre;
	}

	@Override
	public String getCoordinador() {
		return Coordinador;
	}


}
