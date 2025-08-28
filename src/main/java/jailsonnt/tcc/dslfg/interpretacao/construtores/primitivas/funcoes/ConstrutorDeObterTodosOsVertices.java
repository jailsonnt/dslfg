package jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes;

import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.ObterTodosOsVerticesDe;

public class ConstrutorDeObterTodosOsVertices implements ConstrutorFuncao {
	
	private String nomeDoGrafo;
	public ConstrutorDeObterTodosOsVertices(String nomeDoGrafo) {
		this.nomeDoGrafo = nomeDoGrafo;
	}
	@Override
	public Funcao obterFuncao() {
		return new ObterTodosOsVerticesDe(nomeDoGrafo);
	}

}
