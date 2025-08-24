package jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes;

import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.ObterTodasAsArestasDe;

public class ConstrutorDeObterTodasAsArestas implements ConstrutorFuncao {
	
	private String nomeDoGrafo;
	public ConstrutorDeObterTodasAsArestas(String nomeDoGrafo) {
		this.nomeDoGrafo = nomeDoGrafo;
	}
	@Override
	public Funcao obterFuncao() {
		return new ObterTodasAsArestasDe(nomeDoGrafo);
	}

}
