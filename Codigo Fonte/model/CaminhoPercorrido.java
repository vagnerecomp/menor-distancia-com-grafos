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
package model;


import java.util.Iterator;
import java.util.List;

import util.impl.Vertice;

/**
 * Classe responsável por calcularo tempo gasto dos percursos. Este método será
 * de grande importância no momento que for solicitado o percurso de menor
 * caminho
 * 
 * @author kroton
 *
 */
public class CaminhoPercorrido {

	private List<Vertice> pontos;
	private int tempo;

	/**
	 * @param menorCaminho
	 */
	public CaminhoPercorrido(List<Vertice> menorCaminho) {
		// TODO Auto-generated constructor stub
		this.pontos = menorCaminho;
	}

	/**
	 * @return the pontos
	 */
	public List<Vertice> getPontos() {
		return pontos;
	}

	/**
	 * @param pontos
	 *      the pontos to set
	 */
	public void setPontos(List<Vertice> pontos) {
		this.pontos = pontos;
	}

	/**
	 * @return the distanciaPercorrida
	 */
	public int getTempo() {
		return tempo;
	}

	/**
	 * @param distanciaPercorrida
	 *            the distanciaPercorrida to set
	 */
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	/** 
	 * Metodo que atualiza o caminho ja percorrido pelo algoritmo de Dijkstra, no final, ele tera uma lista
	 * com todos os vertices desde a origem, passando pelo ponto de coleta at� o banco
	 * 
	 * @param vertice que passou
	 * @param tempo
	 */
	public void atualizaCaminho(CaminhoPercorrido novo){
		Iterator<Vertice> it = novo.getPontos().iterator();//iterador que recebe os pontos da lista do cainho que recebe 
		while(it.hasNext())
			pontos.add(it.next());
		this.tempo+=novo.getTempo();
	}


}
