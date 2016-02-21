package de.hs.settlers.server;

import de.hs.settlers.server.parser.CommandInterpreter;
import de.hs.settlers.server.parser.textProtocolParser.CommandsContext;
import de.hs.settlers.server.parser.textProtocolLexer;
import de.hs.settlers.server.parser.textProtocolParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;
import java.net.Socket;

/**
 * Created by Mastermarci on 21.02.2016.
 */
public class ClientHandler implements Runnable {
    private Socket clientConnection;
    private BufferedReader reader;
    private BufferedWriter writer;


    @Override
    public void run() {
        try {
            InputStream inputStream = clientConnection.getInputStream();
            OutputStream outputStream = clientConnection.getOutputStream();
            reader = new BufferedReader(new InputStreamReader(inputStream));
            writer = new BufferedWriter(new OutputStreamWriter(outputStream));
            writer.append("SE1 SettlersOfCatan-Server 1.0, Timeout set to 3600000ms");
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (clientConnection.isClosed() == false) {
            try {
                String command = reader.readLine();
                CharStream charStream = new ANTLRInputStream(command);
                textProtocolLexer textProtocolLexer = new textProtocolLexer(charStream);
                CommonTokenStream commonTokenStream = new CommonTokenStream(textProtocolLexer);
                textProtocolParser textProtocolParser = new textProtocolParser(commonTokenStream);
                CommandsContext commands = textProtocolParser.commands();
                CommandInterpreter commandInterpreter = new CommandInterpreter();
                commandInterpreter.visit(commands);
                writer.append(commandInterpreter.getCommandAnswer());
                writer.newLine();
                writer.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public BufferedWriter getWriter() {
        return writer;
    }

    public void setWriter(BufferedWriter writer) {
        this.writer = writer;
    }

    public BufferedReader getReader() {
        return reader;
    }

    public void setReader(BufferedReader reader) {
        this.reader = reader;
    }

    public void setClientConnection(Socket clientConnection) {
        this.clientConnection = clientConnection;
    }
}
