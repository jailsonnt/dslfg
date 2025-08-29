package jailsonnt.tcc.dslfg.execucao.primitivas;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;



public class AtribuicaoPorExpressao implements Executavel{
	private String nome;
	private Funcao funcao;
	
	public AtribuicaoPorExpressao(String nome, Funcao funcao) {
		this.nome = nome;
		this.funcao = funcao;
	}

	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		funcao.executar(contextoDeExecução);
		Objeto resultado = funcao.obterResultado();
		contextoDeExecução.adicionarVariável(nome, resultado);
	}
	
	
	
	@Override
	public String toString() {
		return "AtribuicaoPorExpressao. Nome: " + nome +" funcao: "+ funcao.toString();
	}

	@Override
	public Executavel obterCópia() {
		Funcao novaFunção = (Funcao) funcao.obterCópia();
		return new AtribuicaoPorExpressao(nome, novaFunção);
	}

}
