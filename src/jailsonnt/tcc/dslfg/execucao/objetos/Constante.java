package jailsonnt.tcc.dslfg.execucao.objetos;

import jailsonnt.tcc.dslfg.execucao.Objeto;

import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Constante implements Objeto {
	private String nomeDaConstante;
	private Objeto valorCalculado;

	public Constante(String nomeDaConstante) {
		this.nomeDaConstante = nomeDaConstante;
		definirValorCalculado();
	}
	

	private void definirValorCalculado() {
		if (nomeDaConstante.equals("numeroMaximo")){
			valorCalculado = new Numero(Double.MAX_VALUE);
		}
		if (nomeDaConstante.equals("numeroMinimo")){
			valorCalculado = new Numero(Double.MIN_VALUE);
		}
	}
	
	public Objeto obterValor() {
		return valorCalculado;
	}


	@Override
	public String toString() {
		return valorCalculado.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		return valorCalculado.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public Objeto clonar() {
		return new Constante(nomeDaConstante);
	}
}
