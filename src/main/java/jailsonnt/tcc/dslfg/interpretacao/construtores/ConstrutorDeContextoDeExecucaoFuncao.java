package jailsonnt.tcc.dslfg.interpretacao.construtores;

import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.primitivas.ContextoDeExecucaoFuncao;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.ConstrutorDePrimitiva;

import java.util.ArrayList;

public class ConstrutorDeContextoDeExecucaoFuncao extends	ConstrutorDeContextoDeExecucaoAbstrato implements ConstrutorDePrimitiva {
	private String nomeDaFunção;
	private ArrayList<String> parâmetros = new ArrayList<String>();
	
	public ConstrutorDeContextoDeExecucaoFuncao(String nomeDaFunção) {
		this.nomeDaFunção = nomeDaFunção;
	}
	
	public void adicionarParametro(String parametro){
		this.parâmetros.add(parametro);
	}
	
	@Override
	public Executavel obterComando() {
		ArrayList<Executavel> executáveis = obterListaDeExecutaveis();
		return new ContextoDeExecucaoFuncao(nomeDaFunção, parâmetros, executáveis);
	}

}
