package jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes;

import jailsonnt.tcc.dslfg.execucao.primitivas.Funcao;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadoresLogicos.Diferente;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadoresLogicos.EUmElementoDe;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadoresLogicos.Igual;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadoresLogicos.Maior;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadoresLogicos.MaiorOuIgual;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadoresLogicos.Menor;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadoresLogicos.MenorOuIgual;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadoresLogicos.NaoEUmElementoDe;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadoresLogicos.Subconjunto;
import jailsonnt.tcc.dslfg.execucao.primitivas.funcoes.operadoresLogicos.eSubconjuntoProprioDe;

public class ConstrutorDeCondicao implements ConstrutorFuncao {
	private static ConstrutorDeCondicao construtorDeCondição;
	private Object itemDaEsquerda;
	private Object itemDaDireita;
	private String nomeDaFunçãoDoOperador;
	
	private ConstrutorDeCondicao(Object itemDaEsquerda, Object itemDaDireita, String nomeDaFunçãoDoOperador) {
		this.itemDaEsquerda = itemDaEsquerda;
		this.itemDaDireita = itemDaDireita;
		this.nomeDaFunçãoDoOperador = nomeDaFunçãoDoOperador;
	}
	
	public static void novoConstrutorDeCondição(Object itemDaEsquerda, Object itemDaDireita, String nomeDaFunçãoDoOperador){
		construtorDeCondição = new ConstrutorDeCondicao(itemDaEsquerda, itemDaDireita, nomeDaFunçãoDoOperador);
	}

	@Override
	public Funcao obterFuncao() {
		if (nomeDaFunçãoDoOperador.equals(" subconjuntoProprioDe ")){
			return new eSubconjuntoProprioDe(itemDaEsquerda.toString(), itemDaDireita.toString());
		}
		if (nomeDaFunçãoDoOperador.equals(" subconjunto ")){
			return new Subconjunto(itemDaEsquerda.toString(), itemDaDireita.toString());
		}
		if (nomeDaFunçãoDoOperador.equals(" eUmElementoDe ")){
			return new EUmElementoDe(itemDaEsquerda.toString(), itemDaDireita.toString());
		}
		if (nomeDaFunçãoDoOperador.equals(" naoEUmElementoDe ")){
			return new NaoEUmElementoDe(itemDaEsquerda.toString(), itemDaDireita.toString());
		}
		if (nomeDaFunçãoDoOperador.equals(" == ")){
			return new Igual(itemDaEsquerda, itemDaDireita);
		}
		if (nomeDaFunçãoDoOperador.equals(" <= ")){
			return new MenorOuIgual(itemDaEsquerda, itemDaDireita);
		}
		if (nomeDaFunçãoDoOperador.equals(" >= ")){
			return new MaiorOuIgual(itemDaEsquerda, itemDaDireita);
		}
		if (nomeDaFunçãoDoOperador.equals(" < ")){
			return new Menor(itemDaEsquerda, itemDaDireita);
		}
		if (nomeDaFunçãoDoOperador.equals(" > ")){
			return new Maior(itemDaEsquerda, itemDaDireita);
		}
		if (nomeDaFunçãoDoOperador.equals(" != ")){
			return new Diferente(itemDaEsquerda, itemDaDireita);
		}
		return null;
	}
	
	public static ConstrutorDeCondicao obterConstrutorDeCondição(){
		return construtorDeCondição;
	}

}
