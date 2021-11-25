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

package util;

import java.util.List;

import util.impl.Aresta;
import util.impl.Vertice;

/**
 * Interface com as assinaturas dos métodos que uma classe deve ter ao
 * implementar um IGrafo. lembrando que esta interface é própria de um grafo
 * ponderado.
 * 
 * @author Saulo Araujo
 */
public interface IGrafo {

	/**
	 * Método que retorna os vértices do grafo.
	 * 
	 * @return Lista com os vértices do grafo.
	 */
	public List<Vertice> getVertices();

	/**
	 * Método que insere um novo vértice no grafo.
	 * 
	 * @param objeto
	 *            Objeto do vértice que será inserido no grafo.
	 */
	public void inserirVertice(Vertice v);

	/**
	 * Método que insere uma aresta entre 2 vértices do grafo.
	 * 
	 * @param objeto1
	 *            Objeto do vértice que será inserido a aresta.
	 * @param objeto2
	 *            Objeto do outro vértice que será inserido a aresta.
	 * @param peso
	 *            Double com o peso da aresta.
	 */
	public void inserirAresta(Vertice Origem, Vertice destino, double peso);

	/**
	 * Método que busca um vértice no grafo.
	 * 
	 * @param objeto
	 *            Objeto do vértice.
	 * @return Vertice do objeto.
	 */
	public Vertice buscarVertice(Object objeto);
	
	/**
	 * Metodo que remove determinado vertice de um grafo, bem como as arestas que estão ligando a ele
	 * 
	 * @param vertice a ser removido
	 * 
	 */
	public void removerVertice(Vertice v);
	/**
	 * Metodo que remove areta do grafo, vefificando todos os vertices
	 * @param a
	 */
	public void removerAresta(Aresta a);

}
