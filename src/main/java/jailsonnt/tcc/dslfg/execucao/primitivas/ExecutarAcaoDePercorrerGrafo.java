package jailsonnt.tcc.dslfg.execucao.primitivas;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;

import java.util.ArrayList;

public class ExecutarAcaoDePercorrerGrafo implements Executavel {
	private String nomeDoParametroDeAção;
	private Objeto parametroAção;
	private ArrayList<String> parâmetros;
	private ArrayList<Objeto> valoresDosParâmetros;

	public ExecutarAcaoDePercorrerGrafo(String nomeDoParametroDeAção, ArrayList<String> parâmetros) {
		this.nomeDoParametroDeAção = nomeDoParametroDeAção;
		this.parâmetros = parâmetros;
	}
	
	public ArrayList<String> obterParâmetros(){
		return parâmetros;
	}
	
	public String obterNomeDoParametroDeAção(){
		return nomeDoParametroDeAção;
	}
	
	public boolean contémOParâmetroDeAção(){
		if (parametroAção != null){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean verificaSeParâmetrosPossuemValores() {
		if (parâmetros.size() == valoresDosParâmetros.size()){
			return true;
		}
		return false;
	}
	
	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		ContextoDeExecucao contextoParaAção = criarNovoContextoComParâmetros();
		AcaoDeInstrucaoPercorrerGrafo açãoDeInstruçãoPercorrerGrafo = (AcaoDeInstrucaoPercorrerGrafo) this.parametroAção;
		açãoDeInstruçãoPercorrerGrafo.executar(contextoParaAção);
	}
	
	public void adicionarValoresDosParâmetros(ArrayList<Objeto> valoresDosParâmetros) {
		this.valoresDosParâmetros= valoresDosParâmetros;
	}
	
	public void adicionarParametroDeAçao(AcaoDeInstrucaoPercorrerGrafo ação) {
		parametroAção = ação;
	}
	
	private ContextoDeExecucao criarNovoContextoComParâmetros(){
		ContextoDeExecucao contextoDeExecução = new ContextoDeExecucaoSimples();
		for (int indiceDoParâmetro = 0; indiceDoParâmetro < this.valoresDosParâmetros.size(); indiceDoParâmetro++) {
			contextoDeExecução.adicionarVariável(this.parâmetros.get(indiceDoParâmetro), this.valoresDosParâmetros.get(indiceDoParâmetro));
		}
		contextoDeExecução.adicionarVariável(nomeDoParametroDeAção, parametroAção);
		return contextoDeExecução;
	}
	
	@Override
	public Executavel obterCópia() {
		return new ExecutarAcaoDePercorrerGrafo(nomeDoParametroDeAção, parâmetros);
	}

	
	

	

}
