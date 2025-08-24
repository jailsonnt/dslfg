package jailsonnt.tcc.dslfg.execucao.decorador;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.objetos.Booleano;
import jailsonnt.tcc.dslfg.execucao.primitivas.Retorno;

public class DecoradorRetorno implements Executavel{
	private Retorno retorno;
	
	public DecoradorRetorno(String nomeDaVariavel) {
		this.retorno = new Retorno(nomeDaVariavel);
	}

	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		if (contextoDeExecução.obterVariavel(retorno.obterNomeDaVariavel(), contextoDeExecução).equals(new Booleano(false))){
			throw new ExcecaoEmTempoDeExecucao("Variavel " + retorno.obterNomeDaVariavel() + " não encontrada.");
		}
		retorno.executar(contextoDeExecução);
	}

	@Override
	public Executavel obterCópia() {
		return new DecoradorRetorno(retorno.obterNomeDaVariavel());
	}

}
