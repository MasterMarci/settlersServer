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
import de.hs.settlers.server.datamodel.generated.Game;
import java.util.Collection;
import org.sdmlib.models.modelsets.StringList;
import org.sdmlib.models.modelsets.intList;
import org.sdmlib.models.modelsets.booleanList;
import org.sdmlib.models.modelsets.ObjectSet;
import de.hs.settlers.server.datamodel.generated.util.SettlersMapSet;
import de.hs.settlers.server.datamodel.generated.SettlersMap;
import de.hs.settlers.server.datamodel.generated.util.GameManagerSet;
import de.hs.settlers.server.datamodel.generated.GameManager;
import java.util.Collections;
import de.hs.settlers.server.datamodel.generated.util.PlayerSet;
import de.hs.settlers.server.datamodel.generated.Player;

public class GameSet extends SDMSet<Game>
{

   public static final GameSet EMPTY_SET = new GameSet().withReadOnly();


   public GamePO hasGamePO()
   {
      return new GamePO(this.toArray(new Game[this.size()]));
   }


   public String getEntryType()
   {
      return "de.hs.settlers.server.datamodel.generated.Game";
   }


   @SuppressWarnings("unchecked")
   public GameSet with(Object value)
   {
      if (value == null)
      {
         return this;
      }
      else if (value instanceof java.util.Collection)
      {
         this.addAll((Collection<Game>)value);
      }
      else if (value != null)
      {
         this.add((Game) value);
      }
      
      return this;
   }
   
   public GameSet without(Game value)
   {
      this.remove(value);
      return this;
   }


   /**
    * Loop through the current set of Game objects and collect a list of the name attribute values. 
    * 
    * @return List of String objects reachable via name attribute
    */
   public StringList getName()
   {
      StringList result = new StringList();
      
      for (Game obj : this)
      {
         result.add(obj.getName());
      }
      
      return result;
   }


   /**
    * Loop through the current set of Game objects and collect those Game objects where the name attribute matches the parameter value. 
    * 
    * @param value Search value
    * 
    * @return Subset of Game objects that match the parameter
    */
   public GameSet hasName(String value)
   {
      GameSet result = new GameSet();
      
      for (Game obj : this)
      {
         if (value.equals(obj.getName()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Game objects and collect those Game objects where the name attribute is between lower and upper. 
    * 
    * @param lower Lower bound 
    * @param upper Upper bound 
    * 
    * @return Subset of Game objects that match the parameter
    */
   public GameSet hasName(String lower, String upper)
   {
      GameSet result = new GameSet();
      
      for (Game obj : this)
      {
         if (lower.compareTo(obj.getName()) <= 0 && obj.getName().compareTo(upper) <= 0)
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Game objects and assign value to the name attribute of each of it. 
    * 
    * @param value New attribute value
    * 
    * @return Current set of Game objects now with new attribute values.
    */
   public GameSet withName(String value)
   {
      for (Game obj : this)
      {
         obj.setName(value);
      }
      
      return this;
   }


   /**
    * Loop through the current set of Game objects and collect a list of the maxPlayers attribute values. 
    * 
    * @return List of int objects reachable via maxPlayers attribute
    */
   public intList getMaxPlayers()
   {
      intList result = new intList();
      
      for (Game obj : this)
      {
         result.add(obj.getMaxPlayers());
      }
      
      return result;
   }


   /**
    * Loop through the current set of Game objects and collect those Game objects where the maxPlayers attribute matches the parameter value. 
    * 
    * @param value Search value
    * 
    * @return Subset of Game objects that match the parameter
    */
   public GameSet hasMaxPlayers(int value)
   {
      GameSet result = new GameSet();
      
      for (Game obj : this)
      {
         if (value == obj.getMaxPlayers())
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Game objects and collect those Game objects where the maxPlayers attribute is between lower and upper. 
    * 
    * @param lower Lower bound 
    * @param upper Upper bound 
    * 
    * @return Subset of Game objects that match the parameter
    */
   public GameSet hasMaxPlayers(int lower, int upper)
   {
      GameSet result = new GameSet();
      
      for (Game obj : this)
      {
         if (lower <= obj.getMaxPlayers() && obj.getMaxPlayers() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Game objects and assign value to the maxPlayers attribute of each of it. 
    * 
    * @param value New attribute value
    * 
    * @return Current set of Game objects now with new attribute values.
    */
   public GameSet withMaxPlayers(int value)
   {
      for (Game obj : this)
      {
         obj.setMaxPlayers(value);
      }
      
      return this;
   }


   /**
    * Loop through the current set of Game objects and collect a list of the testGame attribute values. 
    * 
    * @return List of boolean objects reachable via testGame attribute
    */
   public booleanList getTestGame()
   {
      booleanList result = new booleanList();
      
      for (Game obj : this)
      {
         result.add(obj.isTestGame());
      }
      
      return result;
   }


   /**
    * Loop through the current set of Game objects and collect those Game objects where the testGame attribute matches the parameter value. 
    * 
    * @param value Search value
    * 
    * @return Subset of Game objects that match the parameter
    */
   public GameSet hasTestGame(boolean value)
   {
      GameSet result = new GameSet();
      
      for (Game obj : this)
      {
         if (value == obj.isTestGame())
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Game objects and assign value to the testGame attribute of each of it. 
    * 
    * @param value New attribute value
    * 
    * @return Current set of Game objects now with new attribute values.
    */
   public GameSet withTestGame(boolean value)
   {
      for (Game obj : this)
      {
         obj.setTestGame(value);
      }
      
      return this;
   }

   /**
    * Loop through the current set of Game objects and collect a set of the SettlersMap objects reached via map. 
    * 
    * @return Set of SettlersMap objects reachable via map
    */
   public SettlersMapSet getMap()
   {
      SettlersMapSet result = new SettlersMapSet();
      
      for (Game obj : this)
      {
         result.add(obj.getMap());
      }
      
      return result;
   }

   /**
    * Loop through the current set of Game objects and collect all contained objects with reference map pointing to the object passed as parameter. 
    * 
    * @param value The object required as map neighbor of the collected results. 
    * 
    * @return Set of SettlersMap objects referring to value via map
    */
   public GameSet hasMap(Object value)
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
      
      GameSet answer = new GameSet();
      
      for (Game obj : this)
      {
         if (neighbors.contains(obj.getMap()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   /**
    * Loop through current set of ModelType objects and attach the Game object passed as parameter to the Map attribute of each of it. 
    * 
    * @return The original set of ModelType objects now with the new neighbor attached to their Map attributes.
    */
   public GameSet withMap(SettlersMap value)
   {
      for (Game obj : this)
      {
         obj.withMap(value);
      }
      
      return this;
   }

   /**
    * Loop through the current set of Game objects and collect a set of the GameManager objects reached via gameManager. 
    * 
    * @return Set of GameManager objects reachable via gameManager
    */
   public GameManagerSet getGameManager()
   {
      GameManagerSet result = new GameManagerSet();
      
      for (Game obj : this)
      {
         result.add(obj.getGameManager());
      }
      
      return result;
   }

   /**
    * Loop through the current set of Game objects and collect all contained objects with reference gameManager pointing to the object passed as parameter. 
    * 
    * @param value The object required as gameManager neighbor of the collected results. 
    * 
    * @return Set of GameManager objects referring to value via gameManager
    */
   public GameSet hasGameManager(Object value)
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
      
      GameSet answer = new GameSet();
      
      for (Game obj : this)
      {
         if (neighbors.contains(obj.getGameManager()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   /**
    * Loop through current set of ModelType objects and attach the Game object passed as parameter to the GameManager attribute of each of it. 
    * 
    * @return The original set of ModelType objects now with the new neighbor attached to their GameManager attributes.
    */
   public GameSet withGameManager(GameManager value)
   {
      for (Game obj : this)
      {
         obj.withGameManager(value);
      }
      
      return this;
   }

   /**
    * Loop through the current set of Game objects and collect a set of the Player objects reached via players. 
    * 
    * @return Set of Player objects reachable via players
    */
   public PlayerSet getPlayers()
   {
      PlayerSet result = new PlayerSet();
      
      for (Game obj : this)
      {
         result.addAll(obj.getPlayers());
      }
      
      return result;
   }

   /**
    * Loop through the current set of Game objects and collect all contained objects with reference players pointing to the object passed as parameter. 
    * 
    * @param value The object required as players neighbor of the collected results. 
    * 
    * @return Set of Player objects referring to value via players
    */
   public GameSet hasPlayers(Object value)
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
      
      GameSet answer = new GameSet();
      
      for (Game obj : this)
      {
         if ( ! Collections.disjoint(neighbors, obj.getPlayers()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   /**
    * Loop through current set of ModelType objects and attach the Game object passed as parameter to the Players attribute of each of it. 
    * 
    * @return The original set of ModelType objects now with the new neighbor attached to their Players attributes.
    */
   public GameSet withPlayers(Player value)
   {
      for (Game obj : this)
      {
         obj.withPlayers(value);
      }
      
      return this;
   }

   /**
    * Loop through current set of ModelType objects and remove the Game object passed as parameter from the Players attribute of each of it. 
    * 
    * @return The original set of ModelType objects now without the old neighbor.
    */
   public GameSet withoutPlayers(Player value)
   {
      for (Game obj : this)
      {
         obj.withoutPlayers(value);
      }
      
      return this;
   }

   /**
    * Loop through the current set of Game objects and collect a set of the Player objects reached via visitors. 
    * 
    * @return Set of Player objects reachable via visitors
    */
   public PlayerSet getVisitors()
   {
      PlayerSet result = new PlayerSet();
      
      for (Game obj : this)
      {
         result.addAll(obj.getVisitors());
      }
      
      return result;
   }

   /**
    * Loop through the current set of Game objects and collect all contained objects with reference visitors pointing to the object passed as parameter. 
    * 
    * @param value The object required as visitors neighbor of the collected results. 
    * 
    * @return Set of Player objects referring to value via visitors
    */
   public GameSet hasVisitors(Object value)
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
      
      GameSet answer = new GameSet();
      
      for (Game obj : this)
      {
         if ( ! Collections.disjoint(neighbors, obj.getVisitors()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   /**
    * Loop through current set of ModelType objects and attach the Game object passed as parameter to the Visitors attribute of each of it. 
    * 
    * @return The original set of ModelType objects now with the new neighbor attached to their Visitors attributes.
    */
   public GameSet withVisitors(Player value)
   {
      for (Game obj : this)
      {
         obj.withVisitors(value);
      }
      
      return this;
   }

   /**
    * Loop through current set of ModelType objects and remove the Game object passed as parameter from the Visitors attribute of each of it. 
    * 
    * @return The original set of ModelType objects now without the old neighbor.
    */
   public GameSet withoutVisitors(Player value)
   {
      for (Game obj : this)
      {
         obj.withoutVisitors(value);
      }
      
      return this;
   }

}
