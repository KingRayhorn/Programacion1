package Modelo;

public class Canino extends Mamifero
{

	public Canino(String raza, int numPatas)
	{
		super.raza = raza;
		super.numeroPatas = numPatas;
		
	}
	
	
	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println(" Como Concentrado, shhhhh!!");
	}

	@Override
	public void hacerSonido() {
		// TODO Auto-generated method stub
		System.out.println("guau guau");
	}

}
