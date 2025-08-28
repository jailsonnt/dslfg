package jailsonnt.tcc.dslfg.execucao;

import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;



public interface Executavel {
	
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao;
	
	public Executavel obterCópia();

}
