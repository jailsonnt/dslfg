package jailsonnt.tcc.dslfg.interfaceDoUsuario.console;

import jailsonnt.tcc.dslfg.interfaceDoUsuario.InterfaceDoUsuario;

public class Console implements InterfaceDoUsuario {
	
	@Override
	public void imprimir(String texto) {
		System.out.println(texto);
	}

}
