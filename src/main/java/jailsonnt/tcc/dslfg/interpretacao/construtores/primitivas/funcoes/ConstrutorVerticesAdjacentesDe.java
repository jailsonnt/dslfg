package jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes;

import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.VerticesAdjacentesDe;

public class ConstrutorVerticesAdjacentesDe implements ConstrutorFuncao {
	private String nomeDoVerticePrincipal;
	
	public ConstrutorVerticesAdjacentesDe(String nomeDoVerticePrincipal) {
		this.nomeDoVerticePrincipal = nomeDoVerticePrincipal;
	}
	
	@Override
	public Funcao obterFuncao() {
		return new VerticesAdjacentesDe(nomeDoVerticePrincipal);
	}

}
