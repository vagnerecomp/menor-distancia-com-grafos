/**
 * Componente Curricular: M�dulo Integrado de Programa��o
 * Autor: Saulo Araujo
 * Data:  13/04/2016
 *
 * Declaro que este c�digo foi elaborado por mim de forma individual e
 * n�o cont�m nenhum trecho de c�digo de outro colega ou de outro autor, 
 * tais como provindos de livros e apostilas, e p�ginas ou documentos 
 * eletr�nicos da Internet. Qualquer trecho de c�digo de outra autoria que
 * uma cita��o para o n�o a minha est� destacado com autor e a fonte do
 * c�digo, e estou ciente que estes trechos n�o ser�o considerados para fins
 * de avalia��o. Alguns trechos do c�digo podem coincidir com de outros
 * colegas pois estes foram discutidos em sess�es tutorias.
 */
package util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import util.impl.Aresta;
import util.impl.Grafo;
import util.impl.Vertice;

/**
 * @author SO
 *
 */
public class TesteGrafo {

	@Test
	public void testeBuscaVertice(){
		Grafo g1 = new Grafo();
		Vertice v1 = new Vertice("Loja 1");
		assertNotNull(v1);
		Vertice v2 = new Vertice("Loja 2");
		assertNotNull(v2);
		Vertice v3 = new Vertice("Loja 3");
		assertNotNull(v3);
		Vertice v4 = new Vertice("Loja 4");
		assertNotNull(v4);
		Vertice v5 = new Vertice("Loja 5");
		assertNotNull(v5);
		g1.inserirVertice(v1);
		g1.inserirVertice(v2);
		g1.inserirVertice(v3);
		g1.inserirVertice(v4);
		g1.inserirVertice(v5);
		Vertice busca = g1.buscarVertice(v3);
		assertNotNull(busca);
		assertEquals(busca.getNome(),"Loja 3");
		
	}
	
	
	
	@Test
	public void testeInserirVertice() {
		Grafo g1 = new Grafo();
		Vertice v1 = new Vertice("Loja 1");
		assertNotNull(v1);
		Vertice v2 = new Vertice("Loja 2");
		assertNotNull(v2);
		Vertice v3 = new Vertice("Loja 3");
		assertNotNull(v3);
		g1.inserirVertice(v1);
		g1.inserirVertice(v2);
		g1.inserirVertice(v3);
		assertNotNull(g1);
		assertEquals(g1.tamanho(),3);
		
	}
	
	@Test
	public void testeInsereAresta(){
		Grafo g1 = new Grafo();
		Vertice v1 = new Vertice("Loja 1");
		assertNotNull(v1);
		g1.inserirVertice(v1);
		Vertice v2 = new Vertice("Loja 2");
		assertNotNull(v2);
		g1.inserirVertice(v2);
		Vertice v3 = new Vertice("Loja 3");
		assertNotNull(v3);
		g1.inserirVertice(v3);
		
		
		g1.inserirAresta(v1, v2, 1);
		g1.inserirAresta(v2, v3, 2);
		
		
	}

}
