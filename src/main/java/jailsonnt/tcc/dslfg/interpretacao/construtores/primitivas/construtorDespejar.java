package jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas;

import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.primitivas.Despejar;

public class construtorDespejar implements ConstrutorDePrimitiva {
	private String nomeVariável ;
	
	public construtorDespejar(String nomeVariável) {
		this.nomeVariável = nomeVariável;
	}

	@Override
	public Executavel obterComando() {
		return new Despejar(nomeVariável);
	}

}
