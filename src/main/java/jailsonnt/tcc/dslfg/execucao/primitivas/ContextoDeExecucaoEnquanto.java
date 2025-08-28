package jailsonnt.tcc.dslfg.execucao.primitivas;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.decorador.DecoradorExecutarAcaoDePercorrerOGrafo;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.objetos.Booleano;

import java.util.ArrayList;

public class ContextoDeExecucaoEnquanto extends ContextoDeExecucaoAbstrato implements Executavel {
	private Funcao condição;

	public ContextoDeExecucaoEnquanto(ArrayList<Executavel> executáveis, Funcao condição) {
		this.executáveis = executáveis;
		this.condição = condição;
	}
	
	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		this.contextoAnterior = contextoDeExecução;
		definirFunçõesNesseContexto(contextoDeExecução);
		condição.executar(this);
		while (condição.obterResultado().equals(new Booleano(true)) && !éInstruçãoDeParada()){
			for (Executavel comandoAtual : executáveis) {
				if (comandoAtual instanceof DecoradorExecutarAcaoDePercorrerOGrafo){
					DecoradorExecutarAcaoDePercorrerOGrafo comandoExecutarAçãoDePercorrerOGrafo = (DecoradorExecutarAcaoDePercorrerOGrafo) comandoAtual;
					comandoExecutarAçãoDePercorrerOGrafo.adicionarValoresDosParâmetros(this.obterValoresDosParametrosParaAInstruçãoExecutarAçãoDePercorrerOGrafo(comandoExecutarAçãoDePercorrerOGrafo.obterParâmetros()));
					AcaoDeInstrucaoPercorrerGrafo ação =  obterAçãoDoParametroDeAção(comandoExecutarAçãoDePercorrerOGrafo.obterNomeDoParametroDeAção());
					comandoExecutarAçãoDePercorrerOGrafo.adicionarParametroDeAçao(ação);
					comandoExecutarAçãoDePercorrerOGrafo.executar(contextoDeExecução);
				}else{
					comandoAtual.executar(this);
				}
				if (éInstruçãoDeParada()){
					break;
				}
			}
			condição.executar(contextoDeExecução);
		}
		

	}
	
	private void definirFunçõesNesseContexto(ContextoDeExecucao contextoDeExecução){
		this.funções = contextoDeExecução.obterFunções();
	}
	
	private ArrayList<Objeto> obterValoresDosParametrosParaAInstruçãoExecutarAçãoDePercorrerOGrafo(ArrayList<String> parâmetrosDaInstrução) {
		ArrayList<Objeto> memóriaParaAInstruçãoExecutarAçãoDePercorrerOGrafo = new ArrayList<Objeto>();
		for (String parâmetro :  parâmetrosDaInstrução) {
			memóriaParaAInstruçãoExecutarAçãoDePercorrerOGrafo.add(this.obterVariavel(parâmetro, this));
		}
		return memóriaParaAInstruçãoExecutarAçãoDePercorrerOGrafo;
	}
	
	private AcaoDeInstrucaoPercorrerGrafo obterAçãoDoParametroDeAção(String nomeDoParametroDeAção) {
		return (AcaoDeInstrucaoPercorrerGrafo) this.obterVariavel(nomeDoParametroDeAção, this);
	}
	
	@Override
	public Executavel obterCópia() {
		ArrayList<Executavel> executáveis = new ArrayList<Executavel>();
		for (Executavel executavel : this.executáveis){
			executáveis.add(executavel.obterCópia());
		}
		Funcao condição = (Funcao) this.condição.obterCópia();
		return new ContextoDeExecucaoEnquanto(executáveis, condição);
	}

}
