package jailsonnt.tcc.dslfg.execucao.primitivas.funcoes;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.objetos.Conjunto;
import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;

public class ObterIterador implements Funcao {
	private String nomeDoConjunto;
	private Objeto resultado;
	
	public ObterIterador(String nomeDoConjunto) {
		this.nomeDoConjunto = nomeDoConjunto;
	}

	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		Conjunto conjunto = (Conjunto) contextoDeExecução.obterVariavel(nomeDoConjunto, contextoDeExecução);
		resultado = conjunto.obterIterador();
	}

	@Override
	public Objeto obterResultado() {
		return resultado;
	}

	@Override
	public Executavel obterCópia() {
		return new ObterIterador(nomeDoConjunto);
	}

}
