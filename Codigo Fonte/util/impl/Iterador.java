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

import util.IIterador;

/**
 * Classe que serve de implementação de um iterador para uma lista encadeada.
 * Seu objetivo é auxiliar uma varredura em uma lista encadeada.
 * 
 * @author Saulo Araujo
 * 
 * @see br.uefs.ecomp.CGoes.Util.No
 */
public class Iterador implements IIterador {

	private No novoNo;

	/**
	 * Construtor da classe Iterador.
	 * 
	 * @param primeiro
	 *            No que referencia o primeiro No da lista.
	 */
	public Iterador(No primeiro) {
		novoNo = primeiro;
	}

	/**
	 * Método que diz se há um próximo item na lista.
	 * 
	 * @return Verdadeiro, caso haja um próximo elemento ou Falso, caso
	 *         contrário.
	 */
	@Override
	public boolean hasNext() {
		return (novoNo != null);
	}

	/**
	 * Método que retorna o objeto da célula atual e muda o No atual para a
	 * próximao no da lista.
	 * 
	 * @return O objeto do No atual ou null se o No atual for null.
	 */
	@Override
	public Object next() {
		if (!hasNext())
			return null;
		else {
			Object objeto = novoNo.getObjeto();
			novoNo = novoNo.getProximo();
			return objeto;
		}
	}

}