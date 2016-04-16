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
import de.hs.settlers.server.datamodel.generated.Player;
import java.util.Collection;
import org.sdmlib.models.modelsets.StringList;
import org.sdmlib.models.modelsets.booleanList;
import org.sdmlib.models.modelsets.ObjectSet;
import de.hs.settlers.server.datamodel.generated.util.TeamSet;
import de.hs.settlers.server.datamodel.generated.Team;
import de.hs.settlers.server.datamodel.generated.util.GameSet;
import de.hs.settlers.server.datamodel.generated.Game;

public class PlayerSet extends SDMSet<Player>
{

   public static final PlayerSet EMPTY_SET = new PlayerSet().withReadOnly();


   public PlayerPO hasPlayerPO()
   {
      return new PlayerPO(this.toArray(new Player[this.size()]));
   }


   public String getEntryType()
   {
      return "de.hs.settlers.server.datamodel.generated.Player";
   }


   @SuppressWarnings("unchecked")
   public PlayerSet with(Object value)
   {
      if (value == null)
      {
         return this;
      }
      else if (value instanceof java.util.Collection)
      {
         this.addAll((Collection<Player>)value);
      }
      else if (value != null)
      {
         this.add((Player) value);
      }
      
      return this;
   }
   
   public PlayerSet without(Player value)
   {
      this.remove(value);
      return this;
   }


   /**
    * Loop through the current set of Player objects and collect a list of the name attribute values. 
    * 
    * @return List of String objects reachable via name attribute
    */
   public StringList getName()
   {
      StringList result = new StringList();
      
      for (Player obj : this)
      {
         result.add(obj.getName());
      }
      
      return result;
   }


   /**
    * Loop through the current set of Player objects and collect those Player objects where the name attribute matches the parameter value. 
    * 
    * @param value Search value
    * 
    * @return Subset of Player objects that match the parameter
    */
   public PlayerSet hasName(String value)
   {
      PlayerSet result = new PlayerSet();
      
      for (Player obj : this)
      {
         if (value.equals(obj.getName()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Player objects and collect those Player objects where the name attribute is between lower and upper. 
    * 
    * @param lower Lower bound 
    * @param upper Upper bound 
    * 
    * @return Subset of Player objects that match the parameter
    */
   public PlayerSet hasName(String lower, String upper)
   {
      PlayerSet result = new PlayerSet();
      
      for (Player obj : this)
      {
         if (lower.compareTo(obj.getName()) <= 0 && obj.getName().compareTo(upper) <= 0)
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Player objects and assign value to the name attribute of each of it. 
    * 
    * @param value New attribute value
    * 
    * @return Current set of Player objects now with new attribute values.
    */
   public PlayerSet withName(String value)
   {
      for (Player obj : this)
      {
         obj.setName(value);
      }
      
      return this;
   }


   /**
    * Loop through the current set of Player objects and collect a list of the password attribute values. 
    * 
    * @return List of String objects reachable via password attribute
    */
   public StringList getPassword()
   {
      StringList result = new StringList();
      
      for (Player obj : this)
      {
         result.add(obj.getPassword());
      }
      
      return result;
   }


   /**
    * Loop through the current set of Player objects and collect those Player objects where the password attribute matches the parameter value. 
    * 
    * @param value Search value
    * 
    * @return Subset of Player objects that match the parameter
    */
   public PlayerSet hasPassword(String value)
   {
      PlayerSet result = new PlayerSet();
      
      for (Player obj : this)
      {
         if (value.equals(obj.getPassword()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Player objects and collect those Player objects where the password attribute is between lower and upper. 
    * 
    * @param lower Lower bound 
    * @param upper Upper bound 
    * 
    * @return Subset of Player objects that match the parameter
    */
   public PlayerSet hasPassword(String lower, String upper)
   {
      PlayerSet result = new PlayerSet();
      
      for (Player obj : this)
      {
         if (lower.compareTo(obj.getPassword()) <= 0 && obj.getPassword().compareTo(upper) <= 0)
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Player objects and assign value to the password attribute of each of it. 
    * 
    * @param value New attribute value
    * 
    * @return Current set of Player objects now with new attribute values.
    */
   public PlayerSet withPassword(String value)
   {
      for (Player obj : this)
      {
         obj.setPassword(value);
      }
      
      return this;
   }


   /**
    * Loop through the current set of Player objects and collect a list of the online attribute values. 
    * 
    * @return List of boolean objects reachable via online attribute
    */
   public booleanList getOnline()
   {
      booleanList result = new booleanList();
      
      for (Player obj : this)
      {
         result.add(obj.isOnline());
      }
      
      return result;
   }


   /**
    * Loop through the current set of Player objects and collect those Player objects where the online attribute matches the parameter value. 
    * 
    * @param value Search value
    * 
    * @return Subset of Player objects that match the parameter
    */
   public PlayerSet hasOnline(boolean value)
   {
      PlayerSet result = new PlayerSet();
      
      for (Player obj : this)
      {
         if (value == obj.isOnline())
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Player objects and assign value to the online attribute of each of it. 
    * 
    * @param value New attribute value
    * 
    * @return Current set of Player objects now with new attribute values.
    */
   public PlayerSet withOnline(boolean value)
   {
      for (Player obj : this)
      {
         obj.setOnline(value);
      }
      
      return this;
   }


   /**
    * Loop through the current set of Player objects and collect a list of the status attribute values. 
    * 
    * @return List of String objects reachable via status attribute
    */
   public StringList getStatus()
   {
      StringList result = new StringList();
      
      for (Player obj : this)
      {
         result.add(obj.getStatus());
      }
      
      return result;
   }


   /**
    * Loop through the current set of Player objects and collect those Player objects where the status attribute matches the parameter value. 
    * 
    * @param value Search value
    * 
    * @return Subset of Player objects that match the parameter
    */
   public PlayerSet hasStatus(String value)
   {
      PlayerSet result = new PlayerSet();
      
      for (Player obj : this)
      {
         if (value.equals(obj.getStatus()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Player objects and collect those Player objects where the status attribute is between lower and upper. 
    * 
    * @param lower Lower bound 
    * @param upper Upper bound 
    * 
    * @return Subset of Player objects that match the parameter
    */
   public PlayerSet hasStatus(String lower, String upper)
   {
      PlayerSet result = new PlayerSet();
      
      for (Player obj : this)
      {
         if (lower.compareTo(obj.getStatus()) <= 0 && obj.getStatus().compareTo(upper) <= 0)
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Player objects and assign value to the status attribute of each of it. 
    * 
    * @param value New attribute value
    * 
    * @return Current set of Player objects now with new attribute values.
    */
   public PlayerSet withStatus(String value)
   {
      for (Player obj : this)
      {
         obj.setStatus(value);
      }
      
      return this;
   }

   /**
    * Loop through the current set of Player objects and collect a set of the Team objects reached via team. 
    * 
    * @return Set of Team objects reachable via team
    */
   public TeamSet getTeam()
   {
      TeamSet result = new TeamSet();
      
      for (Player obj : this)
      {
         result.add(obj.getTeam());
      }
      
      return result;
   }

   /**
    * Loop through the current set of Player objects and collect all contained objects with reference team pointing to the object passed as parameter. 
    * 
    * @param value The object required as team neighbor of the collected results. 
    * 
    * @return Set of Team objects referring to value via team
    */
   public PlayerSet hasTeam(Object value)
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
      
      PlayerSet answer = new PlayerSet();
      
      for (Player obj : this)
      {
         if (neighbors.contains(obj.getTeam()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   /**
    * Loop through current set of ModelType objects and attach the Player object passed as parameter to the Team attribute of each of it. 
    * 
    * @return The original set of ModelType objects now with the new neighbor attached to their Team attributes.
    */
   public PlayerSet withTeam(Team value)
   {
      for (Player obj : this)
      {
         obj.withTeam(value);
      }
      
      return this;
   }

   /**
    * Loop through the current set of Player objects and collect a set of the Game objects reached via activeGame. 
    * 
    * @return Set of Game objects reachable via activeGame
    */
   public GameSet getActiveGame()
   {
      GameSet result = new GameSet();
      
      for (Player obj : this)
      {
         result.add(obj.getActiveGame());
      }
      
      return result;
   }

   /**
    * Loop through the current set of Player objects and collect all contained objects with reference activeGame pointing to the object passed as parameter. 
    * 
    * @param value The object required as activeGame neighbor of the collected results. 
    * 
    * @return Set of Game objects referring to value via activeGame
    */
   public PlayerSet hasActiveGame(Object value)
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
      
      PlayerSet answer = new PlayerSet();
      
      for (Player obj : this)
      {
         if (neighbors.contains(obj.getActiveGame()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   /**
    * Loop through current set of ModelType objects and attach the Player object passed as parameter to the ActiveGame attribute of each of it. 
    * 
    * @return The original set of ModelType objects now with the new neighbor attached to their ActiveGame attributes.
    */
   public PlayerSet withActiveGame(Game value)
   {
      for (Player obj : this)
      {
         obj.withActiveGame(value);
      }
      
      return this;
   }

   /**
    * Loop through the current set of Player objects and collect a set of the Game objects reached via observedGame. 
    * 
    * @return Set of Game objects reachable via observedGame
    */
   public GameSet getObservedGame()
   {
      GameSet result = new GameSet();
      
      for (Player obj : this)
      {
         result.add(obj.getObservedGame());
      }
      
      return result;
   }

   /**
    * Loop through the current set of Player objects and collect all contained objects with reference observedGame pointing to the object passed as parameter. 
    * 
    * @param value The object required as observedGame neighbor of the collected results. 
    * 
    * @return Set of Game objects referring to value via observedGame
    */
   public PlayerSet hasObservedGame(Object value)
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
      
      PlayerSet answer = new PlayerSet();
      
      for (Player obj : this)
      {
         if (neighbors.contains(obj.getObservedGame()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   /**
    * Loop through current set of ModelType objects and attach the Player object passed as parameter to the ObservedGame attribute of each of it. 
    * 
    * @return The original set of ModelType objects now with the new neighbor attached to their ObservedGame attributes.
    */
   public PlayerSet withObservedGame(Game value)
   {
      for (Player obj : this)
      {
         obj.withObservedGame(value);
      }
      
      return this;
   }

}
