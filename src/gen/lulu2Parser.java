package gen;
// Generated from C:/Users/mrafe/Desktop/test\lulu2.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lulu2Parser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_ft_dcl = 1, RULE_func_dcl = 2, RULE_args = 3, RULE_args_var = 4, 
		RULE_type_dcl = 5, RULE_var_def = 6, RULE_var_val = 7, RULE_ft_def = 8, 
		RULE_type_def = 9, RULE_component = 10, RULE_access_modifier = 11, RULE_fun_def = 12, 
		RULE_block = 13, RULE_stmt = 14, RULE_assign = 15, RULE_ref = 16, RULE_expr = 17, 
		RULE_var = 18, RULE_func_call = 19, RULE_list = 20, RULE_handle_call = 21, 
		RULE_params = 22, RULE_cond_stmt = 23, RULE_loop_stmt = 24, RULE_type = 25, 
		RULE_const_val = 26, RULE_binary_op = 27, RULE_binary_op2 = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "ft_dcl", "func_dcl", "args", "args_var", "type_dcl", "var_def", 
			"var_val", "ft_def", "type_def", "component", "access_modifier", "fun_def", 
			"block", "stmt", "assign", "ref", "expr", "var", "func_call", "list", 
			"handle_call", "params", "cond_stmt", "loop_stmt", "type", "const_val", 
			"binary_op", "binary_op2"
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

	@Override
	public String getGrammarFileName() { return "lulu2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lulu2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Ft_dclContext ft_dcl() {
			return getRuleContext(Ft_dclContext.class,0);
		}
		public List<Ft_defContext> ft_def() {
			return getRuleContexts(Ft_defContext.class);
		}
		public Ft_defContext ft_def(int i) {
			return getRuleContext(Ft_defContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(58);
				ft_dcl();
				}
			}

			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				ft_def();
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << O_PAR) | (1L << TYPE))) != 0) );
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

	public static class Ft_dclContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(lulu2Parser.DECLARE, 0); }
		public TerminalNode O_CUR() { return getToken(lulu2Parser.O_CUR, 0); }
		public TerminalNode C_CUR() { return getToken(lulu2Parser.C_CUR, 0); }
		public List<Func_dclContext> func_dcl() {
			return getRuleContexts(Func_dclContext.class);
		}
		public Func_dclContext func_dcl(int i) {
			return getRuleContext(Func_dclContext.class,i);
		}
		public List<Type_dclContext> type_dcl() {
			return getRuleContexts(Type_dclContext.class);
		}
		public Type_dclContext type_dcl(int i) {
			return getRuleContext(Type_dclContext.class,i);
		}
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public Ft_dclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ft_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterFt_dcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitFt_dcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitFt_dcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ft_dclContext ft_dcl() throws RecognitionException {
		Ft_dclContext _localctx = new Ft_dclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ft_dcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(DECLARE);
			setState(67);
			match(O_CUR);
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(71);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(68);
					func_dcl();
					}
					break;
				case 2:
					{
					setState(69);
					type_dcl();
					}
					break;
				case 3:
					{
					setState(70);
					var_def();
					}
					break;
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << CONST) | (1L << O_PAR) | (1L << FLOAT) | (1L << BOOL) | (1L << INT) | (1L << ID))) != 0) );
			setState(75);
			match(C_CUR);
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

	public static class Func_dclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lulu2Parser.ID, 0); }
		public List<TerminalNode> O_PAR() { return getTokens(lulu2Parser.O_PAR); }
		public TerminalNode O_PAR(int i) {
			return getToken(lulu2Parser.O_PAR, i);
		}
		public List<TerminalNode> C_PAR() { return getTokens(lulu2Parser.C_PAR); }
		public TerminalNode C_PAR(int i) {
			return getToken(lulu2Parser.C_PAR, i);
		}
		public TerminalNode SEM_C() { return getToken(lulu2Parser.SEM_C, 0); }
		public List<ArgsContext> args() {
			return getRuleContexts(ArgsContext.class);
		}
		public ArgsContext args(int i) {
			return getRuleContext(ArgsContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(lulu2Parser.EQUAL, 0); }
		public Args_varContext args_var() {
			return getRuleContext(Args_varContext.class,0);
		}
		public Func_dclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterFunc_dcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitFunc_dcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitFunc_dcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_dclContext func_dcl() throws RecognitionException {
		Func_dclContext _localctx = new Func_dclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_func_dcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==O_PAR) {
				{
				setState(77);
				match(O_PAR);
				setState(78);
				args(0);
				setState(79);
				match(C_PAR);
				setState(80);
				match(EQUAL);
				}
			}

			setState(84);
			match(ID);
			setState(85);
			match(O_PAR);
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(86);
				args(0);
				}
				break;
			case 2:
				{
				setState(87);
				args_var(0);
				}
				break;
			}
			setState(90);
			match(C_PAR);
			setState(91);
			match(SEM_C);
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

	public static class ArgsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> O_BRA() { return getTokens(lulu2Parser.O_BRA); }
		public TerminalNode O_BRA(int i) {
			return getToken(lulu2Parser.O_BRA, i);
		}
		public List<TerminalNode> C_BRA() { return getTokens(lulu2Parser.C_BRA); }
		public TerminalNode C_BRA(int i) {
			return getToken(lulu2Parser.C_BRA, i);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(lulu2Parser.COMMA, 0); }
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		return args(0);
	}

	private ArgsContext args(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgsContext _localctx = new ArgsContext(_ctx, _parentState);
		ArgsContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_args, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(94);
			type();
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(95);
					match(O_BRA);
					setState(96);
					match(C_BRA);
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_args);
					setState(102);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(103);
					match(COMMA);
					setState(104);
					type();
					setState(109);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(105);
							match(O_BRA);
							setState(106);
							match(C_BRA);
							}
							} 
						}
						setState(111);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					}
					}
					} 
				}
				setState(116);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Args_varContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(lulu2Parser.ID, 0); }
		public List<TerminalNode> O_BRA() { return getTokens(lulu2Parser.O_BRA); }
		public TerminalNode O_BRA(int i) {
			return getToken(lulu2Parser.O_BRA, i);
		}
		public List<TerminalNode> C_BRA() { return getTokens(lulu2Parser.C_BRA); }
		public TerminalNode C_BRA(int i) {
			return getToken(lulu2Parser.C_BRA, i);
		}
		public Args_varContext args_var() {
			return getRuleContext(Args_varContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(lulu2Parser.COMMA, 0); }
		public Args_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterArgs_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitArgs_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitArgs_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Args_varContext args_var() throws RecognitionException {
		return args_var(0);
	}

	private Args_varContext args_var(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Args_varContext _localctx = new Args_varContext(_ctx, _parentState);
		Args_varContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_args_var, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(118);
			type();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==O_BRA) {
				{
				{
				setState(119);
				match(O_BRA);
				setState(120);
				match(C_BRA);
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Args_varContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_args_var);
					setState(128);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(129);
					match(COMMA);
					setState(130);
					type();
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==O_BRA) {
						{
						{
						setState(131);
						match(O_BRA);
						setState(132);
						match(C_BRA);
						}
						}
						setState(137);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(138);
					match(ID);
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Type_dclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lulu2Parser.ID, 0); }
		public TerminalNode SEM_C() { return getToken(lulu2Parser.SEM_C, 0); }
		public Type_dclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterType_dcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitType_dcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitType_dcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_dclContext type_dcl() throws RecognitionException {
		Type_dclContext _localctx = new Type_dclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type_dcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(ID);
			setState(146);
			match(SEM_C);
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

	public static class Var_defContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<Var_valContext> var_val() {
			return getRuleContexts(Var_valContext.class);
		}
		public Var_valContext var_val(int i) {
			return getRuleContext(Var_valContext.class,i);
		}
		public TerminalNode SEM_C() { return getToken(lulu2Parser.SEM_C, 0); }
		public TerminalNode CONST() { return getToken(lulu2Parser.CONST, 0); }
		public List<TerminalNode> COMMA() { return getTokens(lulu2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(lulu2Parser.COMMA, i);
		}
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterVar_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitVar_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitVar_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(148);
				match(CONST);
				}
			}

			setState(151);
			type();
			setState(152);
			var_val();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(153);
				match(COMMA);
				setState(154);
				var_val();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(SEM_C);
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

	public static class Var_valContext extends ParserRuleContext {
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(lulu2Parser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterVar_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitVar_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitVar_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_valContext var_val() throws RecognitionException {
		Var_valContext _localctx = new Var_valContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			ref();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(163);
				match(EQUAL);
				setState(164);
				expr(0);
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

	public static class Ft_defContext extends ParserRuleContext {
		public Type_defContext type_def() {
			return getRuleContext(Type_defContext.class,0);
		}
		public Fun_defContext fun_def() {
			return getRuleContext(Fun_defContext.class,0);
		}
		public Ft_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ft_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterFt_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitFt_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitFt_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ft_defContext ft_def() throws RecognitionException {
		Ft_defContext _localctx = new Ft_defContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ft_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				{
				setState(167);
				type_def();
				}
				break;
			case FUNCTION:
			case O_PAR:
				{
				setState(168);
				fun_def();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Type_defContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(lulu2Parser.TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(lulu2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(lulu2Parser.ID, i);
		}
		public TerminalNode O_CUR() { return getToken(lulu2Parser.O_CUR, 0); }
		public TerminalNode C_CUR() { return getToken(lulu2Parser.C_CUR, 0); }
		public TerminalNode COLON() { return getToken(lulu2Parser.COLON, 0); }
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public Type_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterType_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitType_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitType_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_defContext type_def() throws RecognitionException {
		Type_defContext _localctx = new Type_defContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(TYPE);
			setState(172);
			match(ID);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(173);
				match(COLON);
				setState(174);
				match(ID);
				}
			}

			setState(177);
			match(O_CUR);
			setState(179); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(178);
				component();
				}
				}
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROTECTED) | (1L << FUNCTION) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << STRING) | (1L << CONST) | (1L << O_PAR) | (1L << FLOAT) | (1L << BOOL) | (1L << INT) | (1L << ID))) != 0) );
			setState(183);
			match(C_CUR);
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

	public static class ComponentContext extends ParserRuleContext {
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public Fun_defContext fun_def() {
			return getRuleContext(Fun_defContext.class,0);
		}
		public Access_modifierContext access_modifier() {
			return getRuleContext(Access_modifierContext.class,0);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROTECTED) | (1L << PRIVATE) | (1L << PUBLIC))) != 0)) {
				{
				setState(185);
				access_modifier();
				}
			}

			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case CONST:
			case FLOAT:
			case BOOL:
			case INT:
			case ID:
				{
				setState(188);
				var_def();
				}
				break;
			case FUNCTION:
			case O_PAR:
				{
				setState(189);
				fun_def();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Access_modifierContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(lulu2Parser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(lulu2Parser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(lulu2Parser.PROTECTED, 0); }
		public Access_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterAccess_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitAccess_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitAccess_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_modifierContext access_modifier() throws RecognitionException {
		Access_modifierContext _localctx = new Access_modifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_access_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROTECTED) | (1L << PRIVATE) | (1L << PUBLIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Fun_defContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(lulu2Parser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(lulu2Parser.ID, 0); }
		public List<TerminalNode> O_PAR() { return getTokens(lulu2Parser.O_PAR); }
		public TerminalNode O_PAR(int i) {
			return getToken(lulu2Parser.O_PAR, i);
		}
		public List<TerminalNode> C_PAR() { return getTokens(lulu2Parser.C_PAR); }
		public TerminalNode C_PAR(int i) {
			return getToken(lulu2Parser.C_PAR, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Args_varContext> args_var() {
			return getRuleContexts(Args_varContext.class);
		}
		public Args_varContext args_var(int i) {
			return getRuleContext(Args_varContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(lulu2Parser.EQUAL, 0); }
		public Fun_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterFun_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitFun_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitFun_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_defContext fun_def() throws RecognitionException {
		Fun_defContext _localctx = new Fun_defContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fun_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==O_PAR) {
				{
				setState(194);
				match(O_PAR);
				setState(195);
				args_var(0);
				setState(196);
				match(C_PAR);
				setState(197);
				match(EQUAL);
				}
			}

			setState(201);
			match(FUNCTION);
			setState(202);
			match(ID);
			setState(203);
			match(O_PAR);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << FLOAT) | (1L << BOOL) | (1L << INT) | (1L << ID))) != 0)) {
				{
				setState(204);
				args_var(0);
				}
			}

			setState(207);
			match(C_PAR);
			setState(208);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode O_CUR() { return getToken(lulu2Parser.O_CUR, 0); }
		public TerminalNode C_CUR() { return getToken(lulu2Parser.C_CUR, 0); }
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(O_CUR);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONTINUE) | (1L << DESTRUCT) | (1L << RETURN) | (1L << SWITCH) | (1L << STRING) | (1L << BREAK) | (1L << CONST) | (1L << O_PAR) | (1L << SUPER) | (1L << WRITE) | (1L << WHILE) | (1L << FLOAT) | (1L << THIS) | (1L << READ) | (1L << BOOL) | (1L << FOR) | (1L << INT) | (1L << IF) | (1L << ID))) != 0)) {
				{
				setState(213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(211);
					var_def();
					}
					break;
				case 2:
					{
					setState(212);
					stmt();
					}
					break;
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			match(C_CUR);
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

	public static class StmtContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode SEM_C() { return getToken(lulu2Parser.SEM_C, 0); }
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Cond_stmtContext cond_stmt() {
			return getRuleContext(Cond_stmtContext.class,0);
		}
		public Loop_stmtContext loop_stmt() {
			return getRuleContext(Loop_stmtContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(lulu2Parser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(lulu2Parser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(lulu2Parser.CONTINUE, 0); }
		public TerminalNode DESTRUCT() { return getToken(lulu2Parser.DESTRUCT, 0); }
		public TerminalNode ID() { return getToken(lulu2Parser.ID, 0); }
		public List<TerminalNode> O_BRA() { return getTokens(lulu2Parser.O_BRA); }
		public TerminalNode O_BRA(int i) {
			return getToken(lulu2Parser.O_BRA, i);
		}
		public List<TerminalNode> C_BRA() { return getTokens(lulu2Parser.C_BRA); }
		public TerminalNode C_BRA(int i) {
			return getToken(lulu2Parser.C_BRA, i);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stmt);
		int _la;
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				assign();
				setState(221);
				match(SEM_C);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				func_call();
				setState(224);
				match(SEM_C);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				cond_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				loop_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(228);
				match(RETURN);
				setState(229);
				match(SEM_C);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(230);
				match(BREAK);
				setState(231);
				match(SEM_C);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(232);
				match(CONTINUE);
				setState(233);
				match(SEM_C);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(234);
				match(DESTRUCT);
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==O_BRA) {
					{
					{
					setState(235);
					match(O_BRA);
					setState(236);
					match(C_BRA);
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(242);
				match(ID);
				setState(243);
				match(SEM_C);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(lulu2Parser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode O_PAR() { return getToken(lulu2Parser.O_PAR, 0); }
		public TerminalNode C_PAR() { return getToken(lulu2Parser.C_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(lulu2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(lulu2Parser.COMMA, i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
			case THIS:
			case ID:
				{
				setState(246);
				var();
				}
				break;
			case O_PAR:
				{
				setState(247);
				match(O_PAR);
				setState(248);
				var();
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(249);
					match(COMMA);
					setState(250);
					var();
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(256);
				match(C_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(260);
			match(EQUAL);
			setState(261);
			expr(0);
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

	public static class RefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lulu2Parser.ID, 0); }
		public List<TerminalNode> O_BRA() { return getTokens(lulu2Parser.O_BRA); }
		public TerminalNode O_BRA(int i) {
			return getToken(lulu2Parser.O_BRA, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> C_BRA() { return getTokens(lulu2Parser.C_BRA); }
		public TerminalNode C_BRA(int i) {
			return getToken(lulu2Parser.C_BRA, i);
		}
		public RefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ref);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(ID);
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(264);
					match(O_BRA);
					setState(265);
					expr(0);
					setState(266);
					match(C_BRA);
					}
					} 
				}
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode O_PAR() { return getToken(lulu2Parser.O_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode C_PAR() { return getToken(lulu2Parser.C_PAR, 0); }
		public TerminalNode TERM() { return getToken(lulu2Parser.TERM, 0); }
		public Const_valContext const_val() {
			return getRuleContext(Const_valContext.class,0);
		}
		public TerminalNode ALLOCATE() { return getToken(lulu2Parser.ALLOCATE, 0); }
		public Handle_callContext handle_call() {
			return getRuleContext(Handle_callContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode NIL() { return getToken(lulu2Parser.NIL, 0); }
		public Binary_opContext binary_op() {
			return getRuleContext(Binary_opContext.class,0);
		}
		public Binary_op2Context binary_op2() {
			return getRuleContext(Binary_op2Context.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(274);
				match(O_PAR);
				setState(275);
				expr(0);
				setState(276);
				match(C_PAR);
				}
				break;
			case 2:
				{
				setState(278);
				match(TERM);
				setState(279);
				expr(7);
				}
				break;
			case 3:
				{
				setState(280);
				const_val();
				}
				break;
			case 4:
				{
				setState(281);
				match(ALLOCATE);
				setState(282);
				handle_call();
				}
				break;
			case 5:
				{
				setState(283);
				func_call();
				}
				break;
			case 6:
				{
				setState(284);
				var();
				}
				break;
			case 7:
				{
				setState(285);
				list();
				}
				break;
			case 8:
				{
				setState(286);
				match(NIL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(297);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(289);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(290);
						binary_op();
						setState(291);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(293);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(294);
						binary_op2();
						setState(295);
						expr(10);
						}
						break;
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public List<RefContext> ref() {
			return getRuleContexts(RefContext.class);
		}
		public RefContext ref(int i) {
			return getRuleContext(RefContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(lulu2Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(lulu2Parser.DOT, i);
		}
		public TerminalNode THIS() { return getToken(lulu2Parser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(lulu2Parser.SUPER, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_var);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUPER || _la==THIS) {
				{
				setState(302);
				_la = _input.LA(1);
				if ( !(_la==SUPER || _la==THIS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(303);
				match(DOT);
				}
			}

			setState(306);
			ref();
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(307);
					match(DOT);
					setState(308);
					ref();
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class Func_callContext extends ParserRuleContext {
		public Handle_callContext handle_call() {
			return getRuleContext(Handle_callContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode DOT() { return getToken(lulu2Parser.DOT, 0); }
		public TerminalNode READ() { return getToken(lulu2Parser.READ, 0); }
		public TerminalNode O_PAR() { return getToken(lulu2Parser.O_PAR, 0); }
		public TerminalNode C_PAR() { return getToken(lulu2Parser.C_PAR, 0); }
		public TerminalNode WRITE() { return getToken(lulu2Parser.WRITE, 0); }
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_func_call);
		try {
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
			case THIS:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(314);
					var();
					setState(315);
					match(DOT);
					}
					break;
				}
				setState(319);
				handle_call();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(READ);
				setState(321);
				match(O_PAR);
				setState(322);
				var();
				setState(323);
				match(C_PAR);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				match(WRITE);
				setState(326);
				match(O_PAR);
				setState(327);
				var();
				setState(328);
				match(C_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode O_BRA() { return getToken(lulu2Parser.O_BRA, 0); }
		public TerminalNode C_BRA() { return getToken(lulu2Parser.C_BRA, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(lulu2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(lulu2Parser.COMMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(O_BRA);
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(333);
				expr(0);
				}
				break;
			case 2:
				{
				setState(334);
				list();
				}
				break;
			}
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(337);
				match(COMMA);
				setState(340);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(338);
					expr(0);
					}
					break;
				case 2:
					{
					setState(339);
					list();
					}
					break;
				}
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(347);
			match(C_BRA);
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

	public static class Handle_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lulu2Parser.ID, 0); }
		public TerminalNode O_PAR() { return getToken(lulu2Parser.O_PAR, 0); }
		public TerminalNode C_PAR() { return getToken(lulu2Parser.C_PAR, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Handle_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handle_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterHandle_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitHandle_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitHandle_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Handle_callContext handle_call() throws RecognitionException {
		Handle_callContext _localctx = new Handle_callContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_handle_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(ID);
			setState(350);
			match(O_PAR);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_CONST) | (1L << TERM) | (1L << ALLOCATE) | (1L << O_PAR) | (1L << O_BRA) | (1L << SUPER) | (1L << WRITE) | (1L << THIS) | (1L << READ) | (1L << NIL) | (1L << INT_CONST) | (1L << REAL_CONST) | (1L << ID) | (1L << STRING_CONST))) != 0)) {
				{
				setState(351);
				params();
				}
			}

			setState(354);
			match(C_PAR);
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

	public static class ParamsContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(lulu2Parser.COMMA, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_params);
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				expr(0);
				setState(358);
				match(COMMA);
				setState(359);
				params();
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

	public static class Cond_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(lulu2Parser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(lulu2Parser.ELSE, 0); }
		public TerminalNode SWITCH() { return getToken(lulu2Parser.SWITCH, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode O_CUR() { return getToken(lulu2Parser.O_CUR, 0); }
		public TerminalNode DEFAULT() { return getToken(lulu2Parser.DEFAULT, 0); }
		public List<TerminalNode> COLON() { return getTokens(lulu2Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(lulu2Parser.COLON, i);
		}
		public TerminalNode C_CUR() { return getToken(lulu2Parser.C_CUR, 0); }
		public List<TerminalNode> CASE() { return getTokens(lulu2Parser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(lulu2Parser.CASE, i);
		}
		public List<TerminalNode> INT_CONST() { return getTokens(lulu2Parser.INT_CONST); }
		public TerminalNode INT_CONST(int i) {
			return getToken(lulu2Parser.INT_CONST, i);
		}
		public Cond_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterCond_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitCond_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitCond_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_stmtContext cond_stmt() throws RecognitionException {
		Cond_stmtContext _localctx = new Cond_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cond_stmt);
		int _la;
		try {
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				match(IF);
				setState(364);
				expr(0);
				setState(365);
				block();
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(366);
					match(ELSE);
					setState(367);
					block();
					}
				}

				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				match(SWITCH);
				setState(371);
				var();
				setState(372);
				match(O_CUR);
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE) {
					{
					{
					setState(373);
					match(CASE);
					setState(374);
					match(INT_CONST);
					setState(375);
					match(COLON);
					setState(376);
					block();
					}
					}
					setState(381);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(382);
				match(DEFAULT);
				setState(383);
				match(COLON);
				setState(384);
				block();
				setState(385);
				match(C_CUR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Loop_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(lulu2Parser.FOR, 0); }
		public List<TerminalNode> SEM_C() { return getTokens(lulu2Parser.SEM_C); }
		public TerminalNode SEM_C(int i) {
			return getToken(lulu2Parser.SEM_C, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(lulu2Parser.WHILE, 0); }
		public Loop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterLoop_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitLoop_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitLoop_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_stmtContext loop_stmt() throws RecognitionException {
		Loop_stmtContext _localctx = new Loop_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_loop_stmt);
		int _la;
		try {
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				match(FOR);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << O_PAR) | (1L << SUPER) | (1L << FLOAT) | (1L << THIS) | (1L << BOOL) | (1L << INT) | (1L << ID))) != 0)) {
					{
					setState(391);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						setState(390);
						type();
						}
						break;
					}
					setState(393);
					assign();
					}
				}

				setState(396);
				match(SEM_C);
				setState(397);
				expr(0);
				setState(398);
				match(SEM_C);
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << O_PAR) | (1L << SUPER) | (1L << THIS) | (1L << ID))) != 0)) {
					{
					setState(399);
					assign();
					}
				}

				setState(402);
				block();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				match(WHILE);
				setState(405);
				expr(0);
				setState(406);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(lulu2Parser.INT, 0); }
		public TerminalNode BOOL() { return getToken(lulu2Parser.BOOL, 0); }
		public TerminalNode FLOAT() { return getToken(lulu2Parser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(lulu2Parser.STRING, 0); }
		public TerminalNode ID() { return getToken(lulu2Parser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << FLOAT) | (1L << BOOL) | (1L << INT) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Const_valContext extends ParserRuleContext {
		public TerminalNode STRING_CONST() { return getToken(lulu2Parser.STRING_CONST, 0); }
		public TerminalNode INT_CONST() { return getToken(lulu2Parser.INT_CONST, 0); }
		public TerminalNode REAL_CONST() { return getToken(lulu2Parser.REAL_CONST, 0); }
		public TerminalNode BOOL_CONST() { return getToken(lulu2Parser.BOOL_CONST, 0); }
		public Const_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterConst_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitConst_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitConst_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_valContext const_val() throws RecognitionException {
		Const_valContext _localctx = new Const_valContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_const_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_CONST) | (1L << INT_CONST) | (1L << REAL_CONST) | (1L << STRING_CONST))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Binary_opContext extends ParserRuleContext {
		public TerminalNode ARITHMETIC1() { return getToken(lulu2Parser.ARITHMETIC1, 0); }
		public TerminalNode RELATIONAL() { return getToken(lulu2Parser.RELATIONAL, 0); }
		public TerminalNode BITWISE() { return getToken(lulu2Parser.BITWISE, 0); }
		public Binary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterBinary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitBinary_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitBinary_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_opContext binary_op() throws RecognitionException {
		Binary_opContext _localctx = new Binary_opContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_binary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARITHMETIC1) | (1L << RELATIONAL) | (1L << BITWISE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Binary_op2Context extends ParserRuleContext {
		public TerminalNode TERM() { return getToken(lulu2Parser.TERM, 0); }
		public TerminalNode LOGICAL() { return getToken(lulu2Parser.LOGICAL, 0); }
		public Binary_op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterBinary_op2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitBinary_op2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitBinary_op2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_op2Context binary_op2() throws RecognitionException {
		Binary_op2Context _localctx = new Binary_op2Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_binary_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_la = _input.LA(1);
			if ( !(_la==LOGICAL || _la==TERM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return args_sempred((ArgsContext)_localctx, predIndex);
		case 4:
			return args_var_sempred((Args_varContext)_localctx, predIndex);
		case 17:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean args_sempred(ArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean args_var_sempred(Args_varContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u01a5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\5\2>\n\2\3\2\6"+
		"\2A\n\2\r\2\16\2B\3\3\3\3\3\3\3\3\3\3\6\3J\n\3\r\3\16\3K\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\5\4U\n\4\3\4\3\4\3\4\3\4\5\4[\n\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\7\5d\n\5\f\5\16\5g\13\5\3\5\3\5\3\5\3\5\3\5\7\5n\n\5\f\5\16\5q"+
		"\13\5\7\5s\n\5\f\5\16\5v\13\5\3\6\3\6\3\6\3\6\7\6|\n\6\f\6\16\6\177\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0088\n\6\f\6\16\6\u008b\13\6\3\6\3"+
		"\6\7\6\u008f\n\6\f\6\16\6\u0092\13\6\3\7\3\7\3\7\3\b\5\b\u0098\n\b\3\b"+
		"\3\b\3\b\3\b\7\b\u009e\n\b\f\b\16\b\u00a1\13\b\3\b\3\b\3\t\3\t\3\t\5\t"+
		"\u00a8\n\t\3\n\3\n\5\n\u00ac\n\n\3\13\3\13\3\13\3\13\5\13\u00b2\n\13\3"+
		"\13\3\13\6\13\u00b6\n\13\r\13\16\13\u00b7\3\13\3\13\3\f\5\f\u00bd\n\f"+
		"\3\f\3\f\5\f\u00c1\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u00ca\n\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00d0\n\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17"+
		"\u00d8\n\17\f\17\16\17\u00db\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00f0"+
		"\n\20\f\20\16\20\u00f3\13\20\3\20\3\20\5\20\u00f7\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\7\21\u00fe\n\21\f\21\16\21\u0101\13\21\3\21\3\21\5\21\u0105"+
		"\n\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u010f\n\22\f\22\16"+
		"\22\u0112\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u0122\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\7\23\u012c\n\23\f\23\16\23\u012f\13\23\3\24\3\24\5\24\u0133\n\24\3\24"+
		"\3\24\3\24\7\24\u0138\n\24\f\24\16\24\u013b\13\24\3\25\3\25\3\25\5\25"+
		"\u0140\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u014d\n\25\3\26\3\26\3\26\5\26\u0152\n\26\3\26\3\26\3\26\5\26\u0157\n"+
		"\26\7\26\u0159\n\26\f\26\16\26\u015c\13\26\3\26\3\26\3\27\3\27\3\27\5"+
		"\27\u0163\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u016c\n\30\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u0173\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\7\31\u017c\n\31\f\31\16\31\u017f\13\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0186\n\31\3\32\3\32\5\32\u018a\n\32\3\32\5\32\u018d\n\32\3\32\3\32\3"+
		"\32\3\32\5\32\u0193\n\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u019b\n\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\2\5\b\n$\37\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\b\5\2\f\f\22\22\25"+
		"\25\4\2%%**\7\2\30\30((..\62\62\66\66\5\2\7\7\64\65\67\67\4\2\5\6\b\b"+
		"\3\2\t\n\2\u01c6\2=\3\2\2\2\4D\3\2\2\2\6T\3\2\2\2\b_\3\2\2\2\nw\3\2\2"+
		"\2\f\u0093\3\2\2\2\16\u0097\3\2\2\2\20\u00a4\3\2\2\2\22\u00ab\3\2\2\2"+
		"\24\u00ad\3\2\2\2\26\u00bc\3\2\2\2\30\u00c2\3\2\2\2\32\u00c9\3\2\2\2\34"+
		"\u00d4\3\2\2\2\36\u00f6\3\2\2\2 \u0104\3\2\2\2\"\u0109\3\2\2\2$\u0121"+
		"\3\2\2\2&\u0132\3\2\2\2(\u014c\3\2\2\2*\u014e\3\2\2\2,\u015f\3\2\2\2."+
		"\u016b\3\2\2\2\60\u0185\3\2\2\2\62\u019a\3\2\2\2\64\u019c\3\2\2\2\66\u019e"+
		"\3\2\2\28\u01a0\3\2\2\2:\u01a2\3\2\2\2<>\5\4\3\2=<\3\2\2\2=>\3\2\2\2>"+
		"@\3\2\2\2?A\5\22\n\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\3\3\2\2"+
		"\2DE\7\21\2\2EI\7\33\2\2FJ\5\6\4\2GJ\5\f\7\2HJ\5\16\b\2IF\3\2\2\2IG\3"+
		"\2\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7\34\2\2N\5"+
		"\3\2\2\2OP\7\35\2\2PQ\5\b\5\2QR\7\36\2\2RS\7\37\2\2SU\3\2\2\2TO\3\2\2"+
		"\2TU\3\2\2\2UV\3\2\2\2VW\7\66\2\2WZ\7\35\2\2X[\5\b\5\2Y[\5\n\6\2ZX\3\2"+
		"\2\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\36\2\2]^\7 \2\2^\7\3\2\2\2_`"+
		"\b\5\1\2`e\5\64\33\2ab\7!\2\2bd\7\"\2\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2"+
		"ef\3\2\2\2ft\3\2\2\2ge\3\2\2\2hi\f\3\2\2ij\7#\2\2jo\5\64\33\2kl\7!\2\2"+
		"ln\7\"\2\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2ps\3\2\2\2qo\3\2\2\2"+
		"rh\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\t\3\2\2\2vt\3\2\2\2wx\b\6\1"+
		"\2x}\5\64\33\2yz\7!\2\2z|\7\"\2\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3"+
		"\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\66\2\2\u0081\u0090\3"+
		"\2\2\2\u0082\u0083\f\3\2\2\u0083\u0084\7#\2\2\u0084\u0089\5\64\33\2\u0085"+
		"\u0086\7!\2\2\u0086\u0088\7\"\2\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u008d\7\66\2\2\u008d\u008f\3\2\2\2\u008e\u0082\3"+
		"\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\13\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7\66\2\2\u0094\u0095\7 \2"+
		"\2\u0095\r\3\2\2\2\u0096\u0098\7\32\2\2\u0097\u0096\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\5\64\33\2\u009a\u009f\5\20\t"+
		"\2\u009b\u009c\7#\2\2\u009c\u009e\5\20\t\2\u009d\u009b\3\2\2\2\u009e\u00a1"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a3\7 \2\2\u00a3\17\3\2\2\2\u00a4\u00a7\5\"\22"+
		"\2\u00a5\u00a6\7\37\2\2\u00a6\u00a8\5$\23\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\21\3\2\2\2\u00a9\u00ac\5\24\13\2\u00aa\u00ac\5\32"+
		"\16\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\23\3\2\2\2\u00ad\u00ae"+
		"\7)\2\2\u00ae\u00b1\7\66\2\2\u00af\u00b0\7$\2\2\u00b0\u00b2\7\66\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\7\33"+
		"\2\2\u00b4\u00b6\5\26\f\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\34"+
		"\2\2\u00ba\25\3\2\2\2\u00bb\u00bd\5\30\r\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00c1\5\16\b\2\u00bf\u00c1\5\32\16"+
		"\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\27\3\2\2\2\u00c2\u00c3"+
		"\t\2\2\2\u00c3\31\3\2\2\2\u00c4\u00c5\7\35\2\2\u00c5\u00c6\5\n\6\2\u00c6"+
		"\u00c7\7\36\2\2\u00c7\u00c8\7\37\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c4\3"+
		"\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7\r\2\2\u00cc"+
		"\u00cd\7\66\2\2\u00cd\u00cf\7\35\2\2\u00ce\u00d0\5\n\6\2\u00cf\u00ce\3"+
		"\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7\36\2\2\u00d2"+
		"\u00d3\5\34\17\2\u00d3\33\3\2\2\2\u00d4\u00d9\7\33\2\2\u00d5\u00d8\5\16"+
		"\b\2\u00d6\u00d8\5\36\20\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7\34\2\2\u00dd\35\3\2\2\2\u00de\u00df"+
		"\5 \21\2\u00df\u00e0\7 \2\2\u00e0\u00f7\3\2\2\2\u00e1\u00e2\5(\25\2\u00e2"+
		"\u00e3\7 \2\2\u00e3\u00f7\3\2\2\2\u00e4\u00f7\5\60\31\2\u00e5\u00f7\5"+
		"\62\32\2\u00e6\u00e7\7\26\2\2\u00e7\u00f7\7 \2\2\u00e8\u00e9\7\31\2\2"+
		"\u00e9\u00f7\7 \2\2\u00ea\u00eb\7\16\2\2\u00eb\u00f7\7 \2\2\u00ec\u00f1"+
		"\7\17\2\2\u00ed\u00ee\7!\2\2\u00ee\u00f0\7\"\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7\66\2\2\u00f5\u00f7\7 \2\2\u00f6"+
		"\u00de\3\2\2\2\u00f6\u00e1\3\2\2\2\u00f6\u00e4\3\2\2\2\u00f6\u00e5\3\2"+
		"\2\2\u00f6\u00e6\3\2\2\2\u00f6\u00e8\3\2\2\2\u00f6\u00ea\3\2\2\2\u00f6"+
		"\u00ec\3\2\2\2\u00f7\37\3\2\2\2\u00f8\u0105\5&\24\2\u00f9\u00fa\7\35\2"+
		"\2\u00fa\u00ff\5&\24\2\u00fb\u00fc\7#\2\2\u00fc\u00fe\5&\24\2\u00fd\u00fb"+
		"\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7\36\2\2\u0103\u0105\3"+
		"\2\2\2\u0104\u00f8\3\2\2\2\u0104\u00f9\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0107\7\37\2\2\u0107\u0108\5$\23\2\u0108!\3\2\2\2\u0109\u0110\7\66\2"+
		"\2\u010a\u010b\7!\2\2\u010b\u010c\5$\23\2\u010c\u010d\7\"\2\2\u010d\u010f"+
		"\3\2\2\2\u010e\u010a\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111#\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\b\23\1\2"+
		"\u0114\u0115\7\35\2\2\u0115\u0116\5$\23\2\u0116\u0117\7\36\2\2\u0117\u0122"+
		"\3\2\2\2\u0118\u0119\7\n\2\2\u0119\u0122\5$\23\t\u011a\u0122\5\66\34\2"+
		"\u011b\u011c\7\20\2\2\u011c\u0122\5,\27\2\u011d\u0122\5(\25\2\u011e\u0122"+
		"\5&\24\2\u011f\u0122\5*\26\2\u0120\u0122\7/\2\2\u0121\u0113\3\2\2\2\u0121"+
		"\u0118\3\2\2\2\u0121\u011a\3\2\2\2\u0121\u011b\3\2\2\2\u0121\u011d\3\2"+
		"\2\2\u0121\u011e\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122"+
		"\u012d\3\2\2\2\u0123\u0124\f\f\2\2\u0124\u0125\58\35\2\u0125\u0126\5$"+
		"\23\r\u0126\u012c\3\2\2\2\u0127\u0128\f\13\2\2\u0128\u0129\5:\36\2\u0129"+
		"\u012a\5$\23\f\u012a\u012c\3\2\2\2\u012b\u0123\3\2\2\2\u012b\u0127\3\2"+
		"\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"%\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\t\3\2\2\u0131\u0133\7\60\2\2"+
		"\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0139"+
		"\5\"\22\2\u0135\u0136\7\60\2\2\u0136\u0138\5\"\22\2\u0137\u0135\3\2\2"+
		"\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\'"+
		"\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\5&\24\2\u013d\u013e\7\60\2\2"+
		"\u013e\u0140\3\2\2\2\u013f\u013c\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141"+
		"\3\2\2\2\u0141\u014d\5,\27\2\u0142\u0143\7-\2\2\u0143\u0144\7\35\2\2\u0144"+
		"\u0145\5&\24\2\u0145\u0146\7\36\2\2\u0146\u014d\3\2\2\2\u0147\u0148\7"+
		"&\2\2\u0148\u0149\7\35\2\2\u0149\u014a\5&\24\2\u014a\u014b\7\36\2\2\u014b"+
		"\u014d\3\2\2\2\u014c\u013f\3\2\2\2\u014c\u0142\3\2\2\2\u014c\u0147\3\2"+
		"\2\2\u014d)\3\2\2\2\u014e\u0151\7!\2\2\u014f\u0152\5$\23\2\u0150\u0152"+
		"\5*\26\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152\u015a\3\2\2\2\u0153"+
		"\u0156\7#\2\2\u0154\u0157\5$\23\2\u0155\u0157\5*\26\2\u0156\u0154\3\2"+
		"\2\2\u0156\u0155\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0153\3\2\2\2\u0159"+
		"\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\3\2"+
		"\2\2\u015c\u015a\3\2\2\2\u015d\u015e\7\"\2\2\u015e+\3\2\2\2\u015f\u0160"+
		"\7\66\2\2\u0160\u0162\7\35\2\2\u0161\u0163\5.\30\2\u0162\u0161\3\2\2\2"+
		"\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\7\36\2\2\u0165-\3"+
		"\2\2\2\u0166\u016c\5$\23\2\u0167\u0168\5$\23\2\u0168\u0169\7#\2\2\u0169"+
		"\u016a\5.\30\2\u016a\u016c\3\2\2\2\u016b\u0166\3\2\2\2\u016b\u0167\3\2"+
		"\2\2\u016c/\3\2\2\2\u016d\u016e\7\63\2\2\u016e\u016f\5$\23\2\u016f\u0172"+
		"\5\34\17\2\u0170\u0171\7+\2\2\u0171\u0173\5\34\17\2\u0172\u0170\3\2\2"+
		"\2\u0172\u0173\3\2\2\2\u0173\u0186\3\2\2\2\u0174\u0175\7\27\2\2\u0175"+
		"\u0176\5&\24\2\u0176\u017d\7\33\2\2\u0177\u0178\7,\2\2\u0178\u0179\7\64"+
		"\2\2\u0179\u017a\7$\2\2\u017a\u017c\5\34\17\2\u017b\u0177\3\2\2\2\u017c"+
		"\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2"+
		"\2\2\u017f\u017d\3\2\2\2\u0180\u0181\7\23\2\2\u0181\u0182\7$\2\2\u0182"+
		"\u0183\5\34\17\2\u0183\u0184\7\34\2\2\u0184\u0186\3\2\2\2\u0185\u016d"+
		"\3\2\2\2\u0185\u0174\3\2\2\2\u0186\61\3\2\2\2\u0187\u018c\7\61\2\2\u0188"+
		"\u018a\5\64\33\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3"+
		"\2\2\2\u018b\u018d\5 \21\2\u018c\u0189\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u018f\7 \2\2\u018f\u0190\5$\23\2\u0190\u0192\7 \2"+
		"\2\u0191\u0193\5 \21\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194"+
		"\3\2\2\2\u0194\u0195\5\34\17\2\u0195\u019b\3\2\2\2\u0196\u0197\7\'\2\2"+
		"\u0197\u0198\5$\23\2\u0198\u0199\5\34\17\2\u0199\u019b\3\2\2\2\u019a\u0187"+
		"\3\2\2\2\u019a\u0196\3\2\2\2\u019b\63\3\2\2\2\u019c\u019d\t\4\2\2\u019d"+
		"\65\3\2\2\2\u019e\u019f\t\5\2\2\u019f\67\3\2\2\2\u01a0\u01a1\t\6\2\2\u01a1"+
		"9\3\2\2\2\u01a2\u01a3\t\7\2\2\u01a3;\3\2\2\2\62=BIKTZeot}\u0089\u0090"+
		"\u0097\u009f\u00a7\u00ab\u00b1\u00b7\u00bc\u00c0\u00c9\u00cf\u00d7\u00d9"+
		"\u00f1\u00f6\u00ff\u0104\u0110\u0121\u012b\u012d\u0132\u0139\u013f\u014c"+
		"\u0151\u0156\u015a\u0162\u016b\u0172\u017d\u0185\u0189\u018c\u0192\u019a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}