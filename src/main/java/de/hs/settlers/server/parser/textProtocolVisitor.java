// Generated from C:/Users/Mastermarci/projects_2016/settlersServer/src/main/java\textProtocol.g4 by ANTLR 4.5.1
 package de.hs.settlers.server.parser; 
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link textProtocolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface textProtocolVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link textProtocolParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(textProtocolParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link textProtocolParser#login}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogin(textProtocolParser.LoginContext ctx);
	/**
	 * Visit a parse tree produced by {@link textProtocolParser#help}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelp(textProtocolParser.HelpContext ctx);
	/**
	 * Visit a parse tree produced by {@link textProtocolParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(textProtocolParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link textProtocolParser#createGame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateGame(textProtocolParser.CreateGameContext ctx);
	/**
	 * Visit a parse tree produced by {@link textProtocolParser#joinGame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinGame(textProtocolParser.JoinGameContext ctx);
	/**
	 * Visit a parse tree produced by {@link textProtocolParser#msg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMsg(textProtocolParser.MsgContext ctx);
	/**
	 * Visit a parse tree produced by {@link textProtocolParser#downloadMap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDownloadMap(textProtocolParser.DownloadMapContext ctx);
	/**
	 * Visit a parse tree produced by {@link textProtocolParser#createTestplayer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTestplayer(textProtocolParser.CreateTestplayerContext ctx);
	/**
	 * Visit a parse tree produced by {@link textProtocolParser#pwd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPwd(textProtocolParser.PwdContext ctx);
	/**
	 * Visit a parse tree produced by {@link textProtocolParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(textProtocolParser.IdentifierContext ctx);
}