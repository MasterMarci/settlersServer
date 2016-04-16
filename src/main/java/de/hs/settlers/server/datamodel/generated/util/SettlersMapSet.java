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

import de.uniks.networkparser.list.SDMSet;
import de.hs.settlers.server.datamodel.generated.SettlersMap;
import java.util.Collection;
import org.sdmlib.models.modelsets.StringList;
import org.sdmlib.models.modelsets.ObjectSet;
import java.util.Collections;
import de.hs.settlers.server.datamodel.generated.util.GameSet;
import de.hs.settlers.server.datamodel.generated.Game;

public class SettlersMapSet extends SDMSet<SettlersMap>
{

   public static final SettlersMapSet EMPTY_SET = new SettlersMapSet().withReadOnly();


   public SettlersMapPO hasSettlersMapPO()
   {
      return new SettlersMapPO(this.toArray(new SettlersMap[this.size()]));
   }


   public String getEntryType()
   {
      return "de.hs.settlers.server.datamodel.generated.SettlersMap";
   }


   @SuppressWarnings("unchecked")
   public SettlersMapSet with(Object value)
   {
      if (value == null)
      {
         return this;
      }
      else if (value instanceof java.util.Collection)
      {
         this.addAll((Collection<SettlersMap>)value);
      }
      else if (value != null)
      {
         this.add((SettlersMap) value);
      }
      
      return this;
   }
   
   public SettlersMapSet without(SettlersMap value)
   {
      this.remove(value);
      return this;
   }


   /**
    * Loop through the current set of SettlersMap objects and collect a list of the name attribute values. 
    * 
    * @return List of String objects reachable via name attribute
    */
   public StringList getName()
   {
      StringList result = new StringList();
      
      for (SettlersMap obj : this)
      {
         result.add(obj.getName());
      }
      
      return result;
   }


   /**
    * Loop through the current set of SettlersMap objects and collect those SettlersMap objects where the name attribute matches the parameter value. 
    * 
    * @param value Search value
    * 
    * @return Subset of SettlersMap objects that match the parameter
    */
   public SettlersMapSet hasName(String value)
   {
      SettlersMapSet result = new SettlersMapSet();
      
      for (SettlersMap obj : this)
      {
         if (value.equals(obj.getName()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of SettlersMap objects and collect those SettlersMap objects where the name attribute is between lower and upper. 
    * 
    * @param lower Lower bound 
    * @param upper Upper bound 
    * 
    * @return Subset of SettlersMap objects that match the parameter
    */
   public SettlersMapSet hasName(String lower, String upper)
   {
      SettlersMapSet result = new SettlersMapSet();
      
      for (SettlersMap obj : this)
      {
         if (lower.compareTo(obj.getName()) <= 0 && obj.getName().compareTo(upper) <= 0)
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of SettlersMap objects and assign value to the name attribute of each of it. 
    * 
    * @param value New attribute value
    * 
    * @return Current set of SettlersMap objects now with new attribute values.
    */
   public SettlersMapSet withName(String value)
   {
      for (SettlersMap obj : this)
      {
         obj.setName(value);
      }
      
      return this;
   }

   /**
    * Loop through the current set of SettlersMap objects and collect a set of the Game objects reached via games. 
    * 
    * @return Set of Game objects reachable via games
    */
   public GameSet getGames()
   {
      GameSet result = new GameSet();
      
      for (SettlersMap obj : this)
      {
         result.addAll(obj.getGames());
      }
      
      return result;
   }

   /**
    * Loop through the current set of SettlersMap objects and collect all contained objects with reference games pointing to the object passed as parameter. 
    * 
    * @param value The object required as games neighbor of the collected results. 
    * 
    * @return Set of Game objects referring to value via games
    */
   public SettlersMapSet hasGames(Object value)
   {
      ObjectSet neighbors = new ObjectSet();

      if (value instanceof Collection)
      {
         neighbors.addAll((Collection<?>) value);
      }
      else
      {
         neighbors.add(value);
      }
      
      SettlersMapSet answer = new SettlersMapSet();
      
      for (SettlersMap obj : this)
      {
         if ( ! Collections.disjoint(neighbors, obj.getGames()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   /**
    * Loop through current set of ModelType objects and attach the SettlersMap object passed as parameter to the Games attribute of each of it. 
    * 
    * @return The original set of ModelType objects now with the new neighbor attached to their Games attributes.
    */
   public SettlersMapSet withGames(Game value)
   {
      for (SettlersMap obj : this)
      {
         obj.withGames(value);
      }
      
      return this;
   }

   /**
    * Loop through current set of ModelType objects and remove the SettlersMap object passed as parameter from the Games attribute of each of it. 
    * 
    * @return The original set of ModelType objects now without the old neighbor.
    */
   public SettlersMapSet withoutGames(Game value)
   {
      for (SettlersMap obj : this)
      {
         obj.withoutGames(value);
      }
      
      return this;
   }

}
