package jailsonnt.tcc.dslfg.interpretacao.construtores;

import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.primitivas.ContextoDeExecucaoPercorrerGrafo;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.ConstrutorDePrimitiva;

import java.util.ArrayList;

public class ConstrutorDeContextoDeExecucaoPercorrerGrafo extends ConstrutorDeContextoDeExecucaoAbstrato implements ConstrutorDePrimitiva {
	private String nomeDoGrafo;
	private String nomeDaFunção;
	private String nomeDoVerticeInicial;
	
	public ConstrutorDeContextoDeExecucaoPercorrerGrafo (String nomeDoGrafo, String nomeDaFunção, String nomeDoVerticeInicial) {
		this.nomeDoGrafo = nomeDoGrafo;
		this.nomeDaFunção = nomeDaFunção;
		this.nomeDoVerticeInicial = nomeDoVerticeInicial;
	}
	
	@Override
	public Executavel obterComando() {
		ArrayList<Executavel> executáveis = obterListaDeExecutaveis();
		return new ContextoDeExecucaoPercorrerGrafo(nomeDoGrafo, nomeDaFunção, nomeDoVerticeInicial, executáveis);
	}

}
