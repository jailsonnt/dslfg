package jailsonnt.tcc.dslfg.execucao.primitivas.funcoes;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.objetos.Iterador;
import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;

public class ObterProximoItemDeIterador implements Funcao {
	private String nomeDoIterador;
	private Objeto retorno;

	public ObterProximoItemDeIterador(String nomeDoIterador) {
		this.nomeDoIterador = nomeDoIterador;
	}

	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		Iterador iterador = (Iterador) contextoDeExecução.obterVariavel(nomeDoIterador, contextoDeExecução);
		retorno = iterador.obterProximoItem();
	}

	@Override
	public Objeto obterResultado() {
		return retorno;
	}

	@Override
	public Executavel obterCópia() {
		return new ObterProximoItemDeIterador(nomeDoIterador);
	}

}
