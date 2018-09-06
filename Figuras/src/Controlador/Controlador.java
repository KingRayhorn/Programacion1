package Controlador;

import Modelo.Mundo;
import Vista.Interfaz;

public class Controlador {

	//Atributos que vienen del Modelo (mundo) 
	private Mundo bd;
	
	//Atributos que vienen de Vista
	private Interfaz gui;
	
	public Controlador() {

		//aqui van los constructores tanto de Mundo, como de Vista
		
		bd = new Mundo();
		gui = new Interfaz();

		//aqui van los m�todos que se invocan de Modelo (Mundo) y de Vista y que ejecutar�n el programa.
		
		bd.getCirc().setRadio(Double.parseDouble(gui.pedirRadio()));
		bd.getCirc().calcularArea();
		bd.getCirc().calcularPerimetro();
		gui.imprimirResultados("Circulo", bd.getCirc().getArea(),bd.getCirc().getPerimetro() );
		
		bd.getCuad().setLado(Double.parseDouble(gui.pedirLado()));
		bd.getCuad().calcularArea();
		bd.getCuad().calcularPerimetro();
		gui.imprimirResultados("Cuadrado", bd.getCuad().getArea(), bd.getCuad().getPerimetro());
	}

}
