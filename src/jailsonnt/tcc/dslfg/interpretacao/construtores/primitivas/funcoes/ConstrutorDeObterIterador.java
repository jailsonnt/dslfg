package jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes;

import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.ObterIterador;

public class ConstrutorDeObterIterador implements ConstrutorFuncao {
	private String nomeDoConjunto;
	
	public ConstrutorDeObterIterador(String nomeDoConjunto) {
		this.nomeDoConjunto = nomeDoConjunto;
	}

	@Override
	public Funcao obterFuncao() {
		return new ObterIterador(nomeDoConjunto);
	}

}
