package Clubsocial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class ClubSocial {
	double cuotaMensual;
	Map<Integer, Socio> socios;
	List<String> actividades;
	

	/* Constructor */
	
	public ClubSocial() {
		this.socios = new HashMap<>();
		this.actividades = new ArrayList<>(); //Momentaneamente asi
	}
	
	/* METODOS */
	
	public void agregarActividad (String nombreActividad) {
		//TODO
	}
	
	/* METODOS SOCIO */

	public void agregarSocioClub (int dni, String nombre, String fechaDeNacimiento, String fechaIngreso, String adicional) {
		//TODO
	}
	
	public void agregarSocioSemipleno (int dni, String nombre, String fechaDeNacimiento, String fechaIngreso, String costoXactividad) {
		//TODO
	}
	
	public void agregarSocioLimitado(int dni, String nombre, String fechaDeNacimiento, String fechaIngreso, String actividad, double costo) {
		//TODO
	}
	
	public void agregarSocioPleno (int dni, String nombre, String fechaDeNacimiento, String fechaIngreso, double costoXactividad) {
		//TODO
	}
	
	public void registrarActSocio(int dni, String actividad, String fechaDelDia) {
		//TODO
	}
	
	/* METODOS DEL CLUB */
	
	public double recaudacionMensual() {
		//TODO
	}
	
	
	
	

}
