package jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadoresLogicos;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.objetos.Booleano;
import jailsonnt.tcc.dslfg.execucao.objetos.Constante;
import jailsonnt.tcc.dslfg.execucao.objetos.Numero;
import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;

public class Menor implements Funcao {
	private Object itemDaEsquerda;
	private Object itemDaDireita;
	private Objeto resultado;
	
	public Menor(Object itemDaEsquerda, Object itemDaDireita) {
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
		if (verificaSeOsDoisItensSãoNumeros(itemDaEsquerda, ItemDaDireita)){
			Numero numeroDaEsquerda = (Numero) itemDaEsquerda;
			Numero numeroDaDireita= (Numero) ItemDaDireita;
			if (verificaSeNumeroDaEsquerdaÉMenorQueODaDireita(numeroDaEsquerda, numeroDaDireita)){
				return new Booleano(true);
			}else{
				return new Booleano(false);
			}
		}else{
			return null; //criar excessão de comparação invalida caso nao se encaixe em nenhuma das condições
		}
		
	}
	
	private boolean verificaSeNumeroDaEsquerdaÉMenorQueODaDireita(Numero numeroDaEsquerda, Numero numeroDaDireita) {
		if (numeroDaEsquerda.obterNúmero() < numeroDaDireita.obterNúmero()){
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
	
	private boolean verificaSeOsDoisItensSãoNumeros(Objeto itemDaEsquerda, Objeto itemDaDireita){
		if (itemDaEsquerda instanceof Numero && itemDaDireita instanceof Numero){
			return true;
		}
		return false;
	}


	@Override
	public Funcao obterCópia() {
		return new Menor(itemDaEsquerda, itemDaDireita);
	}
	
	@Override
	public String toString() {
		return "item Da Esquerda: " + itemDaEsquerda.toString() + " menor que "+" item Da Direita: "+itemDaDireita.toString();
	}

	

}
