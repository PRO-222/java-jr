package evaluacion_2;

public class Ejercicio5 {
	
	public static void main(String [] args) {
		Usuario p =  new Usuario("Laura", 28);
		System.out.println("Nombre: " +p.nombre+ ", Edad: " +p.edad);
	}

}
class Usuario {
	 String nombre;
	 int edad;
	 
	 public Usuario (String nombre, int edad) {
		 this.nombre = nombre;
		 this.edad= edad;
	 }
}
