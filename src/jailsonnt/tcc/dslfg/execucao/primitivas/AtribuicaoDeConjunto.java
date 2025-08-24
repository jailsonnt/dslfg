package jailsonnt.tcc.dslfg.execucao.primitivas;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.objetos.Conjunto;

import java.util.HashSet;
import java.util.Set;

public class AtribuicaoDeConjunto implements Executavel{
	private String nome;
	private Set<Objeto> conjunto = new HashSet<Objeto>();
		
	public AtribuicaoDeConjunto(String nome, Set<Objeto> conjunto) {
		this.nome = nome;
		this.conjunto = conjunto;
	}

	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		Set<Objeto> conjunto = new HashSet<>();
		for (Objeto elemento : this.conjunto){
			conjunto.add(elemento);
		}
		contextoDeExecução.adicionarVariável(nome, new Conjunto(conjunto));
	}

	@Override
	public Executavel obterCópia() {
		return new AtribuicaoDeConjunto(nome, conjunto);
	}

}
