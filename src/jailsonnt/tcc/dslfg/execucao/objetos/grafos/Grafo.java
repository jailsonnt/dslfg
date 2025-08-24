package jailsonnt.tcc.dslfg.execucao.objetos.grafos;

import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.objetos.Conjunto;
import jailsonnt.tcc.dslfg.execucao.objetos.Numero;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.builder.EqualsBuilder;

public class Grafo implements Objeto{

	private String nome;
	private Set<Vertice> vertices = new HashSet<Vertice>();
	private Set<Aresta> arestas = new HashSet<Aresta>();

	public Grafo(String nome, Set<Vertice> vertices, Set<Aresta> arestas, String tipoDeGrafo) {
		this.nome = nome;
		for(Vertice vertice : vertices){
			vertice.fixarGrafo(this);
		}
		this.vertices = vertices;
		for (Aresta aresta : arestas){
			aresta.obterVerticeOrigem().fixarGrafo(this);
			aresta.obterVerticeDestino().fixarGrafo(this);
			aresta.fixarGrafo(this);
		}
		this.arestas = arestas;
		
		if(tipoDeGrafo.equals("grafo")){
			definirArestasParaGrafoNaoOrientado();
		}
	}
	
	private void definirArestasParaGrafoNaoOrientado(){
		Set<Aresta> arestas = new HashSet<Aresta>(this.arestas);
		for (Aresta aresta : arestas){
			Vertice verticeDeOrigemDaNovaAresta = aresta.obterVerticeDestino();
			Vertice verticeDeDestinoDaNovaAresta = aresta.obterVerticeOrigem();
			Aresta novaAresta = new Aresta(verticeDeOrigemDaNovaAresta, verticeDeDestinoDaNovaAresta);
			this.adicionarAresta(novaAresta);
		}
	}
	
	private Grafo(){}
	private void adicionarVertice(Vertice novoVértice){
		vertices.add(novoVértice);
	}
	private void adicionarAresta(Aresta novaAresta){
		arestas.add(novaAresta);
	}

	public String obterNome() {
		return this.nome;
	}

	public Set<Vertice> obterVertices() {
		return this.vertices;
	}

	public Set<Aresta> obterArestas() {
		return this.arestas;
	}

	public Conjunto obterVerticesAdjacentes(Vertice vertice) {
		Conjunto verticesAdjacentes = new Conjunto();
		for (Aresta arestaAtual : arestas) {
			if (arestaAtual.obterVerticeOrigem().equals(vertice)) {
				verticesAdjacentes.adicionarElemento(arestaAtual.obterVerticeDestino());
			}
		}
		return verticesAdjacentes;
	}
	
	public Vertice obterUmVerticeDe(){
		for (Vertice vertice: this.vertices){
			return vertice;
		}
		
		return null;
	}
	
	public Objeto obterPesoDaAresta(Vertice vérticeDeOrigem, Vertice vérticeDeDestino) {
		for (Aresta aresta : arestas){
			if (aresta.obterVerticeOrigem().equals(vérticeDeOrigem) && aresta.obterVerticeDestino().equals(vérticeDeDestino)) {
				return new Numero(aresta.obterPeso());
			}
		}
		return null;
	}
	
	public Vertice obterVertice(String vérticeProcurado) {
		for (Vertice vérticeAtual : vertices){
			if (vérticeProcurado.equals(vérticeAtual.obterNome())){
				return vérticeAtual;
			}
		}
		return null;
	}
	
	public Conjunto obterTodosOsVertices() {
		Conjunto conjunto = new Conjunto();
		for (Vertice vertice : vertices) {
			conjunto.adicionarElemento(vertice);
		}
		return conjunto;
	}
	
	public Conjunto obterTodosAsArestas() {
		Conjunto conjunto = new Conjunto();
		for (Aresta vertice : arestas) {
			conjunto.adicionarElemento(vertice);
		}
		return conjunto;
	}

	@Override
	public String toString() {
		String saída = "\nGrafo " + nome + ":\n";

		for (Aresta arestaAtual : arestas) {
			saída += "\t" + arestaAtual.toString()+ "\n";
		}
		saída += "Propriedades dos vértices: \n";
		String propriedades = "";
		for (Vertice vertice: vertices){
			if (vertice.possuiPropriedades()){
				propriedades += vertice.toString() + "\n";
			}
		}
		
		return saída + propriedades;
	}

	@Override
	public Objeto clonar() {
		Grafo grafoClonado = new Grafo();
		grafoClonado.nome = nome;
		for (Aresta aresta: arestas){
			grafoClonado.adicionarAresta(aresta.clonar());
		}
		for (Vertice vertice: vertices){
			grafoClonado.adicionarVertice(vertice.clonar());
		}
		return grafoClonado;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Grafo){
			if (!compararListaDeVertice(obj) || !compararListaDeArestas(obj)){
				return false;
			}
			List<String> itensNaoComparaveis = new ArrayList<String>();
			itensNaoComparaveis.add("vertices");
			itensNaoComparaveis.add("arestas");
			return EqualsBuilder.reflectionEquals(this, obj, itensNaoComparaveis);
		}else{
			return false;
		}
	}
	
	private boolean compararListaDeVertice(Object obj){
		Grafo grafoEstudado = (Grafo) obj;
		if (grafoEstudado.obterVertices().size() == this.obterVertices().size()){
			for (Vertice verticeDoContextoAtual : this.obterVertices()){
				boolean encontrouVertice = false;
				for (Vertice verticeDoGrafoEstudado: grafoEstudado.obterVertices()){
					if (verticeDoContextoAtual.equals(verticeDoGrafoEstudado)){
						encontrouVertice = true;
						break;
					}
				}
				if (!encontrouVertice){
					return false;
				}
			}
		}
		return true;
	}
	
	private boolean compararListaDeArestas(Object obj){
		Grafo grafoEstudado = (Grafo) obj;
		if (grafoEstudado.obterArestas().size() == this.obterArestas().size()){
			for (Aresta arestaDoContextoAtual : this.obterArestas()){
				boolean encontrouAresta = false;
				for (Aresta arestaDoGrafoEstudado: grafoEstudado.obterArestas()){
					if (arestaDoContextoAtual.equals(arestaDoGrafoEstudado)){
						encontrouAresta = true;
						break;
					}
				}
				if (!encontrouAresta){
					return false;
				}
			}
		}
		return true;
	}

}
