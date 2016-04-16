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

import de.hs.settlers.server.datamodel.generated.SettlersMap;
import de.uniks.networkparser.list.SDMSet;
import de.hs.settlers.server.datamodel.generated.GameManager;
import java.util.Collection;
import org.sdmlib.models.modelsets.ObjectSet;
import java.util.Collections;
import de.hs.settlers.server.datamodel.generated.util.GameSet;
import de.hs.settlers.server.datamodel.generated.Game;

public class GameManagerSet extends SDMSet<GameManager>
{

   public static final GameManagerSet EMPTY_SET = new GameManagerSet().withReadOnly();


   public GameManagerPO hasGameManagerPO()
   {
      return new GameManagerPO(this.toArray(new GameManager[this.size()]));
   }


   public String getEntryType()
   {
      return "de.hs.settlers.server.datamodel.generated.GameManager";
   }


   @SuppressWarnings("unchecked")
   public GameManagerSet with(Object value)
   {
      if (value == null)
      {
         return this;
      }
      else if (value instanceof java.util.Collection)
      {
         this.addAll((Collection<GameManager>)value);
      }
      else if (value != null)
      {
         this.add((GameManager) value);
      }
      
      return this;
   }
   
   public GameManagerSet without(GameManager value)
   {
      this.remove(value);
      return this;
   }

   
   //==========================================================================
   
   public GameManagerSet createGame(String name, int maxPlayers, boolean testGame, SettlersMap p3)
   {
      for (GameManager obj : this)
      {
         obj.createGame(name, maxPlayers, testGame, p3);
      }
      return this;
   }

   /**
    * Loop through the current set of GameManager objects and collect a set of the Game objects reached via games. 
    * 
    * @return Set of Game objects reachable via games
    */
   public GameSet getGames()
   {
      GameSet result = new GameSet();
      
      for (GameManager obj : this)
      {
         result.addAll(obj.getGames());
      }
      
      return result;
   }

   /**
    * Loop through the current set of GameManager objects and collect all contained objects with reference games pointing to the object passed as parameter. 
    * 
    * @param value The object required as games neighbor of the collected results. 
    * 
    * @return Set of Game objects referring to value via games
    */
   public GameManagerSet hasGames(Object value)
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
      
      GameManagerSet answer = new GameManagerSet();
      
      for (GameManager obj : this)
      {
         if ( ! Collections.disjoint(neighbors, obj.getGames()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   /**
    * Loop through current set of ModelType objects and attach the GameManager object passed as parameter to the Games attribute of each of it. 
    * 
    * @return The original set of ModelType objects now with the new neighbor attached to their Games attributes.
    */
   public GameManagerSet withGames(Game value)
   {
      for (GameManager obj : this)
      {
         obj.withGames(value);
      }
      
      return this;
   }

   /**
    * Loop through current set of ModelType objects and remove the GameManager object passed as parameter from the Games attribute of each of it. 
    * 
    * @return The original set of ModelType objects now without the old neighbor.
    */
   public GameManagerSet withoutGames(Game value)
   {
      for (GameManager obj : this)
      {
         obj.withoutGames(value);
      }
      
      return this;
   }

}
