package jailsonnt.tcc.dslfg.execucao.primitivas.funcoes;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.objetos.grafos.Grafo;
import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;

public class ObterUmVerticeDe implements Funcao {
	private String nomeDoObjetoContentor;
	private Objeto resultado;
	
	public ObterUmVerticeDe(String nomeDoObjetoContentor){
		this.nomeDoObjetoContentor = nomeDoObjetoContentor;
	}
	
	private void definirResultado(Grafo grafo){
		resultado = grafo.obterUmVerticeDe();
	}
	
	
	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		definirResultado((Grafo) contextoDeExecução.obterVariavel(nomeDoObjetoContentor, contextoDeExecução));
	}

	@Override
	public Objeto obterResultado() {
		return resultado;
	}

	@Override
	public Executavel obterCópia() {
		return new ObterUmVerticeDe(nomeDoObjetoContentor);
	}

}
