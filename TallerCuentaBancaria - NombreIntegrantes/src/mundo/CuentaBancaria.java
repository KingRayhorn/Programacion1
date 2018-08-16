/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * CuentaBancaria.java
 * @version 1.0
 * Universidad El Bosque (Bogot� - Colombia)
 * Facultad de Ingenier�a de Sistemas
 * Ejercicio: Objetos-CuentaBancaria
 * @Autor: AM
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package mundo;

/**
 * Clase que representa una cuenta bancaria.
 */
public class CuentaBancaria {
	
	// -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------
	
	/**
	 * El n�mero de la cuenta bancaria
	 */
	private int numCuenta;
	
	/**
	 * El tipo de la cuenta bancaria. 1.Ahorros 2.Corriente
	 */	
	private int tipoCuenta;
	
	/**
	 * El saldo actual en la cuenta bancaria.
	 */	
	private double saldo;
	

	// -----------------------------------------------------------------
	// Constructor
	// -----------------------------------------------------------------

	/**
	 * Constructor de la clase. Se encarga de crear una cuenta bancaria seg�n los par�metros
	 * @param numCuenta El n�mero de la cuenta bancaria
	 * @param tipoCuenta El tipo de la cuenta. 1.Ahorros 2.Corriente
	 * @param saldo Saldo actual de la cuenta
	 */
	public CuentaBancaria(int numCuenta, int tipoCuenta, double saldo) {
		super();
		this.numCuenta = numCuenta;
		this.tipoCuenta = tipoCuenta;
		this.saldo = saldo;
	}
	
	// -----------------------------------------------------------------
	// M�todos
	// -----------------------------------------------------------------

    /**
     * Retorna el n�mero de cuenta bancaria
     * @return n�mero de la cuenta bancaria
     */
	public int getNumCuenta() {
		return numCuenta;
	}
	
    /**
     * Asigna un nuevo n�mero a la cuenta
     * @param numCuenta Nuevo n�mero de cuenta
     */
	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}
	
    /**
     * Retorna el tipo de cuenta bancaria
     * 1.Cuenta Ahorros, 2.Cuenta Corriente
     * @return tipo de cuenta bancaria
     */
	public int getTipoCuenta() {
		return tipoCuenta;
	}
	
    /**
     * Asigna un nuevo tipo a la cuenta
     * @param tipoCuenta Nuevo tipo de cuenta
     */
	public void setTipoCuenta(int tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	
    /**
     * Retorna el saldo actual de la cuenta
     * @return saldo actual de la cuenta
     */	
	public double getSaldo() {
		return saldo;
	}
	
    /**
     * Asigna un nuevo saldo a la cuenta
     * @param saldo Nuevo saldo de cuenta
     */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
 }
