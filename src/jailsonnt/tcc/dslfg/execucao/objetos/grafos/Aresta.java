package jailsonnt.tcc.dslfg.execucao.objetos.grafos;

import jailsonnt.tcc.dslfg.execucao.Objeto;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Aresta implements Objeto{
	private Vertice verticeDeOrigem = null;
	private Vertice verticeDeDestino = null;
	private Double pesoDaAresta;
	private Grafo grafo;

	public Aresta(Vertice verticeDeOrigem, Vertice verticeDeDestino) {
		this.verticeDeOrigem = verticeDeOrigem;
		this.verticeDeDestino = verticeDeDestino;
	}
	
	public Grafo obterGrafo() {
		return this.grafo;
	}
	
	void fixarGrafo(Grafo grafo) {
		this.grafo= grafo;
	}

	public Vertice obterVerticeOrigem() {
		return this.verticeDeOrigem;
	}

	public Vertice obterVerticeDestino() {
		return this.verticeDeDestino;
	}
	
	public Double obterPeso () {
		return this.pesoDaAresta;
	}

	public void definirPeso(Double pesoDaAresta) {
		this.pesoDaAresta = pesoDaAresta;
	}
	
	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj, "grafo");
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
	
	@Override
	public String toString() {
		String saída ="";
		saída =  verticeDeOrigem.obterNome() + " ligado com " + verticeDeDestino.obterNome();
		if (null != this.obterPeso()) {
			saída += " Peso da aresta = " + this.obterPeso() ;
		}
		return saída;
	}

	@Override
	public Aresta clonar() {
		Aresta arestaClonada = new Aresta(verticeDeOrigem.clonar(), verticeDeDestino.clonar());
		arestaClonada.definirPeso(this.pesoDaAresta);
		arestaClonada.fixarGrafo(this.grafo);
		return arestaClonada;
	}

	
}
