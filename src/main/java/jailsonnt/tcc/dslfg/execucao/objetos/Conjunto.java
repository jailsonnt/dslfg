package jailsonnt.tcc.dslfg.execucao.objetos;

import jailsonnt.tcc.dslfg.execucao.Objeto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Conjunto implements Objeto{
	private Set<Objeto> conjunto;
	private static Random geradorDeNúmerosAleatórios = new Random();

	public Conjunto() {
		this.conjunto = new HashSet<Objeto>();
	}

	public Conjunto(Set<Objeto> novoConjunto) {
		this.conjunto = novoConjunto;
	}

	public Set<Objeto> obterConjunto() {
		return conjunto;
	}
	
	public void adicionarElemento(Objeto novoItem) {
		conjunto.add(novoItem);
	}
	
	public Objeto obterUmElementoDe() {
		List<Objeto> conjuntoEmLista = new ArrayList<Objeto>(conjunto);	
		int randomico = geradorDeNúmerosAleatórios.nextInt(conjuntoEmLista.size());
		Objeto resultado = conjuntoEmLista.get(randomico);
		return resultado;
	}
	public Conjunto retirarElementos(Conjunto conjuntoParaRetirar) {
		Set<Objeto> conjuntoResultado = new HashSet<Objeto>(conjunto);
		conjuntoResultado.removeAll(conjuntoParaRetirar.obterConjunto());
		return new Conjunto(conjuntoResultado);
	}
	
	public Conjunto unirElementos(Conjunto conjuntoParaUnir) {
		Set<Objeto> conjuntoResultado = new HashSet<Objeto>(conjunto);
		conjuntoResultado.addAll(conjuntoParaUnir.obterConjunto());
		return new Conjunto(conjuntoResultado);
	}
	
	public Conjunto obterIntersecçãoDeConjuntos(Conjunto conjuntoParaVerificar){
		Set<Objeto> conjuntoResultado = new HashSet<Objeto>();
		for (Objeto objetoAtual : conjunto){
			for (Objeto objetoParaVerificar : conjuntoParaVerificar.conjunto){
				if (objetoAtual.equals(objetoParaVerificar)){
					conjuntoResultado.add(objetoAtual);
				}
			}
		}
		return new Conjunto(conjuntoResultado);
	}
	
	public Conjunto obterDiferençaDeConjuntos(Conjunto conjuntoParaVerificar){
		Set<Objeto> conjuntoResultado = new HashSet<Objeto>();
		for (Objeto objetoAtual : conjunto){
			boolean estaNosDoisConjuntos = false;
			for (Objeto objetoParaVerificar : conjuntoParaVerificar.conjunto){
				if (objetoAtual.equals(objetoParaVerificar)){
					estaNosDoisConjuntos = true;
					break;
				}
			}
			if (!estaNosDoisConjuntos){
				conjuntoResultado.add(objetoAtual);
			}
		}
		
		for (Objeto objetoParaVerificar : conjuntoParaVerificar.conjunto){
			boolean estaNosDoisConjuntos = false;
			for (Objeto objetoAtual : conjunto){
				if (objetoAtual.equals(objetoParaVerificar)){
					estaNosDoisConjuntos = true;
					break;
				}
			}
			if (!estaNosDoisConjuntos){
				conjuntoResultado.add(objetoParaVerificar);
			}
		}
		return new Conjunto(conjuntoResultado);
	}
	
	public Objeto éSubconjuntoPróprioDe(Conjunto conjuntoDaDireita) {
		if (!conjuntoDaDireita.equals(this)){
			if (conjuntoDaDireita.obterConjunto().containsAll(this.conjunto)){
				return new Booleano(true);
			}
		}
		return new Booleano(false);
	}
	
	public Objeto subconjunto(Conjunto conjuntoDaDireita) {
		if (conjuntoDaDireita.obterConjunto().containsAll(this.conjunto)){
			return new Booleano(true);
		}
		return new Booleano(false);
	}
	
	public Objeto vertificaSePossuiElemento(Objeto elementoProcurado) {
		if (this.obterConjunto().contains(elementoProcurado)){
			return new Booleano(true);
		}
		return new Booleano(false);
	}
	public Objeto vertificaSeNaoPossuiElemento(Objeto elementoProcurado) {
		if (this.obterConjunto().contains(elementoProcurado)){
			return new Booleano(false);
		}
		return new Booleano(true);
	}
	
	@Override
	public Conjunto clonar()  {
		Conjunto clonado = new Conjunto();
		for (Objeto elementoParaCopiar : this.conjunto){
			clonado.adicionarElemento(elementoParaCopiar.clonar());
		}
		return clonado;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Conjunto && compararListaDeElementos(obj)){
			return true;
		}else{
			return false;
		}
	}
	
	private boolean compararListaDeElementos(Object obj){
		Conjunto conjuntoEstudado = (Conjunto) obj;
		if (conjuntoEstudado.obterConjunto().size() == this.obterConjunto().size()){
			for (Objeto elementoDoContextoAtual : this.obterConjunto()){
				boolean encontrouElemento = false;
				for (Objeto elementoDoGrafoEstudado: conjuntoEstudado.obterConjunto()){
					if (elementoDoContextoAtual.equals(elementoDoGrafoEstudado)){
						encontrouElemento = true;
						break;
					}
				}
				if (!encontrouElemento){
					return false;
				}
			}
		}else{
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		String saída = "\n{";
		for (Object numeroAtual : conjunto) {
			saída += numeroAtual.toString() + ", ";
		}
		return saída + "}\n";
	}

	public Objeto obterIterador() {
		return new Iterador(this);
	}

	
}
