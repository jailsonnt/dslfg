package jailsonnt.tcc.dslfg.execucao.primitivas.funcoes;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.objetos.grafos.Grafo;
import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;

public class ObterVertice implements Funcao {
	private String nomeDoGrafo;
	private String nomeDovértice;
	private Objeto resultado;
	
	public ObterVertice(String nomeDoGrafo, String nomeDoVértice) {
		this.nomeDoGrafo = nomeDoGrafo;
		nomeDovértice = nomeDoVértice;
	}

	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		Grafo grafo = (Grafo) contextoDeExecução.obterVariavel(nomeDoGrafo, contextoDeExecução);
		resultado = grafo.obterVertice(nomeDovértice);

	}

	@Override
	public Objeto obterResultado() {
		return resultado;
	}

	@Override
	public Executavel obterCópia() {
		return new ObterVertice(nomeDoGrafo, nomeDovértice);
	}

}
