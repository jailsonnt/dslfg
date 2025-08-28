package jailsonnt.tcc.dslfg.execucao.primitivas;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;

import java.util.ArrayList;

public class ChamadaDeFuncao implements Executavel, Funcao {
	private String nomeDaFunção;
	private ArrayList<String> parâmetros = new ArrayList<String>();
	private Objeto resultado;
	
	public ChamadaDeFuncao(String nomeDaFunção, ArrayList<String> parâmetros) {
		this.nomeDaFunção = nomeDaFunção;
		this.parâmetros = parâmetros;
	}
	
	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		ContextoDeExecucaoFuncao contextoBase = (ContextoDeExecucaoFuncao) contextoDeExecução.obterFunção(nomeDaFunção);
		ArrayList<Executavel> executaveisCopiados = copiarListaDeExecutaveis(contextoBase.obterListaDeExecutaveis());
		ContextoDeExecucaoFuncao contextoDeExecuçãoFunção = new ContextoDeExecucaoFuncao(contextoBase.obterNomeDaFunção(), contextoBase.obterParâmetros(), executaveisCopiados);
		contextoDeExecuçãoFunção.adicionarValoresDosParâmetros(obterValoresDosParâmetros(contextoDeExecução));
		contextoDeExecuçãoFunção.executar(contextoDeExecução);
		resultado = contextoDeExecuçãoFunção.obterResultadoDaInstruçãoDeRetorno();
	}
	
	private ArrayList<Executavel> copiarListaDeExecutaveis(ArrayList<Executavel> executaveisBase) {
		ArrayList<Executavel> executáveisRetorno = new ArrayList<Executavel>();
		for (Executavel executavel : executaveisBase){
			executáveisRetorno.add(executavel.obterCópia());
		}
		return executáveisRetorno;
	}

	private ArrayList<Objeto> obterValoresDosParâmetros(ContextoDeExecucao contextoDeExecução) {
		ArrayList<Objeto> valoresDosParâmetros = new ArrayList<Objeto>();
		
		for (String nomeDaVariável : this.parâmetros){
			valoresDosParâmetros.add(((Objeto) contextoDeExecução.obterVariavel(nomeDaVariável, contextoDeExecução)));
		}
		return valoresDosParâmetros;
	}

	@Override
	public Objeto obterResultado() {
		return resultado;
	}

	@Override
	public Executavel obterCópia() {
		return new ChamadaDeFuncao(nomeDaFunção, parâmetros);
	}
	
	public String obterNomeDaFunção(){
		return this.nomeDaFunção;
	}
	
	public ArrayList<String> obterParâmetros(){
		return this.parâmetros;
	}
	
	

}
