package jailsonnt.tcc.dslfg.execucao.primitivas;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;


public class Despejar implements Executavel {
	
	private String nomeVariável;

	public Despejar(String nomeVariável) {
		this.nomeVariável = nomeVariável;
	}

	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		Objeto variávelParaDespejar = ((Objeto) contextoDeExecução.obterVariavel(nomeVariável, contextoDeExecução)).clonar();
		contextoDeExecução.adicionarVariávelEmDespejo(nomeVariável, variávelParaDespejar);
	}

	@Override
	public Executavel obterCópia() {
		return new Despejar(nomeVariável);
	}

}
