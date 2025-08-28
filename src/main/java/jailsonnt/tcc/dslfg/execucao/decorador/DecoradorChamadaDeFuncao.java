package jailsonnt.tcc.dslfg.execucao.decorador;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.primitivas.ChamadaDeFuncao;
import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;

import java.util.ArrayList;

public class DecoradorChamadaDeFuncao implements Executavel, Funcao {
	private ChamadaDeFuncao chamadaDeFunção;
	
	public DecoradorChamadaDeFuncao(String nomeDaFunção, ArrayList<String> parâmetros) {
		this.chamadaDeFunção = new ChamadaDeFuncao(nomeDaFunção, parâmetros);
	}

	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		if (contextoDeExecução.obterFunção(chamadaDeFunção.obterNomeDaFunção()) == null){
			throw new ExcecaoEmTempoDeExecucao("Função " + chamadaDeFunção.obterNomeDaFunção() + " não encontrada.");
		}
		chamadaDeFunção.executar(contextoDeExecução);
	}

	@Override
	public Executavel obterCópia() {
		return new DecoradorChamadaDeFuncao(chamadaDeFunção.obterNomeDaFunção(), chamadaDeFunção.obterParâmetros());
	}

	@Override
	public Objeto obterResultado() {
		return chamadaDeFunção.obterResultado();
	}

}
