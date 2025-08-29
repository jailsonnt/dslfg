package jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes;

import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadores.AtribuicaoSimples;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadores.Div;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadores.Divisao;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadores.Mod;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadores.Multiplicacao;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadores.Soma;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadores.Subtracao;

public class ConstrutorDeExpressaoAritmetica implements ConstrutorFuncao {
	private String operador;
	private Object itemDaDireita;
	private Object itemDaEsquerda;

	public ConstrutorDeExpressaoAritmetica(Object itemDaEsquerda, Object itemDaDireita, String operador) {
		this.itemDaEsquerda = itemDaEsquerda;
		this.itemDaDireita = itemDaDireita;
		if (operador == null){
			operador = "";
		}
		this.operador = operador;
	}

	@Override
	public Funcao obterFuncao() {
		switch (operador) {
		case "":
			return new AtribuicaoSimples(itemDaEsquerda);
		case "+":
			return new Soma(itemDaEsquerda, itemDaDireita);
		case "-":
			return new Subtracao(itemDaEsquerda, itemDaDireita);
		case "*":
			return new Multiplicacao(itemDaEsquerda, itemDaDireita);
		case "/":
			return new Divisao(itemDaEsquerda, itemDaDireita);
		case "mod":
			return new Mod(itemDaEsquerda, itemDaDireita);
		case "div":
			return new Div(itemDaEsquerda, itemDaDireita);
		default:
			return null;
		}
	}

}
