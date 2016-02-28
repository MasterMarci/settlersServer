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
		T__17=18, T__18=19, T__19=20, UPLOADMAP=21, LOGOUT=22, NOOP=23, TEXT=24, 
		NUMBER=25, WHITEDPACE=26;
	public static final int
		RULE_command = 0, RULE_login = 1, RULE_help = 2, RULE_list = 3, RULE_createGame = 4, 
		RULE_joinGame = 5, RULE_msg = 6, RULE_downloadMap = 7, RULE_createTestplayer = 8, 
		RULE_pwd = 9, RULE_identifier = 10;
	public static final String[] ruleNames = {
		"command", "login", "help", "list", "createGame", "joinGame", "msg", "downloadMap", 
		"createTestplayer", "pwd", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'LOGIN'", "' '", "'HELP'", "'LIST'", "'MAPS'", "'USERS'", "'GAMES'", 
		"'CREATE'", "'GAME'", "'maxPlayers'", "'JOIN'", "'-visitor'", "'true'", 
		"'false'", "'ALL'", "'USER'", "'TEAM'", "'DOWNLOAD'", "'MAP'", "'TESTPLAYER'", 
		null, "'LOGOUT'", "'NOOP'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "UPLOADMAP", "LOGOUT", 
		"NOOP", "TEXT", "NUMBER", "WHITEDPACE"
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
	public static class CommandContext extends ParserRuleContext {
		public HelpContext help() {
			return getRuleContext(HelpContext.class,0);
		}
		public LoginContext login() {
			return getRuleContext(LoginContext.class,0);
		}
		public TerminalNode LOGOUT() { return getToken(textProtocolParser.LOGOUT, 0); }
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
		public TerminalNode UPLOADMAP() { return getToken(textProtocolParser.UPLOADMAP, 0); }
		public DownloadMapContext downloadMap() {
			return getRuleContext(DownloadMapContext.class,0);
		}
		public CreateTestplayerContext createTestplayer() {
			return getRuleContext(CreateTestplayerContext.class,0);
		}
		public TerminalNode NOOP() { return getToken(textProtocolParser.NOOP, 0); }
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
		enterRule(_localctx, 0, RULE_command);
		try {
			setState(33);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				help();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				login();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				match(LOGOUT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(25);
				list();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(26);
				createGame();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(27);
				joinGame();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(28);
				msg();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(29);
				match(UPLOADMAP);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(30);
				downloadMap();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(31);
				createTestplayer();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(32);
				match(NOOP);
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
		public PwdContext password;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PwdContext pwd() {
			return getRuleContext(PwdContext.class,0);
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
		enterRule(_localctx, 2, RULE_login);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__0);
			setState(36);
			match(T__1);
			setState(37);
			((LoginContext)_localctx).username = identifier();
			setState(38);
			match(T__1);
			setState(39);
			((LoginContext)_localctx).password = pwd();
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
		enterRule(_localctx, 4, RULE_help);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__2);
			setState(42);
			match(T__1);
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				((HelpContext)_localctx).infoFor = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TEXT || _la==NUMBER) ) {
					((HelpContext)_localctx).infoFor = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(46); 
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
		enterRule(_localctx, 6, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__3);
			setState(49);
			match(T__1);
			setState(50);
			((ListContext)_localctx).listOption = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
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
		enterRule(_localctx, 8, RULE_createGame);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__7);
			setState(53);
			match(T__1);
			setState(54);
			match(T__8);
			setState(55);
			((CreateGameContext)_localctx).gameName = identifier();
			setState(56);
			match(T__9);
			setState(57);
			match(T__1);
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				((CreateGameContext)_localctx).maxPlayers = match(NUMBER);
				}
				}
				setState(61); 
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
		enterRule(_localctx, 10, RULE_joinGame);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__10);
			setState(64);
			match(T__1);
			setState(65);
			match(T__8);
			setState(66);
			((JoinGameContext)_localctx).gameName = identifier();
			setState(69);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(67);
				match(T__11);
				setState(68);
				((JoinGameContext)_localctx).joinedAsVisitor = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
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
		enterRule(_localctx, 12, RULE_msg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(71);
				((MsgContext)_localctx).allChannel = match(T__14);
				}
				break;
			case T__15:
			case T__16:
				{
				{
				setState(72);
				((MsgContext)_localctx).channelType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
					((MsgContext)_localctx).channelType = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(73);
				match(T__1);
				setState(74);
				((MsgContext)_localctx).recipient = identifier();
				}
				setState(76);
				match(T__1);
				}
				break;
			case T__1:
			case TEXT:
			case NUMBER:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				((MsgContext)_localctx).message = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << TEXT) | (1L << NUMBER))) != 0)) ) {
					((MsgContext)_localctx).message = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << TEXT) | (1L << NUMBER))) != 0) );
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
		enterRule(_localctx, 14, RULE_downloadMap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__17);
			setState(86);
			match(T__1);
			setState(87);
			match(T__18);
			setState(88);
			match(T__1);
			setState(89);
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
		enterRule(_localctx, 16, RULE_createTestplayer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__7);
			setState(92);
			match(T__1);
			setState(93);
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

	public static class PwdContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(textProtocolParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(textProtocolParser.TEXT, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(textProtocolParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(textProtocolParser.NUMBER, i);
		}
		public PwdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pwd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).enterPwd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof textProtocolListener ) ((textProtocolListener)listener).exitPwd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof textProtocolVisitor ) return ((textProtocolVisitor<? extends T>)visitor).visitPwd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PwdContext pwd() throws RecognitionException {
		PwdContext _localctx = new PwdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pwd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(95);
				_la = _input.LA(1);
				if ( !(_la==TEXT || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(98); 
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
		enterRule(_localctx, 20, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(TEXT);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT || _la==NUMBER) {
				{
				{
				setState(101);
				_la = _input.LA(1);
				if ( !(_la==TEXT || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(106);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34n\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2$\n\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\6\4/\n\4\r\4\16\4\60\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\6\6>\n\6\r\6\16\6?\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"H\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bQ\n\b\3\b\6\bT\n\b\r\b\16\bU\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\6\13c\n\13\r\13\16\13d\3\f\3"+
		"\f\7\fi\n\f\f\f\16\fl\13\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\7\3"+
		"\2\32\33\3\2\7\t\3\2\17\20\3\2\22\23\4\2\4\4\32\33t\2#\3\2\2\2\4%\3\2"+
		"\2\2\6+\3\2\2\2\b\62\3\2\2\2\n\66\3\2\2\2\fA\3\2\2\2\16P\3\2\2\2\20W\3"+
		"\2\2\2\22]\3\2\2\2\24b\3\2\2\2\26f\3\2\2\2\30$\5\6\4\2\31$\5\4\3\2\32"+
		"$\7\30\2\2\33$\5\b\5\2\34$\5\n\6\2\35$\5\f\7\2\36$\5\16\b\2\37$\7\27\2"+
		"\2 $\5\20\t\2!$\5\22\n\2\"$\7\31\2\2#\30\3\2\2\2#\31\3\2\2\2#\32\3\2\2"+
		"\2#\33\3\2\2\2#\34\3\2\2\2#\35\3\2\2\2#\36\3\2\2\2#\37\3\2\2\2# \3\2\2"+
		"\2#!\3\2\2\2#\"\3\2\2\2$\3\3\2\2\2%&\7\3\2\2&\'\7\4\2\2\'(\5\26\f\2()"+
		"\7\4\2\2)*\5\24\13\2*\5\3\2\2\2+,\7\5\2\2,.\7\4\2\2-/\t\2\2\2.-\3\2\2"+
		"\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\7\3\2\2\2\62\63\7\6\2\2\63"+
		"\64\7\4\2\2\64\65\t\3\2\2\65\t\3\2\2\2\66\67\7\n\2\2\678\7\4\2\289\7\13"+
		"\2\29:\5\26\f\2:;\7\f\2\2;=\7\4\2\2<>\7\33\2\2=<\3\2\2\2>?\3\2\2\2?=\3"+
		"\2\2\2?@\3\2\2\2@\13\3\2\2\2AB\7\r\2\2BC\7\4\2\2CD\7\13\2\2DG\5\26\f\2"+
		"EF\7\16\2\2FH\t\4\2\2GE\3\2\2\2GH\3\2\2\2H\r\3\2\2\2IQ\7\21\2\2JK\t\5"+
		"\2\2KL\7\4\2\2LM\5\26\f\2MN\3\2\2\2NO\7\4\2\2OQ\3\2\2\2PI\3\2\2\2PJ\3"+
		"\2\2\2PQ\3\2\2\2QS\3\2\2\2RT\t\6\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3"+
		"\2\2\2V\17\3\2\2\2WX\7\24\2\2XY\7\4\2\2YZ\7\25\2\2Z[\7\4\2\2[\\\5\26\f"+
		"\2\\\21\3\2\2\2]^\7\n\2\2^_\7\4\2\2_`\7\26\2\2`\23\3\2\2\2ac\t\2\2\2b"+
		"a\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2e\25\3\2\2\2fj\7\32\2\2gi\t\2\2"+
		"\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\27\3\2\2\2lj\3\2\2\2\n#\60"+
		"?GPUdj";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}