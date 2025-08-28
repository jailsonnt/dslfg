package jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadoresLogicos;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.objetos.Conjunto;
import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;

public class eSubconjuntoProprioDe implements Funcao {
	private String itemDaEsquerda;
	private String itemDaDireita;
	private Objeto resultado;
	
	public eSubconjuntoProprioDe(String itemDaEsquerda, String itemDaDireita) {
		this.itemDaEsquerda = itemDaEsquerda;
		this.itemDaDireita = itemDaDireita;
	}

	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		Conjunto conjuntoDaEsquerda = (Conjunto) contextoDeExecução.obterVariavel(itemDaEsquerda, contextoDeExecução);
		Conjunto conjuntoDaDireita = (Conjunto) contextoDeExecução.obterVariavel(itemDaDireita, contextoDeExecução);
		resultado = conjuntoDaEsquerda.éSubconjuntoPróprioDe(conjuntoDaDireita);
		
	}

	@Override
	public Objeto obterResultado() {
		return resultado;
	}

	@Override
	public Executavel obterCópia() {
		return new eSubconjuntoProprioDe(itemDaEsquerda, itemDaDireita);
	}

}
