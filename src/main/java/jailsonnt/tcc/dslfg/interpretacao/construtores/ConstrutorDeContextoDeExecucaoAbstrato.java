package jailsonnt.tcc.dslfg.interpretacao.construtores;

import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.ConstrutorDePrimitiva;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class ConstrutorDeContextoDeExecucaoAbstrato {
	protected ArrayList<ConstrutorDePrimitiva> construtoresDePrimitiva = new ArrayList<ConstrutorDePrimitiva>();
	protected Map<String, ConstrutorDeContextoDeExecucaoAbstrato> funções = new HashMap<String, ConstrutorDeContextoDeExecucaoAbstrato>();
	protected String nomeDaFunçãoEmFormação = "";
	
	public void adicionarPrimitiva(ConstrutorDePrimitiva construtorDePrimitiva, int contadorDeTab) {
		if (éContextoDeFunção(contadorDeTab)) {
			obterFunçãoEmFormação().adicionarPrimitiva(construtorDePrimitiva, proximoNivelDeIdentação(contadorDeTab));
		} else {
			if (deveSerAdicionadoNesteContexto(contadorDeTab)) {
				this.construtoresDePrimitiva.add(construtorDePrimitiva);
			} else {
				ConstrutorDeContextoDeExecucaoAbstrato proximoContexto = (ConstrutorDeContextoDeExecucaoAbstrato) construtoresDePrimitiva.get(proximoContexto());
				proximoContexto.adicionarPrimitiva(construtorDePrimitiva, proximoNivelDeIdentação(contadorDeTab));
			}
		}
	}
	
	public Map<String, ConstrutorDeContextoDeExecucaoAbstrato> obterFunções() {
		return this.funções;
	}
	
	private boolean deveSerAdicionadoNesteContexto(int contadorDeTab) {
		if (contadorDeTab == 0) {
			return true;
		} else {
			return false;
		}
	}

	private int proximoNivelDeIdentação(int contadorDeTab) {
		return contadorDeTab - 1;
	}


	private int proximoContexto() {
		return construtoresDePrimitiva.size() - 1;
	}
	
	private ConstrutorDeContextoDeExecucaoAbstrato obterFunçãoEmFormação() {
		return  funções.get(nomeDaFunçãoEmFormação);
	}
	
	private boolean éContextoDeFunção(int contadorDeTab) {
		if (existeFunçãoEmFormação() && contadorDeTab > 0) {
			return true;
		}
		nomeDaFunçãoEmFormação = "";
		return false;
	}
	
	private boolean existeFunçãoEmFormação(){
		if (nomeDaFunçãoEmFormação.length() > 0) {
			return true;
		}
		return false;
	}

	protected ArrayList<Executavel> obterListaDeExecutaveis() {
		ArrayList<Executavel> executáveis = new ArrayList<Executavel>();
		for (ConstrutorDePrimitiva construtorDePrimitiva : construtoresDePrimitiva) {
			executáveis.add(construtorDePrimitiva.obterComando());
		}
		return executáveis;
	}
}
