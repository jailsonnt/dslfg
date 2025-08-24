package jailsonnt.tcc.dslfg.execucao.objetos.grafos;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.objetos.Booleano;
import jailsonnt.tcc.dslfg.execucao.objetos.Conjunto;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Vertice implements Objeto{
	private String nome;
	private Map<String, Object> propriedades = new HashMap<String, Object>();
	private Grafo grafo;

	public Vertice(String nomeDoVertice) {
		this.nome = nomeDoVertice;
	}

	public String obterNome() {
		return this.nome;
	}
	
	public Grafo obterGrafo(){
		return this.grafo;
	}
	
	void fixarGrafo(Grafo grafo){
		this.grafo = grafo;
	}
	
	public void definirValoresNasPropriedadesComVariaveis(ContextoDeExecucao contextoDeExecução){
		HashSet<String> listaDeCódigosDasPropriedades = new HashSet<String>(this.propriedades.keySet());
		for (String códigoDoVértice: listaDeCódigosDasPropriedades ){
			Object objetoAtual = propriedades.get(códigoDoVértice);
			if (objetoAtual instanceof String){
				Objeto retorno = contextoDeExecução.obterVariavel(objetoAtual.toString(), contextoDeExecução);
				propriedades.put(códigoDoVértice, retorno);
			}
		}
	}
	
	public void adicionarPropriedade(String nome, Object valor){
		propriedades.put(nome, valor);
	}
	
	public void adicionarPropriedades(Map<String, Object> propriedades){
		this.propriedades.putAll(propriedades);
		
	}
	
	public Conjunto funçãoObterVerticesAdjacentes(){
		return grafo.obterVerticesAdjacentes(this);
	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj,"grafo");
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public String toString() {
		String retorno = nome;
		HashSet<String> listaDeCódigosDasPropriedades = new HashSet<String>(this.propriedades.keySet());
		for (String códigoDoVértice: listaDeCódigosDasPropriedades ){
			Object objetoAtual = propriedades.get(códigoDoVértice);
			retorno += " com " + códigoDoVértice + " = " + objetoAtual.toString();
		}
		return retorno;
	}

	@Override
	public Vertice clonar() {
		Vertice vértice = new Vertice(this.nome);
		vértice.fixarGrafo(this.grafo);
		vértice.adicionarPropriedades(propriedades);
		return vértice;
	}

	public Objeto obterPropriedade(String nomeDaPropriedade) {
		if (propriedades.get(nomeDaPropriedade) == null){
			return new Booleano(false);
		}else{
			return (Objeto) propriedades.get(nomeDaPropriedade);
		}
	}

	public boolean possuiPropriedades() {
		if (propriedades.size() > 0){
			return true;
		}
		return false;
	}
	
}
