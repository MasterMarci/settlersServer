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
import de.hs.settlers.server.datamodel.generated.Player;
import de.hs.settlers.server.datamodel.generated.Team;
import de.hs.settlers.server.datamodel.generated.Game;

public class PlayerCreator implements SendableEntityCreator
{
   private final String[] properties = new String[]
   {
      Player.PROPERTY_NAME,
      Player.PROPERTY_PASSWORD,
      Player.PROPERTY_ONLINE,
      Player.PROPERTY_STATUS,
      Player.PROPERTY_TEAM,
      Player.PROPERTY_ACTIVEGAME,
      Player.PROPERTY_OBSERVEDGAME,
   };
   
   @Override
   public String[] getProperties()
   {
      return properties;
   }
   
   @Override
   public Object getSendableInstance(boolean reference)
   {
      return new Player();
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

      if (Player.PROPERTY_NAME.equalsIgnoreCase(attribute))
      {
         return ((Player) target).getName();
      }

      if (Player.PROPERTY_PASSWORD.equalsIgnoreCase(attribute))
      {
         return ((Player) target).getPassword();
      }

      if (Player.PROPERTY_ONLINE.equalsIgnoreCase(attribute))
      {
         return ((Player) target).isOnline();
      }

      if (Player.PROPERTY_STATUS.equalsIgnoreCase(attribute))
      {
         return ((Player) target).getStatus();
      }

      if (Player.PROPERTY_TEAM.equalsIgnoreCase(attribute))
      {
         return ((Player) target).getTeam();
      }

      if (Player.PROPERTY_ACTIVEGAME.equalsIgnoreCase(attribute))
      {
         return ((Player) target).getActiveGame();
      }

      if (Player.PROPERTY_OBSERVEDGAME.equalsIgnoreCase(attribute))
      {
         return ((Player) target).getObservedGame();
      }
      
      return null;
   }
   
   @Override
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      if (Player.PROPERTY_STATUS.equalsIgnoreCase(attrName))
      {
         ((Player) target).withStatus((String) value);
         return true;
      }

      if (Player.PROPERTY_ONLINE.equalsIgnoreCase(attrName))
      {
         ((Player) target).withOnline((Boolean) value);
         return true;
      }

      if (Player.PROPERTY_PASSWORD.equalsIgnoreCase(attrName))
      {
         ((Player) target).withPassword((String) value);
         return true;
      }

      if (Player.PROPERTY_NAME.equalsIgnoreCase(attrName))
      {
         ((Player) target).withName((String) value);
         return true;
      }

      if (JsonIdMap.REMOVE.equals(type) && value != null)
      {
         attrName = attrName + type;
      }

      if (Player.PROPERTY_TEAM.equalsIgnoreCase(attrName))
      {
         ((Player) target).setTeam((Team) value);
         return true;
      }

      if (Player.PROPERTY_ACTIVEGAME.equalsIgnoreCase(attrName))
      {
         ((Player) target).setActiveGame((Game) value);
         return true;
      }

      if (Player.PROPERTY_OBSERVEDGAME.equalsIgnoreCase(attrName))
      {
         ((Player) target).setObservedGame((Game) value);
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
      ((Player) entity).removeYou();
   }
}
