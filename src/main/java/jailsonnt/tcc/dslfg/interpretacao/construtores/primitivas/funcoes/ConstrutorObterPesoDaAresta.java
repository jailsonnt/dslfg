package jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes;

import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.ObterPesoDaAresta;

public class ConstrutorObterPesoDaAresta implements ConstrutorFuncao {
	private String vérticeDeOrigem;
	private String vérticeDeDestino;
	
	public ConstrutorObterPesoDaAresta(String vérticeDeOrigem, String vérticeDeDestino) {
		this.vérticeDeOrigem = vérticeDeOrigem;
		this.vérticeDeDestino = vérticeDeDestino;
	}

	@Override
	public Funcao obterFuncao() {
		return new ObterPesoDaAresta(vérticeDeOrigem, vérticeDeDestino);
	}

}
