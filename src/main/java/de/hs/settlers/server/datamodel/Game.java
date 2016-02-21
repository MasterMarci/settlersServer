package de.hs.settlers.server.datamodel;

import java.util.List;

/**
 * Created by Mastermarci on 21.02.2016.
 */
public class Game {
    private String name;
    private int maxPlayers;
    private List<User> playerList;
    private List<User> visitorList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public List<User> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<User> playerList) {
        this.playerList = playerList;
    }

    public List<User> getVisitorList() {
        return visitorList;
    }

    public void setVisitorList(List<User> visitorList) {
        this.visitorList = visitorList;
    }
}
