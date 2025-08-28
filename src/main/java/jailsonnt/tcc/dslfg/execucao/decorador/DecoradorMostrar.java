package jailsonnt.tcc.dslfg.execucao.decorador;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.primitivas.Mostrar;

public class DecoradorMostrar implements Executavel{
	private Mostrar mostrar;
	
	public DecoradorMostrar(Object valorÀMostrar) {
		this.mostrar = new Mostrar(valorÀMostrar);
	}

	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		mostrar.executar(contextoDeExecução);
	}

	@Override
	public Executavel obterCópia() {
		return new DecoradorMostrar(mostrar.obterValorÀMostrar());
	}

}
