package jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes;

import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.ObterUmVerticeDe;

public class ConstrutorObterUmVerticeDe implements ConstrutorFuncao {
	private String nomeDoObjetoContentor;
	
	public ConstrutorObterUmVerticeDe(String nomeDoObjetoContentor) {
		this.nomeDoObjetoContentor = nomeDoObjetoContentor;
	}

	@Override
	public Funcao obterFuncao() {
		return new ObterUmVerticeDe(nomeDoObjetoContentor);
	}

}
