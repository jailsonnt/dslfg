package jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes;

import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadores.Retirar;

public class ConstrutorRetirar implements ConstrutorFuncao{
	private String nomeConjuntoPrincipal;
	private String nomeConjuntoParaRetirar;
	
	public ConstrutorRetirar(String nomeConjuntoPrincipal, String nomeConjuntoParaRetirar){
		this.nomeConjuntoPrincipal = nomeConjuntoPrincipal;
		this.nomeConjuntoParaRetirar = nomeConjuntoParaRetirar;
		
	}
	@Override
	public Funcao obterFuncao() {
		return new Retirar(nomeConjuntoPrincipal, nomeConjuntoParaRetirar);
	}

}
