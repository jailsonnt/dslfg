package jailsonnt.tcc.dslfg.execucao.primitivas.funcoes;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.objetos.grafos.Grafo;
import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;

public class CopiarGrafo implements Funcao {
	private String nomeDoGrafo;
	private Objeto resultado;

	public CopiarGrafo(String nomeDoGrafo) {
		this.nomeDoGrafo = nomeDoGrafo;
	}
	
	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		Grafo grafo = (Grafo) contextoDeExecução.obterVariavel(nomeDoGrafo, contextoDeExecução);
		resultado = grafo.clonar();
	}

	@Override
	public Objeto obterResultado() {
		return resultado;
	}

	@Override
	public Executavel obterCópia() {
		return new CopiarGrafo(nomeDoGrafo);
	}

}
