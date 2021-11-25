/**
 * Componente Curricular: Módulo Integrado de Programação
 * Autor: Saulo araujo	
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
 * Classe que se comporta como no de uma lista encadeada.
 * Armazena um objeto e o endereço da próxima célula.
 *
 * @author Saulo araujo
 */
public class No {
    
    private Object objeto;
    private No proximo;
    
    /**
     * Construtor da classe No.
     * 
     * @param objeto Objeto a ser armazenado na celula.
     */
    public No (Object objeto) {
        this.objeto = objeto;
    }

    /**
     * Metodo que retorna o objeto que o No armazena.
     * 
     * @return O Objeto da No.
     */
    public Object getObjeto() {
        return objeto;
    }

    /**
     * Método que retorna a próximo No da lista.
     * 
     * @return O próximo No da lista.
     */
    public No getProximo() {
        return proximo;
    }

    /**
     * Método que atribui um novo No próximo.
     * 
     * @param proximo No que será atribuída.
     */
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    
}
