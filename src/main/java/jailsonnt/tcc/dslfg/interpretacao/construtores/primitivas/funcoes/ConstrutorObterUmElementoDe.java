package jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes;

import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.ObterUmElementoDe;

public class ConstrutorObterUmElementoDe implements ConstrutorFuncao {
	private String nomeDoObjetoContentor;
	
	public ConstrutorObterUmElementoDe(String nomeDoObjetoContentor) {
		this.nomeDoObjetoContentor = nomeDoObjetoContentor;
	}

	@Override
	public Funcao obterFuncao() {
		return new ObterUmElementoDe(nomeDoObjetoContentor);
	}

}
