package Vista;

import javax.swing.JOptionPane;

public class Interfaz {

	public Interfaz() 
	{
		// TODO Auto-generated constructor stub
		
	}

	/* metodo de prueba que pide un dato por JOptionPane y retorna el String correspondiente
	 * Reemplazar por lo que se necesiten
	 */
	
	public String pedirLado() 
	{
		return (JOptionPane.showInputDialog(null,"Ingrese el Lado","Titulo del InputDialog",JOptionPane.INFORMATION_MESSAGE));
	}
	
	public String pedirRadio() 
	{
		return (JOptionPane.showInputDialog(null,"Ingrese Radio","Titulo del InputDialog",JOptionPane.INFORMATION_MESSAGE));
	}

	
	
	/* metodo de prueba que imprime un dato procesado por un m�todo declarado en 
	 * Reemplazar por lo que se necesiten
	 */

	public void imprimirResultados(String figura, double area, double perimetro)
	{
		String cadena = "";
		cadena = "el area es: "+ area + "\n";
		cadena = cadena + "el perimetro es: "+perimetro + "\n";
		escribirResultado(cadena, figura); 
	}
	
	public void escribirResultado(String dato, String titulo) 
	{
		JOptionPane.showMessageDialog(null, dato, titulo, JOptionPane.INFORMATION_MESSAGE);
	}
}
