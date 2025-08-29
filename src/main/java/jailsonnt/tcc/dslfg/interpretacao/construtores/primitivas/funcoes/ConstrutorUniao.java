package jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes;

import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadores.Uniao;

public class ConstrutorUniao implements ConstrutorFuncao{
	private String nomeConjuntoPrincipal;
	private String nomeConjuntoParaUnir;
	
	public ConstrutorUniao(String nomeConjuntoPrincipal, String nomeConjuntoParaUnir){
		this.nomeConjuntoPrincipal = nomeConjuntoPrincipal;
		this.nomeConjuntoParaUnir = nomeConjuntoParaUnir;
		
	}
	@Override
	public Funcao obterFuncao() {
		return new Uniao(nomeConjuntoPrincipal, nomeConjuntoParaUnir);
	}

}
