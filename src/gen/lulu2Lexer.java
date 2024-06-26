package gen;
// Generated from C:/Users/mrafe/Desktop/test\lulu2.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lulu2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, MULTI_LINE_COMMENT=2, ARITHMETIC1=3, RELATIONAL=4, BOOL_CONST=5, 
		BITWISE=6, LOGICAL=7, TERM=8, TERM1=9, PROTECTED=10, FUNCTION=11, CONTINUE=12, 
		DESTRUCT=13, ALLOCATE=14, DECLARE=15, PRIVATE=16, DEFAULT=17, MCOMMENT=18, 
		PUBLIC=19, RETURN=20, SWITCH=21, STRING=22, BREAK=23, CONST=24, O_CUR=25, 
		C_CUR=26, O_PAR=27, C_PAR=28, EQUAL=29, SEM_C=30, O_BRA=31, C_BRA=32, 
		COMMA=33, COLON=34, SUPER=35, WRITE=36, WHILE=37, FLOAT=38, TYPE=39, THIS=40, 
		ELSE=41, CASE=42, READ=43, BOOL=44, NIL=45, DOT=46, FOR=47, INT=48, IF=49, 
		INT_CONST=50, REAL_CONST=51, ID=52, STRING_CONST=53, WS=54;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "MULTI_LINE_COMMENT", "ARITHMETIC1", "RELATIONAL", "BOOL_CONST", 
			"BITWISE", "LOGICAL", "TERM", "TERM1", "PROTECTED", "FUNCTION", "CONTINUE", 
			"DESTRUCT", "ALLOCATE", "DECLARE", "PRIVATE", "DEFAULT", "MCOMMENT", 
			"PUBLIC", "RETURN", "SWITCH", "STRING", "BREAK", "CONST", "O_CUR", "C_CUR", 
			"O_PAR", "C_PAR", "EQUAL", "SEM_C", "O_BRA", "C_BRA", "COMMA", "COLON", 
			"SUPER", "WRITE", "WHILE", "FLOAT", "TYPE", "THIS", "ELSE", "CASE", "READ", 
			"BOOL", "NIL", "DOT", "FOR", "INT", "IF", "INT_CONST", "REAL_CONST", 
			"ID", "STRING_CONST", "ESC", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "'protected'", 
			"'function'", "'continue'", "'destruct'", "'allocate'", "'declare'", 
			"'private'", "'default'", null, "'public'", "'return'", "'switch'", "'string'", 
			"'break'", "'const'", "'{'", "'}'", "'('", "')'", "'='", "';'", "'['", 
			"']'", "','", "':'", "'super'", "'write'", "'while'", "'float'", "'type'", 
			"'this'", "'else'", "'case'", "'read'", "'bool'", "'nil'", "'.'", "'for'", 
			"'int'", "'if'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "MULTI_LINE_COMMENT", "ARITHMETIC1", "RELATIONAL", "BOOL_CONST", 
			"BITWISE", "LOGICAL", "TERM", "TERM1", "PROTECTED", "FUNCTION", "CONTINUE", 
			"DESTRUCT", "ALLOCATE", "DECLARE", "PRIVATE", "DEFAULT", "MCOMMENT", 
			"PUBLIC", "RETURN", "SWITCH", "STRING", "BREAK", "CONST", "O_CUR", "C_CUR", 
			"O_PAR", "C_PAR", "EQUAL", "SEM_C", "O_BRA", "C_BRA", "COMMA", "COLON", 
			"SUPER", "WRITE", "WHILE", "FLOAT", "TYPE", "THIS", "ELSE", "CASE", "READ", 
			"BOOL", "NIL", "DOT", "FOR", "INT", "IF", "INT_CONST", "REAL_CONST", 
			"ID", "STRING_CONST", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public lulu2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lulu2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u01d6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\7\2v\n\2\f\2\16"+
		"\2y\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u0081\n\3\f\3\16\3\u0084\13\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0096"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a1\n\6\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\5\b\u00a9\n\b\3\t\5\t\u00ac\n\t\3\t\5\t\u00af\n\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\7"+
		"\23\u00fd\n\23\f\23\16\23\u0100\13\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\""+
		"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+"+
		"\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3\60\3\60\3"+
		"\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\6\63\u018f"+
		"\n\63\r\63\16\63\u0190\3\63\6\63\u0194\n\63\r\63\16\63\u0195\5\63\u0198"+
		"\n\63\3\64\6\64\u019b\n\64\r\64\16\64\u019c\3\64\3\64\7\64\u01a1\n\64"+
		"\f\64\16\64\u01a4\13\64\3\64\3\64\6\64\u01a8\n\64\r\64\16\64\u01a9\5\64"+
		"\u01ac\n\64\3\64\3\64\3\64\6\64\u01b1\n\64\r\64\16\64\u01b2\5\64\u01b5"+
		"\n\64\3\65\3\65\7\65\u01b9\n\65\f\65\16\65\u01bc\13\65\3\66\3\66\3\66"+
		"\7\66\u01c1\n\66\f\66\16\66\u01c4\13\66\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\5\67\u01ce\n\67\38\68\u01d1\n8\r8\168\u01d2\38\38\5\u0082\u00fe"+
		"\u01c2\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m\2o8\3\2\21\3\2\f\f\5\2\'\',,\61\61\4\2>>@@\5\2((``~~\5\2##-"+
		"-\u0080\u0080\4\2ZZzz\5\2\62;CHch\3\2\62;\4\2GGgg\4\2--//\6\2%%C\\aac"+
		"|\7\2%%\62;C\\aac|\4\2))^^\t\2))\62\62^^ddppttvv\5\2\13\f\16\17\"\"\2"+
		"\u01ed\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"o\3\2\2\2\3q\3\2\2\2\5|\3\2\2\2\7\u008a\3\2\2\2\t\u0095\3\2\2\2\13\u00a0"+
		"\3\2\2\2\r\u00a2\3\2\2\2\17\u00a8\3\2\2\2\21\u00ab\3\2\2\2\23\u00b0\3"+
		"\2\2\2\25\u00b2\3\2\2\2\27\u00bc\3\2\2\2\31\u00c5\3\2\2\2\33\u00ce\3\2"+
		"\2\2\35\u00d7\3\2\2\2\37\u00e0\3\2\2\2!\u00e8\3\2\2\2#\u00f0\3\2\2\2%"+
		"\u00f8\3\2\2\2\'\u0108\3\2\2\2)\u010f\3\2\2\2+\u0116\3\2\2\2-\u011d\3"+
		"\2\2\2/\u0124\3\2\2\2\61\u012a\3\2\2\2\63\u0130\3\2\2\2\65\u0132\3\2\2"+
		"\2\67\u0134\3\2\2\29\u0136\3\2\2\2;\u0138\3\2\2\2=\u013a\3\2\2\2?\u013c"+
		"\3\2\2\2A\u013e\3\2\2\2C\u0140\3\2\2\2E\u0142\3\2\2\2G\u0144\3\2\2\2I"+
		"\u014a\3\2\2\2K\u0150\3\2\2\2M\u0156\3\2\2\2O\u015c\3\2\2\2Q\u0161\3\2"+
		"\2\2S\u0166\3\2\2\2U\u016b\3\2\2\2W\u0170\3\2\2\2Y\u0175\3\2\2\2[\u017a"+
		"\3\2\2\2]\u017e\3\2\2\2_\u0180\3\2\2\2a\u0184\3\2\2\2c\u0188\3\2\2\2e"+
		"\u0197\3\2\2\2g\u01ab\3\2\2\2i\u01b6\3\2\2\2k\u01bd\3\2\2\2m\u01cd\3\2"+
		"\2\2o\u01d0\3\2\2\2qr\7\'\2\2rs\7\'\2\2sw\3\2\2\2tv\n\2\2\2ut\3\2\2\2"+
		"vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\b\2\2\2{\4\3\2\2"+
		"\2|}\7\'\2\2}~\7\u0080\2\2~\u0082\3\2\2\2\177\u0081\13\2\2\2\u0080\177"+
		"\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7\u0080\2\2\u0086\u0087"+
		"\7\'\2\2\u0087\u0088\3\2\2\2\u0088\u0089\b\3\2\2\u0089\6\3\2\2\2\u008a"+
		"\u008b\t\3\2\2\u008b\b\3\2\2\2\u008c\u008d\7>\2\2\u008d\u0096\7?\2\2\u008e"+
		"\u008f\7@\2\2\u008f\u0096\7?\2\2\u0090\u0096\t\4\2\2\u0091\u0092\7?\2"+
		"\2\u0092\u0096\7?\2\2\u0093\u0094\7#\2\2\u0094\u0096\7?\2\2\u0095\u008c"+
		"\3\2\2\2\u0095\u008e\3\2\2\2\u0095\u0090\3\2\2\2\u0095\u0091\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\n\3\2\2\2\u0097\u0098\7v\2\2\u0098\u0099\7t\2\2\u0099"+
		"\u009a\7w\2\2\u009a\u00a1\7g\2\2\u009b\u009c\7h\2\2\u009c\u009d\7c\2\2"+
		"\u009d\u009e\7n\2\2\u009e\u009f\7u\2\2\u009f\u00a1\7g\2\2\u00a0\u0097"+
		"\3\2\2\2\u00a0\u009b\3\2\2\2\u00a1\f\3\2\2\2\u00a2\u00a3\t\5\2\2\u00a3"+
		"\16\3\2\2\2\u00a4\u00a5\7(\2\2\u00a5\u00a9\7(\2\2\u00a6\u00a7\7~\2\2\u00a7"+
		"\u00a9\7~\2\2\u00a8\u00a4\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\20\3\2\2\2"+
		"\u00aa\u00ac\7/\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae"+
		"\3\2\2\2\u00ad\u00af\5\23\n\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2"+
		"\u00af\22\3\2\2\2\u00b0\u00b1\t\6\2\2\u00b1\24\3\2\2\2\u00b2\u00b3\7r"+
		"\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7"+
		"\7g\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7g\2\2\u00ba"+
		"\u00bb\7f\2\2\u00bb\26\3\2\2\2\u00bc\u00bd\7h\2\2\u00bd\u00be\7w\2\2\u00be"+
		"\u00bf\7p\2\2\u00bf\u00c0\7e\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7k\2\2"+
		"\u00c2\u00c3\7q\2\2\u00c3\u00c4\7p\2\2\u00c4\30\3\2\2\2\u00c5\u00c6\7"+
		"e\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca"+
		"\7k\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7w\2\2\u00cc\u00cd\7g\2\2\u00cd"+
		"\32\3\2\2\2\u00ce\u00cf\7f\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7u\2\2\u00d1"+
		"\u00d2\7v\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7w\2\2\u00d4\u00d5\7e\2\2"+
		"\u00d5\u00d6\7v\2\2\u00d6\34\3\2\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7"+
		"n\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7e\2\2\u00dc\u00dd"+
		"\7c\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7g\2\2\u00df\36\3\2\2\2\u00e0\u00e1"+
		"\7f\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7e\2\2\u00e3\u00e4\7n\2\2\u00e4"+
		"\u00e5\7c\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7g\2\2\u00e7 \3\2\2\2\u00e8"+
		"\u00e9\7r\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7x\2\2"+
		"\u00ec\u00ed\7c\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7g\2\2\u00ef\"\3\2"+
		"\2\2\u00f0\u00f1\7f\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7h\2\2\u00f3\u00f4"+
		"\7c\2\2\u00f4\u00f5\7w\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7v\2\2\u00f7"+
		"$\3\2\2\2\u00f8\u00f9\7\'\2\2\u00f9\u00fa\7\u0080\2\2\u00fa\u00fe\3\2"+
		"\2\2\u00fb\u00fd\13\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0101\u0102\7\u0080\2\2\u0102\u0103\7\'\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0105\7\f\2\2\u0105\u0106\3\2\2\2\u0106\u0107\b\23\2\2\u0107&\3\2\2\2"+
		"\u0108\u0109\7r\2\2\u0109\u010a\7w\2\2\u010a\u010b\7d\2\2\u010b\u010c"+
		"\7n\2\2\u010c\u010d\7k\2\2\u010d\u010e\7e\2\2\u010e(\3\2\2\2\u010f\u0110"+
		"\7t\2\2\u0110\u0111\7g\2\2\u0111\u0112\7v\2\2\u0112\u0113\7w\2\2\u0113"+
		"\u0114\7t\2\2\u0114\u0115\7p\2\2\u0115*\3\2\2\2\u0116\u0117\7u\2\2\u0117"+
		"\u0118\7y\2\2\u0118\u0119\7k\2\2\u0119\u011a\7v\2\2\u011a\u011b\7e\2\2"+
		"\u011b\u011c\7j\2\2\u011c,\3\2\2\2\u011d\u011e\7u\2\2\u011e\u011f\7v\2"+
		"\2\u011f\u0120\7t\2\2\u0120\u0121\7k\2\2\u0121\u0122\7p\2\2\u0122\u0123"+
		"\7i\2\2\u0123.\3\2\2\2\u0124\u0125\7d\2\2\u0125\u0126\7t\2\2\u0126\u0127"+
		"\7g\2\2\u0127\u0128\7c\2\2\u0128\u0129\7m\2\2\u0129\60\3\2\2\2\u012a\u012b"+
		"\7e\2\2\u012b\u012c\7q\2\2\u012c\u012d\7p\2\2\u012d\u012e\7u\2\2\u012e"+
		"\u012f\7v\2\2\u012f\62\3\2\2\2\u0130\u0131\7}\2\2\u0131\64\3\2\2\2\u0132"+
		"\u0133\7\177\2\2\u0133\66\3\2\2\2\u0134\u0135\7*\2\2\u01358\3\2\2\2\u0136"+
		"\u0137\7+\2\2\u0137:\3\2\2\2\u0138\u0139\7?\2\2\u0139<\3\2\2\2\u013a\u013b"+
		"\7=\2\2\u013b>\3\2\2\2\u013c\u013d\7]\2\2\u013d@\3\2\2\2\u013e\u013f\7"+
		"_\2\2\u013fB\3\2\2\2\u0140\u0141\7.\2\2\u0141D\3\2\2\2\u0142\u0143\7<"+
		"\2\2\u0143F\3\2\2\2\u0144\u0145\7u\2\2\u0145\u0146\7w\2\2\u0146\u0147"+
		"\7r\2\2\u0147\u0148\7g\2\2\u0148\u0149\7t\2\2\u0149H\3\2\2\2\u014a\u014b"+
		"\7y\2\2\u014b\u014c\7t\2\2\u014c\u014d\7k\2\2\u014d\u014e\7v\2\2\u014e"+
		"\u014f\7g\2\2\u014fJ\3\2\2\2\u0150\u0151\7y\2\2\u0151\u0152\7j\2\2\u0152"+
		"\u0153\7k\2\2\u0153\u0154\7n\2\2\u0154\u0155\7g\2\2\u0155L\3\2\2\2\u0156"+
		"\u0157\7h\2\2\u0157\u0158\7n\2\2\u0158\u0159\7q\2\2\u0159\u015a\7c\2\2"+
		"\u015a\u015b\7v\2\2\u015bN\3\2\2\2\u015c\u015d\7v\2\2\u015d\u015e\7{\2"+
		"\2\u015e\u015f\7r\2\2\u015f\u0160\7g\2\2\u0160P\3\2\2\2\u0161\u0162\7"+
		"v\2\2\u0162\u0163\7j\2\2\u0163\u0164\7k\2\2\u0164\u0165\7u\2\2\u0165R"+
		"\3\2\2\2\u0166\u0167\7g\2\2\u0167\u0168\7n\2\2\u0168\u0169\7u\2\2\u0169"+
		"\u016a\7g\2\2\u016aT\3\2\2\2\u016b\u016c\7e\2\2\u016c\u016d\7c\2\2\u016d"+
		"\u016e\7u\2\2\u016e\u016f\7g\2\2\u016fV\3\2\2\2\u0170\u0171\7t\2\2\u0171"+
		"\u0172\7g\2\2\u0172\u0173\7c\2\2\u0173\u0174\7f\2\2\u0174X\3\2\2\2\u0175"+
		"\u0176\7d\2\2\u0176\u0177\7q\2\2\u0177\u0178\7q\2\2\u0178\u0179\7n\2\2"+
		"\u0179Z\3\2\2\2\u017a\u017b\7p\2\2\u017b\u017c\7k\2\2\u017c\u017d\7n\2"+
		"\2\u017d\\\3\2\2\2\u017e\u017f\7\60\2\2\u017f^\3\2\2\2\u0180\u0181\7h"+
		"\2\2\u0181\u0182\7q\2\2\u0182\u0183\7t\2\2\u0183`\3\2\2\2\u0184\u0185"+
		"\7k\2\2\u0185\u0186\7p\2\2\u0186\u0187\7v\2\2\u0187b\3\2\2\2\u0188\u0189"+
		"\7k\2\2\u0189\u018a\7h\2\2\u018ad\3\2\2\2\u018b\u018c\7\62\2\2\u018c\u018e"+
		"\t\7\2\2\u018d\u018f\t\b\2\2\u018e\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0198\3\2\2\2\u0192\u0194\t\t"+
		"\2\2\u0193\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0193\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u018b\3\2\2\2\u0197\u0193\3\2"+
		"\2\2\u0198f\3\2\2\2\u0199\u019b\t\t\2\2\u019a\u0199\3\2\2\2\u019b\u019c"+
		"\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u01a2\7\60\2\2\u019f\u01a1\t\t\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a4\3"+
		"\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01ac\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a5\u01a7\7\60\2\2\u01a6\u01a8\t\t\2\2\u01a7\u01a6\3"+
		"\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"\u01ac\3\2\2\2\u01ab\u019a\3\2\2\2\u01ab\u01a5\3\2\2\2\u01ac\u01b4\3\2"+
		"\2\2\u01ad\u01ae\t\n\2\2\u01ae\u01b0\t\13\2\2\u01af\u01b1\t\t\2\2\u01b0"+
		"\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2"+
		"\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01ad\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"h\3\2\2\2\u01b6\u01ba\t\f\2\2\u01b7\u01b9\t\r\2\2\u01b8\u01b7\3\2\2\2"+
		"\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bbj\3"+
		"\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01c2\7)\2\2\u01be\u01c1\5m\67\2\u01bf"+
		"\u01c1\n\16\2\2\u01c0\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1\u01c4\3"+
		"\2\2\2\u01c2\u01c3\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4"+
		"\u01c2\3\2\2\2\u01c5\u01c6\7)\2\2\u01c6l\3\2\2\2\u01c7\u01c8\7^\2\2\u01c8"+
		"\u01ce\t\17\2\2\u01c9\u01ca\7^\2\2\u01ca\u01cb\t\7\2\2\u01cb\u01cc\t\b"+
		"\2\2\u01cc\u01ce\t\b\2\2\u01cd\u01c7\3\2\2\2\u01cd\u01c9\3\2\2\2\u01ce"+
		"n\3\2\2\2\u01cf\u01d1\t\20\2\2\u01d0\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2"+
		"\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5"+
		"\b8\2\2\u01d5p\3\2\2\2\31\2w\u0082\u0095\u00a0\u00a8\u00ab\u00ae\u00fe"+
		"\u0190\u0195\u0197\u019c\u01a2\u01a9\u01ab\u01b2\u01b4\u01ba\u01c0\u01c2"+
		"\u01cd\u01d2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}