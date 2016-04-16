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
import de.hs.settlers.server.datamodel.generated.Team;
import java.util.Collection;
import org.sdmlib.models.modelsets.StringList;
import org.sdmlib.models.modelsets.ObjectSet;
import java.util.Collections;
import de.hs.settlers.server.datamodel.generated.util.PlayerSet;
import de.hs.settlers.server.datamodel.generated.Player;

public class TeamSet extends SDMSet<Team>
{

   public static final TeamSet EMPTY_SET = new TeamSet().withReadOnly();


   public TeamPO hasTeamPO()
   {
      return new TeamPO(this.toArray(new Team[this.size()]));
   }


   public String getEntryType()
   {
      return "de.hs.settlers.server.datamodel.generated.Team";
   }


   @SuppressWarnings("unchecked")
   public TeamSet with(Object value)
   {
      if (value == null)
      {
         return this;
      }
      else if (value instanceof java.util.Collection)
      {
         this.addAll((Collection<Team>)value);
      }
      else if (value != null)
      {
         this.add((Team) value);
      }
      
      return this;
   }
   
   public TeamSet without(Team value)
   {
      this.remove(value);
      return this;
   }


   /**
    * Loop through the current set of Team objects and collect a list of the name attribute values. 
    * 
    * @return List of String objects reachable via name attribute
    */
   public StringList getName()
   {
      StringList result = new StringList();
      
      for (Team obj : this)
      {
         result.add(obj.getName());
      }
      
      return result;
   }


   /**
    * Loop through the current set of Team objects and collect those Team objects where the name attribute matches the parameter value. 
    * 
    * @param value Search value
    * 
    * @return Subset of Team objects that match the parameter
    */
   public TeamSet hasName(String value)
   {
      TeamSet result = new TeamSet();
      
      for (Team obj : this)
      {
         if (value.equals(obj.getName()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Team objects and collect those Team objects where the name attribute is between lower and upper. 
    * 
    * @param lower Lower bound 
    * @param upper Upper bound 
    * 
    * @return Subset of Team objects that match the parameter
    */
   public TeamSet hasName(String lower, String upper)
   {
      TeamSet result = new TeamSet();
      
      for (Team obj : this)
      {
         if (lower.compareTo(obj.getName()) <= 0 && obj.getName().compareTo(upper) <= 0)
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Team objects and assign value to the name attribute of each of it. 
    * 
    * @param value New attribute value
    * 
    * @return Current set of Team objects now with new attribute values.
    */
   public TeamSet withName(String value)
   {
      for (Team obj : this)
      {
         obj.setName(value);
      }
      
      return this;
   }

   /**
    * Loop through the current set of Team objects and collect a set of the Player objects reached via teammates. 
    * 
    * @return Set of Player objects reachable via teammates
    */
   public PlayerSet getTeammates()
   {
      PlayerSet result = new PlayerSet();
      
      for (Team obj : this)
      {
         result.addAll(obj.getTeammates());
      }
      
      return result;
   }

   /**
    * Loop through the current set of Team objects and collect all contained objects with reference teammates pointing to the object passed as parameter. 
    * 
    * @param value The object required as teammates neighbor of the collected results. 
    * 
    * @return Set of Player objects referring to value via teammates
    */
   public TeamSet hasTeammates(Object value)
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
      
      TeamSet answer = new TeamSet();
      
      for (Team obj : this)
      {
         if ( ! Collections.disjoint(neighbors, obj.getTeammates()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   /**
    * Loop through current set of ModelType objects and attach the Team object passed as parameter to the Teammates attribute of each of it. 
    * 
    * @return The original set of ModelType objects now with the new neighbor attached to their Teammates attributes.
    */
   public TeamSet withTeammates(Player value)
   {
      for (Team obj : this)
      {
         obj.withTeammates(value);
      }
      
      return this;
   }

   /**
    * Loop through current set of ModelType objects and remove the Team object passed as parameter from the Teammates attribute of each of it. 
    * 
    * @return The original set of ModelType objects now without the old neighbor.
    */
   public TeamSet withoutTeammates(Player value)
   {
      for (Team obj : this)
      {
         obj.withoutTeammates(value);
      }
      
      return this;
   }

}
