package jailsonnt.tcc.dslfg.execucao.primitivas;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.decorador.DecoradorExecutarAcaoDePercorrerOGrafo;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;

import java.util.ArrayList;

public class ContextoDeExecucaoFuncao extends ContextoDeExecucaoAbstrato implements Executavel {
	private String nomeDaFunção;
	private ArrayList<String> parâmetros = new ArrayList<String>();
	private ArrayList<Objeto> valoresDosParâmetros ;
	private static Objeto resultadoDaInstruçãoDeRetorno;
	
	public ContextoDeExecucaoFuncao(String nomeDaFunção, ArrayList<String> parâmetros, ArrayList<Executavel> executáveis ) {
		this.nomeDaFunção = nomeDaFunção;
		this.parâmetros = parâmetros;
		this.executáveis = executáveis;
	}
	
	public String obterNomeDaFunção(){
		return this.nomeDaFunção;
	}
	
	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		this.contextoAnterior = obterContextoDeExecuçãoPrincipalParaFunção();
		definirFunçõesNesseContexto(contextoAnterior);
		adicionarParâmetrosNaMemória();
		
		for (Executavel comandoAtual : executáveis) {
			if (comandoAtual instanceof DecoradorExecutarAcaoDePercorrerOGrafo){
				DecoradorExecutarAcaoDePercorrerOGrafo comandoExecutarAçãoDePercorrerOGrafo = (DecoradorExecutarAcaoDePercorrerOGrafo) comandoAtual;
				comandoExecutarAçãoDePercorrerOGrafo.adicionarValoresDosParâmetros(this.obterValoresDosParametrosParaAInstruçãoExecutarAçãoDePercorrerOGrafo(comandoExecutarAçãoDePercorrerOGrafo.obterParâmetros()));
				AcaoDeInstrucaoPercorrerGrafo ação =  obterAçãoDoParametroDeAção(comandoExecutarAçãoDePercorrerOGrafo.obterNomeDoParametroDeAção());
				comandoExecutarAçãoDePercorrerOGrafo.adicionarParametroDeAçao(ação);
				comandoExecutarAçãoDePercorrerOGrafo.executar(null);
			}else{
				comandoAtual.executar(this);
			}
			
			if (éInstruçãoDeParada()){
				break;
			}
		}
		super.desativarÉInstruçãoDeParada();
	}
	
	private void definirFunçõesNesseContexto(ContextoDeExecucao contextoDeExecução){
		this.funções = contextoDeExecução.obterFunções();
	}
	
	private void adicionarParâmetrosNaMemória(){
		for (int indiceDoParâmetro = 0; indiceDoParâmetro < this.valoresDosParâmetros.size(); indiceDoParâmetro++) {
			this.adicionarVariável(this.parâmetros.get(indiceDoParâmetro), this.valoresDosParâmetros.get(indiceDoParâmetro));
		}
	}
	
	public void adicionarValoresDosParâmetros(ArrayList<Objeto> valoresDosParâmetros) {
		this.valoresDosParâmetros= valoresDosParâmetros;
	}
	
	public static void definirResultadoDaInstruçãoDeRetorno(Objeto resultadoDaInstruçãoDeRetorno){
		ContextoDeExecucaoFuncao.resultadoDaInstruçãoDeRetorno = resultadoDaInstruçãoDeRetorno;
		
	}
	
	public Objeto obterResultadoDaInstruçãoDeRetorno(){
		return resultadoDaInstruçãoDeRetorno;
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

	public ArrayList<String> obterParâmetros() {
		return this.parâmetros;
	}

	public ArrayList<Executavel> obterListaDeExecutaveis() {
		return this.executáveis;
	}
	
	@Override
	public Executavel obterCópia() {
		ArrayList<Executavel> executáveis = new ArrayList<Executavel>();
		for (Executavel executavel : this.executáveis){
			executáveis.add(executavel.obterCópia());
		}
		return new ContextoDeExecucaoFuncao(nomeDaFunção, parâmetros, executáveis);
	}


	}
