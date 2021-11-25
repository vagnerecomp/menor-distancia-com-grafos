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
package controller;

import model.CaminhoPercorrido;
import util.IDijkstra;
import util.impl.Aresta;
import util.impl.Grafo;
import util.impl.Vertice;

/**
 * @author SO
 *
 */
public class Controller {

	private Grafo grafo; // atributo que servir� como "persistencia" do projeto

	/**
	 * Metodo que cadastra um vertice unico no grafo
	 * 
	 * @param vertice
	 *            a ser inserido
	 */
	public void cadastraVertice(Vertice v) {
		grafo.inserirVertice(v);
	}

	/**
	 * Metodo que cadastra as aresta de liga��o entre dois vertices
	 * 
	 * @param Vertice de origem
	 * @param Vertice de destino
	 * @param peso da aresta
	 */
	public void cadastraAresta(Vertice origem, Vertice destino, double peso) {
		grafo.inserirAresta(origem, destino, peso);
	}
	/**
	 * Metodo para remo��o de um vertice, bem como as arestas ligadas
	 * 
	 * @param vertice a ser removido
	 */
	public void removerVertice(Vertice v){
		grafo.removerVertice(v);
	}	
	/**
	 * Metodo que remove uma aresta espec�fica
	 * 
	 * @param a
	 */
	public void removerAresta(Aresta a){
		grafo.removerAresta(a);
	}
	
	/**
	 * Metodo que usa a classe de Dijkstra e a classe de caminho percorrido pra calcular todo o percurso
	 * @param garagem
	 * @param coleta
	 * @param banco
	 * @return
	 */
	@SuppressWarnings("null")
	public CaminhoPercorrido encontraMenorCaminho(Vertice garagem, Vertice coleta, Vertice banco) {
		CaminhoPercorrido caminho = null;
		IDijkstra djk = null; // TODO mudar para classe e altrar para usar contrutor
		caminho = djk.trajetoria(grafo, garagem, coleta);
		caminho.atualizaCaminho(djk.trajetoria(grafo, coleta, banco));
		return caminho;
	}

}
