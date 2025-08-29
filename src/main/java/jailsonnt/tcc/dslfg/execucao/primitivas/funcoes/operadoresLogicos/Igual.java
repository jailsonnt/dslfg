package jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadoresLogicos;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.objetos.Booleano;
import jailsonnt.tcc.dslfg.execucao.objetos.Constante;
import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;

public class Igual implements Funcao {
	private Object itemDaEsquerda;
	private Object itemDaDireita;
	private Objeto resultado;
	
	public Igual(Object itemDaEsquerda, Object itemDaDireita) {
		this.itemDaEsquerda = itemDaEsquerda;
		this.itemDaDireita = itemDaDireita;
	}
	

	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		Objeto itemDaEsquerda = obterObjeto(this.itemDaEsquerda, contextoDeExecução);
		Objeto itemDaDireita = obterObjeto(this.itemDaDireita, contextoDeExecução);
		resultado = executaComparacao(itemDaEsquerda, itemDaDireita);

	}
	
	@Override
	public Objeto obterResultado() {
		return resultado;
	}
	
	private Objeto executaComparacao(Objeto itemDaEsquerda, Objeto ItemDaDireita){
		if (itemDaEsquerda.equals(ItemDaDireita)){
			return new Booleano(true);
		}else{
			return new Booleano(false);
		}
	}
	
	private Objeto obterObjeto(Object itemEstudado, ContextoDeExecucao contextoDeExecução) {
		Objeto itemDeRetorno;
		if (itemEstudado instanceof String){
			itemDeRetorno = contextoDeExecução.obterVariavel(itemEstudado.toString(), contextoDeExecução);
		}else {
			itemDeRetorno = (Objeto) itemEstudado;
		}
		
		if (itemDeRetorno instanceof Constante){
			Constante constante = (Constante) itemDeRetorno;
			itemDeRetorno = constante.obterValor();
		}
		return itemDeRetorno;
	}


	@Override
	public Executavel obterCópia() {
		return new Igual(itemDaEsquerda, itemDaDireita);
	}

	

}
