package jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes;

import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.ObterProximoItemDeIterador;

public class ConstrutorDeObterProximoItemDeIterador implements ConstrutorFuncao {
	private String nomeDoIterador;

	public ConstrutorDeObterProximoItemDeIterador(String nomeDoIterador) {
		this.nomeDoIterador = nomeDoIterador;
	}

	@Override
	public Funcao obterFuncao() {
		return new ObterProximoItemDeIterador(nomeDoIterador);
	}

}
