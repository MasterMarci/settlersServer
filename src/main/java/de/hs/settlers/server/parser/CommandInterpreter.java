package de.hs.settlers.server.parser;

import de.hs.settlers.server.Server;
import de.hs.settlers.server.datamodel.User;
import org.antlr.v4.runtime.Token;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Mastermarci on 21.02.2016.
 */
public class CommandInterpreter extends textProtocolBaseVisitor {

    private String commandAnswer;

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

    @Override
    public Object visitLogin(textProtocolParser.LoginContext ctx) {
        String userName = ctx.username.getText();
        String password = ctx.password.getText();
        User user = Server.USER_DATABASE.findUser(userName);

        if (user != null && user.getPassword().equals(password)) {
            // TODO get rid of email or incorporat it into the datamodel
            commandAnswer ="USER NICK=" + userName + " EMAIL=" + userName + "@xy.de " + "ROLE=Student"
                            + "\nTEAM NAME=SE ID=3fb6101e\nOK";

            return null;
        }

        commandAnswer = "LOGIN FAILED";
        return null;
    }

    @Override
    public Object visitCommand(textProtocolParser.CommandContext ctx) {
        if(ctx.NOOP() != null) {
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
