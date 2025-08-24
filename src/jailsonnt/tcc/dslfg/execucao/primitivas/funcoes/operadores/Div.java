package jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadores;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.objetos.Constante;
import jailsonnt.tcc.dslfg.execucao.objetos.Numero;
import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;

public class Div implements Funcao {
	private Objeto resultado;
	private Object itemDaDireita;
	private Object itemDaEsquerda;

	public Div(Object itemDaEsquerda, Object itemDaDireita) {
		this.itemDaEsquerda = itemDaEsquerda;
		this.itemDaDireita = itemDaDireita;
	}

	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		Objeto itemDaEsquerda = obterObjeto(this.itemDaEsquerda, contextoDeExecução);
		Objeto itemDaDireita = obterObjeto(this.itemDaDireita, contextoDeExecução);
		resultado = executaDiv(itemDaEsquerda, itemDaDireita);

	}
	
	@Override
	public Objeto obterResultado() {
		return resultado;
	}
	
	private Objeto executaDiv(Objeto itemDaEsquerda, Objeto itemDaDireita){
		if (verificaSeOsDoisItensSãoNumeros(itemDaEsquerda, itemDaDireita)){
			Numero numeroDaEsquerda = (Numero) itemDaEsquerda;
			Numero numeroDaDireita = (Numero) itemDaDireita;
			int inteiroDaEsquerda = numeroDaEsquerda.obterNúmero().intValue();
			int inteiroDaDireita = numeroDaDireita.obterNúmero().intValue();
			int resultado = inteiroDaEsquerda / inteiroDaDireita;
			return new Numero(resultado);
		}
		return null; //criar excessão de soma invalida caso nao se encaixe em nenhuma das condições
	}
	
	private boolean verificaSeOsDoisItensSãoNumeros(Objeto itemDaEsquerda, Objeto itemDaDireita){
		if (itemDaEsquerda instanceof Numero && itemDaDireita instanceof Numero){
			return true;
		}
		return false;
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
		return new Div(itemDaEsquerda, itemDaDireita);
	}

}
