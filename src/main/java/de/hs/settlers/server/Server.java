package de.hs.settlers.server;

import de.hs.settlers.server.datamodel.UserDatabase;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Mastermarci on 20.02.2016.
 */
public class Server {


    private static int port = 4242;

    public static Logger generalLogging = Logger.getLogger("GENERAL");
    private static boolean isShutdown = false;

    public static final UserDatabase USER_DATABASE = new UserDatabase();

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            generalLogging.log(Level.SEVERE, "Could not start Server on port " + port, e);
            System.exit(1);
        }

        while( isShutdown == false) {
            try {
                // TODO handle connections properly
                Socket accept = serverSocket.accept();
                ClientHandler clientHandler = new ClientHandler();
                clientHandler.setClientConnection(accept);
                new Thread(clientHandler).start();


            } catch (IOException e) {
                generalLogging.log(Level.WARNING, "Could not establish connnection with client", e);
            }
        }
    }
}
