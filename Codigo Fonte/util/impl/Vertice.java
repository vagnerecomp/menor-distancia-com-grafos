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
package util.impl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Classe vertice que será usada no grafo
 * @author kroton
 *
 */
public class Vertice {
	
	private String nome;
	private boolean visitada; // verifica se o vertice ja foi visitado ou não, ajudará no algoritmo de djk
	private double distanciaPercorrida; // distancia percorrida até esse ponto, ajudará no algoritmo de djk
	private List<Aresta> arestas; 
	private List<Vertice> verticesVizitados; //vertices vizinhos que ja passou, para usar em djk
	private List<Vertice> vizinhos; // vertices que tem arestas com esse vertice
	private Vertice pai; // origem de onde vem o caminho de dijkstra
	
	public Vertice getPai() {
		return pai;
	}

	public void setPai(Vertice pai) {
		this.pai = pai;
	}

	public Vertice (String conteudo){
		this.nome = conteudo;
		arestas = new LinkedList<Aresta>();
		vizinhos = new LinkedList<Vertice>();
	}
	
	/**
	 * método que retorna de qual vertice o caminho v
	 * @return the origem
	 */
	public List<Vertice> getVizinhos() {
		return vizinhos;
	}

	/**
	 * @return the conteudo
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param conteudo the conteudo to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the visitada
	 */
	public boolean isVisitada() {
		return visitada;
	}

	/**
	 * @param visitada the visitada to set
	 */
	public void setVisitada(boolean visitada) {
		this.visitada = visitada;
	}

	/**
	 * @return the distanciaPercorrida
	 */
	public double getDistanciaPercorrida() {
		return distanciaPercorrida;
	}

	/**
	 * @param distanciaPercorrida the distanciaPercorrida to set
	 */
	public void setDistanciaPercorrida(double distanciaPercorrida) {
		this.distanciaPercorrida = distanciaPercorrida;
	}

	/**
	 * @return the vertices
	 */
	public List<Aresta> getArestas() {
		return arestas;
	}

	/**
	 * @param vertices the vertices to set
	 */
	public void setVertices(List<Aresta> vertices) {
		this.arestas = vertices;
	}
	/**
	 * Metodo que insere uma aresta no grafo
	 * @param aresta a ser inserida
	 */
	public void iserirAresta(Aresta aresta){
		arestas.add(aresta);
		vizinhos.add(aresta.getDestino());
	}
	/**
	 * metodo que remove uma unica aresta do vertice
	 * @param aresta
	 */
	public void removeAresta(Aresta aresta){
		this.arestas.remove(aresta);
	}
	/**
	 * Metodo que limpa as lista de aresta que saem deste vertice, usado qunado o vertice for removido
	 */
	public void limparArestas(){
		this.arestas.clear();

	}
	/**
	 * 
	 * @param vertice Vizitado
	 */
	public void atualizarVizinhos(Vertice verticeVizitado){
		this.verticesVizitados.add(verticeVizitado);
	}
	
	/**
	 * 
	 */
	@Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj instanceof Vertice) {
            Vertice vertice = (Vertice) obj;
            if (this.getNome().equals(vertice.getNome())) {
                return true;
            }
        }
        return false;
    }
	
	public void removerArestaVizinho(Aresta a){
		Iterator <Vertice>it = vizinhos.iterator();
		while(it.hasNext()){
			Vertice v = it.next();
			if(a.getDestino().equals(v));
				this.vizinhos.remove(a);
		}
	}
	
	
}
