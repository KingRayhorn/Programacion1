/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Inicio.java, v 1.0
 * Universidad El Bosque (Bogot� - Colombia)
 * Facultad de Ingenier�a de Sistemas
 * Ejercicio: Objetos-CuentaBancaria
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package interfaz;

public class Inicio {

    // -----------------------------------------------------------------
    // Main
    // -----------------------------------------------------------------

    /**
     * Main de la aplicaci�n
     * @param args Lista de argumentos con los que inicia la aplicaci�n.
     */
	
	public static void main(String[] args) {
		
		InterfazBanco aplicacionBanco = new InterfazBanco();
		aplicacionBanco.ejecutarMenu();
		
	}
}
