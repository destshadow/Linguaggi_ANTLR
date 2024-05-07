// Generated from C:/Users/amara/Desktop/es linguaggi/homework3/Homework3/src/Brainfuck.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BrainfuckParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LT=1, GT=2, PLUS=3, MINUS=4, DOT=5, COMMA=6, LBRAK=7, RBRAK=8, EXTRA=9;
	public static final int
		RULE_main = 0, RULE_com = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "com"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'+'", "'-'", "'.'", "','", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LT", "GT", "PLUS", "MINUS", "DOT", "COMMA", "LBRAK", "RBRAK", 
			"EXTRA"
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
	public String getGrammarFileName() { return "Brainfuck.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BrainfuckParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BrainfuckParser.EOF, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrainfuckListener ) ((BrainfuckListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrainfuckListener ) ((BrainfuckListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfuckVisitor ) return ((BrainfuckVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			com();
			setState(5);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(BrainfuckParser.LT, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode GT() { return getToken(BrainfuckParser.GT, 0); }
		public TerminalNode PLUS() { return getToken(BrainfuckParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BrainfuckParser.MINUS, 0); }
		public TerminalNode DOT() { return getToken(BrainfuckParser.DOT, 0); }
		public TerminalNode COMMA() { return getToken(BrainfuckParser.COMMA, 0); }
		public TerminalNode LBRAK() { return getToken(BrainfuckParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(BrainfuckParser.RBRAK, 0); }
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrainfuckListener ) ((BrainfuckListener)listener).enterCom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrainfuckListener ) ((BrainfuckListener)listener).exitCom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfuckVisitor ) return ((BrainfuckVisitor<? extends T>)visitor).visitCom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		ComContext _localctx = new ComContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_com);
		try {
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(7);
				match(LT);
				setState(8);
				com();
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(9);
				match(GT);
				setState(10);
				com();
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(11);
				match(PLUS);
				setState(12);
				com();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(13);
				match(MINUS);
				setState(14);
				com();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 5);
				{
				setState(15);
				match(DOT);
				setState(16);
				com();
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 6);
				{
				setState(17);
				match(COMMA);
				setState(18);
				com();
				}
				break;
			case LBRAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(19);
				match(LBRAK);
				setState(20);
				com();
				setState(21);
				match(RBRAK);
				}
				break;
			case EOF:
			case RBRAK:
				enterOuterAlt(_localctx, 8);
				{
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

	public static final String _serializedATN =
		"\u0004\u0001\t\u001b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u0019\b\u0001\u0001\u0001\u0000\u0000\u0002"+
		"\u0000\u0002\u0000\u0000\u001f\u0000\u0004\u0001\u0000\u0000\u0000\u0002"+
		"\u0018\u0001\u0000\u0000\u0000\u0004\u0005\u0003\u0002\u0001\u0000\u0005"+
		"\u0006\u0005\u0000\u0000\u0001\u0006\u0001\u0001\u0000\u0000\u0000\u0007"+
		"\b\u0005\u0001\u0000\u0000\b\u0019\u0003\u0002\u0001\u0000\t\n\u0005\u0002"+
		"\u0000\u0000\n\u0019\u0003\u0002\u0001\u0000\u000b\f\u0005\u0003\u0000"+
		"\u0000\f\u0019\u0003\u0002\u0001\u0000\r\u000e\u0005\u0004\u0000\u0000"+
		"\u000e\u0019\u0003\u0002\u0001\u0000\u000f\u0010\u0005\u0005\u0000\u0000"+
		"\u0010\u0019\u0003\u0002\u0001\u0000\u0011\u0012\u0005\u0006\u0000\u0000"+
		"\u0012\u0019\u0003\u0002\u0001\u0000\u0013\u0014\u0005\u0007\u0000\u0000"+
		"\u0014\u0015\u0003\u0002\u0001\u0000\u0015\u0016\u0005\b\u0000\u0000\u0016"+
		"\u0019\u0001\u0000\u0000\u0000\u0017\u0019\u0001\u0000\u0000\u0000\u0018"+
		"\u0007\u0001\u0000\u0000\u0000\u0018\t\u0001\u0000\u0000\u0000\u0018\u000b"+
		"\u0001\u0000\u0000\u0000\u0018\r\u0001\u0000\u0000\u0000\u0018\u000f\u0001"+
		"\u0000\u0000\u0000\u0018\u0011\u0001\u0000\u0000\u0000\u0018\u0013\u0001"+
		"\u0000\u0000\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u0003\u0001"+
		"\u0000\u0000\u0000\u0001\u0018";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}