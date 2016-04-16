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
   
package de.hs.settlers.server.datamodel.generated;

import de.uniks.networkparser.interfaces.SendableEntity;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;
import org.sdmlib.StrUtil;
import de.hs.settlers.server.datamodel.generated.util.PlayerSet;
   /**
    * 
    * @see <a href='../../../../../../../../../src/main/java/de/hs/settlers/server/datamodel/sdmlib/ModelGenerator.java'>ModelGenerator.java</a>/n */
   public  class Team implements SendableEntity
{

   
   //==========================================================================
   
   protected PropertyChangeSupport listeners = new PropertyChangeSupport(this);
   
   public PropertyChangeSupport getPropertyChangeSupport()
   {
      return listeners;
   }
   
   public boolean addPropertyChangeListener(PropertyChangeListener listener) 
   {
      getPropertyChangeSupport().addPropertyChangeListener(listener);
      return true;
   }
   
   public boolean addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
      getPropertyChangeSupport().addPropertyChangeListener(propertyName, listener);
      return true;
   }
   
   public boolean removePropertyChangeListener(PropertyChangeListener listener) {
      getPropertyChangeSupport().removePropertyChangeListener(listener);
      return true;
   }

   
   //==========================================================================
   
   
   public void removeYou()
   {
   
      withoutTeammates(this.getTeammates().toArray(new Player[this.getTeammates().size()]));
      getPropertyChangeSupport().firePropertyChange("REMOVE_YOU", this, null);
   }

   
   //==========================================================================
   
   public static final String PROPERTY_NAME = "name";
   
   private String name;

   public String getName()
   {
      return this.name;
   }
   
   public void setName(String value)
   {
      if ( ! StrUtil.stringEquals(this.name, value)) {
      
         String oldValue = this.name;
         this.name = value;
         getPropertyChangeSupport().firePropertyChange(PROPERTY_NAME, oldValue, value);
      }
   }
   
   public Team withName(String value)
   {
      setName(value);
      return this;
   } 


   @Override
   public String toString()
   {
      StringBuilder result = new StringBuilder();
      
      result.append(" ").append(this.getName());
      return result.substring(1);
   }


   
   /********************************************************************
    * <pre>
    *              one                       many
    * Team ----------------------------------- Player
    *              team                   teammates
    * </pre>
    */
   
   public static final String PROPERTY_TEAMMATES = "teammates";

   private PlayerSet teammates = null;
   
   public PlayerSet getTeammates()
   {
      if (this.teammates == null)
      {
         return PlayerSet.EMPTY_SET;
      }
   
      return this.teammates;
   }

   public Team withTeammates(Player... value)
   {
      if(value==null){
         return this;
      }
      for (Player item : value)
      {
         if (item != null)
         {
            if (this.teammates == null)
            {
               this.teammates = new PlayerSet();
            }
            
            boolean changed = this.teammates.add (item);

            if (changed)
            {
               item.withTeam(this);
               getPropertyChangeSupport().firePropertyChange(PROPERTY_TEAMMATES, null, item);
            }
         }
      }
      return this;
   } 

   public Team withoutTeammates(Player... value)
   {
      for (Player item : value)
      {
         if ((this.teammates != null) && (item != null))
         {
            if (this.teammates.remove(item))
            {
               item.setTeam(null);
               getPropertyChangeSupport().firePropertyChange(PROPERTY_TEAMMATES, item, null);
            }
         }
      }
      return this;
   }

   public Player createTeammates()
   {
      Player value = new Player();
      withTeammates(value);
      return value;
   } 
}
