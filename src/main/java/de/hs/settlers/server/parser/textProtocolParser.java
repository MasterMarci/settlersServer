// Generated from C:/Users/Mastermarci/projects_2016/settlersServer/src/main/java\textProtocol.g4 by ANTLR 4.5.1
 package de.hs.settlers.server.parser; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class textProtocolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, TEXT=24, NUMBER=25, 
		WHITESPACEFORMESSAGES=26, WHITEDPACE=27;
	public static final int
		RULE_commands = 0, RULE_command = 1, RULE_login = 2, RULE_logout = 3, 
		RULE_help = 4, RULE_list = 5, RULE_createGame = 6, RULE_joinGame = 7, 
		RULE_msg = 8, RULE_uploadMap = 9, RULE_downloadMap = 10, RULE_createTestplayer = 11, 
		RULE_noop = 12, RULE_identifier = 13;
	public static final String[] ruleNames = {
		"commands", "command", "login", "logout", "help", "list", "createGame", 
		"joinGame", "msg", "uploadMap", "downloadMap", "createTestplayer", "noop", 
		"identifier"
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

	@Override
	public String getGrammarFileName() { return "textProtocol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public textProtocolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CommandsContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).exitCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof textProtocolVisitor ) return ((textProtocolVisitor<? extends T>)visitor).visitCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_commands);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			command();
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

	public static class CommandContext extends ParserRuleContext {
		public HelpContext help() {
			return getRuleContext(HelpContext.class,0);
		}
		public LoginContext login() {
			return getRuleContext(LoginContext.class,0);
		}
		public LogoutContext logout() {
			return getRuleContext(LogoutContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public CreateGameContext createGame() {
			return getRuleContext(CreateGameContext.class,0);
		}
		public JoinGameContext joinGame() {
			return getRuleContext(JoinGameContext.class,0);
		}
		public MsgContext msg() {
			return getRuleContext(MsgContext.class,0);
		}
		public UploadMapContext uploadMap() {
			return getRuleContext(UploadMapContext.class,0);
		}
		public DownloadMapContext downloadMap() {
			return getRuleContext(DownloadMapContext.class,0);
		}
		public CreateTestplayerContext createTestplayer() {
			return getRuleContext(CreateTestplayerContext.class,0);
		}
		public NoopContext noop() {
			return getRuleContext(NoopContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof textProtocolVisitor ) return ((textProtocolVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(41);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				help();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				login();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				logout();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				list();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(34);
				createGame();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(35);
				joinGame();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(36);
				msg();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(37);
				uploadMap();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(38);
				downloadMap();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(39);
				createTestplayer();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(40);
				noop();
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

	public static class LoginContext extends ParserRuleContext {
		public IdentifierContext username;
		public Token password;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> TEXT() { return getTokens(textProtocolParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(textProtocolParser.TEXT, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(textProtocolParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(textProtocolParser.NUMBER, i);
		}
		public LoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_login; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).enterLogin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).exitLogin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof textProtocolVisitor ) return ((textProtocolVisitor<? extends T>)visitor).visitLogin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoginContext login() throws RecognitionException {
		LoginContext _localctx = new LoginContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_login);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__0);
			setState(44);
			match(T__1);
			setState(45);
			((LoginContext)_localctx).username = identifier();
			setState(46);
			match(T__1);
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47);
				((LoginContext)_localctx).password = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TEXT || _la==NUMBER) ) {
					((LoginContext)_localctx).password = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT || _la==NUMBER );
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

	public static class LogoutContext extends ParserRuleContext {
		public LogoutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logout; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).enterLogout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).exitLogout(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof textProtocolVisitor ) return ((textProtocolVisitor<? extends T>)visitor).visitLogout(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogoutContext logout() throws RecognitionException {
		LogoutContext _localctx = new LogoutContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_logout);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__2);
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

	public static class HelpContext extends ParserRuleContext {
		public Token infoFor;
		public List<TerminalNode> TEXT() { return getTokens(textProtocolParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(textProtocolParser.TEXT, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(textProtocolParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(textProtocolParser.NUMBER, i);
		}
		public HelpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_help; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).enterHelp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).exitHelp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof textProtocolVisitor ) return ((textProtocolVisitor<? extends T>)visitor).visitHelp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HelpContext help() throws RecognitionException {
		HelpContext _localctx = new HelpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_help);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__3);
			setState(55);
			match(T__1);
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				((HelpContext)_localctx).infoFor = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TEXT || _la==NUMBER) ) {
					((HelpContext)_localctx).infoFor = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT || _la==NUMBER );
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
		public Token listOption;
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof textProtocolVisitor ) return ((textProtocolVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__4);
			setState(62);
			match(T__1);
			setState(63);
			((ListContext)_localctx).listOption = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
				((ListContext)_localctx).listOption = (Token)_errHandler.recoverInline(this);
			} else {
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

	public static class CreateGameContext extends ParserRuleContext {
		public IdentifierContext gameName;
		public Token maxPlayers;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> NUMBER() { return getTokens(textProtocolParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(textProtocolParser.NUMBER, i);
		}
		public CreateGameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createGame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).enterCreateGame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).exitCreateGame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof textProtocolVisitor ) return ((textProtocolVisitor<? extends T>)visitor).visitCreateGame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateGameContext createGame() throws RecognitionException {
		CreateGameContext _localctx = new CreateGameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_createGame);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__8);
			setState(66);
			match(T__1);
			setState(67);
			match(T__9);
			setState(68);
			((CreateGameContext)_localctx).gameName = identifier();
			setState(69);
			match(T__10);
			setState(70);
			match(T__1);
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				((CreateGameContext)_localctx).maxPlayers = match(NUMBER);
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
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

	public static class JoinGameContext extends ParserRuleContext {
		public IdentifierContext gameName;
		public Token joinedAsVisitor;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public JoinGameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinGame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).enterJoinGame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).exitJoinGame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof textProtocolVisitor ) return ((textProtocolVisitor<? extends T>)visitor).visitJoinGame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinGameContext joinGame() throws RecognitionException {
		JoinGameContext _localctx = new JoinGameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_joinGame);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__11);
			setState(77);
			match(T__1);
			setState(78);
			match(T__9);
			setState(79);
			((JoinGameContext)_localctx).gameName = identifier();
			setState(82);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(80);
				match(T__12);
				setState(81);
				((JoinGameContext)_localctx).joinedAsVisitor = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==T__14) ) {
					((JoinGameContext)_localctx).joinedAsVisitor = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
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

	public static class MsgContext extends ParserRuleContext {
		public Token allChannel;
		public Token channelType;
		public IdentifierContext recipient;
		public Token message;
		public List<TerminalNode> TEXT() { return getTokens(textProtocolParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(textProtocolParser.TEXT, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(textProtocolParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(textProtocolParser.NUMBER, i);
		}
		public List<TerminalNode> WHITESPACEFORMESSAGES() { return getTokens(textProtocolParser.WHITESPACEFORMESSAGES); }
		public TerminalNode WHITESPACEFORMESSAGES(int i) {
			return getToken(textProtocolParser.WHITESPACEFORMESSAGES, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MsgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).enterMsg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).exitMsg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof textProtocolVisitor ) return ((textProtocolVisitor<? extends T>)visitor).visitMsg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MsgContext msg() throws RecognitionException {
		MsgContext _localctx = new MsgContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_msg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			switch (_input.LA(1)) {
			case T__15:
				{
				setState(84);
				((MsgContext)_localctx).allChannel = match(T__15);
				}
				break;
			case T__16:
			case T__17:
				{
				{
				setState(85);
				((MsgContext)_localctx).channelType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
					((MsgContext)_localctx).channelType = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(86);
				match(T__1);
				setState(87);
				((MsgContext)_localctx).recipient = identifier();
				}
				setState(89);
				match(T__1);
				}
				break;
			case TEXT:
			case NUMBER:
			case WHITESPACEFORMESSAGES:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(93);
				((MsgContext)_localctx).message = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << NUMBER) | (1L << WHITESPACEFORMESSAGES))) != 0)) ) {
					((MsgContext)_localctx).message = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << NUMBER) | (1L << WHITESPACEFORMESSAGES))) != 0) );
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

	public static class UploadMapContext extends ParserRuleContext {
		public UploadMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uploadMap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).enterUploadMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).exitUploadMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof textProtocolVisitor ) return ((textProtocolVisitor<? extends T>)visitor).visitUploadMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UploadMapContext uploadMap() throws RecognitionException {
		UploadMapContext _localctx = new UploadMapContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_uploadMap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__18);
			setState(99);
			match(T__1);
			setState(100);
			match(T__19);
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

	public static class DownloadMapContext extends ParserRuleContext {
		public IdentifierContext mapName;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DownloadMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_downloadMap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).enterDownloadMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).exitDownloadMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof textProtocolVisitor ) return ((textProtocolVisitor<? extends T>)visitor).visitDownloadMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DownloadMapContext downloadMap() throws RecognitionException {
		DownloadMapContext _localctx = new DownloadMapContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_downloadMap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__20);
			setState(103);
			match(T__1);
			setState(104);
			match(T__19);
			setState(105);
			match(T__1);
			setState(106);
			((DownloadMapContext)_localctx).mapName = identifier();
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

	public static class CreateTestplayerContext extends ParserRuleContext {
		public CreateTestplayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTestplayer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).enterCreateTestplayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).exitCreateTestplayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof textProtocolVisitor ) return ((textProtocolVisitor<? extends T>)visitor).visitCreateTestplayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTestplayerContext createTestplayer() throws RecognitionException {
		CreateTestplayerContext _localctx = new CreateTestplayerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_createTestplayer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__8);
			setState(109);
			match(T__1);
			setState(110);
			match(T__21);
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

	public static class NoopContext extends ParserRuleContext {
		public NoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).enterNoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).exitNoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof textProtocolVisitor ) return ((textProtocolVisitor<? extends T>)visitor).visitNoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoopContext noop() throws RecognitionException {
		NoopContext _localctx = new NoopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_noop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__22);
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

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(textProtocolParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(textProtocolParser.TEXT, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(textProtocolParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(textProtocolParser.NUMBER, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof textProtocolVisitor ) return ((textProtocolVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(TEXT);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT || _la==NUMBER) {
				{
				{
				setState(115);
				_la = _input.LA(1);
				if ( !(_la==TEXT || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(120);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35|\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\4\6\4\63\n\4\r\4\16\4\64\3"+
		"\5\3\5\3\6\3\6\3\6\6\6<\n\6\r\6\16\6=\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\6\bK\n\b\r\b\16\bL\3\t\3\t\3\t\3\t\3\t\3\t\5\tU\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n^\n\n\3\n\6\na\n\n\r\n\16\nb\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\7\17"+
		"w\n\17\f\17\16\17z\13\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\2\7\3\2\32\33\3\2\b\n\3\2\20\21\3\2\23\24\3\2\32\34\177\2\36\3\2\2"+
		"\2\4+\3\2\2\2\6-\3\2\2\2\b\66\3\2\2\2\n8\3\2\2\2\f?\3\2\2\2\16C\3\2\2"+
		"\2\20N\3\2\2\2\22]\3\2\2\2\24d\3\2\2\2\26h\3\2\2\2\30n\3\2\2\2\32r\3\2"+
		"\2\2\34t\3\2\2\2\36\37\5\4\3\2\37\3\3\2\2\2 ,\5\n\6\2!,\5\6\4\2\",\5\b"+
		"\5\2#,\5\f\7\2$,\5\16\b\2%,\5\20\t\2&,\5\22\n\2\',\5\24\13\2(,\5\26\f"+
		"\2),\5\30\r\2*,\5\32\16\2+ \3\2\2\2+!\3\2\2\2+\"\3\2\2\2+#\3\2\2\2+$\3"+
		"\2\2\2+%\3\2\2\2+&\3\2\2\2+\'\3\2\2\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\5"+
		"\3\2\2\2-.\7\3\2\2./\7\4\2\2/\60\5\34\17\2\60\62\7\4\2\2\61\63\t\2\2\2"+
		"\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\7\3\2\2\2"+
		"\66\67\7\5\2\2\67\t\3\2\2\289\7\6\2\29;\7\4\2\2:<\t\2\2\2;:\3\2\2\2<="+
		"\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\13\3\2\2\2?@\7\7\2\2@A\7\4\2\2AB\t\3\2\2"+
		"B\r\3\2\2\2CD\7\13\2\2DE\7\4\2\2EF\7\f\2\2FG\5\34\17\2GH\7\r\2\2HJ\7\4"+
		"\2\2IK\7\33\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\17\3\2\2\2NO"+
		"\7\16\2\2OP\7\4\2\2PQ\7\f\2\2QT\5\34\17\2RS\7\17\2\2SU\t\4\2\2TR\3\2\2"+
		"\2TU\3\2\2\2U\21\3\2\2\2V^\7\22\2\2WX\t\5\2\2XY\7\4\2\2YZ\5\34\17\2Z["+
		"\3\2\2\2[\\\7\4\2\2\\^\3\2\2\2]V\3\2\2\2]W\3\2\2\2]^\3\2\2\2^`\3\2\2\2"+
		"_a\t\6\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\23\3\2\2\2de\7\25"+
		"\2\2ef\7\4\2\2fg\7\26\2\2g\25\3\2\2\2hi\7\27\2\2ij\7\4\2\2jk\7\26\2\2"+
		"kl\7\4\2\2lm\5\34\17\2m\27\3\2\2\2no\7\13\2\2op\7\4\2\2pq\7\30\2\2q\31"+
		"\3\2\2\2rs\7\31\2\2s\33\3\2\2\2tx\7\32\2\2uw\t\2\2\2vu\3\2\2\2wz\3\2\2"+
		"\2xv\3\2\2\2xy\3\2\2\2y\35\3\2\2\2zx\3\2\2\2\n+\64=LT]bx";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}