package jailsonnt.tcc.dslfg.interpretacao.construtores.objetos;

import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.objetos.grafos.Aresta;
import jailsonnt.tcc.dslfg.execucao.objetos.grafos.Vertice;
import jailsonnt.tcc.dslfg.execucao.primitivas.AtribuicaoDeGrafo;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.ConstrutorDePrimitiva;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ConstrutorDeGrafo implements ConstrutorDePrimitiva{
	private static Map<Integer, ConstrutorDeGrafo> construtores = new HashMap<Integer, ConstrutorDeGrafo>();

	private String nome;
	private String tipoDeGrafo;
	private Set<Vertice> vértices = new HashSet<Vertice>();
	private Map<Integer, Aresta> arestas = new HashMap<Integer, Aresta>();
	private int identificadorDaArestaComPeso = 0;
	private double pesoDaAresta;
	private Map<Integer, Map<String, Object>> propriedadesDosVértices = new HashMap<Integer,Map<String, Object>>();

	private ConstrutorDeGrafo(String tipoDeGrafo) {
		this.tipoDeGrafo = tipoDeGrafo;
	}

	public void adicionarVertice(int identificadorDoVertice, String nomeDoVertice) {
		Vertice novoVertice = new Vertice(nomeDoVertice);
		if (propriedadesDosVértices.get(identificadorDoVertice) != null){
			novoVertice.adicionarPropriedades(propriedadesDosVértices.get(identificadorDoVertice));
		}
		Vertice verticeJaExistente = obterVertice(nomeDoVertice);
		if (verticeJaExistente == null){
			vértices.add(novoVertice);
		}
		

	}
	
	public Vertice obterVertice(String nome){
		for (Vertice vertice : vértices){
			if (vertice.obterNome().equals(nome)){
				return vertice;
			}
		}
		return null;
	}
	
	public void adicionarAresta(int identificadorDaAresta, String nomeDoVerticeOrigem,String nomeDoVerticeDestino) {
		Vertice verticeDeOrigem = obterVertice(nomeDoVerticeOrigem);
		Vertice verticeDeDestino = obterVertice(nomeDoVerticeDestino);
		Aresta novaAresta = new Aresta(verticeDeOrigem, verticeDeDestino);
		if (identificadorDaAresta == identificadorDaArestaComPeso){
			novaAresta.definirPeso(pesoDaAresta);
			identificadorDaArestaComPeso = 0;
		}
		arestas.put(identificadorDaAresta, novaAresta);
	}
	
	public void adicionarPesoDeAresta(int identificadorDaAresta, Double pesoDaAresta) {
		this.pesoDaAresta = pesoDaAresta;
		this.identificadorDaArestaComPeso = identificadorDaAresta;
	}
	
	public void adicionarPropriedadeEmVértice(int identificadorDoVértice, String nomeDaPropriedade,ConstrutorMultiTipos valor){
		Map<String, Object> propriedadesDoVértice;
		if (propriedadesDosVértices.get(identificadorDoVértice) != null){
			propriedadesDoVértice= this.propriedadesDosVértices.get(identificadorDoVértice);
		}else{
			propriedadesDoVértice = new HashMap<String, Object>();
		}
		propriedadesDoVértice.put(nomeDaPropriedade, valor.obterValor());
		this.propriedadesDosVértices.put(identificadorDoVértice, propriedadesDoVértice);
	}
	
	public void comNome(String nome) {
		this.nome = nome;
	}

	public static ConstrutorDeGrafo novoGrafo(int identificadorDoGrafo, String tipoDeGrafo) {
		ConstrutorDeGrafo construtorDeGrafo = new ConstrutorDeGrafo(tipoDeGrafo);
		construtores.put(identificadorDoGrafo, construtorDeGrafo);
		return construtorDeGrafo;
	}

	public static ConstrutorDeGrafo obterConstrutorDeGrafo(int identificadorDoGrafo) {
		return construtores.get(identificadorDoGrafo);
	}
	
	private Set<Aresta> transformaMapDeArestasEmSetDeArestas() {
		Set<Aresta> arestas = new HashSet<Aresta>();
		HashSet<Integer> listaDeCódigosDasArestas = new HashSet<Integer>(this.arestas.keySet());
		
		for (Integer códigoDaAresta: listaDeCódigosDasArestas ){
			arestas.add(this.arestas.get(códigoDaAresta));
		}
		return arestas;
	}
	
	@Override
	public Executavel obterComando() {
		Set<Aresta> arestas = transformaMapDeArestasEmSetDeArestas();
		return new AtribuicaoDeGrafo(nome, this.vértices, arestas, this.tipoDeGrafo);
	}

}
