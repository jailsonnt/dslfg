package jailsonnt.tcc.dslfg.interpretacao;

import jailsonnt.tcc.dslfg.execucao.primitivas.ContextoDeExecucaoSimples;
import jailsonnt.tcc.dslfg.interpretacao.construtores.ConstrutorDeContextoDeExecucaoEnquanto;
import jailsonnt.tcc.dslfg.interpretacao.construtores.ConstrutorDeContextoDeExecucaoFuncao;
import jailsonnt.tcc.dslfg.interpretacao.construtores.ConstrutorDeContextoDeExecucaoPercorrerGrafo;
import jailsonnt.tcc.dslfg.interpretacao.construtores.ConstrutorDeContextoDeExecucaoSe;
import jailsonnt.tcc.dslfg.interpretacao.construtores.ConstrutorDeContextoDeExecucaoSimples;
import jailsonnt.tcc.dslfg.interpretacao.construtores.objetos.ConstrutorDeConjunto;
import jailsonnt.tcc.dslfg.interpretacao.construtores.objetos.ConstrutorDeGrafo;
import jailsonnt.tcc.dslfg.interpretacao.construtores.objetos.ConstrutorMultiTipos;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.ConstrutorAdicionarAConjunto;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.ConstrutorAtribuicaoPorExpressao;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.ConstrutorDeChamadaDeFuncao;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.ConstrutorDeExecutarAcaoDePercorrerGrafo;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.ConstrutorDefinirPropriedade;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.ConstrutorImportar;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.ConstrutorMostrar;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.ConstrutorRetorno;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.construtorDespejar;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes.ConstrutorDeCondicao;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes.ConstrutorDeCopiarGrafo;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes.ConstrutorDeExisteProximoItemEmIterador;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes.ConstrutorDeExpressaoAritmetica;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes.ConstrutorDeObterIterador;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes.ConstrutorDeObterPropriedade;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes.ConstrutorDeObterProximoItemDeIterador;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes.ConstrutorDeObterTodasAsArestas;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes.ConstrutorDeObterTodosOsVertices;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes.ConstrutorDiferencaDeConjuntos;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes.ConstrutorInterseccao;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes.ConstrutorObterPesoDaAresta;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes.ConstrutorObterUmElementoDe;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes.ConstrutorObterUmVerticeDe;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes.ConstrutorObterVertice;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes.ConstrutorRetirar;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes.ConstrutorUniao;
import jailsonnt.tcc.dslfg.interpretacao.construtores.primitivas.funcoes.ConstrutorVerticesAdjacentesDe;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGBaseListener;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.AdicaoDePropriedadeContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.AdicionarAConjuntoContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.AtribuicaoPorExpressaoContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.ChamadaFuncaoContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.CondicionalContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.CondicionalDeConjuntoContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.ConjuntoContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.ConstrucaoDeDigrafoContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.ConstrucaoDeGrafoContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.CopiarGrafoContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.DeclaracaoDeConjuntoContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.DefinirPropriedadeContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.DespejarContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.DiferencaContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.EnquantoContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.ExecutarAcaoDePercorrerGrafoContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.ExisteProximoItemContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.ExpressaoAritmeticaContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.FuncaoContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.FuncaoMostrarContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.FuncaoPercorerGrafoContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.ImportarContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.InterseccaoContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.LigacaoDeVerticeContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.MultiTiposContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.ObterIteradorContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.ObterPesoDaArestaContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.ObterPropriedadeContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.ObterProximoItemContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.ObterTodasAsArestasContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.ObterTodosOsVerticesContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.ObterUmElementoContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.ObterUmVerticeContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.ObterVerticeContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.ObterVerticesAdjacentesContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.PesoDaArestaContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.RetirarContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.RetornoContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.SeContext;
import jailsonnt.tcc.dslfg.interpretacao.gramatica.DSLFGParser.UniaoContext;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

@SuppressWarnings("rawtypes")
public class OuvinteDSLFG extends DSLFGBaseListener {
	private ConstrutorDeContextoDeExecucaoSimples contextoDeExecuçãoPrincipal = new ConstrutorDeContextoDeExecucaoSimples();
	
	@Override
	public void enterImportar(ImportarContext ctx) {
		String caminho = ctx.STRING().toString();
		ConstrutorImportar construtorImportar = new ConstrutorImportar(caminho);
		contextoDeExecuçãoPrincipal.adicionarComandoImportar(construtorImportar);
	}
	
	@Override
	public void enterConstrucaoDeGrafo(ConstrucaoDeGrafoContext ctx) {
		String nome = ctx.PALAVRA().toString();

		ConstrutorDeGrafo grafoEmConstrução = ConstrutorDeGrafo.novoGrafo(ctx
				.hashCode(), "grafo");
		grafoEmConstrução.comNome(nome);

	}
	@Override
	public void enterConstrucaoDeDigrafo(ConstrucaoDeDigrafoContext ctx) {
		String nome = ctx.PALAVRA().toString();

		ConstrutorDeGrafo grafoEmConstrução = ConstrutorDeGrafo.novoGrafo(ctx
				.hashCode(), "digrafo");
		grafoEmConstrução.comNome(nome);
	}

	@Override
	public void exitLigacaoDeVertice(LigacaoDeVerticeContext ctx) {
		String nomeDoVerticeOrigem = obterNomeDoVerticeDeOrigemPeloContextoDeLigacaoDeVertice(ctx);
		String nomeDoVerticeDestino = obterNomeDoVerticeDeDestinoPeloContextoDeLigacaoDeVertice(ctx);
		int identificadorDoverticeDeOrigem = obterIdentificador(ctx.declaracaoDeVertice(0));
		int identificadorDoVerticeDeDestino = obterIdentificador(ctx.declaracaoDeVertice(1));

		int identificadorDoGrafo = obterIdentificadorDoPai(ctx);

		ConstrutorDeGrafo grafoEmConstrução = ConstrutorDeGrafo
				.obterConstrutorDeGrafo(identificadorDoGrafo);

		grafoEmConstrução.adicionarVertice(identificadorDoverticeDeOrigem, nomeDoVerticeOrigem);
		grafoEmConstrução.adicionarVertice(identificadorDoVerticeDeDestino, nomeDoVerticeDestino);

		int identificadorDaAresta = obterIdentificador(ctx);
		grafoEmConstrução.adicionarAresta(identificadorDaAresta, nomeDoVerticeOrigem,
				nomeDoVerticeDestino);
	}

	
	
	@Override
	public void exitAdicaoDePropriedade(AdicaoDePropriedadeContext ctx) {
		String nomeDaPropriedade = ctx.PALAVRA().toString();
		int identificadorDoGrafo = obterIdentificadorDoBisavô(ctx);
		int identificadorDoVértice = obterIdentificadorDoPai(ctx);
		ConstrutorMultiTipos valor= ConstrutorMultiTipos.obterConstrutorMultiTipos();
		
		ConstrutorDeGrafo grafoEmConstrução = ConstrutorDeGrafo.obterConstrutorDeGrafo(identificadorDoGrafo);
		grafoEmConstrução.adicionarPropriedadeEmVértice(identificadorDoVértice, nomeDaPropriedade, valor);
	}

	@Override
	public void enterPesoDaAresta(PesoDaArestaContext ctx) {
		Double pesoDaAresta = Double.valueOf(ctx.NUMERO().getText());
		int identificadorDoGrafo = obterIdentificadorDoAvô(ctx);
		int identificadorDaAresta = obterIdentificadorDoPai(ctx);
		ConstrutorDeGrafo grafoEmConstrução = ConstrutorDeGrafo.obterConstrutorDeGrafo(identificadorDoGrafo);
		grafoEmConstrução.adicionarPesoDeAresta(identificadorDaAresta,	pesoDaAresta);

	}

	@Override
	public void exitConstrucaoDeGrafo(ConstrucaoDeGrafoContext ctx) {
		int identificadorDoGrafo = obterIdentificador(ctx);
		int contadorDeTab = ctx.TAB().size();

		ConstrutorDeGrafo grafoEmConstrução = ConstrutorDeGrafo
				.obterConstrutorDeGrafo(identificadorDoGrafo);

		contextoDeExecuçãoPrincipal.adicionarPrimitiva(grafoEmConstrução, contadorDeTab);
	}
	
	@Override
	public void exitConstrucaoDeDigrafo(ConstrucaoDeDigrafoContext ctx) {
		int identificadorDoGrafo = obterIdentificador(ctx);
		int contadorDeTab = ctx.TAB().size();

		ConstrutorDeGrafo grafoEmConstrução = ConstrutorDeGrafo
				.obterConstrutorDeGrafo(identificadorDoGrafo);

		contextoDeExecuçãoPrincipal.adicionarPrimitiva(grafoEmConstrução, contadorDeTab);
	}

	@Override
	public void exitFuncaoMostrar(FuncaoMostrarContext ctx) {
		int contadorDeTab = ctx.TAB().size();
		ConstrutorMultiTipos ValorÀmostrar = ConstrutorMultiTipos.obterConstrutorMultiTipos();
		
		ConstrutorMostrar construtorMostrar = new ConstrutorMostrar(ValorÀmostrar);

		contextoDeExecuçãoPrincipal.adicionarPrimitiva(construtorMostrar, contadorDeTab);
	}

	@Override
	public void enterDeclaracaoDeConjunto(DeclaracaoDeConjuntoContext ctx) {
		String nome = ctx.PALAVRA().toString();
		int identificadorDaAtribuiçãoDeConjunto = obterIdentificador(ctx);
		ConstrutorDeConjunto conjuntoEmConstrução = ConstrutorDeConjunto
				.novoConjunto(identificadorDaAtribuiçãoDeConjunto);
		conjuntoEmConstrução.comNome(nome);
	}

	@Override
	public void enterConjunto(ConjuntoContext ctx) {
		int identificadorDaAtribuiçãoDeConjunto = obterIdentificadorDoPai(ctx);
		ConstrutorDeConjunto conjuntoEmConstrução = ConstrutorDeConjunto
				.obterConstrutorDeConjunto(identificadorDaAtribuiçãoDeConjunto);

		for (int contador = 0; contador < ctx.NUMERO().size(); contador++) {
			Double valorAdicionado = Double.valueOf(ctx.NUMERO(contador)
					.toString());
			conjuntoEmConstrução.adicionarNumero(valorAdicionado);
		}
	}

	@Override
	public void exitDeclaracaoDeConjunto(DeclaracaoDeConjuntoContext ctx) {
		int contadorDeTab = ctx.TAB().size();
		int identificadorDaAtribuiçãoDeConjunto = obterIdentificador(ctx);
		ConstrutorDeConjunto conjuntoEmConstrução = ConstrutorDeConjunto.obterConstrutorDeConjunto(identificadorDaAtribuiçãoDeConjunto);
		contextoDeExecuçãoPrincipal.adicionarPrimitiva(conjuntoEmConstrução, contadorDeTab);
	}

	@Override
	public void exitAdicionarAConjunto(AdicionarAConjuntoContext ctx) {
		int contadorDeTab = ctx.TAB().size();
		String nomeDoConjunto = ctx.PALAVRA().toString();
		ConstrutorMultiTipos ValorÀAdicionar = ConstrutorMultiTipos.obterConstrutorMultiTipos();
		ConstrutorAdicionarAConjunto comandoEmConstrução = new ConstrutorAdicionarAConjunto(nomeDoConjunto, ValorÀAdicionar);
		contextoDeExecuçãoPrincipal.adicionarPrimitiva(comandoEmConstrução, contadorDeTab);
	}
	
	@Override
	public void exitDefinirPropriedade(DefinirPropriedadeContext ctx) {
		int contadorDeTab = ctx.TAB().size();
		String nomeDaPropriedade = ctx.PALAVRA(0).toString();
		String nomeDoVértice = ctx.PALAVRA(1).toString();
		ConstrutorMultiTipos ValorÀAdicionar = ConstrutorMultiTipos.obterConstrutorMultiTipos();
		ConstrutorDefinirPropriedade comandoEmConstrução = new ConstrutorDefinirPropriedade(nomeDaPropriedade, nomeDoVértice, ValorÀAdicionar);
		contextoDeExecuçãoPrincipal.adicionarPrimitiva(comandoEmConstrução, contadorDeTab);
	}
	
	@Override
	public void enterMultiTipos(MultiTiposContext ctx) {
		ConstrutorMultiTipos.novoConstrutorMultiTipos(ctx);
	}

	@Override
	public void enterAtribuicaoPorExpressao(AtribuicaoPorExpressaoContext ctx) {
		int identificadorDaAtribuiçãoDeExpressão = obterIdentificador(ctx);
		ConstrutorAtribuicaoPorExpressao atribuiçãoEmConstrução = ConstrutorAtribuicaoPorExpressao.novaAtribuição(identificadorDaAtribuiçãoDeExpressão);
		String nome = ctx.PALAVRA().toString();
		atribuiçãoEmConstrução.comNome(nome);
	}
	
	@Override
	public void enterExpressaoAritmetica(ExpressaoAritmeticaContext ctx) {
		int identificadorDaAtribuiçãoDeExpressão = obterIdentificadorDoAvô(ctx);
		ConstrutorMultiTipos.novoConstrutorMultiTipos(ctx.multiTipos(0));
		ConstrutorMultiTipos itemDaEsquerda = ConstrutorMultiTipos.obterConstrutorMultiTipos();
		ConstrutorMultiTipos itemDaDireita = null;
		String operador = null;
		ConstrutorAtribuicaoPorExpressao atribuiçãoEmConstrução = ConstrutorAtribuicaoPorExpressao.obterConstrutorDeAtribuiçãoPorExpressão(identificadorDaAtribuiçãoDeExpressão);
		ConstrutorDeExpressaoAritmetica expressãoAritmética;
		if (ctx.OPERADOR_ARITMETICO() != null){
			operador = ctx.OPERADOR_ARITMETICO().toString();
			ConstrutorMultiTipos.novoConstrutorMultiTipos(ctx.multiTipos(1));
			itemDaDireita = ConstrutorMultiTipos.obterConstrutorMultiTipos();
			expressãoAritmética = new ConstrutorDeExpressaoAritmetica(itemDaEsquerda.obterValor(), itemDaDireita.obterValor(), operador);
		}else{
			expressãoAritmética = new ConstrutorDeExpressaoAritmetica(itemDaEsquerda.obterValor(), null, null);
		}
		atribuiçãoEmConstrução.definirFuncao(expressãoAritmética);
	}
	
	@Override
	public void enterCopiarGrafo(CopiarGrafoContext ctx) {
		int identificadorDaAtribuiçãoDeExpressão = obterIdentificadorDoAvô(ctx);
		String nomeDografo = ctx.PALAVRA().toString();
		ConstrutorAtribuicaoPorExpressao atribuiçãoEmConstrução = ConstrutorAtribuicaoPorExpressao.obterConstrutorDeAtribuiçãoPorExpressão(identificadorDaAtribuiçãoDeExpressão);
		
		ConstrutorDeCopiarGrafo funçãoCopiargrafo = new ConstrutorDeCopiarGrafo(nomeDografo);
		atribuiçãoEmConstrução.definirFuncao(funçãoCopiargrafo);
	}
	
	@Override
	public void enterObterTodosOsVertices(ObterTodosOsVerticesContext ctx) {
		int identificadorDaAtribuiçãoDeExpressão = obterIdentificadorDoAvô(ctx);
		String nomeDografo = ctx.PALAVRA().toString();
		ConstrutorAtribuicaoPorExpressao atribuiçãoEmConstrução = ConstrutorAtribuicaoPorExpressao.obterConstrutorDeAtribuiçãoPorExpressão(identificadorDaAtribuiçãoDeExpressão);
		
		ConstrutorDeObterTodosOsVertices funçãoObterTodosOsVertices = new ConstrutorDeObterTodosOsVertices(nomeDografo);
		atribuiçãoEmConstrução.definirFuncao(funçãoObterTodosOsVertices);
	}
	
	@Override
	public void enterObterTodasAsArestas(ObterTodasAsArestasContext ctx) {
		int identificadorDaAtribuiçãoDeExpressão = obterIdentificadorDoAvô(ctx);
		String nomeDografo = ctx.PALAVRA().toString();
		ConstrutorAtribuicaoPorExpressao atribuiçãoEmConstrução = ConstrutorAtribuicaoPorExpressao.obterConstrutorDeAtribuiçãoPorExpressão(identificadorDaAtribuiçãoDeExpressão);
		
		ConstrutorDeObterTodasAsArestas funçãoObterTodasAsArestas = new ConstrutorDeObterTodasAsArestas(nomeDografo);
		atribuiçãoEmConstrução.definirFuncao(funçãoObterTodasAsArestas);
	}
	
	@Override
	public void enterObterIterador(ObterIteradorContext ctx) {
		int identificadorDaAtribuiçãoDeExpressão = obterIdentificadorDoAvô(ctx);
		String nomeDoConjunto = ctx.PALAVRA().toString();
		ConstrutorAtribuicaoPorExpressao atribuiçãoEmConstrução = ConstrutorAtribuicaoPorExpressao.obterConstrutorDeAtribuiçãoPorExpressão(identificadorDaAtribuiçãoDeExpressão);
		
		ConstrutorDeObterIterador funçãoObterIterador = new ConstrutorDeObterIterador(nomeDoConjunto);
		atribuiçãoEmConstrução.definirFuncao(funçãoObterIterador);
	}
	
	@Override
	public void enterExisteProximoItem(ExisteProximoItemContext ctx) {
		int identificadorDaAtribuiçãoDeExpressão = obterIdentificadorDoAvô(ctx);
		String nomeDoIterador = ctx.PALAVRA().toString();
		ConstrutorAtribuicaoPorExpressao atribuiçãoEmConstrução = ConstrutorAtribuicaoPorExpressao.obterConstrutorDeAtribuiçãoPorExpressão(identificadorDaAtribuiçãoDeExpressão);
		
		ConstrutorDeExisteProximoItemEmIterador funçãoExisteProximoItem = new ConstrutorDeExisteProximoItemEmIterador(nomeDoIterador);
		atribuiçãoEmConstrução.definirFuncao(funçãoExisteProximoItem);
	}
	
	@Override
	public void enterObterProximoItem(ObterProximoItemContext ctx) {
		int identificadorDaAtribuiçãoDeExpressão = obterIdentificadorDoAvô(ctx);
		String nomeDoIterador = ctx.PALAVRA().toString();
		ConstrutorAtribuicaoPorExpressao atribuiçãoEmConstrução = ConstrutorAtribuicaoPorExpressao.obterConstrutorDeAtribuiçãoPorExpressão(identificadorDaAtribuiçãoDeExpressão);
		
		ConstrutorDeObterProximoItemDeIterador funçãoObterProximoItem = new ConstrutorDeObterProximoItemDeIterador(nomeDoIterador);
		atribuiçãoEmConstrução.definirFuncao(funçãoObterProximoItem);
	}
	@Override
	public void enterObterPropriedade(ObterPropriedadeContext ctx) {
		int identificadorDaAtribuiçãoDeExpressão = obterIdentificadorDoAvô(ctx);
		String nomeDaPropriedade = ctx.PALAVRA(0).toString();
		String nomeDoVértice = ctx.PALAVRA(1).toString();
		ConstrutorAtribuicaoPorExpressao atribuiçãoEmConstrução = ConstrutorAtribuicaoPorExpressao.obterConstrutorDeAtribuiçãoPorExpressão(identificadorDaAtribuiçãoDeExpressão);

		ConstrutorDeObterPropriedade funçãoObterPropriedade = new ConstrutorDeObterPropriedade(nomeDaPropriedade, nomeDoVértice);
		atribuiçãoEmConstrução.definirFuncao(funçãoObterPropriedade);
	}

	@Override
	public void enterObterUmElemento(ObterUmElementoContext ctx) {
		int identificadorDaAtribuiçãoDeExpressão = obterIdentificadorDoAvô(ctx);
		String nomeDoObjeto = ctx.PALAVRA().toString();
		ConstrutorAtribuicaoPorExpressao atribuiçãoEmConstrução = ConstrutorAtribuicaoPorExpressao.obterConstrutorDeAtribuiçãoPorExpressão(identificadorDaAtribuiçãoDeExpressão);

		ConstrutorObterUmElementoDe funcaoObterUmElementoDe = new ConstrutorObterUmElementoDe(nomeDoObjeto);
		atribuiçãoEmConstrução.definirFuncao(funcaoObterUmElementoDe);
	}

	@Override
	public void enterObterUmVertice(ObterUmVerticeContext ctx) {
		int identificadorDaAtribuiçãoDeExpressão = obterIdentificadorDoAvô(ctx);
		String nomeDoObjeto = ctx.PALAVRA().toString();
		ConstrutorAtribuicaoPorExpressao atribuiçãoEmConstrução = ConstrutorAtribuicaoPorExpressao.obterConstrutorDeAtribuiçãoPorExpressão(identificadorDaAtribuiçãoDeExpressão);

		ConstrutorObterUmVerticeDe funcaoObterUmVerticeDe = new ConstrutorObterUmVerticeDe(nomeDoObjeto);
		atribuiçãoEmConstrução.definirFuncao(funcaoObterUmVerticeDe);
	}
	
	@Override
	public void enterObterVertice(ObterVerticeContext ctx) {
		int identificadorDaAtribuiçãoDeExpressão = obterIdentificadorDoAvô(ctx);
		String nomeDoGrafo = ctx.PALAVRA(1).toString();
		String nomeDoVértice = ctx.PALAVRA(0).toString();
		ConstrutorAtribuicaoPorExpressao atribuiçãoEmConstrução = ConstrutorAtribuicaoPorExpressao.obterConstrutorDeAtribuiçãoPorExpressão(identificadorDaAtribuiçãoDeExpressão);
		
		ConstrutorObterVertice funçãoObterVertice = new ConstrutorObterVertice(nomeDoGrafo, nomeDoVértice);
		atribuiçãoEmConstrução.definirFuncao(funçãoObterVertice);
	}
	
	@Override
	public void enterObterPesoDaAresta(ObterPesoDaArestaContext ctx) {
		int identificadorDaAtribuiçãoDeExpressão = obterIdentificadorDoAvô(ctx);
		String nomeDoVerticeDestino = ctx.PALAVRA(1).toString();
		String nomedoVerticeOrigem = ctx.PALAVRA(0).toString();
		ConstrutorAtribuicaoPorExpressao atribuiçãoEmConstrução = ConstrutorAtribuicaoPorExpressao.obterConstrutorDeAtribuiçãoPorExpressão(identificadorDaAtribuiçãoDeExpressão);
		
		ConstrutorObterPesoDaAresta funçãoObterPesoDaAresta = new ConstrutorObterPesoDaAresta(nomedoVerticeOrigem, nomeDoVerticeDestino);
		atribuiçãoEmConstrução.definirFuncao(funçãoObterPesoDaAresta);
	}

	@Override
	public void enterObterVerticesAdjacentes(ObterVerticesAdjacentesContext ctx) {
		int identificadorDaAtribuiçãoDeExpressão = obterIdentificadorDoAvô(ctx);
		String nomeDoObjeto = ctx.PALAVRA().toString();
		ConstrutorAtribuicaoPorExpressao atribuiçãoEmConstrução = ConstrutorAtribuicaoPorExpressao.obterConstrutorDeAtribuiçãoPorExpressão(identificadorDaAtribuiçãoDeExpressão);
		
		ConstrutorVerticesAdjacentesDe funcaoVerticesAdjacentes = new ConstrutorVerticesAdjacentesDe(nomeDoObjeto);
		atribuiçãoEmConstrução.definirFuncao(funcaoVerticesAdjacentes);
	}
	
	@Override
	public void enterRetirar(RetirarContext ctx) {
		int identificadorDaAtribuiçãoDeExpressão = obterIdentificadorDoAvô(ctx);
		String nomeDoConjuntoPrincipal = ctx.PALAVRA().get(0).toString();
		String nomeDoConjuntoParaRetirar = ctx.PALAVRA().get(1).toString();
		ConstrutorAtribuicaoPorExpressao atribuiçãoEmConstrução = ConstrutorAtribuicaoPorExpressao.obterConstrutorDeAtribuiçãoPorExpressão(identificadorDaAtribuiçãoDeExpressão);
		
		ConstrutorRetirar funçãoRetirar = new ConstrutorRetirar(nomeDoConjuntoPrincipal, nomeDoConjuntoParaRetirar);
		atribuiçãoEmConstrução.definirFuncao(funçãoRetirar);
	}
	
	@Override
	public void enterUniao(UniaoContext ctx) {
		int identificadorDaAtribuiçãoDeExpressão = obterIdentificadorDoAvô(ctx);
		String nomeDoConjuntoPrincipal = ctx.PALAVRA().get(0).toString();
		String nomeDoConjuntoParaUnir = ctx.PALAVRA().get(1).toString();
		ConstrutorAtribuicaoPorExpressao atribuiçãoEmConstrução = ConstrutorAtribuicaoPorExpressao.obterConstrutorDeAtribuiçãoPorExpressão(identificadorDaAtribuiçãoDeExpressão);
		
		ConstrutorUniao funçãoUniao = new ConstrutorUniao(nomeDoConjuntoPrincipal, nomeDoConjuntoParaUnir);
		atribuiçãoEmConstrução.definirFuncao(funçãoUniao);
	}
	
	@Override
	public void enterInterseccao(InterseccaoContext ctx) {
		int identificadorDaAtribuiçãoDeExpressão = obterIdentificadorDoAvô(ctx);
		String nomeDoConjuntoPrincipal = ctx.PALAVRA().get(0).toString();
		String nomeDoConjuntoParaVerificar = ctx.PALAVRA().get(1).toString();
		ConstrutorAtribuicaoPorExpressao atribuiçãoEmConstrução = ConstrutorAtribuicaoPorExpressao.obterConstrutorDeAtribuiçãoPorExpressão(identificadorDaAtribuiçãoDeExpressão);
		
		ConstrutorInterseccao funçãoIntersecção = new ConstrutorInterseccao(nomeDoConjuntoPrincipal, nomeDoConjuntoParaVerificar);
		atribuiçãoEmConstrução.definirFuncao(funçãoIntersecção);
	}
	
	@Override
	public void enterDiferenca(DiferencaContext ctx) {
		int identificadorDaAtribuiçãoDeExpressão = obterIdentificadorDoAvô(ctx);
		String nomeDoConjuntoPrincipal = ctx.PALAVRA().get(0).toString();
		String nomeDoConjuntoParaVerificar = ctx.PALAVRA().get(1).toString();
		ConstrutorAtribuicaoPorExpressao atribuiçãoEmConstrução = ConstrutorAtribuicaoPorExpressao.obterConstrutorDeAtribuiçãoPorExpressão(identificadorDaAtribuiçãoDeExpressão);
		
		ConstrutorDiferencaDeConjuntos funçãoDiferença = new ConstrutorDiferencaDeConjuntos(nomeDoConjuntoPrincipal, nomeDoConjuntoParaVerificar);
		atribuiçãoEmConstrução.definirFuncao(funçãoDiferença);
	}

	@Override
	public void exitAtribuicaoPorExpressao(AtribuicaoPorExpressaoContext ctx) {
		int contadorDeTab = ctx.TAB().size();
		int identificadorDaAtribuiçãoDeExpressão = obterIdentificador(ctx);
		ConstrutorAtribuicaoPorExpressao atribuiçãoEmConstrução = ConstrutorAtribuicaoPorExpressao.obterConstrutorDeAtribuiçãoPorExpressão(identificadorDaAtribuiçãoDeExpressão);
		contextoDeExecuçãoPrincipal.adicionarPrimitiva(atribuiçãoEmConstrução, contadorDeTab);
	}
	
	@Override
	public void exitCondicionalDeConjunto(CondicionalDeConjuntoContext ctx) {
		String itemDaEsquerda = ctx.PALAVRA(0).toString();
		String itemDaDireita = ctx.PALAVRA(1).toString();
		String nomeDaFunçãoDoOperador = ctx.OPERADOR_CONDICIONAL_DE_CONJUNTO().toString();
		ConstrutorDeCondicao.novoConstrutorDeCondição(itemDaEsquerda, itemDaDireita, nomeDaFunçãoDoOperador);
	}
	
	@Override
	public void exitCondicional(CondicionalContext ctx) {
		ConstrutorMultiTipos.novoConstrutorMultiTipos(ctx.multiTipos(0));
		ConstrutorMultiTipos itemDaEsquerda = ConstrutorMultiTipos.obterConstrutorMultiTipos();
		ConstrutorMultiTipos.novoConstrutorMultiTipos(ctx.multiTipos(1));
		ConstrutorMultiTipos itemDaDireita = ConstrutorMultiTipos.obterConstrutorMultiTipos();
		String nomeDaFunçãoDoOperador = ctx.OPERADOR_CONDICIONAL().toString();
		ConstrutorDeCondicao.novoConstrutorDeCondição(itemDaEsquerda.obterValor(), itemDaDireita.obterValor(), nomeDaFunçãoDoOperador);
	}
		
	@Override
	public void exitSe(SeContext ctx) {
		int contadorDeTab = ctx.TAB().size();
		ConstrutorDeContextoDeExecucaoSe comandoSe = new ConstrutorDeContextoDeExecucaoSe(ConstrutorDeCondicao.obterConstrutorDeCondição());
		contextoDeExecuçãoPrincipal.adicionarPrimitiva(comandoSe, contadorDeTab);
	}

	@Override
	public void exitEnquanto(EnquantoContext ctx) {
		int contadorDeTab = ctx.TAB().size();
		ConstrutorDeContextoDeExecucaoEnquanto comandoEnquanto = new ConstrutorDeContextoDeExecucaoEnquanto(ConstrutorDeCondicao.obterConstrutorDeCondição());
		contextoDeExecuçãoPrincipal.adicionarPrimitiva(comandoEnquanto, contadorDeTab);
	}
	
	@Override
	public void enterDespejar(DespejarContext ctx) {
		int contadorDeTab = ctx.TAB().size();
		String variávelParaDespejar = ctx.PALAVRA().toString();
		construtorDespejar despejar = new construtorDespejar(variávelParaDespejar);
		contextoDeExecuçãoPrincipal.adicionarPrimitiva(despejar, contadorDeTab);
	}
	
	
	@Override
	public void enterFuncao(FuncaoContext ctx) {
		String nomeDaFunção = ctx.PALAVRA().toString();
		ConstrutorDeContextoDeExecucaoFuncao novaFunção = new ConstrutorDeContextoDeExecucaoFuncao(nomeDaFunção);
		List parametros = ctx.parametros().PALAVRA();
		for (Object parametro: parametros){
			novaFunção.adicionarParametro(parametro.toString());
		}
		contextoDeExecuçãoPrincipal.adicionarFunção(nomeDaFunção, novaFunção);
		
	}
	
	@Override
	public void enterChamadaFuncao(ChamadaFuncaoContext ctx) {
		int contadorDeTab = ctx.TAB().size();
		String nomeDaFunção = ctx.PALAVRA().toString();
		ConstrutorDeChamadaDeFuncao novaFunção = new ConstrutorDeChamadaDeFuncao(nomeDaFunção);
		List parametros = ctx.parametros().PALAVRA();
		for (Object parametro: parametros){
			novaFunção.adicionarParametro(parametro.toString());
		}
		
		int identificadorDaAtribuiçãoDeExpressão = obterIdentificadorDoAvô(ctx);
		ConstrutorAtribuicaoPorExpressao atribuiçãoEmConstrução = ConstrutorAtribuicaoPorExpressao.obterConstrutorDeAtribuiçãoPorExpressão(identificadorDaAtribuiçãoDeExpressão);
		
		if (atribuiçãoEmConstrução == null){
			contextoDeExecuçãoPrincipal.adicionarPrimitiva(novaFunção, contadorDeTab);
		}else{
			atribuiçãoEmConstrução.definirFuncao(novaFunção);
		}
	}
	
	@Override
	public void enterRetorno(RetornoContext ctx) {
		int contadorDeTab = ctx.TAB().size();
		String variavelParaRetornar = ctx.PALAVRA().toString();
		ConstrutorRetorno retorno =  new ConstrutorRetorno(variavelParaRetornar);
		contextoDeExecuçãoPrincipal.adicionarPrimitiva(retorno, contadorDeTab);
	}
	
	@Override
	public void enterFuncaoPercorerGrafo(FuncaoPercorerGrafoContext ctx) {
		int contadorDeTab = ctx.TAB().size();
		String nomeDoGrafo = ctx.PALAVRA(0).toString();
		String nomeDaFunção = ctx.PALAVRA(1).toString();
		String nomeDoVerticeInicial = ctx.PALAVRA(2).toString();
		ConstrutorDeContextoDeExecucaoPercorrerGrafo percorrerGrafo = new ConstrutorDeContextoDeExecucaoPercorrerGrafo(nomeDoGrafo, nomeDaFunção, nomeDoVerticeInicial);
		contextoDeExecuçãoPrincipal.adicionarPrimitiva(percorrerGrafo, contadorDeTab);
	}
	
	@Override
	public void enterExecutarAcaoDePercorrerGrafo(ExecutarAcaoDePercorrerGrafoContext ctx) {
		int contadorDeTab = ctx.TAB().size();
		String nomeDoParametroComAção = ctx.PALAVRA().toString();
		ConstrutorDeExecutarAcaoDePercorrerGrafo executarAçãoDePercorrerGrafo = new ConstrutorDeExecutarAcaoDePercorrerGrafo(nomeDoParametroComAção);
		List parametros = ctx.parametros().PALAVRA();
		for (Object parametro: parametros){
			executarAçãoDePercorrerGrafo.adicionarParâmetro(parametro.toString());
		}
		contextoDeExecuçãoPrincipal.adicionarPrimitiva(executarAçãoDePercorrerGrafo, contadorDeTab);
	}
	
	public ContextoDeExecucaoSimples obterContextoDeExecução() {
		return (ContextoDeExecucaoSimples) contextoDeExecuçãoPrincipal.obterComando();
	}
	
	private int obterIdentificadorDoPai(ParserRuleContext ctx) {
		return ctx.parent.hashCode();
	}
	
	private int obterIdentificadorDoAvô(ParserRuleContext ctx) {
		return ctx.parent.parent.hashCode();
	}
	
	private int obterIdentificadorDoBisavô(ParserRuleContext ctx) {
		return ctx.parent.parent.parent.hashCode();
	}
	private int obterIdentificador(ParserRuleContext ctx){
		return ctx.hashCode();
	}
	
	private String obterNomeDoVerticeDeOrigemPeloContextoDeLigacaoDeVertice(LigacaoDeVerticeContext ctx) {
		return ctx.declaracaoDeVertice(0).PALAVRA().toString();
	}
	
	private String obterNomeDoVerticeDeDestinoPeloContextoDeLigacaoDeVertice(LigacaoDeVerticeContext ctx) {
		return ctx.declaracaoDeVertice(1).PALAVRA().toString();
	}
}
