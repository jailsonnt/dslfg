package jailsonnt.tcc.dslfg.execucao.objetos;

import jailsonnt.tcc.dslfg.execucao.Objeto;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Iterador implements Objeto {
	private Conjunto conjunto;
	private Set<Objeto> itensEntregues = new HashSet<Objeto>();

	public Iterador(Conjunto conjunto) {
		this.conjunto = conjunto;
	}

	public Objeto existeProximoItem() {
		Conjunto proximosElementos = conjunto.retirarElementos(new Conjunto(itensEntregues));
		if (proximosElementos.obterConjunto().size() > 0){
			return new Booleano(true);
		}else{
			return new Booleano(false);
		}
	}
	
	public Objeto obterProximoItem(){
		Conjunto proximosElementos = conjunto.retirarElementos(new Conjunto(itensEntregues));
		if (proximosElementos.obterConjunto().size() > 0){
			Objeto elementoRetorno = proximosElementos.obterUmElementoDe();
			itensEntregues.add(elementoRetorno);
			return elementoRetorno;
		}else{
			return new Booleano(false);
		}
	}
	
	@Override
	public String toString() {
		return "";
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
	public Iterador clonar() {
		return new Iterador(conjunto.clonar());
	}

}
