package jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadores;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.objetos.Conjunto;
import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;

public class Uniao implements Funcao {
	private String nomeConjuntoPrincipal;
	private String nomeConjuntoParaUnir;
	private Objeto resultado;
	
	public Uniao(String nomeConjuntoPrincipal, String nomeConjuntoParaUnir){
		this.nomeConjuntoPrincipal = nomeConjuntoPrincipal;
		this.nomeConjuntoParaUnir = nomeConjuntoParaUnir;
	}

	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		Conjunto conjuntoPrincipal = (Conjunto) contextoDeExecução.obterVariavel(nomeConjuntoPrincipal, contextoDeExecução);
		Conjunto conjuntoParaUnir = (Conjunto) contextoDeExecução.obterVariavel(nomeConjuntoParaUnir, contextoDeExecução);
		resultado = conjuntoPrincipal.unirElementos(conjuntoParaUnir);
	}

	@Override
	public Objeto obterResultado() {
		return resultado;
	}

	@Override
	public Executavel obterCópia() {
		return new Uniao(nomeConjuntoPrincipal, nomeConjuntoParaUnir);
	}

}
