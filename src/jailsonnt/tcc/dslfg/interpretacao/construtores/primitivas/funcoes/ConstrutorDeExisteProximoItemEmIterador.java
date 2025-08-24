package jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes;

import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.ExisteProximoItemEmIterador;

public class ConstrutorDeExisteProximoItemEmIterador implements	ConstrutorFuncao {
	private String nomeDoIterador;

	public ConstrutorDeExisteProximoItemEmIterador(String nomeDoIterador) {
		this.nomeDoIterador = nomeDoIterador;
	}
	
	@Override
	public Funcao obterFuncao() {
		return new ExisteProximoItemEmIterador(nomeDoIterador);
	}

}
