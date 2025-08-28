package jailsonnt.tcc.dslfg.execucao.primitivas;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;

public class Retorno implements Executavel {
	private String nomeDaVariavel;
	private Objeto resultado;
	
	public Retorno(String nomeDaVariavel) {
		this.nomeDaVariavel = nomeDaVariavel;
	}

	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		resultado = contextoDeExecução.obterVariavel(nomeDaVariavel, contextoDeExecução);
		ContextoDeExecucaoAbstrato.ativarÉInstruçãoDeParada();
		ContextoDeExecucaoFuncao.definirResultadoDaInstruçãoDeRetorno(resultado);
	}
	
	public String obterNomeDaVariavel(){
		return nomeDaVariavel;
	}

	@Override
	public Executavel obterCópia() {
		return new Retorno(nomeDaVariavel);
	}

}
