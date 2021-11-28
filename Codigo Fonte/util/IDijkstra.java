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
package util;

import model.CaminhoPercorrido;
import util.impl.Grafo;
import util.impl.Vertice;

/**
 * @author SO
 *
 */
public interface IDijkstra {
	/**
	 * Mettodo que busca o menor caminho entre 2 pontos em um grafo.
	 * @return caminho percorrido
	 */
	public CaminhoPercorrido trajetoria(Grafo grafo, Vertice origem, Vertice destino);

}
