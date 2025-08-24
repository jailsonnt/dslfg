package jailsonnt.tcc.dslfg.execucao.objetos;

import jailsonnt.tcc.dslfg.execucao.Objeto;

import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Texto implements Objeto{
	private String texto;
	
	public Texto(String texto) {
		this.texto = texto;
	}
	
	public String obterTexto(){
		return this.texto;
	}

	@Override
	public String toString() {
		char aspas = '"';
		texto = texto.replaceAll(String.valueOf(aspas), "");
		return texto.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		char aspas = '"';
		texto = texto.replaceAll(String.valueOf(aspas), "");
		String textoDoParametro= "";
		if (obj instanceof Texto){
			 Texto texto = (Texto) obj;
			 textoDoParametro = texto.obterTexto();
		} else {
			return false;
		}
		textoDoParametro = textoDoParametro.replaceAll(String.valueOf(aspas), "");
		if (textoDoParametro.equals(texto)){
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public Texto clonar() {
		return new Texto(texto);
	}

}
