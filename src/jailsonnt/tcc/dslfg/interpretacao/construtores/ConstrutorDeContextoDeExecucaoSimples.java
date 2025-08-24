package jailsonnt.tcc.dslfg.interpretacao.construtores;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.primitivas.ContextoDeExecucaoFuncao;
import jailsonnt.tcc.dslfg.execucao.primitivas.ContextoDeExecucaoSimples;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.ConstrutorDePrimitiva;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.ConstrutorImportar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ConstrutorDeContextoDeExecucaoSimples extends ConstrutorDeContextoDeExecucaoAbstrato implements ConstrutorDePrimitiva{
	private ArrayList<ConstrutorImportar> construtoresImportar = new ArrayList<ConstrutorImportar>();
	public void adicionarFunção (String nomeDaFunção, ConstrutorDeContextoDeExecucaoAbstrato novaFunção){
		this.funções.put(nomeDaFunção, novaFunção);
		nomeDaFunçãoEmFormação = nomeDaFunção;
	}
	
	public void adicionarComandoImportar(ConstrutorImportar construtorImportar) {
		this.construtoresImportar.add(construtorImportar);
	}

	@Override
	public Executavel obterComando() {
		ArrayList<Executavel> executáveis = obterListaDeExecutaveis();
		Map<String, ContextoDeExecucao> funções = obterMapDeFunções();
		return new ContextoDeExecucaoSimples(executáveis, funções);
	}

	private Map<String, ContextoDeExecucao> obterMapDeFunções() {
		Map<String, ContextoDeExecucao> funções = obterMapDeFunçõesImportadas();
		HashSet<String> listaDeCódigosDasFunções = new HashSet<String>(this.funções.keySet());
		for (String códigoDaFunção: listaDeCódigosDasFunções ){
			ContextoDeExecucaoFuncao construtorDeFunção = (ContextoDeExecucaoFuncao) ((ConstrutorDeContextoDeExecucaoFuncao) this.funções.get(códigoDaFunção)).obterComando();
			funções.put(códigoDaFunção, construtorDeFunção);
		}
		return funções;
	}
	
	private Map<String, ContextoDeExecucao> obterMapDeFunçõesImportadas(){
		Map<String, ContextoDeExecucao> funções = new HashMap<String, ContextoDeExecucao>();
		for (ConstrutorImportar construtorImportar : this.construtoresImportar){
			Map<String, ContextoDeExecucao> funçõesAtuais = construtorImportar.obterFunções();
			HashSet<String> listaDeCódigosDasFunçõesAtuais = new HashSet<String>(funçõesAtuais.keySet());
			for (String códigoDaFunção: listaDeCódigosDasFunçõesAtuais ){
				ContextoDeExecucaoFuncao construtorDeFunção = (ContextoDeExecucaoFuncao) funçõesAtuais.get(códigoDaFunção);
				funções.put(códigoDaFunção, construtorDeFunção);
			}
		}
		return funções;
	}

}
