package jailsonnt.tcc.dslfg.execucao.primitivas.funcoes;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.objetos.grafos.Vertice;
import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;

public class VerticesAdjacentesDe implements Funcao {
	private String nomeDoVerticePrincipal;
	private Objeto resultado;
	
	public VerticesAdjacentesDe(String nomeDoVerticePrincipal) {
		this.nomeDoVerticePrincipal = nomeDoVerticePrincipal;
	}

	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		Vertice vertice = (Vertice) contextoDeExecução.obterVariavel(nomeDoVerticePrincipal, contextoDeExecução);
		this.resultado = vertice.funçãoObterVerticesAdjacentes();
	}

	@Override
	public Objeto obterResultado() {
		return this.resultado;
	}

	@Override
	public Executavel obterCópia() {
		return new VerticesAdjacentesDe(nomeDoVerticePrincipal);
	}

}
