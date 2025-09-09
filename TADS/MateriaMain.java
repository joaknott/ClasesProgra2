package TADS;

public class MateriaMain {

	public static void main(String[] args) {
		
		Materia m = new Materia("Geografia");
		
		m.AgregarComision("com1");
        m.AgregarDocenteAcomision("Prof. García", "com1");
        m.AgregarAlumnoAcomision("com1","Juan Pérez", 101);
        m.AgregarAlumnoAcomision("com1", "Ana López", 102);

        m.CambiarCoordinador("Prof. García");

        System.out.println("Materia: " + m.getNombre());
        System.out.println("Coordinador: " + m.getCoordinador());
        System.out.println("Docentes com1: " + m.ObtenerDocentes("com1"));
        System.out.println("Libretas com1: " + m.ObtenerLibretas("com1"));
		

	}

}
