package jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadores;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.objetos.Constante;
import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;

public class AtribuicaoSimples implements Funcao {
	private Object itemDaEsquerda;
	private Objeto resultado;

	public AtribuicaoSimples(Object itemDaEsquerda) {
		this.itemDaEsquerda = itemDaEsquerda;
	}

	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		resultado = obterObjeto(this.itemDaEsquerda, contextoDeExecução);
	}

	@Override
	public Objeto obterResultado() {
		return resultado;
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
		return new AtribuicaoSimples(itemDaEsquerda);
	}

}
