/**
 * Componente Curricular: Módulo Integrado de Programação
 * Autor: Saulo Araujo
 * Data:  13/04/2016
 *
 * Declaro que este código foi elaborado por mim de forma individual e
 * não contém nenhum trecho de código de outro colega ou de outro autor, 
 * tais como provindos de livros e apostilas, e páginas ou documentos 
 * eletrônicos da Internet. Qualquer trecho de código de outra autoria que
 * uma citação para o não a minha está destacado com autor e a fonte do
 * código, e estou ciente que estes trechos não serão considerados para fins
 * de avaliação. Alguns trechos do código podem coincidir com de outros
 * colegas pois estes foram discutidos em sessões tutorias.
 */
package view;

import java.awt.Event;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;


/**
 * @author vagner
 *
 */
public class ForteSeguro extends JApplet {

	/**
	 * Create the applet.
	 */
	public ForteSeguro() {

	}
	
	JPanel painel;
	JMenuBar barra = new JMenuBar();
	

	
	//Cria os menus.
	JMenu adcionarVertice = new JMenu("Adicionar Vértice");
	JMenu adicionarAresta = new JMenu("Adicionar Aresta");
	JMenu Menor = new JMenu("Menor caminho");
	JMenu removeV = new JMenu("Remover Vértice");
	JMenu removeA = new JMenu("Remover Aresta");
	JMenu sair = new JMenu("Sair");
	
	
	
	
	
	
	
	
	
	
	public void init(){
		painel = new JPanel();
		painel.setLayout(null);
		painel.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
		        if ((e.getModifiers() & MouseEvent.BUTTON3_MASK) != 0) {
		            JPopupMenu menu = new JPopupMenu();
		            JMenuItem adcVertice = new JMenuItem("Adicionar Local");
		            JMenuItem adcAresta = new JMenuItem("Adicionar Caminho");
		            JMenuItem rmVertice = new JMenuItem("Remover Local");
		            JMenuItem rmAresta = new JMenuItem("Remover Caminho");
		            JMenuItem MenorCaminho = new JMenuItem("Menor Caminho");
		            
		            //Definindo ações do item adcVertice
		            adcVertice.addActionListener(new ActionListener() {
		                public void actionPerformed(ActionEvent ae) {
		                	Pintar vertice = new Pintar();
		                	JLabel label = new JLabel("Informe o nome");
		                	label.setBounds(getX(), getY(), getWidth()+"Informe o nome".length(), getHeight()+9);
		                	JTextField texto = new JTextField();
		                	painel.add(label);
		                }
		            });
		            menu.add(adcVertice);
		            menu.show(painel, e.getX(), e.getY());
		        }
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO A"Menor caminho"uto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		add(painel);
			
	}
	
		
}
