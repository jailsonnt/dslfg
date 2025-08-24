package jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes;

import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.ObterVertice;

public class ConstrutorObterVertice implements ConstrutorFuncao {
	private String nomeDoGrafo;
	private String nomeDoVértice;
	
	public ConstrutorObterVertice(String nomeDoGrafo, String nomeDoVértice) {
		this.nomeDoGrafo = nomeDoGrafo;
		this.nomeDoVértice = nomeDoVértice;
	}

	@Override
	public Funcao obterFuncao() {
		return new ObterVertice(nomeDoGrafo, nomeDoVértice);
	}

}
