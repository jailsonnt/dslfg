package jailsonnt.tcc.dslfg.execucao.primitivas;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;

import java.util.ArrayList;
import java.util.Map;

public class AcaoDeInstrucaoPercorrerGrafo extends ContextoDeExecucaoAbstrato implements Objeto, Executavel {
	
	public void definirListaDePrimitivas(ArrayList<Executavel> executáveis){
		this.executáveis = executáveis;
	}
	
	public void definirMemória(Map<String, Objeto> memória){
		this.memória = memória;
	}

	@Override
	public Objeto clonar() {
		return null;
	}

	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		ContextoDeExecucaoAbstrato contextoAnterior = (ContextoDeExecucaoAbstrato) contextoDeExecução;
		contextoAnterior.definirContextoAnterior(this.contextoAnterior);
		this.contextoAnterior = contextoAnterior;
		for (Executavel comandoAtual : executáveis) {
			comandoAtual.executar(this);
		}
	}

	@Override
	public Executavel obterCópia() {
		return new AcaoDeInstrucaoPercorrerGrafo();
	}

	public void definirContextoAnterior(ContextoDeExecucao contextoDeExecução) {
		this.contextoAnterior = contextoDeExecução;
	}

}
