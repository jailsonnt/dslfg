package jailsonnt.tcc.dslfg.execucao.primitivas.funcoes;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.objetos.grafos.Grafo;
import jailsonnt.tcc.dslfg.execucao.objetos.grafos.Vertice;
import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;

public class ObterPesoDaAresta implements Funcao {
	private String nomeVérticeDeOrigem;
	private String nomeVérticeDeDestino;
	private Objeto resultado;
	
	public ObterPesoDaAresta(String vérticeDeOrigem, String vérticeDeDestino) {
		this.nomeVérticeDeOrigem = vérticeDeOrigem;
		this.nomeVérticeDeDestino = vérticeDeDestino;
	}

	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		Vertice vérticeDeOrigem = (Vertice) contextoDeExecução.obterVariavel(nomeVérticeDeOrigem, contextoDeExecução);
		Vertice vérticeDeDestino =(Vertice) contextoDeExecução.obterVariavel(nomeVérticeDeDestino, contextoDeExecução);
		Grafo grafo = vérticeDeOrigem.obterGrafo();
		resultado = grafo.obterPesoDaAresta(vérticeDeOrigem, vérticeDeDestino);

	}

	@Override
	public Objeto obterResultado() {
		return resultado;
	}

	@Override
	public Executavel obterCópia() {
		return new ObterPesoDaAresta(nomeVérticeDeOrigem, nomeVérticeDeDestino);
	}

}
