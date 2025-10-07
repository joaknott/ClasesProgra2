package Clubsocial;

import java.util.Map;

public class SocioPleno extends Socio {
	
	double adicional;
	Map <String, String> asistencias; //STRING == FECHA 
	

	
	/* Extiende a Socio */
	

	public SocioPleno(int dni, String nombre, String fechaNacimiento, String fechaIngreso, double adicional) {
		super(dni, nombre, fechaNacimiento, fechaIngreso);

	}
	
	/* METODOS */
	
	public void aPagarMensual() {
		//TODO
	}
	
	public int totalAsistencias() {//ABS
		//TODO
	}
	
	public void registrarActividad(String actividad, String fecha) {//ABS
		//TODO	
	}
	
	
 
}
