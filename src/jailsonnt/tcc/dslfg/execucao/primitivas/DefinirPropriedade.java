package jailsonnt.tcc.dslfg.execucao.primitivas;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.objetos.grafos.Vertice;

public class DefinirPropriedade implements Executavel {
	private String nomeDaPropriedade;
	private String nomeDoVértice;
	private Object valorÀAdicionar;
	
	public DefinirPropriedade(String nomeDaPropriedade,String nomeDoVértice, Object valorÀAdicionar) {
		this.nomeDaPropriedade = nomeDaPropriedade;
		this.nomeDoVértice = nomeDoVértice;
		this.valorÀAdicionar = valorÀAdicionar;
	}
	
	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		Vertice vertice = (Vertice) contextoDeExecução.obterVariavel(nomeDoVértice, contextoDeExecução);
		if (valorÀAdicionar instanceof String){
			Objeto retornoDaVariavel = contextoDeExecução.obterVariavel(valorÀAdicionar.toString(), contextoDeExecução);
			vertice.adicionarPropriedade(nomeDaPropriedade, retornoDaVariavel);
		}else{
			vertice.adicionarPropriedade(nomeDaPropriedade, valorÀAdicionar);
		}

	}

	@Override
	public Executavel obterCópia() {
		return new DefinirPropriedade(nomeDaPropriedade, nomeDoVértice, valorÀAdicionar);
	}

}
