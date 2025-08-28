package jailsonnt.tcc.dslfg.execucao;

import java.util.Map;

public interface ContextoDeExecucao {

	public abstract void adicionarVariável(String nome, Objeto valor);
		
	public abstract void adicionarVariávelEmDespejo(String nome, Objeto valor);
	
	public abstract ContextoDeExecucao obterContextoParaAdicionarVariavel(String nome);

	public abstract Objeto obterVariavel(String nomeVariavelProcurada, ContextoDeExecucao contextoAnterior);
	
	public abstract void removerVariavel(String nomeVariavelProcurada);
	
	public abstract ContextoDeExecucao obterFunção(String nomeDaFunção);
	
	public abstract Map<String, ContextoDeExecucao> obterFunções();

}