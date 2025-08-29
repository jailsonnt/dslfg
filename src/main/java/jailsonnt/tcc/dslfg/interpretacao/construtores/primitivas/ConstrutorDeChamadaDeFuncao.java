package jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas;

import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.decorador.DecoradorChamadaDeFuncao;
import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes.ConstrutorFuncao;

import java.util.ArrayList;

public class ConstrutorDeChamadaDeFuncao implements ConstrutorDePrimitiva, ConstrutorFuncao {
	private String nomeDaFunção;
	private ArrayList<String> parâmetros = new ArrayList<String>();
	
	public ConstrutorDeChamadaDeFuncao(String nomeDaFunção) {
		this.nomeDaFunção = nomeDaFunção;
	}
	
	public void adicionarParametro(String parametro){
		this.parâmetros.add(parametro);
	}

	@Override
	public Executavel obterComando() {
		return new DecoradorChamadaDeFuncao(nomeDaFunção, parâmetros);
	}

	@Override
	public Funcao obterFuncao() {
		return new DecoradorChamadaDeFuncao(nomeDaFunção, parâmetros);
	}

}
