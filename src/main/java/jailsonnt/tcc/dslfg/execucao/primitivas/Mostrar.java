package jailsonnt.tcc.dslfg.execucao.primitivas;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.Executavel;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.interfaceDoUsuario.AmbienteDeExecucaoDSLFG;

public class Mostrar implements Executavel {

	private Object valorÀMostrar;

	public Mostrar(Object valorÀMostrar) {
		this.valorÀMostrar = valorÀMostrar;
	}

	@Override
	public void executar(ContextoDeExecucao contextoDeExecução) throws ExcecaoEmTempoDeExecucao {
		String saída ;
		if (valorÀMostrar instanceof String){
			saída = contextoDeExecução.obterVariavel(valorÀMostrar.toString(), contextoDeExecução).toString();
		}else{
			saída = valorÀMostrar.toString();
		}
		AmbienteDeExecucaoDSLFG.obterInstância().obterInterfaceDoUsuário().imprimir(saída);
	}
	
	public Object obterValorÀMostrar(){
		return valorÀMostrar;
	}

	@Override
	public Executavel obterCópia() {
		return new Mostrar(valorÀMostrar);
	}
	

}
