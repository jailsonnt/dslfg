package jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas;

import jailsonnt.tcc.dslfg.execucao.ContextoDeExecucao;
import jailsonnt.tcc.dslfg.interpretacao.OuvinteDSLFG;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGLexer;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

public class ConstrutorImportar {
	private String caminho;
	
	public ConstrutorImportar(String caminho) {
		char aspas = '"';
		caminho = caminho.replaceAll(String.valueOf(aspas), "");
		this.caminho = caminho;
	}
	
	public Map<String, ContextoDeExecucao> obterFunções(){
		Map<String, ContextoDeExecucao> funções = new HashMap<String, ContextoDeExecucao>();
		if (testarArquivo()){
			String programaEmTexto = obterProgramaEmTexto();
			if (obterProgramaEmTexto() != null){
				funções = obterContextoDeExecução(programaEmTexto);
			}
		}
		return funções;
	}

	private Map<String, ContextoDeExecucao> obterContextoDeExecução(String programaEmTexto) {
		ANTLRInputStream input = new ANTLRInputStream(programaEmTexto);
		
		DSLFGLexer lexer = new DSLFGLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DSLFGParser parser = new DSLFGParser(tokens);
		ParseTree tree = parser.inicio();
		ParseTreeWalker walker = new ParseTreeWalker();
		OuvinteDSLFG listener = new OuvinteDSLFG();
		walker.walk(listener, tree);
		
		return listener.obterContextoDeExecução().obterFunções();
	}

	private String obterProgramaEmTexto() {
		List<String> linhasDoArquivo = null;
		try {
			linhasDoArquivo = IOUtils.readLines(new FileInputStream(new File(caminho)));
		} catch (FileNotFoundException e) {} catch (IOException e) {}
		return StringUtils.join(linhasDoArquivo, "\n");
	}

	private boolean testarArquivo() {
		File arquivo = new File(caminho);
		return arquivo.canRead();
	}
}
