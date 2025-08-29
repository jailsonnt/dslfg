package jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas;

import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.decorador.DecoradorMostrar;
import jailsonnt.tcc.dslfg.interpretacao.construtores.objetos.ConstrutorMultiTipos;

public class ConstrutorMostrar implements ConstrutorDePrimitiva {
	
	private ConstrutorMultiTipos valorÀMostrar = null;

	public ConstrutorMostrar(ConstrutorMultiTipos valorÀMostrar) {
		this.valorÀMostrar = valorÀMostrar;
	}

	@Override
	public Executavel obterComando() {
		return new DecoradorMostrar(valorÀMostrar.obterValor());
	}
}
