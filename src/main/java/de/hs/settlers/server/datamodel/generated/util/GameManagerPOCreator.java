package de.hs.settlers.server.datamodel.generated.util;

import org.sdmlib.models.pattern.util.PatternObjectCreator;
import de.uniks.networkparser.json.JsonIdMap;
import de.hs.settlers.server.datamodel.generated.GameManager;

public class GameManagerPOCreator extends PatternObjectCreator
{
   @Override
   public Object getSendableInstance(boolean reference)
   {
      if(reference) {
          return new GameManagerPO(new GameManager[]{});
      } else {
          return new GameManagerPO();
      }
   }
   
   public static JsonIdMap createIdMap(String sessionID) {
      return de.hs.settlers.server.datamodel.generated.util.CreatorCreator.createIdMap(sessionID);
   }
}
