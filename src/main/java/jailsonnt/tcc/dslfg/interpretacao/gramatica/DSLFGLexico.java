// Generated from DSLFGLexico.g4 by ANTLR 4.1
package jailsonnt.tcc.dslfg.interpretacao.gramatica;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DSLFGLexico extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TIPOS_BOOLEANOS=1, CONSTANTES=2, OPERADOR_ARITMETICO=3, OPERADOR_CONDICIONAL_DE_CONJUNTO=4, 
		OPERADOR_CONDICIONAL=5, NUMERO=6, STRING=7, DIGITO=8, PALAVRA=9, TAB=10, 
		QUEBRA_DE_LINHA=11, COMENTARIO=12, WS=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"TIPOS_BOOLEANOS", "CONSTANTES", "OPERADOR_ARITMETICO", "OPERADOR_CONDICIONAL_DE_CONJUNTO", 
		"OPERADOR_CONDICIONAL", "NUMERO", "STRING", "DIGITO", "PALAVRA", "'\t'", 
		"QUEBRA_DE_LINHA", "COMENTARIO", "WS"
	};
	public static final String[] ruleNames = {
		"TIPOS_BOOLEANOS", "CONSTANTES", "OPERADOR_ARITMETICO", "OPERADOR_CONDICIONAL_DE_CONJUNTO", 
		"OPERADOR_CONDICIONAL", "NUMERO", "STRING", "DIGITO", "PALAVRA", "TAB", 
		"QUEBRA_DE_LINHA", "COMENTARIO", "WS"
	};


	public DSLFGLexico(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DSLFGLexico.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 11: COMENTARIO_action((RuleContext)_localctx, actionIndex); break;

		case 12: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\17\u00ea\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2-\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3G\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0096\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ae"+
		"\n\6\3\7\6\7\u00b1\n\7\r\7\16\7\u00b2\3\7\3\7\6\7\u00b7\n\7\r\7\16\7\u00b8"+
		"\5\7\u00bb\n\7\3\b\3\b\7\b\u00bf\n\b\f\b\16\b\u00c2\13\b\3\b\3\b\3\t\3"+
		"\t\3\n\5\n\u00c9\n\n\3\n\3\n\7\n\u00cd\n\n\f\n\16\n\u00d0\13\n\3\13\3"+
		"\13\3\f\3\f\3\f\5\f\u00d7\n\f\3\r\3\r\3\r\3\r\3\r\7\r\u00de\n\r\f\r\16"+
		"\r\u00e1\13\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\u00df\17\3\3\1\5\4"+
		"\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16"+
		"\2\33\17\3\3\2\n\5\2,-//\61\61\4\2$$\u201e\u201e\4\2\3#%\u3101\4\2$$\u201f"+
		"\u201f\3\2\62;\7\2C\\aac|\u00c2\u00fe\u016a\u016b\4\2\f\f\17\17\4\2\16"+
		"\16\"\"\u00fd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3,\3\2\2\2\5F\3\2\2\2\7O\3\2\2\2"+
		"\t\u0095\3\2\2\2\13\u00ad\3\2\2\2\r\u00b0\3\2\2\2\17\u00bc\3\2\2\2\21"+
		"\u00c5\3\2\2\2\23\u00c8\3\2\2\2\25\u00d1\3\2\2\2\27\u00d6\3\2\2\2\31\u00d8"+
		"\3\2\2\2\33\u00e6\3\2\2\2\35\36\7x\2\2\36\37\7g\2\2\37 \7t\2\2 !\7f\2"+
		"\2!\"\7c\2\2\"#\7f\2\2#$\7g\2\2$%\7k\2\2%&\7t\2\2&-\7q\2\2\'(\7h\2\2("+
		")\7c\2\2)*\7n\2\2*+\7u\2\2+-\7q\2\2,\35\3\2\2\2,\'\3\2\2\2-\4\3\2\2\2"+
		"./\7p\2\2/\60\7w\2\2\60\61\7o\2\2\61\62\7g\2\2\62\63\7t\2\2\63\64\7q\2"+
		"\2\64\65\7O\2\2\65\66\7c\2\2\66\67\7z\2\2\678\7k\2\289\7o\2\29G\7q\2\2"+
		":;\7p\2\2;<\7w\2\2<=\7o\2\2=>\7g\2\2>?\7t\2\2?@\7q\2\2@A\7O\2\2AB\7k\2"+
		"\2BC\7p\2\2CD\7k\2\2DE\7o\2\2EG\7q\2\2F.\3\2\2\2F:\3\2\2\2G\6\3\2\2\2"+
		"HP\t\2\2\2IJ\7f\2\2JK\7k\2\2KP\7x\2\2LM\7o\2\2MN\7q\2\2NP\7f\2\2OH\3\2"+
		"\2\2OI\3\2\2\2OL\3\2\2\2P\b\3\2\2\2QR\7\"\2\2RS\7u\2\2ST\7w\2\2TU\7d\2"+
		"\2UV\7e\2\2VW\7q\2\2WX\7p\2\2XY\7l\2\2YZ\7w\2\2Z[\7p\2\2[\\\7v\2\2\\]"+
		"\7q\2\2]^\7R\2\2^_\7t\2\2_`\7q\2\2`a\7r\2\2ab\7t\2\2bc\7k\2\2cd\7q\2\2"+
		"de\7F\2\2ef\7g\2\2f\u0096\7\"\2\2gh\7\"\2\2hi\7u\2\2ij\7w\2\2jk\7d\2\2"+
		"kl\7e\2\2lm\7q\2\2mn\7p\2\2no\7l\2\2op\7w\2\2pq\7p\2\2qr\7v\2\2rs\7q\2"+
		"\2s\u0096\7\"\2\2tu\7\"\2\2uv\7g\2\2vw\7W\2\2wx\7o\2\2xy\7G\2\2yz\7n\2"+
		"\2z{\7g\2\2{|\7o\2\2|}\7g\2\2}~\7p\2\2~\177\7v\2\2\177\u0080\7q\2\2\u0080"+
		"\u0081\7F\2\2\u0081\u0082\7g\2\2\u0082\u0096\7\"\2\2\u0083\u0084\7\"\2"+
		"\2\u0084\u0085\7p\2\2\u0085\u0086\7c\2\2\u0086\u0087\7q\2\2\u0087\u0088"+
		"\7G\2\2\u0088\u0089\7W\2\2\u0089\u008a\7o\2\2\u008a\u008b\7G\2\2\u008b"+
		"\u008c\7n\2\2\u008c\u008d\7g\2\2\u008d\u008e\7o\2\2\u008e\u008f\7g\2\2"+
		"\u008f\u0090\7p\2\2\u0090\u0091\7v\2\2\u0091\u0092\7q\2\2\u0092\u0093"+
		"\7F\2\2\u0093\u0094\7g\2\2\u0094\u0096\7\"\2\2\u0095Q\3\2\2\2\u0095g\3"+
		"\2\2\2\u0095t\3\2\2\2\u0095\u0083\3\2\2\2\u0096\n\3\2\2\2\u0097\u0098"+
		"\7\"\2\2\u0098\u0099\7?\2\2\u0099\u009a\7?\2\2\u009a\u00ae\7\"\2\2\u009b"+
		"\u009c\7\"\2\2\u009c\u009d\7>\2\2\u009d\u009e\7?\2\2\u009e\u00ae\7\"\2"+
		"\2\u009f\u00a0\7\"\2\2\u00a0\u00a1\7@\2\2\u00a1\u00a2\7?\2\2\u00a2\u00ae"+
		"\7\"\2\2\u00a3\u00a4\7\"\2\2\u00a4\u00a5\7>\2\2\u00a5\u00ae\7\"\2\2\u00a6"+
		"\u00a7\7\"\2\2\u00a7\u00a8\7@\2\2\u00a8\u00ae\7\"\2\2\u00a9\u00aa\7\""+
		"\2\2\u00aa\u00ab\7#\2\2\u00ab\u00ac\7?\2\2\u00ac\u00ae\7\"\2\2\u00ad\u0097"+
		"\3\2\2\2\u00ad\u009b\3\2\2\2\u00ad\u009f\3\2\2\2\u00ad\u00a3\3\2\2\2\u00ad"+
		"\u00a6\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ae\f\3\2\2\2\u00af\u00b1\5\21\t"+
		"\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00ba\3\2\2\2\u00b4\u00b6\7\60\2\2\u00b5\u00b7\5\21\t\2"+
		"\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b4\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\16\3\2\2\2\u00bc\u00c0\t\3\2\2\u00bd\u00bf\t\4\2\2\u00be\u00bd\3\2\2"+
		"\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\t\5\2\2\u00c4\20\3\2\2\2\u00c5"+
		"\u00c6\t\6\2\2\u00c6\22\3\2\2\2\u00c7\u00c9\t\7\2\2\u00c8\u00c7\3\2\2"+
		"\2\u00c9\u00ce\3\2\2\2\u00ca\u00cd\t\7\2\2\u00cb\u00cd\5\21\t\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\24\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2"+
		"\7\13\2\2\u00d2\26\3\2\2\2\u00d3\u00d7\t\b\2\2\u00d4\u00d5\7\17\2\2\u00d5"+
		"\u00d7\7\f\2\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\30\3\2\2"+
		"\2\u00d8\u00d9\7\61\2\2\u00d9\u00da\7\61\2\2\u00da\u00db\7,\2\2\u00db"+
		"\u00df\3\2\2\2\u00dc\u00de\13\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3"+
		"\2\2\2\u00df\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00e3\5\27\f\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\b"+
		"\r\2\2\u00e5\32\3\2\2\2\u00e6\u00e7\t\t\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e9\b\16\3\2\u00e9\34\3\2\2\2\22\2,FO\u0095\u00ad\u00b2\u00b8\u00ba"+
		"\u00be\u00c0\u00c8\u00cc\u00ce\u00d6\u00df";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}