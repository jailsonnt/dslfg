package jailsonnt.tcc.dslfg.execucao.objetos;

import jailsonnt.tcc.dslfg.execucao.Objeto;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Numero implements Objeto {
	
	private double número;

	public Numero(double número) {
		this.número = número;
	}

	public Double obterNúmero() {
		return this.número;
	}
	
	@Override
	public String toString() {
		return número+"";
	}
	
	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}
	
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public Numero clonar() {
		return new Numero(this.número);
	}
	
}
