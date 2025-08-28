package jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadoresLogicos;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.objetos.Conjunto;
import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;

public class EUmElementoDe implements Funcao {
	private String itemDaEsquerda;
	private String itemDaDireita;
	private Objeto resultado;
	
	public EUmElementoDe(String itemDaEsquerda, String itemDaDireita) {
		this.itemDaEsquerda = itemDaEsquerda;
		this.itemDaDireita = itemDaDireita;
	}

	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		Objeto elementoDaEsquerda = contextoDeExecução.obterVariavel(itemDaEsquerda, contextoDeExecução);
		Conjunto conjuntoDaDireita = (Conjunto) contextoDeExecução.obterVariavel(itemDaDireita, contextoDeExecução);
		resultado = conjuntoDaDireita.vertificaSePossuiElemento(elementoDaEsquerda);
	}

	@Override
	public Objeto obterResultado() {
		return resultado;
	}

	@Override
	public Executavel obterCópia() {
		return new EUmElementoDe(itemDaEsquerda, itemDaDireita);
	}

}
