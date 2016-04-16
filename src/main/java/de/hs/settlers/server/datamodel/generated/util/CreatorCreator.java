package de.hs.settlers.server.datamodel.generated.util;

import de.uniks.networkparser.json.JsonIdMap;

class CreatorCreator{

   public static JsonIdMap createIdMap(String sessionID)
   {
      JsonIdMap jsonIdMap = new JsonIdMap().withSessionId(sessionID);
      jsonIdMap.withCreator(new GameManagerCreator());
      jsonIdMap.withCreator(new GameManagerPOCreator());
      jsonIdMap.withCreator(new TeamCreator());
      jsonIdMap.withCreator(new TeamPOCreator());
      jsonIdMap.withCreator(new PlayerCreator());
      jsonIdMap.withCreator(new PlayerPOCreator());
      jsonIdMap.withCreator(new SettlersMapCreator());
      jsonIdMap.withCreator(new SettlersMapPOCreator());
      jsonIdMap.withCreator(new GameCreator());
      jsonIdMap.withCreator(new GamePOCreator());
      return jsonIdMap;
   }
}
