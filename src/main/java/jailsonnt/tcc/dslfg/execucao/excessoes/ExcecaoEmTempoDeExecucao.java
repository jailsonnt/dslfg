package jailsonnt.tcc.dslfg.execucao.excessoes;

@SuppressWarnings("serial")
public class ExcecaoEmTempoDeExecucao extends Exception {
	private String mensagem;
	public ExcecaoEmTempoDeExecucao(String mensagem) {
		this.mensagem = mensagem;
	}
	
	@Override
	public String getMessage() {
		return this.mensagem;
	}

}
