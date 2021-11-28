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
import util.ILista;

/**
 * Classe que se comporta como uma estrutura de lista encadeada.
 * 
 * @author Saulo Araujo
 * 
 * @see util.ILista
 */
public class Lista implements ILista {
    
    private No primeiro;
    private No ultimo;

    /**
     * Método que diz se a lista está vazia.
     * 
     * @return True, caso vazia. Else, caso contrário.
     */
    @Override
    public boolean estaVazia() {
        return (primeiro == null);
    }

    /**
     * Método que conta quantos objetos há na lista.
     * 
     * @return int com a quantidade de objetos que há na lista.
     */
    @Override
    public int tamanho() {
        int cont;
        No aux = primeiro;
        
        for (cont = 0; aux != null; aux = aux.getProximo()) cont++;
        
        return cont;
    }

    /**
     * Método que insere um objeto no início da lista.
     * 
     * @param o Objeto que será inserido.
     */
    @Override
    public void insereInicio(Object o) {
        No novo = new No(o);
        
        novo.setProximo(primeiro);
        primeiro = novo;
        
        if (ultimo == null)
            ultimo = novo;
    }

    /**
     * Método que insere um objeto no final da lista.
     * 
     * @param o Objeto que será inserido.
     */
    @Override
    public void insereFinal(Object o) {
        No novo = new No(o);
        
        if (estaVazia())
            primeiro = novo;
        else
            ultimo.setProximo(novo);
        
        ultimo = novo;
    }

    /**
     * Método que remove um objeto do início da lista.
     * 
     * @return O objeto que foi removido.
     */
    @Override
    public Object removeInicio()  {
        if (!estaVazia()) {
            No aux = primeiro;
            if (primeiro == ultimo)
                ultimo = null;
            primeiro = primeiro.getProximo();
            return aux.getObjeto();
        }
        
       return null;
    }

    /**
     * Método que remove um objeto do final da lista.
     * 
     * @return O objeto que foi removido.
     * 
     */
    @Override
    public Object removeFinal(){
        No aux1;
        
        if (!estaVazia()) {
            if (primeiro == ultimo) {
                aux1 = primeiro;
                primeiro = null;
                ultimo = null;
            }
            else {
                No aux2 = null;
                for (aux1 = primeiro; aux1.getProximo() != null; aux1 = aux1.getProximo())
                    aux2 = aux1;
                aux2.setProximo(null);
                ultimo = aux2;
            }
            return aux1.getObjeto();
        }
        
        return null;
    }

    /**
     * Método que retorna um objeto numa determinada posição da lista.
     * 
     * @param index int com o índice determinado.
     * 
     * @return O objeto do índice.
     * 
     */
    @Override
    public Object recupera(int index){
        No aux = primeiro;
        int cont;
        for (cont = 0; aux != null && cont < index; aux = aux.getProximo()) cont++;
        
        if (aux == null || cont != index)
            return null;
        else
            return aux.getObjeto();
    }

    /**
     * Método que retorna o iterador da lista.
     * 
     * @return O iterator da lista.
     */
	@Override
	public IIterador iterator() {
		return new Iterador(primeiro);
	}

   
}
