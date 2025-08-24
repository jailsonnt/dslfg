// Generated from DSLFG.g4 by ANTLR 4.1
package jailsonnt.tcc.dslfg.interpretacao.gramatica;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DSLFGParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__42=1, T__41=2, T__40=3, T__39=4, T__38=5, T__37=6, T__36=7, T__35=8, 
		T__34=9, T__33=10, T__32=11, T__31=12, T__30=13, T__29=14, T__28=15, T__27=16, 
		T__26=17, T__25=18, T__24=19, T__23=20, T__22=21, T__21=22, T__20=23, 
		T__19=24, T__18=25, T__17=26, T__16=27, T__15=28, T__14=29, T__13=30, 
		T__12=31, T__11=32, T__10=33, T__9=34, T__8=35, T__7=36, T__6=37, T__5=38, 
		T__4=39, T__3=40, T__2=41, T__1=42, T__0=43, TIPOS_BOOLEANOS=44, CONSTANTES=45, 
		OPERADOR_ARITMETICO=46, OPERADOR_CONDICIONAL_DE_CONJUNTO=47, OPERADOR_CONDICIONAL=48, 
		NUMERO=49, STRING=50, DIGITO=51, PALAVRA=52, TAB=53, QUEBRA_DE_LINHA=54, 
		COMENTARIO=55, WS=56;
	public static final String[] tokenNames = {
		"<INVALID>", "'importar'", "'utilizando'", "','", "'grafo'", "'executar'", 
		"'em'", "'iniciandoEm'", "'comPeso'", "'percorrerGrafo'", "'obterPesoDaAresta'", 
		"'obterVertice'", "'obterUmVerticeDe'", "'copiarGrafo'", "'se'", "'{'", 
		"'diferenca'", "'mostrar'", "'retornar'", "'}'", "'com'", "'para'", "'enquanto'", 
		"'unindo'", "'comValor'", "'existeProximoItemEm'", "'adicionar'", "'='", 
		"'obterPropriedade'", "'despejar'", "'função'", "'obterProximoItemDe'", 
		"'digrafo'", "'interseccao'", "'retirando'", "'verticesAdjacentesDe'", 
		"'obterTodasAsArestasDe'", "'ligadoCom'", "'definirPropriedade'", "'obterIteradorDe'", 
		"'obterUmElementoDe'", "'obterTodosOsVerticesDe'", "'de'", "'fornecendo'", 
		"TIPOS_BOOLEANOS", "CONSTANTES", "OPERADOR_ARITMETICO", "OPERADOR_CONDICIONAL_DE_CONJUNTO", 
		"OPERADOR_CONDICIONAL", "NUMERO", "STRING", "DIGITO", "PALAVRA", "'\t'", 
		"QUEBRA_DE_LINHA", "COMENTARIO", "WS"
	};
	public static final int
		RULE_inicio = 0, RULE_codigo = 1, RULE_se = 2, RULE_enquanto = 3, RULE_condicionalDeConjunto = 4, 
		RULE_condicional = 5, RULE_importar = 6, RULE_construcaoDeGrafo = 7, RULE_construcaoDeDigrafo = 8, 
		RULE_ligacaoDeVertice = 9, RULE_declaracaoDeVertice = 10, RULE_adicaoDePropriedade = 11, 
		RULE_pesoDaAresta = 12, RULE_funcaoMostrar = 13, RULE_declaracaoDeConjunto = 14, 
		RULE_atribuicaoPorExpressao = 15, RULE_conjunto = 16, RULE_adicionarAConjunto = 17, 
		RULE_definirPropriedade = 18, RULE_funcoes = 19, RULE_expressaoAritmetica = 20, 
		RULE_retirar = 21, RULE_uniao = 22, RULE_interseccao = 23, RULE_diferenca = 24, 
		RULE_chamadaFuncao = 25, RULE_copiarGrafo = 26, RULE_obterTodosOsVertices = 27, 
		RULE_obterTodasAsArestas = 28, RULE_obterIterador = 29, RULE_existeProximoItem = 30, 
		RULE_obterProximoItem = 31, RULE_obterPropriedade = 32, RULE_obterPesoDaAresta = 33, 
		RULE_obterVerticesAdjacentes = 34, RULE_obterUmElemento = 35, RULE_obterUmVertice = 36, 
		RULE_obterVertice = 37, RULE_multiTipos = 38, RULE_despejar = 39, RULE_funcao = 40, 
		RULE_parametros = 41, RULE_retorno = 42, RULE_funcaoPercorerGrafo = 43, 
		RULE_executarAcaoDePercorrerGrafo = 44;
	public static final String[] ruleNames = {
		"inicio", "codigo", "se", "enquanto", "condicionalDeConjunto", "condicional", 
		"importar", "construcaoDeGrafo", "construcaoDeDigrafo", "ligacaoDeVertice", 
		"declaracaoDeVertice", "adicaoDePropriedade", "pesoDaAresta", "funcaoMostrar", 
		"declaracaoDeConjunto", "atribuicaoPorExpressao", "conjunto", "adicionarAConjunto", 
		"definirPropriedade", "funcoes", "expressaoAritmetica", "retirar", "uniao", 
		"interseccao", "diferenca", "chamadaFuncao", "copiarGrafo", "obterTodosOsVertices", 
		"obterTodasAsArestas", "obterIterador", "existeProximoItem", "obterProximoItem", 
		"obterPropriedade", "obterPesoDaAresta", "obterVerticesAdjacentes", "obterUmElemento", 
		"obterUmVertice", "obterVertice", "multiTipos", "despejar", "funcao", 
		"parametros", "retorno", "funcaoPercorerGrafo", "executarAcaoDePercorrerGrafo"
	};

	@Override
	public String getGrammarFileName() { return "DSLFG.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public DSLFGParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InicioContext extends ParserRuleContext {
		public List<ImportarContext> importar() {
			return getRuleContexts(ImportarContext.class);
		}
		public CodigoContext codigo(int i) {
			return getRuleContext(CodigoContext.class,i);
		}
		public ImportarContext importar(int i) {
			return getRuleContext(ImportarContext.class,i);
		}
		public List<CodigoContext> codigo() {
			return getRuleContexts(CodigoContext.class);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==1) {
				{
				{
				setState(90); importar();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 5) | (1L << 9) | (1L << 14) | (1L << 17) | (1L << 22) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 32) | (1L << 38) | (1L << PALAVRA) | (1L << TAB) | (1L << QUEBRA_DE_LINHA))) != 0)) {
				{
				{
				setState(96); codigo();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodigoContext extends ParserRuleContext {
		public FuncaoPercorerGrafoContext funcaoPercorerGrafo() {
			return getRuleContext(FuncaoPercorerGrafoContext.class,0);
		}
		public TerminalNode QUEBRA_DE_LINHA() { return getToken(DSLFGParser.QUEBRA_DE_LINHA, 0); }
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public AdicionarAConjuntoContext adicionarAConjunto() {
			return getRuleContext(AdicionarAConjuntoContext.class,0);
		}
		public DespejarContext despejar() {
			return getRuleContext(DespejarContext.class,0);
		}
		public SeContext se() {
			return getRuleContext(SeContext.class,0);
		}
		public DefinirPropriedadeContext definirPropriedade() {
			return getRuleContext(DefinirPropriedadeContext.class,0);
		}
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public ConstrucaoDeDigrafoContext construcaoDeDigrafo() {
			return getRuleContext(ConstrucaoDeDigrafoContext.class,0);
		}
		public ExecutarAcaoDePercorrerGrafoContext executarAcaoDePercorrerGrafo() {
			return getRuleContext(ExecutarAcaoDePercorrerGrafoContext.class,0);
		}
		public DeclaracaoDeConjuntoContext declaracaoDeConjunto() {
			return getRuleContext(DeclaracaoDeConjuntoContext.class,0);
		}
		public AtribuicaoPorExpressaoContext atribuicaoPorExpressao() {
			return getRuleContext(AtribuicaoPorExpressaoContext.class,0);
		}
		public ConstrucaoDeGrafoContext construcaoDeGrafo() {
			return getRuleContext(ConstrucaoDeGrafoContext.class,0);
		}
		public FuncaoMostrarContext funcaoMostrar() {
			return getRuleContext(FuncaoMostrarContext.class,0);
		}
		public EnquantoContext enquanto() {
			return getRuleContext(EnquantoContext.class,0);
		}
		public CodigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterCodigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitCodigo(this);
		}
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_codigo);
		try {
			setState(118);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102); match(QUEBRA_DE_LINHA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103); construcaoDeGrafo();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104); construcaoDeDigrafo();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105); funcaoMostrar();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(106); declaracaoDeConjunto();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(107); atribuicaoPorExpressao();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(108); adicionarAConjunto();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(109); definirPropriedade();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(110); se();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(111); enquanto();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(112); despejar();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(113); funcao();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(114); chamadaFuncao();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(115); retorno();
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(116); funcaoPercorerGrafo();
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(117); executarAcaoDePercorrerGrafo();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SeContext extends ParserRuleContext {
		public TerminalNode QUEBRA_DE_LINHA() { return getToken(DSLFGParser.QUEBRA_DE_LINHA, 0); }
		public TerminalNode TAB(int i) {
			return getToken(DSLFGParser.TAB, i);
		}
		public CondicionalDeConjuntoContext condicionalDeConjunto() {
			return getRuleContext(CondicionalDeConjuntoContext.class,0);
		}
		public List<TerminalNode> TAB() { return getTokens(DSLFGParser.TAB); }
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public SeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitSe(this);
		}
	}

	public final SeContext se() throws RecognitionException {
		SeContext _localctx = new SeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_se);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB) {
				{
				{
				setState(120); match(TAB);
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126); match(14);
			setState(129);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(127); condicionalDeConjunto();
				}
				break;

			case 2:
				{
				setState(128); condicional();
				}
				break;
			}
			setState(131); match(QUEBRA_DE_LINHA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnquantoContext extends ParserRuleContext {
		public TerminalNode QUEBRA_DE_LINHA() { return getToken(DSLFGParser.QUEBRA_DE_LINHA, 0); }
		public TerminalNode TAB(int i) {
			return getToken(DSLFGParser.TAB, i);
		}
		public CondicionalDeConjuntoContext condicionalDeConjunto() {
			return getRuleContext(CondicionalDeConjuntoContext.class,0);
		}
		public List<TerminalNode> TAB() { return getTokens(DSLFGParser.TAB); }
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public EnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitEnquanto(this);
		}
	}

	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_enquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB) {
				{
				{
				setState(133); match(TAB);
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139); match(22);
			setState(142);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(140); condicionalDeConjunto();
				}
				break;

			case 2:
				{
				setState(141); condicional();
				}
				break;
			}
			setState(144); match(QUEBRA_DE_LINHA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionalDeConjuntoContext extends ParserRuleContext {
		public List<TerminalNode> PALAVRA() { return getTokens(DSLFGParser.PALAVRA); }
		public TerminalNode OPERADOR_CONDICIONAL_DE_CONJUNTO() { return getToken(DSLFGParser.OPERADOR_CONDICIONAL_DE_CONJUNTO, 0); }
		public TerminalNode PALAVRA(int i) {
			return getToken(DSLFGParser.PALAVRA, i);
		}
		public CondicionalDeConjuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionalDeConjunto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterCondicionalDeConjunto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitCondicionalDeConjunto(this);
		}
	}

	public final CondicionalDeConjuntoContext condicionalDeConjunto() throws RecognitionException {
		CondicionalDeConjuntoContext _localctx = new CondicionalDeConjuntoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condicionalDeConjunto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(PALAVRA);
			setState(147); match(OPERADOR_CONDICIONAL_DE_CONJUNTO);
			setState(148); match(PALAVRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode OPERADOR_CONDICIONAL() { return getToken(DSLFGParser.OPERADOR_CONDICIONAL, 0); }
		public MultiTiposContext multiTipos(int i) {
			return getRuleContext(MultiTiposContext.class,i);
		}
		public List<MultiTiposContext> multiTipos() {
			return getRuleContexts(MultiTiposContext.class);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); multiTipos();
			setState(151); match(OPERADOR_CONDICIONAL);
			setState(152); multiTipos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportarContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DSLFGParser.STRING, 0); }
		public ImportarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterImportar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitImportar(this);
		}
	}

	public final ImportarContext importar() throws RecognitionException {
		ImportarContext _localctx = new ImportarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); match(1);
			setState(155); match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstrucaoDeGrafoContext extends ParserRuleContext {
		public TerminalNode QUEBRA_DE_LINHA() { return getToken(DSLFGParser.QUEBRA_DE_LINHA, 0); }
		public TerminalNode TAB(int i) {
			return getToken(DSLFGParser.TAB, i);
		}
		public TerminalNode PALAVRA() { return getToken(DSLFGParser.PALAVRA, 0); }
		public LigacaoDeVerticeContext ligacaoDeVertice(int i) {
			return getRuleContext(LigacaoDeVerticeContext.class,i);
		}
		public List<LigacaoDeVerticeContext> ligacaoDeVertice() {
			return getRuleContexts(LigacaoDeVerticeContext.class);
		}
		public List<TerminalNode> TAB() { return getTokens(DSLFGParser.TAB); }
		public ConstrucaoDeGrafoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_construcaoDeGrafo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterConstrucaoDeGrafo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitConstrucaoDeGrafo(this);
		}
	}

	public final ConstrucaoDeGrafoContext construcaoDeGrafo() throws RecognitionException {
		ConstrucaoDeGrafoContext _localctx = new ConstrucaoDeGrafoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_construcaoDeGrafo);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB) {
				{
				{
				setState(157); match(TAB);
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163); match(4);
			setState(164); match(PALAVRA);
			setState(165); match(QUEBRA_DE_LINHA);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(166); ligacaoDeVertice();
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstrucaoDeDigrafoContext extends ParserRuleContext {
		public TerminalNode QUEBRA_DE_LINHA() { return getToken(DSLFGParser.QUEBRA_DE_LINHA, 0); }
		public TerminalNode TAB(int i) {
			return getToken(DSLFGParser.TAB, i);
		}
		public TerminalNode PALAVRA() { return getToken(DSLFGParser.PALAVRA, 0); }
		public LigacaoDeVerticeContext ligacaoDeVertice(int i) {
			return getRuleContext(LigacaoDeVerticeContext.class,i);
		}
		public List<LigacaoDeVerticeContext> ligacaoDeVertice() {
			return getRuleContexts(LigacaoDeVerticeContext.class);
		}
		public List<TerminalNode> TAB() { return getTokens(DSLFGParser.TAB); }
		public ConstrucaoDeDigrafoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_construcaoDeDigrafo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterConstrucaoDeDigrafo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitConstrucaoDeDigrafo(this);
		}
	}

	public final ConstrucaoDeDigrafoContext construcaoDeDigrafo() throws RecognitionException {
		ConstrucaoDeDigrafoContext _localctx = new ConstrucaoDeDigrafoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_construcaoDeDigrafo);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB) {
				{
				{
				setState(172); match(TAB);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178); match(32);
			setState(179); match(PALAVRA);
			setState(180); match(QUEBRA_DE_LINHA);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(181); ligacaoDeVertice();
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LigacaoDeVerticeContext extends ParserRuleContext {
		public TerminalNode QUEBRA_DE_LINHA() { return getToken(DSLFGParser.QUEBRA_DE_LINHA, 0); }
		public TerminalNode TAB(int i) {
			return getToken(DSLFGParser.TAB, i);
		}
		public DeclaracaoDeVerticeContext declaracaoDeVertice(int i) {
			return getRuleContext(DeclaracaoDeVerticeContext.class,i);
		}
		public List<DeclaracaoDeVerticeContext> declaracaoDeVertice() {
			return getRuleContexts(DeclaracaoDeVerticeContext.class);
		}
		public PesoDaArestaContext pesoDaAresta() {
			return getRuleContext(PesoDaArestaContext.class,0);
		}
		public List<TerminalNode> TAB() { return getTokens(DSLFGParser.TAB); }
		public LigacaoDeVerticeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ligacaoDeVertice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterLigacaoDeVertice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitLigacaoDeVertice(this);
		}
	}

	public final LigacaoDeVerticeContext ligacaoDeVertice() throws RecognitionException {
		LigacaoDeVerticeContext _localctx = new LigacaoDeVerticeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ligacaoDeVertice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(187); match(TAB);
				}
				}
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(192); declaracaoDeVertice();
			setState(193); match(37);
			setState(194); declaracaoDeVertice();
			setState(196);
			_la = _input.LA(1);
			if (_la==8) {
				{
				setState(195); pesoDaAresta();
				}
			}

			setState(198); match(QUEBRA_DE_LINHA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoDeVerticeContext extends ParserRuleContext {
		public List<AdicaoDePropriedadeContext> adicaoDePropriedade() {
			return getRuleContexts(AdicaoDePropriedadeContext.class);
		}
		public TerminalNode QUEBRA_DE_LINHA() { return getToken(DSLFGParser.QUEBRA_DE_LINHA, 0); }
		public TerminalNode TAB(int i) {
			return getToken(DSLFGParser.TAB, i);
		}
		public TerminalNode PALAVRA() { return getToken(DSLFGParser.PALAVRA, 0); }
		public AdicaoDePropriedadeContext adicaoDePropriedade(int i) {
			return getRuleContext(AdicaoDePropriedadeContext.class,i);
		}
		public List<TerminalNode> TAB() { return getTokens(DSLFGParser.TAB); }
		public DeclaracaoDeVerticeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoDeVertice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterDeclaracaoDeVertice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitDeclaracaoDeVertice(this);
		}
	}

	public final DeclaracaoDeVerticeContext declaracaoDeVertice() throws RecognitionException {
		DeclaracaoDeVerticeContext _localctx = new DeclaracaoDeVerticeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaracaoDeVertice);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200); match(PALAVRA);
			setState(213);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(201); match(QUEBRA_DE_LINHA);
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(202); adicaoDePropriedade();
						}
						} 
					}
					setState(207);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(209); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(208); match(TAB);
					}
					}
					setState(211); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TAB );
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdicaoDePropriedadeContext extends ParserRuleContext {
		public TerminalNode QUEBRA_DE_LINHA() { return getToken(DSLFGParser.QUEBRA_DE_LINHA, 0); }
		public TerminalNode TAB(int i) {
			return getToken(DSLFGParser.TAB, i);
		}
		public TerminalNode PALAVRA() { return getToken(DSLFGParser.PALAVRA, 0); }
		public MultiTiposContext multiTipos() {
			return getRuleContext(MultiTiposContext.class,0);
		}
		public List<TerminalNode> TAB() { return getTokens(DSLFGParser.TAB); }
		public AdicaoDePropriedadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adicaoDePropriedade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterAdicaoDePropriedade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitAdicaoDePropriedade(this);
		}
	}

	public final AdicaoDePropriedadeContext adicaoDePropriedade() throws RecognitionException {
		AdicaoDePropriedadeContext _localctx = new AdicaoDePropriedadeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_adicaoDePropriedade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(215); match(TAB);
				}
				}
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(220); match(20);
			setState(221); match(PALAVRA);
			setState(222); match(27);
			setState(223); multiTipos();
			setState(224); match(QUEBRA_DE_LINHA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PesoDaArestaContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(DSLFGParser.NUMERO, 0); }
		public PesoDaArestaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pesoDaAresta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterPesoDaAresta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitPesoDaAresta(this);
		}
	}

	public final PesoDaArestaContext pesoDaAresta() throws RecognitionException {
		PesoDaArestaContext _localctx = new PesoDaArestaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pesoDaAresta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226); match(8);
			setState(227); match(NUMERO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncaoMostrarContext extends ParserRuleContext {
		public TerminalNode QUEBRA_DE_LINHA() { return getToken(DSLFGParser.QUEBRA_DE_LINHA, 0); }
		public TerminalNode TAB(int i) {
			return getToken(DSLFGParser.TAB, i);
		}
		public MultiTiposContext multiTipos() {
			return getRuleContext(MultiTiposContext.class,0);
		}
		public List<TerminalNode> TAB() { return getTokens(DSLFGParser.TAB); }
		public FuncaoMostrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcaoMostrar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterFuncaoMostrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitFuncaoMostrar(this);
		}
	}

	public final FuncaoMostrarContext funcaoMostrar() throws RecognitionException {
		FuncaoMostrarContext _localctx = new FuncaoMostrarContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcaoMostrar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB) {
				{
				{
				setState(229); match(TAB);
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235); match(17);
			setState(236); multiTipos();
			setState(237); match(QUEBRA_DE_LINHA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoDeConjuntoContext extends ParserRuleContext {
		public TerminalNode QUEBRA_DE_LINHA() { return getToken(DSLFGParser.QUEBRA_DE_LINHA, 0); }
		public TerminalNode TAB(int i) {
			return getToken(DSLFGParser.TAB, i);
		}
		public ConjuntoContext conjunto() {
			return getRuleContext(ConjuntoContext.class,0);
		}
		public TerminalNode PALAVRA() { return getToken(DSLFGParser.PALAVRA, 0); }
		public List<TerminalNode> TAB() { return getTokens(DSLFGParser.TAB); }
		public DeclaracaoDeConjuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoDeConjunto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterDeclaracaoDeConjunto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitDeclaracaoDeConjunto(this);
		}
	}

	public final DeclaracaoDeConjuntoContext declaracaoDeConjunto() throws RecognitionException {
		DeclaracaoDeConjuntoContext _localctx = new DeclaracaoDeConjuntoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declaracaoDeConjunto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB) {
				{
				{
				setState(239); match(TAB);
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245); match(PALAVRA);
			setState(246); match(27);
			setState(247); conjunto();
			setState(248); match(QUEBRA_DE_LINHA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtribuicaoPorExpressaoContext extends ParserRuleContext {
		public TerminalNode QUEBRA_DE_LINHA() { return getToken(DSLFGParser.QUEBRA_DE_LINHA, 0); }
		public TerminalNode TAB(int i) {
			return getToken(DSLFGParser.TAB, i);
		}
		public FuncoesContext funcoes() {
			return getRuleContext(FuncoesContext.class,0);
		}
		public TerminalNode PALAVRA() { return getToken(DSLFGParser.PALAVRA, 0); }
		public List<TerminalNode> TAB() { return getTokens(DSLFGParser.TAB); }
		public AtribuicaoPorExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaoPorExpressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterAtribuicaoPorExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitAtribuicaoPorExpressao(this);
		}
	}

	public final AtribuicaoPorExpressaoContext atribuicaoPorExpressao() throws RecognitionException {
		AtribuicaoPorExpressaoContext _localctx = new AtribuicaoPorExpressaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atribuicaoPorExpressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB) {
				{
				{
				setState(250); match(TAB);
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256); match(PALAVRA);
			setState(257); match(27);
			setState(258); funcoes();
			setState(259); match(QUEBRA_DE_LINHA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConjuntoContext extends ParserRuleContext {
		public TerminalNode NUMERO(int i) {
			return getToken(DSLFGParser.NUMERO, i);
		}
		public List<TerminalNode> NUMERO() { return getTokens(DSLFGParser.NUMERO); }
		public ConjuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterConjunto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitConjunto(this);
		}
	}

	public final ConjuntoContext conjunto() throws RecognitionException {
		ConjuntoContext _localctx = new ConjuntoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conjunto);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(261); match(15);
			setState(270);
			_la = _input.LA(1);
			if (_la==NUMERO) {
				{
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(262); match(NUMERO);
						setState(263); match(3);
						}
						} 
					}
					setState(268);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(269); match(NUMERO);
				}
			}

			setState(272); match(19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdicionarAConjuntoContext extends ParserRuleContext {
		public TerminalNode QUEBRA_DE_LINHA() { return getToken(DSLFGParser.QUEBRA_DE_LINHA, 0); }
		public TerminalNode TAB(int i) {
			return getToken(DSLFGParser.TAB, i);
		}
		public TerminalNode PALAVRA() { return getToken(DSLFGParser.PALAVRA, 0); }
		public MultiTiposContext multiTipos() {
			return getRuleContext(MultiTiposContext.class,0);
		}
		public List<TerminalNode> TAB() { return getTokens(DSLFGParser.TAB); }
		public AdicionarAConjuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adicionarAConjunto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterAdicionarAConjunto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitAdicionarAConjunto(this);
		}
	}

	public final AdicionarAConjuntoContext adicionarAConjunto() throws RecognitionException {
		AdicionarAConjuntoContext _localctx = new AdicionarAConjuntoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_adicionarAConjunto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB) {
				{
				{
				setState(274); match(TAB);
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280); match(26);
			setState(281); multiTipos();
			setState(282); match(6);
			setState(283); match(PALAVRA);
			setState(284); match(QUEBRA_DE_LINHA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinirPropriedadeContext extends ParserRuleContext {
		public TerminalNode QUEBRA_DE_LINHA() { return getToken(DSLFGParser.QUEBRA_DE_LINHA, 0); }
		public TerminalNode TAB(int i) {
			return getToken(DSLFGParser.TAB, i);
		}
		public List<TerminalNode> PALAVRA() { return getTokens(DSLFGParser.PALAVRA); }
		public MultiTiposContext multiTipos() {
			return getRuleContext(MultiTiposContext.class,0);
		}
		public TerminalNode PALAVRA(int i) {
			return getToken(DSLFGParser.PALAVRA, i);
		}
		public List<TerminalNode> TAB() { return getTokens(DSLFGParser.TAB); }
		public DefinirPropriedadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definirPropriedade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterDefinirPropriedade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitDefinirPropriedade(this);
		}
	}

	public final DefinirPropriedadeContext definirPropriedade() throws RecognitionException {
		DefinirPropriedadeContext _localctx = new DefinirPropriedadeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_definirPropriedade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB) {
				{
				{
				setState(286); match(TAB);
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292); match(38);
			setState(293); match(PALAVRA);
			setState(294); match(6);
			setState(295); match(PALAVRA);
			setState(296); match(24);
			setState(297); multiTipos();
			setState(298); match(QUEBRA_DE_LINHA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncoesContext extends ParserRuleContext {
		public ExisteProximoItemContext existeProximoItem() {
			return getRuleContext(ExisteProximoItemContext.class,0);
		}
		public ObterVerticesAdjacentesContext obterVerticesAdjacentes() {
			return getRuleContext(ObterVerticesAdjacentesContext.class,0);
		}
		public ObterUmVerticeContext obterUmVertice() {
			return getRuleContext(ObterUmVerticeContext.class,0);
		}
		public ObterTodasAsArestasContext obterTodasAsArestas() {
			return getRuleContext(ObterTodasAsArestasContext.class,0);
		}
		public ObterProximoItemContext obterProximoItem() {
			return getRuleContext(ObterProximoItemContext.class,0);
		}
		public InterseccaoContext interseccao() {
			return getRuleContext(InterseccaoContext.class,0);
		}
		public ObterPesoDaArestaContext obterPesoDaAresta() {
			return getRuleContext(ObterPesoDaArestaContext.class,0);
		}
		public UniaoContext uniao() {
			return getRuleContext(UniaoContext.class,0);
		}
		public ObterUmElementoContext obterUmElemento() {
			return getRuleContext(ObterUmElementoContext.class,0);
		}
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public DiferencaContext diferenca() {
			return getRuleContext(DiferencaContext.class,0);
		}
		public ObterTodosOsVerticesContext obterTodosOsVertices() {
			return getRuleContext(ObterTodosOsVerticesContext.class,0);
		}
		public ObterVerticeContext obterVertice() {
			return getRuleContext(ObterVerticeContext.class,0);
		}
		public ObterPropriedadeContext obterPropriedade() {
			return getRuleContext(ObterPropriedadeContext.class,0);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public CopiarGrafoContext copiarGrafo() {
			return getRuleContext(CopiarGrafoContext.class,0);
		}
		public ObterIteradorContext obterIterador() {
			return getRuleContext(ObterIteradorContext.class,0);
		}
		public RetirarContext retirar() {
			return getRuleContext(RetirarContext.class,0);
		}
		public FuncoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterFuncoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitFuncoes(this);
		}
	}

	public final FuncoesContext funcoes() throws RecognitionException {
		FuncoesContext _localctx = new FuncoesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_funcoes);
		try {
			setState(318);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300); obterVerticesAdjacentes();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301); obterUmElemento();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(302); obterUmVertice();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(303); retirar();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(304); uniao();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(305); interseccao();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(306); diferenca();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(307); chamadaFuncao();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(308); obterVertice();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(309); obterPesoDaAresta();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(310); obterPropriedade();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(311); obterIterador();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(312); existeProximoItem();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(313); obterProximoItem();
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(314); obterTodosOsVertices();
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(315); obterTodasAsArestas();
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(316); copiarGrafo();
				}
				break;

			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(317); expressaoAritmetica();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoAritmeticaContext extends ParserRuleContext {
		public MultiTiposContext multiTipos(int i) {
			return getRuleContext(MultiTiposContext.class,i);
		}
		public TerminalNode OPERADOR_ARITMETICO() { return getToken(DSLFGParser.OPERADOR_ARITMETICO, 0); }
		public List<MultiTiposContext> multiTipos() {
			return getRuleContexts(MultiTiposContext.class);
		}
		public ExpressaoAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterExpressaoAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitExpressaoAritmetica(this);
		}
	}

	public final ExpressaoAritmeticaContext expressaoAritmetica() throws RecognitionException {
		ExpressaoAritmeticaContext _localctx = new ExpressaoAritmeticaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expressaoAritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320); multiTipos();
			setState(323);
			_la = _input.LA(1);
			if (_la==OPERADOR_ARITMETICO) {
				{
				setState(321); match(OPERADOR_ARITMETICO);
				setState(322); multiTipos();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetirarContext extends ParserRuleContext {
		public List<TerminalNode> PALAVRA() { return getTokens(DSLFGParser.PALAVRA); }
		public TerminalNode PALAVRA(int i) {
			return getToken(DSLFGParser.PALAVRA, i);
		}
		public RetirarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retirar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterRetirar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitRetirar(this);
		}
	}

	public final RetirarContext retirar() throws RecognitionException {
		RetirarContext _localctx = new RetirarContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_retirar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325); match(PALAVRA);
			setState(326); match(34);
			setState(327); match(PALAVRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UniaoContext extends ParserRuleContext {
		public List<TerminalNode> PALAVRA() { return getTokens(DSLFGParser.PALAVRA); }
		public TerminalNode PALAVRA(int i) {
			return getToken(DSLFGParser.PALAVRA, i);
		}
		public UniaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterUniao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitUniao(this);
		}
	}

	public final UniaoContext uniao() throws RecognitionException {
		UniaoContext _localctx = new UniaoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_uniao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329); match(PALAVRA);
			setState(330); match(23);
			setState(331); match(PALAVRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterseccaoContext extends ParserRuleContext {
		public List<TerminalNode> PALAVRA() { return getTokens(DSLFGParser.PALAVRA); }
		public TerminalNode PALAVRA(int i) {
			return getToken(DSLFGParser.PALAVRA, i);
		}
		public InterseccaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interseccao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterInterseccao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitInterseccao(this);
		}
	}

	public final InterseccaoContext interseccao() throws RecognitionException {
		InterseccaoContext _localctx = new InterseccaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_interseccao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333); match(PALAVRA);
			setState(334); match(33);
			setState(335); match(PALAVRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiferencaContext extends ParserRuleContext {
		public List<TerminalNode> PALAVRA() { return getTokens(DSLFGParser.PALAVRA); }
		public TerminalNode PALAVRA(int i) {
			return getToken(DSLFGParser.PALAVRA, i);
		}
		public DiferencaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diferenca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterDiferenca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitDiferenca(this);
		}
	}

	public final DiferencaContext diferenca() throws RecognitionException {
		DiferencaContext _localctx = new DiferencaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_diferenca);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337); match(PALAVRA);
			setState(338); match(16);
			setState(339); match(PALAVRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChamadaFuncaoContext extends ParserRuleContext {
		public TerminalNode TAB(int i) {
			return getToken(DSLFGParser.TAB, i);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PALAVRA() { return getToken(DSLFGParser.PALAVRA, 0); }
		public List<TerminalNode> TAB() { return getTokens(DSLFGParser.TAB); }
		public ChamadaFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterChamadaFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitChamadaFuncao(this);
		}
	}

	public final ChamadaFuncaoContext chamadaFuncao() throws RecognitionException {
		ChamadaFuncaoContext _localctx = new ChamadaFuncaoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_chamadaFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB) {
				{
				{
				setState(341); match(TAB);
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(347); match(5);
			setState(348); match(PALAVRA);
			setState(349); parametros();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CopiarGrafoContext extends ParserRuleContext {
		public TerminalNode PALAVRA() { return getToken(DSLFGParser.PALAVRA, 0); }
		public CopiarGrafoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copiarGrafo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterCopiarGrafo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitCopiarGrafo(this);
		}
	}

	public final CopiarGrafoContext copiarGrafo() throws RecognitionException {
		CopiarGrafoContext _localctx = new CopiarGrafoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_copiarGrafo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351); match(13);
			setState(352); match(PALAVRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObterTodosOsVerticesContext extends ParserRuleContext {
		public TerminalNode PALAVRA() { return getToken(DSLFGParser.PALAVRA, 0); }
		public ObterTodosOsVerticesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obterTodosOsVertices; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterObterTodosOsVertices(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitObterTodosOsVertices(this);
		}
	}

	public final ObterTodosOsVerticesContext obterTodosOsVertices() throws RecognitionException {
		ObterTodosOsVerticesContext _localctx = new ObterTodosOsVerticesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_obterTodosOsVertices);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354); match(41);
			setState(355); match(PALAVRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObterTodasAsArestasContext extends ParserRuleContext {
		public TerminalNode PALAVRA() { return getToken(DSLFGParser.PALAVRA, 0); }
		public ObterTodasAsArestasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obterTodasAsArestas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterObterTodasAsArestas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitObterTodasAsArestas(this);
		}
	}

	public final ObterTodasAsArestasContext obterTodasAsArestas() throws RecognitionException {
		ObterTodasAsArestasContext _localctx = new ObterTodasAsArestasContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_obterTodasAsArestas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357); match(36);
			setState(358); match(PALAVRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObterIteradorContext extends ParserRuleContext {
		public TerminalNode PALAVRA() { return getToken(DSLFGParser.PALAVRA, 0); }
		public ObterIteradorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obterIterador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterObterIterador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitObterIterador(this);
		}
	}

	public final ObterIteradorContext obterIterador() throws RecognitionException {
		ObterIteradorContext _localctx = new ObterIteradorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_obterIterador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360); match(39);
			setState(361); match(PALAVRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExisteProximoItemContext extends ParserRuleContext {
		public TerminalNode PALAVRA() { return getToken(DSLFGParser.PALAVRA, 0); }
		public ExisteProximoItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existeProximoItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterExisteProximoItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitExisteProximoItem(this);
		}
	}

	public final ExisteProximoItemContext existeProximoItem() throws RecognitionException {
		ExisteProximoItemContext _localctx = new ExisteProximoItemContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_existeProximoItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363); match(25);
			setState(364); match(PALAVRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObterProximoItemContext extends ParserRuleContext {
		public TerminalNode PALAVRA() { return getToken(DSLFGParser.PALAVRA, 0); }
		public ObterProximoItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obterProximoItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterObterProximoItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitObterProximoItem(this);
		}
	}

	public final ObterProximoItemContext obterProximoItem() throws RecognitionException {
		ObterProximoItemContext _localctx = new ObterProximoItemContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_obterProximoItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366); match(31);
			setState(367); match(PALAVRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObterPropriedadeContext extends ParserRuleContext {
		public List<TerminalNode> PALAVRA() { return getTokens(DSLFGParser.PALAVRA); }
		public TerminalNode PALAVRA(int i) {
			return getToken(DSLFGParser.PALAVRA, i);
		}
		public ObterPropriedadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obterPropriedade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterObterPropriedade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitObterPropriedade(this);
		}
	}

	public final ObterPropriedadeContext obterPropriedade() throws RecognitionException {
		ObterPropriedadeContext _localctx = new ObterPropriedadeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_obterPropriedade);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369); match(28);
			setState(370); match(PALAVRA);
			setState(371); match(42);
			setState(372); match(PALAVRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObterPesoDaArestaContext extends ParserRuleContext {
		public List<TerminalNode> PALAVRA() { return getTokens(DSLFGParser.PALAVRA); }
		public TerminalNode PALAVRA(int i) {
			return getToken(DSLFGParser.PALAVRA, i);
		}
		public ObterPesoDaArestaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obterPesoDaAresta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterObterPesoDaAresta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitObterPesoDaAresta(this);
		}
	}

	public final ObterPesoDaArestaContext obterPesoDaAresta() throws RecognitionException {
		ObterPesoDaArestaContext _localctx = new ObterPesoDaArestaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_obterPesoDaAresta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374); match(10);
			setState(375); match(42);
			setState(376); match(PALAVRA);
			setState(377); match(21);
			setState(378); match(PALAVRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObterVerticesAdjacentesContext extends ParserRuleContext {
		public TerminalNode PALAVRA() { return getToken(DSLFGParser.PALAVRA, 0); }
		public ObterVerticesAdjacentesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obterVerticesAdjacentes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterObterVerticesAdjacentes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitObterVerticesAdjacentes(this);
		}
	}

	public final ObterVerticesAdjacentesContext obterVerticesAdjacentes() throws RecognitionException {
		ObterVerticesAdjacentesContext _localctx = new ObterVerticesAdjacentesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_obterVerticesAdjacentes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380); match(35);
			setState(381); match(PALAVRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObterUmElementoContext extends ParserRuleContext {
		public TerminalNode PALAVRA() { return getToken(DSLFGParser.PALAVRA, 0); }
		public ObterUmElementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obterUmElemento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterObterUmElemento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitObterUmElemento(this);
		}
	}

	public final ObterUmElementoContext obterUmElemento() throws RecognitionException {
		ObterUmElementoContext _localctx = new ObterUmElementoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_obterUmElemento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383); match(40);
			setState(384); match(PALAVRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObterUmVerticeContext extends ParserRuleContext {
		public TerminalNode PALAVRA() { return getToken(DSLFGParser.PALAVRA, 0); }
		public ObterUmVerticeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obterUmVertice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterObterUmVertice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitObterUmVertice(this);
		}
	}

	public final ObterUmVerticeContext obterUmVertice() throws RecognitionException {
		ObterUmVerticeContext _localctx = new ObterUmVerticeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_obterUmVertice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386); match(12);
			setState(387); match(PALAVRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObterVerticeContext extends ParserRuleContext {
		public List<TerminalNode> PALAVRA() { return getTokens(DSLFGParser.PALAVRA); }
		public TerminalNode PALAVRA(int i) {
			return getToken(DSLFGParser.PALAVRA, i);
		}
		public ObterVerticeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obterVertice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterObterVertice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitObterVertice(this);
		}
	}

	public final ObterVerticeContext obterVertice() throws RecognitionException {
		ObterVerticeContext _localctx = new ObterVerticeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_obterVertice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389); match(11);
			setState(390); match(PALAVRA);
			setState(391); match(42);
			setState(392); match(PALAVRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiTiposContext extends ParserRuleContext {
		public TerminalNode TIPOS_BOOLEANOS() { return getToken(DSLFGParser.TIPOS_BOOLEANOS, 0); }
		public TerminalNode PALAVRA() { return getToken(DSLFGParser.PALAVRA, 0); }
		public TerminalNode NUMERO() { return getToken(DSLFGParser.NUMERO, 0); }
		public TerminalNode STRING() { return getToken(DSLFGParser.STRING, 0); }
		public TerminalNode CONSTANTES() { return getToken(DSLFGParser.CONSTANTES, 0); }
		public MultiTiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiTipos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterMultiTipos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitMultiTipos(this);
		}
	}

	public final MultiTiposContext multiTipos() throws RecognitionException {
		MultiTiposContext _localctx = new MultiTiposContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_multiTipos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPOS_BOOLEANOS) | (1L << CONSTANTES) | (1L << NUMERO) | (1L << STRING) | (1L << PALAVRA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DespejarContext extends ParserRuleContext {
		public TerminalNode TAB(int i) {
			return getToken(DSLFGParser.TAB, i);
		}
		public TerminalNode PALAVRA() { return getToken(DSLFGParser.PALAVRA, 0); }
		public List<TerminalNode> TAB() { return getTokens(DSLFGParser.TAB); }
		public DespejarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_despejar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterDespejar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitDespejar(this);
		}
	}

	public final DespejarContext despejar() throws RecognitionException {
		DespejarContext _localctx = new DespejarContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_despejar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB) {
				{
				{
				setState(396); match(TAB);
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402); match(29);
			setState(403); match(PALAVRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncaoContext extends ParserRuleContext {
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PALAVRA() { return getToken(DSLFGParser.PALAVRA, 0); }
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405); match(30);
			setState(406); match(PALAVRA);
			setState(407); parametros();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosContext extends ParserRuleContext {
		public List<TerminalNode> PALAVRA() { return getTokens(DSLFGParser.PALAVRA); }
		public TerminalNode PALAVRA(int i) {
			return getToken(DSLFGParser.PALAVRA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parametros);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(409); match(PALAVRA);
					setState(411);
					_la = _input.LA(1);
					if (_la==3) {
						{
						setState(410); match(3);
						}
					}

					}
					} 
				}
				setState(417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode TAB(int i) {
			return getToken(DSLFGParser.TAB, i);
		}
		public TerminalNode PALAVRA() { return getToken(DSLFGParser.PALAVRA, 0); }
		public List<TerminalNode> TAB() { return getTokens(DSLFGParser.TAB); }
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_retorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(418); match(TAB);
				}
				}
				setState(421); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(423); match(18);
			setState(424); match(PALAVRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncaoPercorerGrafoContext extends ParserRuleContext {
		public TerminalNode TAB(int i) {
			return getToken(DSLFGParser.TAB, i);
		}
		public List<TerminalNode> PALAVRA() { return getTokens(DSLFGParser.PALAVRA); }
		public TerminalNode PALAVRA(int i) {
			return getToken(DSLFGParser.PALAVRA, i);
		}
		public List<TerminalNode> TAB() { return getTokens(DSLFGParser.TAB); }
		public FuncaoPercorerGrafoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcaoPercorerGrafo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterFuncaoPercorerGrafo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitFuncaoPercorerGrafo(this);
		}
	}

	public final FuncaoPercorerGrafoContext funcaoPercorerGrafo() throws RecognitionException {
		FuncaoPercorerGrafoContext _localctx = new FuncaoPercorerGrafoContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_funcaoPercorerGrafo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB) {
				{
				{
				setState(426); match(TAB);
				}
				}
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(432); match(9);
			setState(433); match(PALAVRA);
			setState(434); match(2);
			setState(435); match(PALAVRA);
			setState(436); match(7);
			setState(437); match(PALAVRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecutarAcaoDePercorrerGrafoContext extends ParserRuleContext {
		public TerminalNode TAB(int i) {
			return getToken(DSLFGParser.TAB, i);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PALAVRA() { return getToken(DSLFGParser.PALAVRA, 0); }
		public List<TerminalNode> TAB() { return getTokens(DSLFGParser.TAB); }
		public ExecutarAcaoDePercorrerGrafoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executarAcaoDePercorrerGrafo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).enterExecutarAcaoDePercorrerGrafo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLFGListener ) ((DSLFGListener)listener).exitExecutarAcaoDePercorrerGrafo(this);
		}
	}

	public final ExecutarAcaoDePercorrerGrafoContext executarAcaoDePercorrerGrafo() throws RecognitionException {
		ExecutarAcaoDePercorrerGrafoContext _localctx = new ExecutarAcaoDePercorrerGrafoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_executarAcaoDePercorrerGrafo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB) {
				{
				{
				setState(439); match(TAB);
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(445); match(5);
			setState(446); match(PALAVRA);
			setState(447); match(43);
			setState(448); parametros();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3:\u01c5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\7\2^\n\2\f\2\16\2a\13\2\3\2\7\2d\n\2\f\2\16\2g\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"y\n\3\3\4\7\4|\n\4\f\4\16\4\177\13\4\3\4\3\4\3\4\5\4\u0084\n\4\3\4\3\4"+
		"\3\5\7\5\u0089\n\5\f\5\16\5\u008c\13\5\3\5\3\5\3\5\5\5\u0091\n\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\7\t\u00a1\n\t\f\t\16"+
		"\t\u00a4\13\t\3\t\3\t\3\t\3\t\7\t\u00aa\n\t\f\t\16\t\u00ad\13\t\3\n\7"+
		"\n\u00b0\n\n\f\n\16\n\u00b3\13\n\3\n\3\n\3\n\3\n\7\n\u00b9\n\n\f\n\16"+
		"\n\u00bc\13\n\3\13\6\13\u00bf\n\13\r\13\16\13\u00c0\3\13\3\13\3\13\3\13"+
		"\5\13\u00c7\n\13\3\13\3\13\3\f\3\f\3\f\7\f\u00ce\n\f\f\f\16\f\u00d1\13"+
		"\f\3\f\6\f\u00d4\n\f\r\f\16\f\u00d5\5\f\u00d8\n\f\3\r\6\r\u00db\n\r\r"+
		"\r\16\r\u00dc\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\7\17\u00e9\n"+
		"\17\f\17\16\17\u00ec\13\17\3\17\3\17\3\17\3\17\3\20\7\20\u00f3\n\20\f"+
		"\20\16\20\u00f6\13\20\3\20\3\20\3\20\3\20\3\20\3\21\7\21\u00fe\n\21\f"+
		"\21\16\21\u0101\13\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\7\22\u010b"+
		"\n\22\f\22\16\22\u010e\13\22\3\22\5\22\u0111\n\22\3\22\3\22\3\23\7\23"+
		"\u0116\n\23\f\23\16\23\u0119\13\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\7\24\u0122\n\24\f\24\16\24\u0125\13\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0141\n\25\3\26\3\26\3\26\5\26\u0146"+
		"\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\33\7\33\u0159\n\33\f\33\16\33\u015c\13\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3%\3"+
		"%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\7)\u0190\n)\f)\16)\u0193\13"+
		")\3)\3)\3)\3*\3*\3*\3*\3+\3+\5+\u019e\n+\7+\u01a0\n+\f+\16+\u01a3\13+"+
		"\3,\6,\u01a6\n,\r,\16,\u01a7\3,\3,\3,\3-\7-\u01ae\n-\f-\16-\u01b1\13-"+
		"\3-\3-\3-\3-\3-\3-\3-\3.\7.\u01bb\n.\f.\16.\u01be\13.\3.\3.\3.\3.\3.\3"+
		".\2/\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@"+
		"BDFHJLNPRTVXZ\2\3\5\2./\63\64\66\66\u01d6\2_\3\2\2\2\4x\3\2\2\2\6}\3\2"+
		"\2\2\b\u008a\3\2\2\2\n\u0094\3\2\2\2\f\u0098\3\2\2\2\16\u009c\3\2\2\2"+
		"\20\u00a2\3\2\2\2\22\u00b1\3\2\2\2\24\u00be\3\2\2\2\26\u00ca\3\2\2\2\30"+
		"\u00da\3\2\2\2\32\u00e4\3\2\2\2\34\u00ea\3\2\2\2\36\u00f4\3\2\2\2 \u00ff"+
		"\3\2\2\2\"\u0107\3\2\2\2$\u0117\3\2\2\2&\u0123\3\2\2\2(\u0140\3\2\2\2"+
		"*\u0142\3\2\2\2,\u0147\3\2\2\2.\u014b\3\2\2\2\60\u014f\3\2\2\2\62\u0153"+
		"\3\2\2\2\64\u015a\3\2\2\2\66\u0161\3\2\2\28\u0164\3\2\2\2:\u0167\3\2\2"+
		"\2<\u016a\3\2\2\2>\u016d\3\2\2\2@\u0170\3\2\2\2B\u0173\3\2\2\2D\u0178"+
		"\3\2\2\2F\u017e\3\2\2\2H\u0181\3\2\2\2J\u0184\3\2\2\2L\u0187\3\2\2\2N"+
		"\u018c\3\2\2\2P\u0191\3\2\2\2R\u0197\3\2\2\2T\u01a1\3\2\2\2V\u01a5\3\2"+
		"\2\2X\u01af\3\2\2\2Z\u01bc\3\2\2\2\\^\5\16\b\2]\\\3\2\2\2^a\3\2\2\2_]"+
		"\3\2\2\2_`\3\2\2\2`e\3\2\2\2a_\3\2\2\2bd\5\4\3\2cb\3\2\2\2dg\3\2\2\2e"+
		"c\3\2\2\2ef\3\2\2\2f\3\3\2\2\2ge\3\2\2\2hy\78\2\2iy\5\20\t\2jy\5\22\n"+
		"\2ky\5\34\17\2ly\5\36\20\2my\5 \21\2ny\5$\23\2oy\5&\24\2py\5\6\4\2qy\5"+
		"\b\5\2ry\5P)\2sy\5R*\2ty\5\64\33\2uy\5V,\2vy\5X-\2wy\5Z.\2xh\3\2\2\2x"+
		"i\3\2\2\2xj\3\2\2\2xk\3\2\2\2xl\3\2\2\2xm\3\2\2\2xn\3\2\2\2xo\3\2\2\2"+
		"xp\3\2\2\2xq\3\2\2\2xr\3\2\2\2xs\3\2\2\2xt\3\2\2\2xu\3\2\2\2xv\3\2\2\2"+
		"xw\3\2\2\2y\5\3\2\2\2z|\7\67\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3"+
		"\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0083\7\20\2\2\u0081\u0084\5"+
		"\n\6\2\u0082\u0084\5\f\7\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\78\2\2\u0086\7\3\2\2\2\u0087\u0089\7\67\2\2"+
		"\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0090\7\30\2\2"+
		"\u008e\u0091\5\n\6\2\u008f\u0091\5\f\7\2\u0090\u008e\3\2\2\2\u0090\u008f"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\78\2\2\u0093\t\3\2\2\2\u0094"+
		"\u0095\7\66\2\2\u0095\u0096\7\61\2\2\u0096\u0097\7\66\2\2\u0097\13\3\2"+
		"\2\2\u0098\u0099\5N(\2\u0099\u009a\7\62\2\2\u009a\u009b\5N(\2\u009b\r"+
		"\3\2\2\2\u009c\u009d\7\3\2\2\u009d\u009e\7\64\2\2\u009e\17\3\2\2\2\u009f"+
		"\u00a1\7\67\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3"+
		"\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a6\7\6\2\2\u00a6\u00a7\7\66\2\2\u00a7\u00ab\78\2\2\u00a8\u00aa\5\24"+
		"\13\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\21\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b0\7\67\2"+
		"\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\"\2\2\u00b5"+
		"\u00b6\7\66\2\2\u00b6\u00ba\78\2\2\u00b7\u00b9\5\24\13\2\u00b8\u00b7\3"+
		"\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\23\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00bf\7\67\2\2\u00be\u00bd\3\2\2"+
		"\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2\u00c3\5\26\f\2\u00c3\u00c4\7\'\2\2\u00c4\u00c6\5\26\f\2"+
		"\u00c5\u00c7\5\32\16\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8\u00c9\78\2\2\u00c9\25\3\2\2\2\u00ca\u00d7\7\66\2\2\u00cb"+
		"\u00cf\78\2\2\u00cc\u00ce\5\30\r\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d4\7\67\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3"+
		"\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7"+
		"\u00cb\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\27\3\2\2\2\u00d9\u00db\7\67\2"+
		"\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7\26\2\2\u00df\u00e0\7\66\2\2"+
		"\u00e0\u00e1\7\35\2\2\u00e1\u00e2\5N(\2\u00e2\u00e3\78\2\2\u00e3\31\3"+
		"\2\2\2\u00e4\u00e5\7\n\2\2\u00e5\u00e6\7\63\2\2\u00e6\33\3\2\2\2\u00e7"+
		"\u00e9\7\67\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3"+
		"\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed"+
		"\u00ee\7\23\2\2\u00ee\u00ef\5N(\2\u00ef\u00f0\78\2\2\u00f0\35\3\2\2\2"+
		"\u00f1\u00f3\7\67\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2"+
		"\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7"+
		"\u00f8\7\66\2\2\u00f8\u00f9\7\35\2\2\u00f9\u00fa\5\"\22\2\u00fa\u00fb"+
		"\78\2\2\u00fb\37\3\2\2\2\u00fc\u00fe\7\67\2\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2"+
		"\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7\66\2\2\u0103\u0104\7\35\2\2\u0104"+
		"\u0105\5(\25\2\u0105\u0106\78\2\2\u0106!\3\2\2\2\u0107\u0110\7\21\2\2"+
		"\u0108\u0109\7\63\2\2\u0109\u010b\7\5\2\2\u010a\u0108\3\2\2\2\u010b\u010e"+
		"\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010f\u0111\7\63\2\2\u0110\u010c\3\2\2\2\u0110\u0111\3"+
		"\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7\25\2\2\u0113#\3\2\2\2\u0114\u0116"+
		"\7\67\2\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2"+
		"\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b"+
		"\7\34\2\2\u011b\u011c\5N(\2\u011c\u011d\7\b\2\2\u011d\u011e\7\66\2\2\u011e"+
		"\u011f\78\2\2\u011f%\3\2\2\2\u0120\u0122\7\67\2\2\u0121\u0120\3\2\2\2"+
		"\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126"+
		"\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\7(\2\2\u0127\u0128\7\66\2\2\u0128"+
		"\u0129\7\b\2\2\u0129\u012a\7\66\2\2\u012a\u012b\7\32\2\2\u012b\u012c\5"+
		"N(\2\u012c\u012d\78\2\2\u012d\'\3\2\2\2\u012e\u0141\5F$\2\u012f\u0141"+
		"\5H%\2\u0130\u0141\5J&\2\u0131\u0141\5,\27\2\u0132\u0141\5.\30\2\u0133"+
		"\u0141\5\60\31\2\u0134\u0141\5\62\32\2\u0135\u0141\5\64\33\2\u0136\u0141"+
		"\5L\'\2\u0137\u0141\5D#\2\u0138\u0141\5B\"\2\u0139\u0141\5<\37\2\u013a"+
		"\u0141\5> \2\u013b\u0141\5@!\2\u013c\u0141\58\35\2\u013d\u0141\5:\36\2"+
		"\u013e\u0141\5\66\34\2\u013f\u0141\5*\26\2\u0140\u012e\3\2\2\2\u0140\u012f"+
		"\3\2\2\2\u0140\u0130\3\2\2\2\u0140\u0131\3\2\2\2\u0140\u0132\3\2\2\2\u0140"+
		"\u0133\3\2\2\2\u0140\u0134\3\2\2\2\u0140\u0135\3\2\2\2\u0140\u0136\3\2"+
		"\2\2\u0140\u0137\3\2\2\2\u0140\u0138\3\2\2\2\u0140\u0139\3\2\2\2\u0140"+
		"\u013a\3\2\2\2\u0140\u013b\3\2\2\2\u0140\u013c\3\2\2\2\u0140\u013d\3\2"+
		"\2\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141)\3\2\2\2\u0142\u0145"+
		"\5N(\2\u0143\u0144\7\60\2\2\u0144\u0146\5N(\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146+\3\2\2\2\u0147\u0148\7\66\2\2\u0148\u0149\7$\2\2"+
		"\u0149\u014a\7\66\2\2\u014a-\3\2\2\2\u014b\u014c\7\66\2\2\u014c\u014d"+
		"\7\31\2\2\u014d\u014e\7\66\2\2\u014e/\3\2\2\2\u014f\u0150\7\66\2\2\u0150"+
		"\u0151\7#\2\2\u0151\u0152\7\66\2\2\u0152\61\3\2\2\2\u0153\u0154\7\66\2"+
		"\2\u0154\u0155\7\22\2\2\u0155\u0156\7\66\2\2\u0156\63\3\2\2\2\u0157\u0159"+
		"\7\67\2\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2"+
		"\u015a\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e"+
		"\7\7\2\2\u015e\u015f\7\66\2\2\u015f\u0160\5T+\2\u0160\65\3\2\2\2\u0161"+
		"\u0162\7\17\2\2\u0162\u0163\7\66\2\2\u0163\67\3\2\2\2\u0164\u0165\7+\2"+
		"\2\u0165\u0166\7\66\2\2\u01669\3\2\2\2\u0167\u0168\7&\2\2\u0168\u0169"+
		"\7\66\2\2\u0169;\3\2\2\2\u016a\u016b\7)\2\2\u016b\u016c\7\66\2\2\u016c"+
		"=\3\2\2\2\u016d\u016e\7\33\2\2\u016e\u016f\7\66\2\2\u016f?\3\2\2\2\u0170"+
		"\u0171\7!\2\2\u0171\u0172\7\66\2\2\u0172A\3\2\2\2\u0173\u0174\7\36\2\2"+
		"\u0174\u0175\7\66\2\2\u0175\u0176\7,\2\2\u0176\u0177\7\66\2\2\u0177C\3"+
		"\2\2\2\u0178\u0179\7\f\2\2\u0179\u017a\7,\2\2\u017a\u017b\7\66\2\2\u017b"+
		"\u017c\7\27\2\2\u017c\u017d\7\66\2\2\u017dE\3\2\2\2\u017e\u017f\7%\2\2"+
		"\u017f\u0180\7\66\2\2\u0180G\3\2\2\2\u0181\u0182\7*\2\2\u0182\u0183\7"+
		"\66\2\2\u0183I\3\2\2\2\u0184\u0185\7\16\2\2\u0185\u0186\7\66\2\2\u0186"+
		"K\3\2\2\2\u0187\u0188\7\r\2\2\u0188\u0189\7\66\2\2\u0189\u018a\7,\2\2"+
		"\u018a\u018b\7\66\2\2\u018bM\3\2\2\2\u018c\u018d\t\2\2\2\u018dO\3\2\2"+
		"\2\u018e\u0190\7\67\2\2\u018f\u018e\3\2\2\2\u0190\u0193\3\2\2\2\u0191"+
		"\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2\2\2\u0193\u0191\3\2"+
		"\2\2\u0194\u0195\7\37\2\2\u0195\u0196\7\66\2\2\u0196Q\3\2\2\2\u0197\u0198"+
		"\7 \2\2\u0198\u0199\7\66\2\2\u0199\u019a\5T+\2\u019aS\3\2\2\2\u019b\u019d"+
		"\7\66\2\2\u019c\u019e\7\5\2\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2"+
		"\u019e\u01a0\3\2\2\2\u019f\u019b\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f"+
		"\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2U\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4"+
		"\u01a6\7\67\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a5\3"+
		"\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\7\24\2\2\u01aa"+
		"\u01ab\7\66\2\2\u01abW\3\2\2\2\u01ac\u01ae\7\67\2\2\u01ad\u01ac\3\2\2"+
		"\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2"+
		"\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\7\13\2\2\u01b3\u01b4\7\66\2\2"+
		"\u01b4\u01b5\7\4\2\2\u01b5\u01b6\7\66\2\2\u01b6\u01b7\7\t\2\2\u01b7\u01b8"+
		"\7\66\2\2\u01b8Y\3\2\2\2\u01b9\u01bb\7\67\2\2\u01ba\u01b9\3\2\2\2\u01bb"+
		"\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\3\2"+
		"\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c0\7\7\2\2\u01c0\u01c1\7\66\2\2\u01c1"+
		"\u01c2\7-\2\2\u01c2\u01c3\5T+\2\u01c3[\3\2\2\2#_ex}\u0083\u008a\u0090"+
		"\u00a2\u00ab\u00b1\u00ba\u00c0\u00c6\u00cf\u00d5\u00d7\u00dc\u00ea\u00f4"+
		"\u00ff\u010c\u0110\u0117\u0123\u0140\u0145\u015a\u0191\u019d\u01a1\u01a7"+
		"\u01af\u01bc";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}