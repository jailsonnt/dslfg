package jailsonnt.tcc.dslfg.execucao.primitivas;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.objetos.Booleano;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
@SuppressWarnings("static-access")
public abstract class ContextoDeExecucaoAbstrato implements ContextoDeExecucao {
	private static ContextoDeExecucao contextoPrincipal;
	protected ArrayList<Executavel> executáveis = new ArrayList<Executavel>();
	protected Map<String, Objeto> memória = new HashMap<String, Objeto>();
	protected Map<String, Objeto> despejo = new HashMap<String, Objeto>();
	protected Map<String, ContextoDeExecucao> funções = new HashMap<String, ContextoDeExecucao>();
	protected ContextoDeExecucao contextoAnterior;
	private static boolean éInstruçãoDeParada = false;

	
	protected ContextoDeExecucao obterContextoDeExecuçãoPrincipalParaFunção() {
		return this.contextoPrincipal;
	}
	
	protected void definirContextoDeExecuçãoPrincipalParaFunção(ContextoDeExecucao contextoPrincipal){
		this.contextoPrincipal = contextoPrincipal;
	}
	
	public void definirContextoAnterior(ContextoDeExecucao contextoAnterior){
		this.contextoAnterior = contextoAnterior;
	}
	
	@Override
	public void adicionarVariável(String nome, Objeto valor) {
		if (obterContextoParaAdicionarVariavel(nome) == null){
			memória.put(nome, valor);
		}else{
			ContextoDeExecucaoAbstrato contextoParaAdicionar = (ContextoDeExecucaoAbstrato) obterContextoParaAdicionarVariavel(nome);
			contextoParaAdicionar.memória.put(nome, valor);
		}
	}
	
	@Override
	public ContextoDeExecucao obterContextoParaAdicionarVariavel(String nome){
		if (memória.get(nome) != null){
			return this;
		}else{
			if (this.contextoAnterior != null) {
				return this.contextoAnterior.obterContextoParaAdicionarVariavel(nome);
			}else{
				return null;
			}
		}
	}

	@Override
	public void adicionarVariávelEmDespejo(String nome, Objeto valor) {
		despejo.put(nome, valor);
	}

	public Map<String, Objeto> obterDespejo() {
		return despejo;
	}

	public static void ativarÉInstruçãoDeParada() {
		éInstruçãoDeParada = true;
	}

	protected static boolean éInstruçãoDeParada() {
		return éInstruçãoDeParada;
	}

	protected void desativarÉInstruçãoDeParada() {
		éInstruçãoDeParada = false;
	}

	public int proximoNivelDeIdentação(int contadorDeTab) {
		return contadorDeTab - 1;
	}

	@Override
	public ContextoDeExecucao obterFunção(String nomeDaFunção) {
		return funções.get(nomeDaFunção);
	}

	@Override
	public Objeto obterVariavel(String nomeVariavelProcurada, ContextoDeExecucao contextoAnterior) {
		if (memória.containsKey(nomeVariavelProcurada)) {
			return memória.get(nomeVariavelProcurada);
		} else if (this.contextoAnterior != null) {
			return contextoAnterior.obterVariavel(nomeVariavelProcurada, this.contextoAnterior);
		}
		return new Booleano(false);
	}

	@Override
	public void removerVariavel(String nomeVariavelProcurada) {
		memória.remove(nomeVariavelProcurada);
	}

	@Override
	public Map<String, ContextoDeExecucao> obterFunções() {
		return this.funções;
	}

}