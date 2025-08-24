package jailsonnt.tcc.dslfg.execucao.primitivas.funcoes;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.objetos.Conjunto;
import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;

public class ObterUmElementoDe implements Funcao {
	private String nomeDoObjetoContentor;
	private Objeto resultado;
	
	public ObterUmElementoDe(String nomeDoObjetoContentor){
		this.nomeDoObjetoContentor = nomeDoObjetoContentor;
	}
	
	private void definirResultado(Conjunto conjunto){
		resultado = conjunto.obterUmElementoDe();
	}
	
	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		definirResultado((Conjunto) contextoDeExecução.obterVariavel(nomeDoObjetoContentor, contextoDeExecução));
	}

	@Override
	public Objeto obterResultado() {
		return resultado;
	}

	@Override
	public Executavel obterCópia() {
		return new ObterUmElementoDe(nomeDoObjetoContentor);
	}

}
