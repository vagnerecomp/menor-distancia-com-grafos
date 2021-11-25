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
package util.impl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import util.IGrafo;
import util.IIterador;

/**
 * Classe grafo, baseado em uma lista com vertices que contem arestas
 * 
 * @author Saulo Araujo
 *
 */
public class Grafo implements IGrafo {

	private List<Vertice> vertices;
	private int tamanho;

	/**
	 * Contrutor da classe que inicializa a lista
	 * 
	 * @param vertices
	 */
	public Grafo() {
		this.vertices = new LinkedList<Vertice>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see util.IGrafo#getVertices()
	 */
	@Override
	public List<Vertice> getVertices() {
		return this.vertices;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see util.IGrafo#inserirVertice(java.lang.Object)
	 */
	@Override
	public void inserirVertice(Vertice v) {
		vertices.add(v);
		tamanho++;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see util.IGrafo#buscarVertice(java.lang.Object)
	 */
	@Override
	public Vertice buscarVertice(Object objeto) {
		Iterator<Vertice> it = vertices.iterator();
		while (it.hasNext()) {
			Vertice v = (Vertice) it.next();
			if (v.equals(objeto))
				return v;
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see util.IGrafo#inserirAresta(util.impl.Vertice, util.impl.Vertice,
	 * double)
	 */
	@Override
	public void inserirAresta(Vertice origem, Vertice destino, double peso) {
		Aresta aresta = new Aresta(origem, destino, peso);
		Aresta aresta2 = new Aresta(destino, origem, peso);

		Vertice o = this.buscarVertice(origem);
		Vertice d = this.buscarVertice(destino);

		o.iserirAresta(aresta);
		d.iserirAresta(aresta2);
	}

	public int tamanho() {
		return this.tamanho;

	}

	/* (non-Javadoc)
	 * @see util.IGrafo#removerVertice(util.impl.Vertice)
	 */
	@Override
	public void removerVertice(Vertice v) {
		// busca o vertice passado na lista
		Vertice vertice = this.buscarVertice(v);
		// iterador da lista de vertice que tem arestas que apontam pra este vertice
		Iterator <Vertice> itVerticesOrigem = vertice.getVizinhos().iterator();
		//percorre a lista de vertices 
		while(itVerticesOrigem.hasNext()){
			Vertice origem = itVerticesOrigem.next();
			// Iterador da lista de aretas do vertice pai
			Iterator <Aresta> irArestasVerticePai = origem.getArestas().iterator();
			//percorre a lista de aresta
			while(irArestasVerticePai.hasNext()){
				Aresta a1 = irArestasVerticePai.next();
				//se determinada aresta apontar para o vertice removido, vai ser removida
				if(a1.getDestino()==v)
					origem.removeAresta(a1);
				
			}
			
		}
		vertice.limparArestas();// limpa sua lista de vertices
		this.vertices.remove(v);
		this.tamanho--;
	}

	/* (non-Javadoc)
	 * @see util.IGrafo#removerAresta(util.impl.Aresta)
	 */
	@Override
	public void removerAresta(Aresta a) {
		Iterator<Vertice> it = vertices.iterator();
		while(it.hasNext()){
			Vertice v = it.next();
			if(a.getOrigem().equals(v))
				v.removeAresta(a);
				v.removerArestaVizinho(a);
			
		}
	}

}
