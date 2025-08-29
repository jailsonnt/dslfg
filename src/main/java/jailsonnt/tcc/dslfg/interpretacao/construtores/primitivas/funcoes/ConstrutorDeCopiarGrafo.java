package jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes;

import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.CopiarGrafo;

public class ConstrutorDeCopiarGrafo implements ConstrutorFuncao {
	private String nomeDoGrafo;

	public ConstrutorDeCopiarGrafo(String nomeDoGrafo) {
		this.nomeDoGrafo = nomeDoGrafo;
	}

	@Override
	public Funcao obterFuncao() {
		return new CopiarGrafo(nomeDoGrafo);
	}

}
