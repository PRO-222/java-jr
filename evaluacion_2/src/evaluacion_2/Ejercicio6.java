package evaluacion_2;

public class Ejercicio6 {
	public static void main(String [] args) {
		Producto prod= new Producto();
		prod.setNombre("Mouse");
		System.out.println("Producto: " +prod.getNombre());
	}
	
}
 
class Producto{
	private String nombre;
	
	public void setNombre(String nombre) {
		this.nombre= nombre;
		
	}
	
	public String getNombre() {
			return nombre;
	}
}
