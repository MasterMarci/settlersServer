// Generated from C:/Users/Mastermarci/projects_2016/settlersServer/src/main/java\textProtocol.g4 by ANTLR 4.5.1
 package de.hs.settlers.server.parser; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link textProtocolParser}.
 */
public interface textProtocolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link textProtocolParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(textProtocolParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link textProtocolParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(textProtocolParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link textProtocolParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(textProtocolParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link textProtocolParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(textProtocolParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link textProtocolParser#login}.
	 * @param ctx the parse tree
	 */
	void enterLogin(textProtocolParser.LoginContext ctx);
	/**
	 * Exit a parse tree produced by {@link textProtocolParser#login}.
	 * @param ctx the parse tree
	 */
	void exitLogin(textProtocolParser.LoginContext ctx);
	/**
	 * Enter a parse tree produced by {@link textProtocolParser#logout}.
	 * @param ctx the parse tree
	 */
	void enterLogout(textProtocolParser.LogoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link textProtocolParser#logout}.
	 * @param ctx the parse tree
	 */
	void exitLogout(textProtocolParser.LogoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link textProtocolParser#help}.
	 * @param ctx the parse tree
	 */
	void enterHelp(textProtocolParser.HelpContext ctx);
	/**
	 * Exit a parse tree produced by {@link textProtocolParser#help}.
	 * @param ctx the parse tree
	 */
	void exitHelp(textProtocolParser.HelpContext ctx);
	/**
	 * Enter a parse tree produced by {@link textProtocolParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(textProtocolParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link textProtocolParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(textProtocolParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link textProtocolParser#createGame}.
	 * @param ctx the parse tree
	 */
	void enterCreateGame(textProtocolParser.CreateGameContext ctx);
	/**
	 * Exit a parse tree produced by {@link textProtocolParser#createGame}.
	 * @param ctx the parse tree
	 */
	void exitCreateGame(textProtocolParser.CreateGameContext ctx);
	/**
	 * Enter a parse tree produced by {@link textProtocolParser#joinGame}.
	 * @param ctx the parse tree
	 */
	void enterJoinGame(textProtocolParser.JoinGameContext ctx);
	/**
	 * Exit a parse tree produced by {@link textProtocolParser#joinGame}.
	 * @param ctx the parse tree
	 */
	void exitJoinGame(textProtocolParser.JoinGameContext ctx);
	/**
	 * Enter a parse tree produced by {@link textProtocolParser#msg}.
	 * @param ctx the parse tree
	 */
	void enterMsg(textProtocolParser.MsgContext ctx);
	/**
	 * Exit a parse tree produced by {@link textProtocolParser#msg}.
	 * @param ctx the parse tree
	 */
	void exitMsg(textProtocolParser.MsgContext ctx);
	/**
	 * Enter a parse tree produced by {@link textProtocolParser#uploadMap}.
	 * @param ctx the parse tree
	 */
	void enterUploadMap(textProtocolParser.UploadMapContext ctx);
	/**
	 * Exit a parse tree produced by {@link textProtocolParser#uploadMap}.
	 * @param ctx the parse tree
	 */
	void exitUploadMap(textProtocolParser.UploadMapContext ctx);
	/**
	 * Enter a parse tree produced by {@link textProtocolParser#downloadMap}.
	 * @param ctx the parse tree
	 */
	void enterDownloadMap(textProtocolParser.DownloadMapContext ctx);
	/**
	 * Exit a parse tree produced by {@link textProtocolParser#downloadMap}.
	 * @param ctx the parse tree
	 */
	void exitDownloadMap(textProtocolParser.DownloadMapContext ctx);
	/**
	 * Enter a parse tree produced by {@link textProtocolParser#createTestplayer}.
	 * @param ctx the parse tree
	 */
	void enterCreateTestplayer(textProtocolParser.CreateTestplayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link textProtocolParser#createTestplayer}.
	 * @param ctx the parse tree
	 */
	void exitCreateTestplayer(textProtocolParser.CreateTestplayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link textProtocolParser#noop}.
	 * @param ctx the parse tree
	 */
	void enterNoop(textProtocolParser.NoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link textProtocolParser#noop}.
	 * @param ctx the parse tree
	 */
	void exitNoop(textProtocolParser.NoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link textProtocolParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(textProtocolParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link textProtocolParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(textProtocolParser.IdentifierContext ctx);
}