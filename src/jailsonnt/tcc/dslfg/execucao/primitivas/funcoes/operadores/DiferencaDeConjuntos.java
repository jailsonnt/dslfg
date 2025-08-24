package jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadores;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.objetos.Conjunto;
import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;

public class DiferencaDeConjuntos implements Funcao {
	private String nomeConjuntoPrincipal;
	private String nomeConjuntoParaVerificar;
	private Objeto resultado;
	
	public DiferencaDeConjuntos(String nomeConjuntoPrincipal, String nomeConjuntoParaVerificar){
		this.nomeConjuntoPrincipal = nomeConjuntoPrincipal;
		this.nomeConjuntoParaVerificar = nomeConjuntoParaVerificar;
	}

	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		Conjunto conjuntoPrincipal = (Conjunto) contextoDeExecução.obterVariavel(nomeConjuntoPrincipal, contextoDeExecução);
		Conjunto conjuntoParaVerificar = (Conjunto) contextoDeExecução.obterVariavel(nomeConjuntoParaVerificar, contextoDeExecução);
		resultado = conjuntoPrincipal.obterDiferençaDeConjuntos(conjuntoParaVerificar);
	}

	@Override
	public Objeto obterResultado() {
		return resultado;
	}

	@Override
	public Executavel obterCópia() {
		return new DiferencaDeConjuntos(nomeConjuntoPrincipal, nomeConjuntoParaVerificar);
	}

}
