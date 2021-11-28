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

/**
 * Interface com as assinaturas dos métodos que uma classe deve ter ao implementar uma IListaOrdenada.
 * 
 * @author Saulo Araujo
 */
public interface IListaOrdenada extends Iterable{

    /**
     * Método que verifica se a lista está vazia..
     * 
     * @return True, caso vazia. Else, caso contrário.
     */
    public boolean estaVazia();

    /**
     * Método que conta quantos objetos há na lista.
     * 
     * @return Int com a quantidade de objetos que há na lista.
     */
    public int tamanho();

    /**
     * Método que insere um objeto de modo que a lista se mantenha ordenada.
     * 
     * @param o - objeto que será inserido.
     */
    public void insere(Comparable o);

    /**
     * Método que remove um objeto da lista.
     * 
     * @param o - objeto que será removido.
     * 
     * @return o objeto que foi removido.
     * 
     * @throws DadoNaoEncontradoException - Lança exceção caso o objeto não faça parte da lista.
     */
    public Comparable remove(Comparable o);    

    /**
     * Método que retorna um objeto numa determinada posição da lista.
     * 
     * @param index - �?ndice determinado.
     * 
     * @return O objeto do índice.
     * 
     * @throws DadoNaoEncontradoException - Lança exceção caso não exista a posição do determinado índice ou caso o índice seja menor que 0.
     */
    public Comparable recupera(int index);
    
    /**
     * Método que deleta a lista.
     */
    public void deletarLista();
}