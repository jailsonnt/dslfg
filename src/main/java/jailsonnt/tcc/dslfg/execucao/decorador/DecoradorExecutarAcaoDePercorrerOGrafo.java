package jailsonnt.tcc.dslfg.execucao.decorador;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.primitivas.AcaoDeInstrucaoPercorrerGrafo;
import jailsonnt.tcc.dslfg.execucao.primitivas.ExecutarAcaoDePercorrerGrafo;

import java.util.ArrayList;

public class DecoradorExecutarAcaoDePercorrerOGrafo implements Executavel{
	private ExecutarAcaoDePercorrerGrafo executarAcaoDePercorrerGrafo;
	
	public DecoradorExecutarAcaoDePercorrerOGrafo(String nomeDoParametroDeAção, ArrayList<String> parâmetros) {
		this.executarAcaoDePercorrerGrafo = new ExecutarAcaoDePercorrerGrafo(nomeDoParametroDeAção, parâmetros);
	}

	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		if (!executarAcaoDePercorrerGrafo.contémOParâmetroDeAção()){
			throw new ExcecaoEmTempoDeExecucao("Variavel " + executarAcaoDePercorrerGrafo.obterNomeDoParametroDeAção() + " não encontrada.");
		}
		if (!executarAcaoDePercorrerGrafo.verificaSeParâmetrosPossuemValores()){
				throw new ExcecaoEmTempoDeExecucao("Problemas nos parâmetros da instrução 'executar  - variavel com ação -  fornecendo  - parâmetros -'.");
		}
		
		executarAcaoDePercorrerGrafo.executar(contextoDeExecução);
	}

	@Override
	public Executavel obterCópia() {
		return new DecoradorExecutarAcaoDePercorrerOGrafo(executarAcaoDePercorrerGrafo.obterNomeDoParametroDeAção(), executarAcaoDePercorrerGrafo.obterParâmetros());
	}
	
	public ArrayList<String> obterParâmetros(){
		return executarAcaoDePercorrerGrafo.obterParâmetros();
	}
	
	public String obterNomeDoParametroDeAção(){
		return executarAcaoDePercorrerGrafo.obterNomeDoParametroDeAção();
	}
	
	public void adicionarValoresDosParâmetros(ArrayList<Objeto> valoresDosParâmetros) {
		executarAcaoDePercorrerGrafo.adicionarValoresDosParâmetros(valoresDosParâmetros);
	}
	
	public void adicionarParametroDeAçao(AcaoDeInstrucaoPercorrerGrafo ação) {
		executarAcaoDePercorrerGrafo.adicionarParametroDeAçao(ação);
	}

}
