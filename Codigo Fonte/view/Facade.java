/**
 * Componente Curricular: M�dulo Integrado de Programa��o
 * Autor: Saulo Araujo
 * Data:  13/04/2016
 *
 * Declaro que este c�digo foi elaborado por mim de forma individual e
 * n�o cont�m nenhum trecho de c�digo de outro colega ou de outro autor, 
 * tais como provindos de livros e apostilas, e p�ginas ou documentos 
 * eletr�nicos da Internet. Qualquer trecho de c�digo de outra autoria que
 * uma cita��o para o n�o a minha est� destacado com autor e a fonte do
 * c�digo, e estou ciente que estes trechos n�o ser�o considerados para fins
 * de avalia��o. Alguns trechos do c�digo podem coincidir com de outros
 * colegas pois estes foram discutidos em sess�es tutorias.
 */
package view;

import controller.Controller;
import util.impl.Vertice;

/**
 * Classe de lingacao entre usuario e controlador de negocios
 * @author SO
 *
 */
public class Facade {
	private Controller control;
	
	public void cadastraAresta(String nome){
		Vertice v = new Vertice(nome);
		control.cadastraVertice(v);
		
	}
	
}
