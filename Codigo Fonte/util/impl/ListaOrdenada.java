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

import util.IListaOrdenada;

/**
 * Classe que se comporta como uma estrutura de lista encadeada ordenada.
 * 
 * @author Saulo Arajo
 */
public class ListaOrdenada implements IListaOrdenada {

    private No primeiro;
    private No ultimo;
    
    /**
     * Método responsável por verificar se a lista está vazia.
     * 
     * @return Verdadeiro se estiver vázia, ou Falso caso contrário.
     */
    @Override
    public boolean estaVazia() {
        return (primeiro == null);
    }

    /**
     * Método que conta quantos objetos há na lista.
     * 
     * @return Int com a quantidade de objetos que há na lista.
     */
    @Override
    public int tamanho() {
        int cont;
        No aux = primeiro;
        
        for (cont = 0; aux != null; aux = aux.getProximo()) cont++;
        
        return cont;
    }

    /**
     * Método que insere um objeto de modo que a lista se mantenha ordenada.
     * 
     * @param o - objeto que será inserido.
     */
    @Override
    public void insere(Comparable o) {
        No novo = new No(o);
        if (estaVazia())
            primeiro = ultimo = novo;
        else {
            No aux, aux2 = null;
            
            for (aux = primeiro; aux != null && o.compareTo(aux.getObjeto()) > 0; aux = aux.getProximo()) aux2 = aux;
            
            if (aux2 == null) {
                novo.setProximo(primeiro);
                primeiro = novo;
            }
            else {
                aux2.setProximo(novo);
                novo.setProximo(aux);
                if (aux == null)
                    ultimo = novo;
            }
        }
    }

    /**
     * Método que remove um objeto da lista.
     * 
     * @param o - objeto que será removido.
     * 
     * @return o objeto que foi removido.
     * 
     * @throws DadoNaoEncontradoException - Lança exceção caso o objeto não faça parte da lista.
     */
    @Override
    public Comparable remove(Comparable o) {
        No aux, aux2 = null;
        
        for (aux = primeiro; aux != null && o.compareTo(aux.getObjeto()) != 0; aux = aux.getProximo()) aux2 = aux;
        
        if (aux != null) {
            if (aux2 == null) 
                primeiro = primeiro.getProximo();
            else
                aux2.setProximo(aux.getProximo());
            if (aux == ultimo)
                ultimo = aux2;
            return (Comparable) aux.getObjeto();
        }
        else
            return null;
    }

    /**
     * Método que retorna um objeto numa determinada posição da lista.
     * 
     * @param index - �?ndice determinado.
     * 
     * @return O objeto do índice.
     * 
     * @throws DadoNaoEncontradoException - Lança exceção caso não exista a posição do determinado índice ou caso o índice seja menor que 0.
     */
    @Override
    public Comparable recupera(int index) {
        int cont;
        No aux = primeiro;
        
        for (cont = 0; aux != null && cont < index; aux = aux.getProximo()) cont++;
        
        if (aux == null || cont != index)
            return null;
        else
            return (Comparable) aux.getObjeto();
    }

    /**
     * Método que retorna o iterador da lista.
     * 
     * @return O iterator da lista.
     */
    @Override
    public Iterator iterator() {
        return (Iterator) new Iterador(primeiro);
    }
    
    /**
     * Método que deleta a lista.
     */
    @Override
    public void deletarLista() {
        if (!estaVazia()) {
            primeiro = null;
            ultimo = null;
        }
    }
    
}

