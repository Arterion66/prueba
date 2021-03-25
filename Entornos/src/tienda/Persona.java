package tienda;

/**
 * <h2> Clase Persona </h2>
 * Esta clase simula ser una persona
 * 
 * @author David Pereda
 * @version 1.0
 * 
 */

public class Persona {
	
	/**
	 * Atributo dinero
	 * 
	 * Indica la cantidad total de dinero (en euros)
	 * 
	 *
	 */
	
	public double dinero;
	
	/**
	 * Atributo nombre
	 * 
	 * Indica el nombre de la persona
	 * 
	 *
	 */
	
	public String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
}
