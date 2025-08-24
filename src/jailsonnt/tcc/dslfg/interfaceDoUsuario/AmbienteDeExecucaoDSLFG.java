package jailsonnt.tcc.dslfg.interfaceDoUsuario;

import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.primitivas.ContextoDeExecucaoSimples;
import jailsonnt.tcc.dslfg.interpretacao.OuvinteDSLFG;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGLexer;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

public class AmbienteDeExecucaoDSLFG {

	private static AmbienteDeExecucaoDSLFG instância = null;
	
	private String programaEmTexto;
	private ContextoDeExecucaoSimples contextoDeExecuçãoPrincipal;
	private InterfaceDoUsuario interfaceDoUsuário;
	
	private AmbienteDeExecucaoDSLFG() {}
	
	public static AmbienteDeExecucaoDSLFG obterInstância() {
		if (instância == null) {
			instância = new AmbienteDeExecucaoDSLFG();
		}
		return instância;
	}
	
	public void fixarInterfaceDoUsuario(InterfaceDoUsuario interfaceDoUsuário) {
		this.interfaceDoUsuário = interfaceDoUsuário;
	}
	
	public InterfaceDoUsuario obterInterfaceDoUsuário() {
		return interfaceDoUsuário;
	}
	
	public void carregarPrograma(File arquivoParaExecutar) {
		try {
			List<String> linhasDoArquivo = IOUtils.readLines(new FileInputStream(arquivoParaExecutar));
			programaEmTexto = StringUtils.join(linhasDoArquivo, "\n");
			rodarAnalisadores();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void carregarPrograma(String texto) {
		this.programaEmTexto = texto;
		rodarAnalisadores();
	}

	public void executar() throws ExcecaoEmTempoDeExecucao {
		this.contextoDeExecuçãoPrincipal.executar(contextoDeExecuçãoPrincipal);
	}
	
	public Map<String, Objeto> obterDespejo(){
		return contextoDeExecuçãoPrincipal.obterDespejo();
	}

	private void rodarAnalisadores() {
		ANTLRInputStream input = new ANTLRInputStream(programaEmTexto);
		
		DSLFGLexer lexer = new DSLFGLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DSLFGParser parser = new DSLFGParser(tokens);
		ParseTree tree = parser.inicio(); // begin parsing at init rule
		ParseTreeWalker walker = new ParseTreeWalker();
		OuvinteDSLFG listener = new OuvinteDSLFG();
		walker.walk(listener, tree);
		
		this.contextoDeExecuçãoPrincipal = listener.obterContextoDeExecução();
	}
}
