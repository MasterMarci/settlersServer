// Generated from C:/Users/Mastermarci/projects_2016/settlersServer/src/main/java\textProtocol.g4 by ANTLR 4.5.1
 package de.hs.settlers.server.parser; 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class textProtocolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, TEXT=24, NUMBER=25, 
		WHITESPACEFORMESSAGES=26, WHITEDPACE=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "TEXT", "NUMBER", 
		"WHITESPACEFORMESSAGES", "WHITEDPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'LOGIN'", "' '", "'LOGOUT'", "'HELP'", "'LIST'", "'MAPS'", "'USERS'", 
		"'GAMES'", "'CREATE'", "'GAME'", "'maxPlayers'", "'JOIN'", "'-visitor'", 
		"'true'", "'false'", "'ALL'", "'USER'", "'TEAM'", "'UPLOAD'", "'MAP'", 
		"'DOWNLOAD'", "'TESTPLAYER'", "'NOOP'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"TEXT", "NUMBER", "WHITESPACEFORMESSAGES", "WHITEDPACE"
	};
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


	public textProtocolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "textProtocol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u00d5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\6"+
		"\33\u00cb\n\33\r\33\16\33\u00cc\3\34\6\34\u00d0\n\34\r\34\16\34\u00d1"+
		"\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\35\3\2\6\6\2\"\"&&C\\c|\6\2))\60\60\62\62;;\4\2\13\13\"\"\4\2\13"+
		"\f\16\17\u00d6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\3"+
		"9\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\tH\3\2\2\2\13M\3\2\2\2\rR\3\2\2\2\17W"+
		"\3\2\2\2\21]\3\2\2\2\23c\3\2\2\2\25j\3\2\2\2\27o\3\2\2\2\31z\3\2\2\2\33"+
		"\177\3\2\2\2\35\u0088\3\2\2\2\37\u008d\3\2\2\2!\u0093\3\2\2\2#\u0097\3"+
		"\2\2\2%\u009c\3\2\2\2\'\u00a1\3\2\2\2)\u00a8\3\2\2\2+\u00ac\3\2\2\2-\u00b5"+
		"\3\2\2\2/\u00c0\3\2\2\2\61\u00c5\3\2\2\2\63\u00c7\3\2\2\2\65\u00ca\3\2"+
		"\2\2\67\u00cf\3\2\2\29:\7N\2\2:;\7Q\2\2;<\7I\2\2<=\7K\2\2=>\7P\2\2>\4"+
		"\3\2\2\2?@\7\"\2\2@\6\3\2\2\2AB\7N\2\2BC\7Q\2\2CD\7I\2\2DE\7Q\2\2EF\7"+
		"W\2\2FG\7V\2\2G\b\3\2\2\2HI\7J\2\2IJ\7G\2\2JK\7N\2\2KL\7R\2\2L\n\3\2\2"+
		"\2MN\7N\2\2NO\7K\2\2OP\7U\2\2PQ\7V\2\2Q\f\3\2\2\2RS\7O\2\2ST\7C\2\2TU"+
		"\7R\2\2UV\7U\2\2V\16\3\2\2\2WX\7W\2\2XY\7U\2\2YZ\7G\2\2Z[\7T\2\2[\\\7"+
		"U\2\2\\\20\3\2\2\2]^\7I\2\2^_\7C\2\2_`\7O\2\2`a\7G\2\2ab\7U\2\2b\22\3"+
		"\2\2\2cd\7E\2\2de\7T\2\2ef\7G\2\2fg\7C\2\2gh\7V\2\2hi\7G\2\2i\24\3\2\2"+
		"\2jk\7I\2\2kl\7C\2\2lm\7O\2\2mn\7G\2\2n\26\3\2\2\2op\7o\2\2pq\7c\2\2q"+
		"r\7z\2\2rs\7R\2\2st\7n\2\2tu\7c\2\2uv\7{\2\2vw\7g\2\2wx\7t\2\2xy\7u\2"+
		"\2y\30\3\2\2\2z{\7L\2\2{|\7Q\2\2|}\7K\2\2}~\7P\2\2~\32\3\2\2\2\177\u0080"+
		"\7/\2\2\u0080\u0081\7x\2\2\u0081\u0082\7k\2\2\u0082\u0083\7u\2\2\u0083"+
		"\u0084\7k\2\2\u0084\u0085\7v\2\2\u0085\u0086\7q\2\2\u0086\u0087\7t\2\2"+
		"\u0087\34\3\2\2\2\u0088\u0089\7v\2\2\u0089\u008a\7t\2\2\u008a\u008b\7"+
		"w\2\2\u008b\u008c\7g\2\2\u008c\36\3\2\2\2\u008d\u008e\7h\2\2\u008e\u008f"+
		"\7c\2\2\u008f\u0090\7n\2\2\u0090\u0091\7u\2\2\u0091\u0092\7g\2\2\u0092"+
		" \3\2\2\2\u0093\u0094\7C\2\2\u0094\u0095\7N\2\2\u0095\u0096\7N\2\2\u0096"+
		"\"\3\2\2\2\u0097\u0098\7W\2\2\u0098\u0099\7U\2\2\u0099\u009a\7G\2\2\u009a"+
		"\u009b\7T\2\2\u009b$\3\2\2\2\u009c\u009d\7V\2\2\u009d\u009e\7G\2\2\u009e"+
		"\u009f\7C\2\2\u009f\u00a0\7O\2\2\u00a0&\3\2\2\2\u00a1\u00a2\7W\2\2\u00a2"+
		"\u00a3\7R\2\2\u00a3\u00a4\7N\2\2\u00a4\u00a5\7Q\2\2\u00a5\u00a6\7C\2\2"+
		"\u00a6\u00a7\7F\2\2\u00a7(\3\2\2\2\u00a8\u00a9\7O\2\2\u00a9\u00aa\7C\2"+
		"\2\u00aa\u00ab\7R\2\2\u00ab*\3\2\2\2\u00ac\u00ad\7F\2\2\u00ad\u00ae\7"+
		"Q\2\2\u00ae\u00af\7Y\2\2\u00af\u00b0\7P\2\2\u00b0\u00b1\7N\2\2\u00b1\u00b2"+
		"\7Q\2\2\u00b2\u00b3\7C\2\2\u00b3\u00b4\7F\2\2\u00b4,\3\2\2\2\u00b5\u00b6"+
		"\7V\2\2\u00b6\u00b7\7G\2\2\u00b7\u00b8\7U\2\2\u00b8\u00b9\7V\2\2\u00b9"+
		"\u00ba\7R\2\2\u00ba\u00bb\7N\2\2\u00bb\u00bc\7C\2\2\u00bc\u00bd\7[\2\2"+
		"\u00bd\u00be\7G\2\2\u00be\u00bf\7T\2\2\u00bf.\3\2\2\2\u00c0\u00c1\7P\2"+
		"\2\u00c1\u00c2\7Q\2\2\u00c2\u00c3\7Q\2\2\u00c3\u00c4\7R\2\2\u00c4\60\3"+
		"\2\2\2\u00c5\u00c6\t\2\2\2\u00c6\62\3\2\2\2\u00c7\u00c8\t\3\2\2\u00c8"+
		"\64\3\2\2\2\u00c9\u00cb\t\4\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2"+
		"\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\66\3\2\2\2\u00ce\u00d0"+
		"\t\5\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\b\34\2\2\u00d48\3\2\2\2"+
		"\5\2\u00cc\u00d1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}