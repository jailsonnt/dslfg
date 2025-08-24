package jailsonnt.tcc.dslfg.execucao.primitivas.funcoes;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.objetos.Booleano;
import jailsonnt.tcc.dslfg.execucao.objetos.grafos.Vertice;
import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;

public class ObterPropriedade implements Funcao {
	private String nomeDaPropriedade;
	private String nomeDoVértice;
	private Objeto resultado;
	
	public ObterPropriedade(String nomeDaPropriedade, String nomeDoVértice) {
		this.nomeDaPropriedade = nomeDaPropriedade;
		this.nomeDoVértice = nomeDoVértice;
	}

	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		if (contextoDeExecução.obterVariavel(nomeDoVértice, contextoDeExecução) instanceof Vertice){
			Vertice vértice = (Vertice) contextoDeExecução.obterVariavel(nomeDoVértice, contextoDeExecução);
			resultado = vértice.obterPropriedade(nomeDaPropriedade);
		}else{
			resultado = new Booleano(false);
		}
		
	}

	@Override
	public Objeto obterResultado() {
		return resultado;
	}

	@Override
	public Executavel obterCópia() {
		return new ObterPropriedade(nomeDaPropriedade, nomeDoVértice);
	}

}
