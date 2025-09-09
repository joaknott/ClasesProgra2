package TADS;

import java.util.ArrayList;

public interface MateriaTAD {
	
	void AgregarComision(String NombreComision);
	
	void CambiarCoordinador(String NombreDocente);
	
	ArrayList<String> ObtenerDocentes(String NombreComision);
	
	ArrayList<Integer> ObtenerLibretas(String NombreComision);
	
	void AgregarDocenteAcomision(String NombreDocente, String NombreComision);
	
	void AgregarAlumnoAcomision(String NombreAlumno, String NombreComision, Integer Libreta);
	
	String getNombre();
	
	String getCoordinador();
	
	
	
	

}
