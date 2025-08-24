package jailsonnt.tcc.dslfg.execucao.primitivas;

import java.util.ArrayList;
import java.util.Map;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;


public class ContextoDeExecucaoSimples extends ContextoDeExecucaoAbstrato implements Executavel {
	
	public ContextoDeExecucaoSimples() {}
	
	public ContextoDeExecucaoSimples(ArrayList<Executavel> executáveis, Map<String, ContextoDeExecucao> funções) {
		this.executáveis = executáveis;
		this.funções = funções;
		this.definirContextoDeExecuçãoPrincipalParaFunção(this);
	}

	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		for (Executavel comandoAtual : executáveis) {
			comandoAtual.executar(this);
		}
	}

	@Override
	public Executavel obterCópia() {
		ArrayList<Executavel> executáveis = new ArrayList<Executavel>();
		for (Executavel executavel : this.executáveis){
			executáveis.add(executavel.obterCópia());
		}
		return new ContextoDeExecucaoSimples(executáveis, funções);
	}

}
