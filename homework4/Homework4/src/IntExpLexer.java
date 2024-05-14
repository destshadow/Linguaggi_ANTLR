// Generated from C:/Users/amara/Desktop/es linguaggi/homework4/Homework4/src/IntExp.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class IntExpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAR=1, RPAR=2, PLUS=3, MUL=4, MOD=5, POW=6, DIV=7, MINUS=8, FLOAT=9, 
		ID=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LPAR", "RPAR", "PLUS", "MUL", "MOD", "POW", "DIV", "MINUS", "FLOAT", 
			"INT", "NAT", "POS", "DIGIT", "POSDIGIT", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'+'", "'*'", "'%'", "'^'", "'/'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAR", "RPAR", "PLUS", "MUL", "MOD", "POW", "DIV", "MINUS", "FLOAT", 
			"ID", "WS"
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


	public IntExpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IntExp.g4"; }

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
		"\u0004\u0000\u000b]\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b6\b\b\u0001\b\u0001\b\u0003\b:\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0003\t?\b\t\u0001\n\u0001\n\u0003\nC\b\n\u0001\u000b"+
		"\u0001\u000b\u0005\u000bG\b\u000b\n\u000b\f\u000bJ\t\u000b\u0001\f\u0001"+
		"\f\u0003\fN\b\f\u0001\r\u0001\r\u0001\u000e\u0004\u000eS\b\u000e\u000b"+
		"\u000e\f\u000eT\u0001\u000f\u0004\u000fX\b\u000f\u000b\u000f\f\u000fY"+
		"\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\u0000"+
		"\u0015\u0000\u0017\u0000\u0019\u0000\u001b\u0000\u001d\n\u001f\u000b\u0001"+
		"\u0000\u0003\u0001\u000019\u0001\u0000az\u0003\u0000\t\n\r\r  _\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0001!\u0001\u0000\u0000\u0000\u0003#\u0001\u0000"+
		"\u0000\u0000\u0005%\u0001\u0000\u0000\u0000\u0007\'\u0001\u0000\u0000"+
		"\u0000\t)\u0001\u0000\u0000\u0000\u000b+\u0001\u0000\u0000\u0000\r-\u0001"+
		"\u0000\u0000\u0000\u000f/\u0001\u0000\u0000\u0000\u00119\u0001\u0000\u0000"+
		"\u0000\u0013>\u0001\u0000\u0000\u0000\u0015B\u0001\u0000\u0000\u0000\u0017"+
		"D\u0001\u0000\u0000\u0000\u0019M\u0001\u0000\u0000\u0000\u001bO\u0001"+
		"\u0000\u0000\u0000\u001dR\u0001\u0000\u0000\u0000\u001fW\u0001\u0000\u0000"+
		"\u0000!\"\u0005(\u0000\u0000\"\u0002\u0001\u0000\u0000\u0000#$\u0005)"+
		"\u0000\u0000$\u0004\u0001\u0000\u0000\u0000%&\u0005+\u0000\u0000&\u0006"+
		"\u0001\u0000\u0000\u0000\'(\u0005*\u0000\u0000(\b\u0001\u0000\u0000\u0000"+
		")*\u0005%\u0000\u0000*\n\u0001\u0000\u0000\u0000+,\u0005^\u0000\u0000"+
		",\f\u0001\u0000\u0000\u0000-.\u0005/\u0000\u0000.\u000e\u0001\u0000\u0000"+
		"\u0000/0\u0005-\u0000\u00000\u0010\u0001\u0000\u0000\u00001:\u0003\u0013"+
		"\t\u000026\u0003\u0013\t\u000034\u0005-\u0000\u000046\u00050\u0000\u0000"+
		"52\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u000078\u0005.\u0000\u00008:\u0003\u0019\f\u000091\u0001\u0000\u0000"+
		"\u000095\u0001\u0000\u0000\u0000:\u0012\u0001\u0000\u0000\u0000;?\u0003"+
		"\u0015\n\u0000<=\u0005-\u0000\u0000=?\u0003\u0017\u000b\u0000>;\u0001"+
		"\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?\u0014\u0001\u0000\u0000"+
		"\u0000@C\u00050\u0000\u0000AC\u0003\u0017\u000b\u0000B@\u0001\u0000\u0000"+
		"\u0000BA\u0001\u0000\u0000\u0000C\u0016\u0001\u0000\u0000\u0000DH\u0003"+
		"\u001b\r\u0000EG\u0003\u0019\f\u0000FE\u0001\u0000\u0000\u0000GJ\u0001"+
		"\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000"+
		"I\u0018\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KN\u00050\u0000"+
		"\u0000LN\u0003\u001b\r\u0000MK\u0001\u0000\u0000\u0000ML\u0001\u0000\u0000"+
		"\u0000N\u001a\u0001\u0000\u0000\u0000OP\u0007\u0000\u0000\u0000P\u001c"+
		"\u0001\u0000\u0000\u0000QS\u0007\u0001\u0000\u0000RQ\u0001\u0000\u0000"+
		"\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000U\u001e\u0001\u0000\u0000\u0000VX\u0007\u0002\u0000\u0000"+
		"WV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000"+
		"\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0006\u000f"+
		"\u0000\u0000\\ \u0001\u0000\u0000\u0000\t\u000059>BHMTY\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}