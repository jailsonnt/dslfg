package jailsonnt.tcc.dslfg.execucao.primitivas;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.objetos.grafos.Aresta;
import jailsonnt.tcc.dslfg.execucao.objetos.grafos.Grafo;
import jailsonnt.tcc.dslfg.execucao.objetos.grafos.Vertice;

import java.util.HashSet;
import java.util.Set;

public class AtribuicaoDeGrafo implements Executavel {
	private String nome;
	private String tipoDeGrafo;
	private Set<Vertice> vértices;
	private Set<Aresta> arestas ;
	
	public AtribuicaoDeGrafo(String nome, Set<Vertice> vertices, Set<Aresta> arestas, String tipoDegrafo) {
		this.nome = nome;
		this.tipoDeGrafo = tipoDegrafo;
		this.vértices = vertices;
		this.arestas = arestas;
	}
	
	@Override
	public void executar(ContextoDeExecucao contextoDeExecucao) throws ExcecaoEmTempoDeExecucao {
		for (Vertice verticeAtual:vértices){
			verticeAtual.definirValoresNasPropriedadesComVariaveis(contextoDeExecucao);
		}
		Set<Vertice> vértices = copiarListaDeVértices();
		Set<Aresta> arestas = copiarListaDeArestas();
		
		contextoDeExecucao.adicionarVariável(nome, new Grafo(nome, vértices, arestas, tipoDeGrafo));
		
	}

	private Set<Aresta> copiarListaDeArestas() {
		Set<Aresta> arestas = new HashSet<Aresta>();
		for (Aresta aresta : this.arestas){
			arestas.add(aresta);
		}
		return arestas;
	}

	private Set<Vertice> copiarListaDeVértices() {
		Set<Vertice> vértices = new HashSet<Vertice>();
		for (Vertice vertice : this.vértices){
			vértices.add(vertice);
		}
		return vértices;
	}

	@Override
	public Executavel obterCópia() {
		return new AtribuicaoDeGrafo(nome, vértices, arestas, tipoDeGrafo);
	}

}
