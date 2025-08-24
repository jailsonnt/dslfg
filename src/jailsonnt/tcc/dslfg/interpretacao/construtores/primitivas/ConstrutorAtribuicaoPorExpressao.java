package jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas;

import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.primitivas.AtribuicaoPorExpressao;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes.ConstrutorFuncao;

import java.util.HashMap;
import java.util.Map;

public class ConstrutorAtribuicaoPorExpressao implements ConstrutorDePrimitiva {
	private static Map<Integer, ConstrutorAtribuicaoPorExpressao> construtores = new HashMap<Integer, ConstrutorAtribuicaoPorExpressao>();	
	private String nome;
	private ConstrutorFuncao função;
	
	private ConstrutorAtribuicaoPorExpressao(){
		
	}
	
	@Override
	public Executavel obterComando() {
		return new AtribuicaoPorExpressao(nome, função.obterFuncao());
	}
	
	public void comNome(String nome){
		this.nome = nome;
		
	}
	
	public void definirFuncao(ConstrutorFuncao função){
		this.função = função;
	}
	
	public static ConstrutorAtribuicaoPorExpressao novaAtribuição(int identificadorDaAtribuicao){
		ConstrutorAtribuicaoPorExpressao construtorDeAtribuicaoPorExpressão = new ConstrutorAtribuicaoPorExpressao();
		construtores.put(identificadorDaAtribuicao, construtorDeAtribuicaoPorExpressão);
		return construtorDeAtribuicaoPorExpressão;
	}
	
	public static ConstrutorAtribuicaoPorExpressao obterConstrutorDeAtribuiçãoPorExpressão(int identificadorDaAtribuicao) {
		return construtores.get(identificadorDaAtribuicao);
	}

}
