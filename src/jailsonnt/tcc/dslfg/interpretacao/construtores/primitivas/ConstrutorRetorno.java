package jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas;

import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.decorador.DecoradorRetorno;

public class ConstrutorRetorno implements ConstrutorDePrimitiva {
	private String nomeDaVariavel;
	
	public ConstrutorRetorno(String nomeDaVariavel) {
		this.nomeDaVariavel = nomeDaVariavel;
	}

	@Override
	public Executavel obterComando() {
		return new DecoradorRetorno(nomeDaVariavel);
	}

}
