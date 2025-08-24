package jailsonnt.tcc.dslfg.execucao.objetos;

import jailsonnt.tcc.dslfg.execucao.Objeto;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Booleano implements Objeto {
	private Boolean valor;
	
	public Booleano(Boolean valor) {
		this.valor = valor;
	}
	
	public Boolean obterNUmero() {
		return this.valor;
	}
	
	@Override
	public Objeto clonar() {
		return new Booleano(valor);
	}
	
	@Override
	public String toString() {
		if (valor){
			return "verdadeiro";
		}else{
			return "falso";
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}
	
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}


}
