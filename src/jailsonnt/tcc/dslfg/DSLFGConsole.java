package jailsonnt.tcc.dslfg;

import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.interfaceDoUsuario.AmbienteDeExecucaoDSLFG;
import jailsonnt.tcc.dslfg.interfaceDoUsuario.console.Console;

import java.io.File;

public class DSLFGConsole {
	
	public static void main(String[] args) {
		File pastaExemplos = new File(args[0]);
		int numeroDePastas = pastaExemplos.list().length;
		for (int indexDaPastaAtual = 0; indexDaPastaAtual<numeroDePastas;indexDaPastaAtual++) {
			File subpastaDeExemplos = new File(pastaExemplos.toString()+"\\"+pastaExemplos.list()[indexDaPastaAtual]);
			int numeroDeArquivos = subpastaDeExemplos.listFiles().length;
			for (int indexDoArquivoAtual = 0; indexDoArquivoAtual<numeroDeArquivos;indexDoArquivoAtual++) {
				File arquivoDSLFG = subpastaDeExemplos.listFiles()[indexDoArquivoAtual];
				System.out.println("\n	Arquivo: "+arquivoDSLFG.toString()+" em execução.\n");
				AmbienteDeExecucaoDSLFG dsl = AmbienteDeExecucaoDSLFG.obterInstância();
				dsl.fixarInterfaceDoUsuario(new Console());
				dsl.carregarPrograma(arquivoDSLFG);
				try {
					dsl.executar();
				} catch (ExcecaoEmTempoDeExecucao e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}

}
