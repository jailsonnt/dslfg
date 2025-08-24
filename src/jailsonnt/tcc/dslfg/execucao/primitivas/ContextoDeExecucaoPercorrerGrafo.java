package jailsonnt.tcc.dslfg.execucao.primitivas;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.objetos.grafos.Grafo;
import jailsonnt.tcc.dslfg.execucao.objetos.grafos.Vertice;

import java.util.ArrayList;


public class ContextoDeExecucaoPercorrerGrafo extends ContextoDeExecucaoAbstrato implements Executavel {
	private String nomeDoGrafo;
	private String nomeDaFunção;
	private String nomeDoVerticeInicial;
	
	public ContextoDeExecucaoPercorrerGrafo(String nomeDoGrafo,String nomeDaFunção, String nomeDoVerticeInicial, ArrayList<Executavel> executáveis) {
		this.nomeDoGrafo = nomeDoGrafo;
		this.nomeDaFunção = nomeDaFunção;
		this.nomeDoVerticeInicial = nomeDoVerticeInicial;
		this.executáveis = executáveis;
	}

	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		ContextoDeExecucaoFuncao funçãoChamada = (ContextoDeExecucaoFuncao) contextoDeExecução.obterFunção(nomeDaFunção);
		funçãoChamada.adicionarValoresDosParâmetros(obterValoresDosParâmetros(contextoDeExecução));
		funçãoChamada.executar(contextoDeExecução);
	}
	
	private ArrayList<Objeto> obterValoresDosParâmetros(ContextoDeExecucao contextoDeExecução) {
		ArrayList<Objeto> valoresDosParâmetros = new ArrayList<Objeto>();
		Grafo grafo = (Grafo) contextoDeExecução.obterVariavel(nomeDoGrafo,contextoDeExecução);
		Vertice verticeInicial = grafo.obterVertice(nomeDoVerticeInicial);
		AcaoDeInstrucaoPercorrerGrafo açãoDeInstruçãoPercorrerGrafo = new AcaoDeInstrucaoPercorrerGrafo();
		açãoDeInstruçãoPercorrerGrafo.definirListaDePrimitivas(this.executáveis);
		açãoDeInstruçãoPercorrerGrafo.definirMemória(this.memória);
		açãoDeInstruçãoPercorrerGrafo.definirContextoAnterior(contextoDeExecução);
		valoresDosParâmetros.add(grafo);
		valoresDosParâmetros.add(verticeInicial);
		valoresDosParâmetros.add(açãoDeInstruçãoPercorrerGrafo);
		return valoresDosParâmetros;
	}
	
	@Override
	public Executavel obterCópia() {
		ArrayList<Executavel> executáveis = new ArrayList<Executavel>();
		for (Executavel executavel : this.executáveis){
			executáveis.add(executavel.obterCópia());
		}
		return new ContextoDeExecucaoPercorrerGrafo(nomeDoGrafo, nomeDaFunção, nomeDoVerticeInicial, executáveis);
	}
		
}
