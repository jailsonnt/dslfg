package jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadores;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.objetos.Conjunto;
import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;

public class Retirar implements Funcao {
	private String nomeConjuntoPrincipal;
	private String nomeConjuntoParaRetirar;
	private Objeto resultado;
	
	public Retirar(String nomeConjuntoPrincipal, String nomeConjuntoParaRetirar){
		this.nomeConjuntoPrincipal = nomeConjuntoPrincipal;
		this.nomeConjuntoParaRetirar = nomeConjuntoParaRetirar;
		
	}

	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		Conjunto conjuntoPrincipal = (Conjunto) contextoDeExecução.obterVariavel(nomeConjuntoPrincipal, contextoDeExecução);
		Conjunto conjuntoParaRetirar = (Conjunto) contextoDeExecução.obterVariavel(nomeConjuntoParaRetirar, contextoDeExecução);
		resultado = conjuntoPrincipal.retirarElementos(conjuntoParaRetirar);
	}

	@Override
	public Objeto obterResultado() {
		return resultado;
	}

	@Override
	public Executavel obterCópia() {
		return new Retirar(nomeConjuntoPrincipal, nomeConjuntoParaRetirar);
	}

}
