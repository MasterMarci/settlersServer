package de.hs.settlers.server.parser;

import de.hs.settlers.server.Server;
import de.hs.settlers.server.datamodel.generated.Game;
import de.hs.settlers.server.datamodel.generated.Player;

/**
 * Created by Mastermarci on 21.02.2016.
 */
public class CommandInterpreter extends textProtocolBaseVisitor {

    private String commandAnswer;
    public static final String LIST_MAPS_OPTION = "MAPS";
    public static final String LIST_USERS_OPTION = "USERS";
    public static final String LIST_GAMES_OPTION = "GAMES";

    @Override
    public Object visitHelp(textProtocolParser.HelpContext ctx) {

        String helpText = "Available commands after greeting: LOGIN, LOGOUT\r\n" +
                            "User commands: ID, LIST USERS\r\n" +
                            "Game management: LIST MAPS, CREATE GAME, LIST GAMES, JOIN GAME, UPLOAD MAP, DOWNLOAD MAP\r\n" +
                            "Team management: LIST TEAMS\r\n" +
                            "Other commands: CREATE TESTPLAYER, MSG, CHANGELOG, UPLOAD MAP, NOOP, HELP\r\n" +
                            "send 'HELP <command>' for details\r\n" +
                            "a successfull command will be acknowledged with an 'OK' line\r\n" +
                            "an unsuccessfull command will be acknowledged with an 'ERROR' line";

        commandAnswer = helpText;
        return null;
    }


    // TODO get a real session
    @Override
    public Object visitLogin(textProtocolParser.LoginContext ctx) {
        String userName = ctx.username.getText();
        String password = ctx.password.getText();
        Player user = Server.USER_DATABASE.hasName(userName).first();

        if (user != null && user.getPassword().equals(password)) {
            // TODO get rid of email or incorporat it into the datamodel
            commandAnswer ="USER NICK=" + userName + " EMAIL=" + userName + "@xy.de " + "ROLE=Student"
                            + "\nTEAM NAME=SE ID=3fb6101e\nOK";

            return null;
        }

        commandAnswer = "ERROR";
        return null;
    }

    @Override
    public Object visitList(textProtocolParser.ListContext ctx) {
        switch(ctx.listOption.getText()) {
            case LIST_GAMES_OPTION:
                String gameList = "";
                for (Game game : Server.GAME_MANAGER.getGames()) {
                    String playerInfo = game.getPlayers().size() + "/" + game.getMaxPlayers();
                    gameList += "GAME NAME=" + game.getName() + "EVENTS=0" + "MAPNAME="
                            + game.getMap().getName() + "PLAYERS=" + playerInfo + "STATUS=JOINING TESTGAME=false";
                }
                commandAnswer = gameList;
                break;
        }
        return super.visitList(ctx);
    }

    @Override
    public Object visitCommand(textProtocolParser.CommandContext ctx) {
        // just send ok for noop and logout. this allows logout without being logged in, maybe should be changed later.
        if(ctx.NOOP() != null || ctx.LOGOUT() != null) {
            commandAnswer = "OK";
            return null;
        }
        return super.visitCommand(ctx);
    }

    public String getCommandAnswer() {
        return commandAnswer;
    }

    public void setCommandAnswer(String commandAnswer) {
        this.commandAnswer = commandAnswer;
    }
}
