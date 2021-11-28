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


import java.awt.BasicStroke;
import java.awt.RenderingHints;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Graphics2D;
import static java.awt.Font.MONOSPACED;


/**
 * @author vagner
 *
 */


public class Pintar {
	
	Color cor;
	
	public static void pintarCirculo(Graphics g, int x, int y, String n){
		((Graphics2D)g).setColor(Color.blue);
		((Graphics2D)g).setStroke(new BasicStroke(4)); //espessura do círculo
		((Graphics2D)g).fillOval(x, y, 15, 15);
		((Graphics2D)g).setColor(Color.BLACK);
		((Graphics2D)g).drawOval(x, y, 15, 15);
		
		((Graphics2D)g).setColor(Color.ORANGE);
		Font fonte = new Font("Monospaced", Font.BOLD, 16);
		g.setFont(fonte);
		g.drawString(n, x, y); //possível alteração
	}
	
	
	//implementar
	public static void pintarLinha(Graphics g, int x1,int y1,int x2,int y2,int tam){
        int xAux = 0; int yAux = 0; 
        ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,  RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(2);
        ((Graphics2D)g).setStroke(stroke);         
        ((Graphics2D)g).drawLine(x1+10, y1+10, x2+10, y2+10);
        if(x1<=x2)
           xAux=((x2-x1)/2)+x1;       
        if(x1>x2)
           xAux=((x1-x2)/2)+x2;
        if(y1<y2)
           yAux=((y2-y1)/2)+y1;
        if(y1>=y2)
            yAux=((y1-y2)/2)+y2;        
        // ((Graphics2D)g).setColor(Color.black);
        Font fuente=new Font("Monospaced",Font.PLAIN, 12);
        g.setFont(fuente);
        ((Graphics2D)g).drawString(String.valueOf(tam), xAux, yAux);
	}
	
	public static void pintarCaminho(Graphics g, int x1,int y1,int x2,int y2, Color color){
		((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		BasicStroke stroke = new BasicStroke(2);
		((Graphics2D)g).setStroke(stroke);
		g.setColor(color);
		g.drawLine(x1+10, y1+10, x2+10, y2+10);
	}
	
	public static void clickNoVertice(Graphics g,int x,int y,String n,Color cor){
	       	((Graphics2D)g).setColor(cor);
	        ((Graphics2D)g).setStroke(new BasicStroke(4));//leda el grosor al circulo        
	        ((Graphics2D)g).fillOval(x, y, 15, 15);        
	        ((Graphics2D)g).setColor(Color.BLACK);
	        ((Graphics2D)g).drawOval(x, y, 15, 15);
	        
	}

}
