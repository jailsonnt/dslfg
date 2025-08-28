package jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes;

import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadores.Interseccao;

public class ConstrutorInterseccao implements ConstrutorFuncao{
	private String nomeConjuntoPrincipal;
	private String nomeConjuntoParaVerificar;
	
	public ConstrutorInterseccao(String nomeConjuntoPrincipal, String nomeConjuntoParaVerificar){
		this.nomeConjuntoPrincipal = nomeConjuntoPrincipal;
		this.nomeConjuntoParaVerificar = nomeConjuntoParaVerificar;
		
	}
	@Override
	public Funcao obterFuncao() {
		return new Interseccao(nomeConjuntoPrincipal, nomeConjuntoParaVerificar);
	}

}
