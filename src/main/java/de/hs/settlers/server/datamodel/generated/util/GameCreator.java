/*
   Copyright (c) 2016 Mastermarci
   
   Permission is hereby granted, free of charge, to any person obtaining a copy of this software 
   and associated documentation files (the "Software"), to deal in the Software without restriction, 
   including without limitation the rights to use, copy, modify, merge, publish, distribute, 
   sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is 
   furnished to do so, subject to the following conditions: 
   
   The above copyright notice and this permission notice shall be included in all copies or 
   substantial portions of the Software. 
   
   The Software shall be used for Good, not Evil. 
   
   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING 
   BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
   NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, 
   DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, 
   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE. 
 */
   
package de.hs.settlers.server.datamodel.generated.util;

import de.uniks.networkparser.interfaces.SendableEntityCreator;
import de.uniks.networkparser.json.JsonIdMap;
import de.hs.settlers.server.datamodel.generated.Game;
import de.hs.settlers.server.datamodel.generated.SettlersMap;
import de.hs.settlers.server.datamodel.generated.GameManager;
import de.hs.settlers.server.datamodel.generated.Player;

public class GameCreator implements SendableEntityCreator
{
   private final String[] properties = new String[]
   {
      Game.PROPERTY_NAME,
      Game.PROPERTY_MAXPLAYERS,
      Game.PROPERTY_TESTGAME,
      Game.PROPERTY_MAP,
      Game.PROPERTY_GAMEMANAGER,
      Game.PROPERTY_PLAYERS,
      Game.PROPERTY_VISITORS,
   };
   
   @Override
   public String[] getProperties()
   {
      return properties;
   }
   
   @Override
   public Object getSendableInstance(boolean reference)
   {
      return new Game();
   }
   
   @Override
   public Object getValue(Object target, String attrName)
   {
      int pos = attrName.indexOf('.');
      String attribute = attrName;
      
      if (pos > 0)
      {
         attribute = attrName.substring(0, pos);
      }

      if (Game.PROPERTY_NAME.equalsIgnoreCase(attribute))
      {
         return ((Game) target).getName();
      }

      if (Game.PROPERTY_MAXPLAYERS.equalsIgnoreCase(attribute))
      {
         return ((Game) target).getMaxPlayers();
      }

      if (Game.PROPERTY_TESTGAME.equalsIgnoreCase(attribute))
      {
         return ((Game) target).isTestGame();
      }

      if (Game.PROPERTY_MAP.equalsIgnoreCase(attribute))
      {
         return ((Game) target).getMap();
      }

      if (Game.PROPERTY_GAMEMANAGER.equalsIgnoreCase(attribute))
      {
         return ((Game) target).getGameManager();
      }

      if (Game.PROPERTY_PLAYERS.equalsIgnoreCase(attribute))
      {
         return ((Game) target).getPlayers();
      }

      if (Game.PROPERTY_VISITORS.equalsIgnoreCase(attribute))
      {
         return ((Game) target).getVisitors();
      }
      
      return null;
   }
   
   @Override
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      if (Game.PROPERTY_TESTGAME.equalsIgnoreCase(attrName))
      {
         ((Game) target).withTestGame((Boolean) value);
         return true;
      }

      if (Game.PROPERTY_MAXPLAYERS.equalsIgnoreCase(attrName))
      {
         ((Game) target).withMaxPlayers(Integer.parseInt(value.toString()));
         return true;
      }

      if (Game.PROPERTY_NAME.equalsIgnoreCase(attrName))
      {
         ((Game) target).withName((String) value);
         return true;
      }

      if (JsonIdMap.REMOVE.equals(type) && value != null)
      {
         attrName = attrName + type;
      }

      if (Game.PROPERTY_MAP.equalsIgnoreCase(attrName))
      {
         ((Game) target).setMap((SettlersMap) value);
         return true;
      }

      if (Game.PROPERTY_GAMEMANAGER.equalsIgnoreCase(attrName))
      {
         ((Game) target).setGameManager((GameManager) value);
         return true;
      }

      if (Game.PROPERTY_PLAYERS.equalsIgnoreCase(attrName))
      {
         ((Game) target).withPlayers((Player) value);
         return true;
      }
      
      if ((Game.PROPERTY_PLAYERS + JsonIdMap.REMOVE).equalsIgnoreCase(attrName))
      {
         ((Game) target).withoutPlayers((Player) value);
         return true;
      }

      if (Game.PROPERTY_VISITORS.equalsIgnoreCase(attrName))
      {
         ((Game) target).withVisitors((Player) value);
         return true;
      }
      
      if ((Game.PROPERTY_VISITORS + JsonIdMap.REMOVE).equalsIgnoreCase(attrName))
      {
         ((Game) target).withoutVisitors((Player) value);
         return true;
      }
      
      return false;
   }
   public static JsonIdMap createIdMap(String sessionID)
   {
      return de.hs.settlers.server.datamodel.generated.util.CreatorCreator.createIdMap(sessionID);
   }
   
   //==========================================================================
      public void removeObject(Object entity)
   {
      ((Game) entity).removeYou();
   }
}
