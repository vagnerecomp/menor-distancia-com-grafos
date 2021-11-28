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



/**
 * Classe que servira de ligacao entre dois vertices do grafo
 * @author kroton
 *
 */
public class Aresta {
	private Vertice origem;
	private Vertice destino;
	private double peso;
	
	/**
	 * @param origem
	 * @param destino
	 * @param peso
	 */
	public Aresta(Vertice origem, Vertice destino, double peso) {
		this.origem = origem;
		this.destino = destino;
		this.peso = peso;
	}

	/**
	 * @return the origem
	 */
	public Vertice getOrigem() {
		return origem;
	}

	/**
	 * @param origem the origem to set
	 */
	public void setOrigem(Vertice origem) {
		this.origem = origem;
	}

	/**
	 * @return the destino
	 */
	public Vertice getDestino() {
		return destino;
	}

	/**
	 * @param destino the destino to set
	 */
	public void setDestino(Vertice destino) {
		this.destino = destino;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	/**
     * Método que compara 2 objetos Arestas. O critério de comparação são: a origem, o destino e o peso.
     * 
     * @param obj Objeto que será comparado.
     * @return True, se iguais. Else, o contrário.
     */
	@Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj instanceof Aresta) {
            Aresta aresta = (Aresta) obj;
            if (this.origem.equals(aresta.getOrigem()) && this.destino.equals(aresta.getDestino()) && this.peso == aresta.getPeso())
                return true;
        }
        return false;
    }
	
	
}
