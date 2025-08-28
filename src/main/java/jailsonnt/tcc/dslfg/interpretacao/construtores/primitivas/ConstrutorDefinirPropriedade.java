package jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas;

import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.primitivas.DefinirPropriedade;
import jailsonnt.tcc.dslfg.interpretacao.construtores.objetos.ConstrutorMultiTipos;

public class ConstrutorDefinirPropriedade implements ConstrutorDePrimitiva {
	private String nomeDaPropriedade;
	private String nomeDoVértice;
	private ConstrutorMultiTipos valorÀAdicionar;
	
	public ConstrutorDefinirPropriedade(String nomeDaPropriedade,String nomeDoVértice, ConstrutorMultiTipos valorÀAdicionar) {
		this.nomeDaPropriedade = nomeDaPropriedade;
		this.nomeDoVértice = nomeDoVértice;
		this.valorÀAdicionar = valorÀAdicionar;
	}

	@Override
	public Executavel obterComando() {
		return new DefinirPropriedade(nomeDaPropriedade, nomeDoVértice, valorÀAdicionar.obterValor());
	}

}
