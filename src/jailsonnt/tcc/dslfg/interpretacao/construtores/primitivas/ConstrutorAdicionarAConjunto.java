package jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas;

import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.AdicionarAConjunto;
import jailsonnt.tcc.dslfg.interpretacao.construtores.objetos.ConstrutorMultiTipos;

public class ConstrutorAdicionarAConjunto implements ConstrutorDePrimitiva{
	private String nomeDoConjunto;
	private ConstrutorMultiTipos valorÀAdicionar;
	
	public ConstrutorAdicionarAConjunto(String nomeDoConjunto, ConstrutorMultiTipos valorÀAdicionar) {
		this.nomeDoConjunto = nomeDoConjunto;
		this.valorÀAdicionar = valorÀAdicionar;
	}

	@Override
	public Executavel obterComando() {
		return new AdicionarAConjunto(nomeDoConjunto, valorÀAdicionar.obterValor());
	}

}
