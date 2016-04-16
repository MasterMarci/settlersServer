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
   /**
    * 
    * @see <a href='../../../../../../../../../src/main/java/de/hs/settlers/server/datamodel/sdmlib/ModelGenerator.java'>ModelGenerator.java</a>/n */
   public  class Player implements SendableEntity
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
   
      setTeam(null);
      setActiveGame(null);
      setObservedGame(null);
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
   
   public Player withName(String value)
   {
      setName(value);
      return this;
   } 


   @Override
   public String toString()
   {
      StringBuilder result = new StringBuilder();
      
      result.append(" ").append(this.getName());
      result.append(" ").append(this.getPassword());
      result.append(" ").append(this.getStatus());
      return result.substring(1);
   }


   
   //==========================================================================
   
   public static final String PROPERTY_PASSWORD = "password";
   
   private String password;

   public String getPassword()
   {
      return this.password;
   }
   
   public void setPassword(String value)
   {
      if ( ! StrUtil.stringEquals(this.password, value)) {
      
         String oldValue = this.password;
         this.password = value;
         getPropertyChangeSupport().firePropertyChange(PROPERTY_PASSWORD, oldValue, value);
      }
   }
   
   public Player withPassword(String value)
   {
      setPassword(value);
      return this;
   } 

   
   //==========================================================================
   
   public static final String PROPERTY_ONLINE = "online";
   
   private boolean online;

   public boolean isOnline()
   {
      return this.online;
   }
   
   public void setOnline(boolean value)
   {
      if (this.online != value) {
      
         boolean oldValue = this.online;
         this.online = value;
         getPropertyChangeSupport().firePropertyChange(PROPERTY_ONLINE, oldValue, value);
      }
   }
   
   public Player withOnline(boolean value)
   {
      setOnline(value);
      return this;
   } 

   
   //==========================================================================
   
   public static final String PROPERTY_STATUS = "status";
   
   private String status;

   public String getStatus()
   {
      return this.status;
   }
   
   public void setStatus(String value)
   {
      if ( ! StrUtil.stringEquals(this.status, value)) {
      
         String oldValue = this.status;
         this.status = value;
         getPropertyChangeSupport().firePropertyChange(PROPERTY_STATUS, oldValue, value);
      }
   }
   
   public Player withStatus(String value)
   {
      setStatus(value);
      return this;
   } 

   
   /********************************************************************
    * <pre>
    *              many                       one
    * Player ----------------------------------- Team
    *              teammates                   team
    * </pre>
    */
   
   public static final String PROPERTY_TEAM = "team";

   private Team team = null;

   public Team getTeam()
   {
      return this.team;
   }

   public boolean setTeam(Team value)
   {
      boolean changed = false;
      
      if (this.team != value)
      {
         Team oldValue = this.team;
         
         if (this.team != null)
         {
            this.team = null;
            oldValue.withoutTeammates(this);
         }
         
         this.team = value;
         
         if (value != null)
         {
            value.withTeammates(this);
         }
         
         getPropertyChangeSupport().firePropertyChange(PROPERTY_TEAM, oldValue, value);
         changed = true;
      }
      
      return changed;
   }

   public Player withTeam(Team value)
   {
      setTeam(value);
      return this;
   } 

   public Team createTeam()
   {
      Team value = new Team();
      withTeam(value);
      return value;
   } 

   
   /********************************************************************
    * <pre>
    *              many                       one
    * Player ----------------------------------- Game
    *              players                   activeGame
    * </pre>
    */
   
   public static final String PROPERTY_ACTIVEGAME = "activeGame";

   private Game activeGame = null;

   public Game getActiveGame()
   {
      return this.activeGame;
   }

   public boolean setActiveGame(Game value)
   {
      boolean changed = false;
      
      if (this.activeGame != value)
      {
         Game oldValue = this.activeGame;
         
         if (this.activeGame != null)
         {
            this.activeGame = null;
            oldValue.withoutPlayers(this);
         }
         
         this.activeGame = value;
         
         if (value != null)
         {
            value.withPlayers(this);
         }
         
         getPropertyChangeSupport().firePropertyChange(PROPERTY_ACTIVEGAME, oldValue, value);
         changed = true;
      }
      
      return changed;
   }

   public Player withActiveGame(Game value)
   {
      setActiveGame(value);
      return this;
   } 

   public Game createActiveGame()
   {
      Game value = new Game();
      withActiveGame(value);
      return value;
   } 

   
   /********************************************************************
    * <pre>
    *              many                       one
    * Player ----------------------------------- Game
    *              visitors                   observedGame
    * </pre>
    */
   
   public static final String PROPERTY_OBSERVEDGAME = "observedGame";

   private Game observedGame = null;

   public Game getObservedGame()
   {
      return this.observedGame;
   }

   public boolean setObservedGame(Game value)
   {
      boolean changed = false;
      
      if (this.observedGame != value)
      {
         Game oldValue = this.observedGame;
         
         if (this.observedGame != null)
         {
            this.observedGame = null;
            oldValue.withoutVisitors(this);
         }
         
         this.observedGame = value;
         
         if (value != null)
         {
            value.withVisitors(this);
         }
         
         getPropertyChangeSupport().firePropertyChange(PROPERTY_OBSERVEDGAME, oldValue, value);
         changed = true;
      }
      
      return changed;
   }

   public Player withObservedGame(Game value)
   {
      setObservedGame(value);
      return this;
   } 

   public Game createObservedGame()
   {
      Game value = new Game();
      withObservedGame(value);
      return value;
   } 
}
