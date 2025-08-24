package jailsonnt.tcc.dslfg.execucao.primitivas.funcoes;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.objetos.Conjunto;

public class AdicionarAConjunto implements Executavel {
	private String nomeDoConjunto;
	private Object valorÀAdicionar;
	
	public AdicionarAConjunto(String nomeDoConjunto, Object valorÀAdicionar) {
		this.nomeDoConjunto = nomeDoConjunto;
		this.valorÀAdicionar = valorÀAdicionar;
		
	}

	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		Conjunto conjunto = (Conjunto) contextoDeExecução.obterVariavel(nomeDoConjunto, contextoDeExecução);
		
		if (valorÀAdicionar instanceof String){
			conjunto.adicionarElemento(contextoDeExecução.obterVariavel(valorÀAdicionar.toString(), contextoDeExecução));
		}else{
			conjunto.adicionarElemento((Objeto) valorÀAdicionar);
		}
		

	}

	@Override
	public Executavel obterCópia() {
		return new AdicionarAConjunto(nomeDoConjunto, valorÀAdicionar);
	}

}
