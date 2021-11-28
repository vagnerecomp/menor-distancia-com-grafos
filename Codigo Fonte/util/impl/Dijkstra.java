/**
 * Componente Curricular: Módulo Integrado de Programação
 * Autor: José Solenir Lima Figuerêdo
 * Data:  05/12/2014
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

import model.CaminhoPercorrido;
import util.IListaOrdenada;

/**
 * Classe que implementa o algoritmo de Dijkstra com a finalidade de encontrar o
 * percurso de menor caminho entre 2 pontos em um grafo.
 * 
 * @author Solenir Figuerêdo
 */
public class Dijkstra {
    
    Vertice verticeCaminho;
    Vertice atual;
    Vertice vizinho;
    List <Vertice>naoVisitados;
    List <Vertice>menorCaminho;

    /**
     * Construtor da classe Dijkstra.
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public Dijkstra() {
        naoVisitados = new LinkedList<Vertice>();
        menorCaminho = new LinkedList<Vertice>();
    }
   
    /**
     * Método que busca o menor caminho entre 2 pontos em um grafo.
     * 
     * @param grafo Grafo contendo os vértices.
     * @param origem Vertice de origem.
     * @param destino Vertice de destino.
     * @return Percurso contendo o menor caminho entre 2 pontos no grafo.
     * @throws DadoNaoEncontradoException Lança exceção caso ocorra alguma falha ao encontrar o menor caminho.
     */
	public CaminhoPercorrido encontrarMenorCaminhoDijkstra(Grafo grafo, Vertice origem, Vertice destino) {

        menorCaminho.add(origem);

        // Atribui 0 para a distância da origem, e 9999 para os demais vértices.
        // Atribui falso para o atributo visitado do vértice.
        // Atribui null para o pai do vértice.
        for (int i = 0; i < grafo.getVertices().size(); i++) {
            Vertice aux = (Vertice) grafo.getVertices().get(i);
            if (aux.getNome().equals(origem.getNome()))
                aux.setDistanciaPercorrida(0);
            else
                aux.setDistanciaPercorrida(9999);
            aux.setVisitada(false);
            aux.setPai(null);
            this.naoVisitados.add(aux);
        }

        // Ordena a lista naoVisitados.
        Iterator<Vertice> it = naoVisitados.iterator();
        IListaOrdenada listaOrdenada = new ListaOrdenada();
        while (it.hasNext()) listaOrdenada.insere((Comparable) it.next());
        it = listaOrdenada.iterator();
        naoVisitados.clear();
        while (it.hasNext()) naoVisitados.add(it.next());

        // Passa por todos os vértices e armazena a menor distância partindo da origem até os demais vértices.
        while (!this.naoVisitados.isEmpty()) {
            atual = this.naoVisitados.get(0); // Pega-se sempre o de menor distância, que vai estar no início da lista ao ordenar.
            
            for (int i = 0; i < atual.getArestas().size(); i++) {
                vizinho = ((Aresta)atual.getArestas().get(i)).getDestino();
                
                if (!vizinho.isVisitada()) {
                    if (vizinho.getDistanciaPercorrida() > (atual.getDistanciaPercorrida() + ((Aresta)atual.getArestas().get(i)).getPeso())) {
                        vizinho.setDistanciaPercorrida(atual.getDistanciaPercorrida() + ((Aresta)atual.getArestas().get(i)).getPeso());
                        vizinho.setPai(atual);
                        if (vizinho == destino) {
                            menorCaminho.clear();
                            verticeCaminho = vizinho;
                            menorCaminho.add(vizinho);
                            
                            // Insere todos os vértices pais anteriores que formam o caminho até o destino na lista menorCaminho.
                            while (verticeCaminho.getPai() != null) {
                                menorCaminho.add(verticeCaminho.getPai());
                                verticeCaminho = verticeCaminho.getPai();
                            }
                            
                           //ODENA LISTA DE MeNOR CAMINHO, PARA O MENOR PESO FICAR PRIMEIRO, GERANDO O CAMINHO DESDE A ORIGEM
                            it = menorCaminho.iterator();
                            listaOrdenada.deletarLista();
                            while (it.hasNext()) listaOrdenada.insere((Comparable) it.next());
                            it = listaOrdenada.iterator();
                            menorCaminho.clear();
                            while (it.hasNext()) menorCaminho.add(it.next());
                        }
                    }
                }
            }
            atual.setVisitada(true);
            
            // Remove o Vertice atual da lista naoVisitados.            
            // Ordena a lista naoVisitados.
            it = naoVisitados.iterator();
            listaOrdenada.deletarLista();
            while (it.hasNext()) {
                Vertice next = it.next();
                if (next != atual)
                    listaOrdenada.insere((Comparable) next);
            }
            it = listaOrdenada.iterator();
          	naoVisitados.clear();
            while (it.hasNext()) naoVisitados.add(it.next());
        }
        CaminhoPercorrido cam = new CaminhoPercorrido(menorCaminho);
        
        return cam;
    }
    
}