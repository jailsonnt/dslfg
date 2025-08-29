package jailsonnt.tcc.dslfg.interpretacao.construtores;

import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.primitivas.ContextoDeExecucaoSe;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.ConstrutorDePrimitiva;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes.ConstrutorDeCondicao;

import java.util.ArrayList;

public class ConstrutorDeContextoDeExecucaoSe extends ConstrutorDeContextoDeExecucaoAbstrato implements ConstrutorDePrimitiva {
	private ConstrutorDeCondicao condição;
	
	public ConstrutorDeContextoDeExecucaoSe(ConstrutorDeCondicao condição){
		this.condição = condição;
	}
	
	@Override
	public Executavel obterComando() {
		ArrayList<Executavel> executáveis = obterListaDeExecutaveis();
		return new ContextoDeExecucaoSe(executáveis, condição.obterFuncao());
	}

}
