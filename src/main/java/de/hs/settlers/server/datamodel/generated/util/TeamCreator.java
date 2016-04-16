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
import de.hs.settlers.server.datamodel.generated.Team;
import de.hs.settlers.server.datamodel.generated.Player;

public class TeamCreator implements SendableEntityCreator
{
   private final String[] properties = new String[]
   {
      Team.PROPERTY_NAME,
      Team.PROPERTY_TEAMMATES,
   };
   
   @Override
   public String[] getProperties()
   {
      return properties;
   }
   
   @Override
   public Object getSendableInstance(boolean reference)
   {
      return new Team();
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

      if (Team.PROPERTY_NAME.equalsIgnoreCase(attribute))
      {
         return ((Team) target).getName();
      }

      if (Team.PROPERTY_TEAMMATES.equalsIgnoreCase(attribute))
      {
         return ((Team) target).getTeammates();
      }
      
      return null;
   }
   
   @Override
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      if (Team.PROPERTY_NAME.equalsIgnoreCase(attrName))
      {
         ((Team) target).withName((String) value);
         return true;
      }

      if (JsonIdMap.REMOVE.equals(type) && value != null)
      {
         attrName = attrName + type;
      }

      if (Team.PROPERTY_TEAMMATES.equalsIgnoreCase(attrName))
      {
         ((Team) target).withTeammates((Player) value);
         return true;
      }
      
      if ((Team.PROPERTY_TEAMMATES + JsonIdMap.REMOVE).equalsIgnoreCase(attrName))
      {
         ((Team) target).withoutTeammates((Player) value);
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
      ((Team) entity).removeYou();
   }
}
