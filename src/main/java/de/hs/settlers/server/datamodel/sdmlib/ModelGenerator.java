package de.hs.settlers.server.datamodel.sdmlib;

import org.sdmlib.models.classes.*;

/**
 * Created by Mastermarci on 03.04.2016.
 */
public class ModelGenerator {
    public static void main(String[] strings) {
        ClassModel model = new ClassModel("de.hs.settlers.server.datamodel.generated");
        Clazz gamemanager = model.createClazz("GameManager");

        Clazz team = model.createClazz("Team")
                .withAttribute("name", DataType.STRING);

        Clazz player = model.createClazz("Player")
                .withAttribute("name", DataType.STRING)
                .withAttribute("password", DataType.STRING)
                .withAttribute("online", DataType.BOOLEAN)
                .withAttribute("status", DataType.STRING)
                .withAssoc(team, "team", Card.ONE, "teammates", Card.MANY);

        Clazz settlersMap = model.createClazz("SettlersMap")
                .withAttribute("name", DataType.STRING);

        Clazz game = model.createClazz("Game")
                .withAttribute("name", DataType.STRING)
                .withAttribute("maxPlayers", DataType.INT)
                .withAttribute("testGame", DataType.BOOLEAN)
                .withAssoc(settlersMap, "map", Card.ONE, "games", Card.MANY);

        gamemanager.withMethod("createGame", DataType.ref(game), new Parameter("name", DataType.STRING),
                new Parameter("maxPlayers", DataType.INT), new Parameter("testGame", DataType.BOOLEAN),
                new Parameter(DataType.ref(settlersMap)));


        game.withAssoc(gamemanager, "gameManager", Card.ONE, "games", Card.MANY)
                .withAssoc(player, "players", Card.MANY, "activeGame", Card.ONE)
                .withAssoc(player, "visitors", Card.MANY, "observedGame", Card.ONE);

        Enumeration gameState = model.createEnumeration("GameState").withValueNames("JOINING","OTHER");
        model.generate();

    }
}
