package jailsonnt.tcc.dslfg.interpretacao.construtores.objetos;

import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.objetos.Numero;
import jailsonnt.tcc.dslfg.execucao.primitivas.AtribuicaoDeConjunto;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.ConstrutorDePrimitiva;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ConstrutorDeConjunto implements ConstrutorDePrimitiva {
	private static Map<Integer, ConstrutorDeConjunto> construtores = new HashMap<Integer, ConstrutorDeConjunto>();
	
	private String nome;
	private Set<Objeto> conjunto = new HashSet<Objeto>();
	
	private ConstrutorDeConjunto() {
	}

	public void adicionarNumero(Double novoNumero) {
		conjunto.add(new Numero(novoNumero));
	}

	public void comNome(String nome) {
		this.nome = nome;
	}
	
	public static ConstrutorDeConjunto novoConjunto(int identificadorDeConjunto){
		ConstrutorDeConjunto construtorDeConjunto = new ConstrutorDeConjunto();
		construtores.put(identificadorDeConjunto, construtorDeConjunto);
		return construtorDeConjunto;
	}
	
	public static ConstrutorDeConjunto obterConstrutorDeConjunto(int identificadorDeConjunto) {
		return construtores.get(identificadorDeConjunto);
	}

	@Override
	public Executavel obterComando() {
		return new AtribuicaoDeConjunto(nome, this.conjunto);
	}

}
