package Vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class InterfazGUI extends JFrame implements ActionListener{

	//Constante generada por Eclipse  
	private static final long serialVersionUID = 1L;
	private PanelEntrada panelEntrada; //Se declara un objeto de tipo PanelEntrada
	private PanelResultados panelResultados; //Se declara un objeto de tipo PanelResultados

	public InterfazGUI() 
	{
		// Definici�n de los par�metros b�sicos de la ventana principal
		
		setSize(500,400); //tama�o en ancho y alto en pixeles
		setResizable(false); //Se puede cambiar el tama�o de la ventana?
		setTitle("T�tulo de la Ventana Principal"); //t�tulo de la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);//qu� debe hacer si cierra la ventana
		setLocationRelativeTo(null); //coloca la ventana al centro de la pantalla
		//Establece el layout (lienzo) que vamos a utilizar dentro de la ventana principal.
		setLayout( new BorderLayout() );
		//Se agrega al layout en la parte NORTH, el panel de entrada definido
		panelEntrada = new PanelEntrada();
		add(panelEntrada,BorderLayout.NORTH);
		//Se agrega al layout en la parte CENTER, el panel de entrada definido
		panelResultados = new PanelResultados();
		add(panelResultados,BorderLayout.CENTER);
		panelEntrada.getButConvertir().addActionListener(this);//se agrega al boton ActionListener de este objeto InterfazGUI
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		if (evento.getActionCommand().equals(panelEntrada.CONVERTIR)) {
			panelResultados.getTxtMonto().setText(panelEntrada.getTxtNumero().getText()+" Procesado");
		}
	}
}
