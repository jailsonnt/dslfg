package jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes;

import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.ObterPropriedade;

public class ConstrutorDeObterPropriedade implements ConstrutorFuncao {
	private String nomeDaPropriedade;
	private String nomeDoVértice;
	
	public ConstrutorDeObterPropriedade(String nomeDaPropriedade, String nomeDoVértice) {
		this.nomeDaPropriedade = nomeDaPropriedade;
		this.nomeDoVértice = nomeDoVértice;
	}

	@Override
	public Funcao obterFuncao() {
		return new ObterPropriedade(nomeDaPropriedade, nomeDoVértice);
	}

}
