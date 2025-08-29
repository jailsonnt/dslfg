package jailsonnt.tcc.dslfg.interpretacao.construtores.objetos;

import jailsonnt.tcc.dslfg.execucao.objetos.Booleano;
import jailsonnt.tcc.dslfg.execucao.objetos.Constante;
import jailsonnt.tcc.dslfg.execucao.objetos.Numero;
import jailsonnt.tcc.dslfg.execucao.objetos.Texto;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.MultiTiposContext;

public class ConstrutorMultiTipos {
	private static ConstrutorMultiTipos construtorMultiTipos;
	private String nomeVariavel = null;
	private Numero número = null;
    private Texto texto = null;
    private Constante constante = null;
    private Booleano booleano = null;
    
    private ConstrutorMultiTipos(String nomeVariavel, Numero número, Texto texto, Constante constante, Booleano booleano){
    	this.nomeVariavel = nomeVariavel;
    	this.número = número;
    	this.texto = texto;
    	this.constante = constante;
    	this.booleano = booleano;
    }
    
    public static void novoConstrutorMultiTipos(MultiTiposContext ctx){
    	Numero número = null;
    	Texto texto = null;
    	String nomeVariável = null;
    	Constante constante = null;
    	Booleano booleano = null;
    	if (ctx.NUMERO() != null){
    		número = new Numero(Double.parseDouble(ctx.NUMERO().toString()));
    	}
    	if (ctx.STRING() != null){
    		texto = new Texto(ctx.STRING().toString());
    	}
    	if (ctx.PALAVRA() != null){
    		nomeVariável = ctx.PALAVRA().toString();
    	}
    	if(ctx.CONSTANTES() != null){
    		constante = new Constante(ctx.CONSTANTES().toString());
    	}
    	if(ctx.TIPOS_BOOLEANOS() != null){
    		if (ctx.TIPOS_BOOLEANOS().toString().equals("verdadeiro")){
    			booleano = new Booleano(true);
    		}else{
    			booleano = new Booleano(false);
    		}
    	}
    	
    	construtorMultiTipos = new ConstrutorMultiTipos(nomeVariável, número, texto, constante, booleano);
    }
    public static ConstrutorMultiTipos obterConstrutorMultiTipos() {
    	return construtorMultiTipos;
    }
	
	public Object obterValor() {
		if (nomeVariavel != null){
			return nomeVariavel;
		}
		if (número != null){
			return número;
		}
		if (texto != null){
			return texto;
		}
		if (constante != null){
			return constante;
		}
		if (booleano != null){
			return booleano;
		}
		return null;
	}

}
