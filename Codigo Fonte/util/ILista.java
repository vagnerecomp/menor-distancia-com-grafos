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
 * Interface com as assinaturas dos métodos que uma classe deve ter ao implementar uma ILista.
 * 
 * @author Saulo Araujo
 */
public interface ILista{

    /**
     * Método que diz se a lista está vazia.
     * 
     * @return True, caso vazia. Else, caso contrário.
     */
    public boolean estaVazia();

    /**
     * Método responsável por verificar o tamanho da lista encadeada, ou seja,
     * a quantidade de objetos contidos na mesma.
     * 
     * @return um inteiro representando o tamanho da lista.
     */
    public int tamanho();

    /**
     * Método que insere um objeto no início da lista.
     * 
     * @param o Objeto que será inserido.
     */
    public void insereInicio(Object o);

    /**
     * Método que insere um objeto no final da lista.
     * 
     * @param o Objeto que será inserido.
     */
    public void insereFinal(Object o);

    /**
     * Método que remove um objeto do início da lista.
     * 
     * @return O objeto que foi removido.
     * 
     */
    public Object removeInicio();

    /**
     * Método que remove um objeto do final da lista.
     * 
     * @return O objeto que foi removido.
     * 
     */
    public Object removeFinal();

    /**
     * Método que retorna um objeto numa determinada posição da lista, sem removê-lo.
     * 
     * @param index int com o índice determinado.
     * 
     * @return O objeto do índice.
     * 
     */
    public Object recupera(int index);
    /**
     * 
     * @return Iterador da Lista
     */
    public IIterador iterator();

    
    
    
}
