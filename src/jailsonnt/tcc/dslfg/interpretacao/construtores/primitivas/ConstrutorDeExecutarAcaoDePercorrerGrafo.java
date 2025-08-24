package jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas;

import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.decorador.DecoradorExecutarAcaoDePercorrerOGrafo;

import java.util.ArrayList;

public class ConstrutorDeExecutarAcaoDePercorrerGrafo implements ConstrutorDePrimitiva {
	private String nomeDoParametroDeAção;
	private ArrayList<String> parâmetros;
	
	public ConstrutorDeExecutarAcaoDePercorrerGrafo (String nomeDoParametroDeAção, ArrayList<String> parâmetros){
		this.nomeDoParametroDeAção = nomeDoParametroDeAção;
		this.parâmetros = parâmetros;
	}
	
	public ConstrutorDeExecutarAcaoDePercorrerGrafo(String nomeDoParametroComAção) {
		this.nomeDoParametroDeAção = nomeDoParametroComAção;
		parâmetros = new ArrayList<String>();
	}
	
	public void adicionarParâmetro(String novoParâmetro){
		this.parâmetros.add(novoParâmetro);
	}

	@Override
	public Executavel obterComando() {
		return new DecoradorExecutarAcaoDePercorrerOGrafo(nomeDoParametroDeAção, parâmetros);
	}
	
	

}
