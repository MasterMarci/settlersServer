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
   public  class Game implements SendableEntity
{

   private GameState state;

   
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
   
      setMap(null);
      setGameManager(null);
      withoutPlayers(this.getPlayers().toArray(new Player[this.getPlayers().size()]));
      withoutVisitors(this.getVisitors().toArray(new Player[this.getVisitors().size()]));
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
   
   public Game withName(String value)
   {
      setName(value);
      return this;
   } 


   @Override
   public String toString()
   {
      StringBuilder result = new StringBuilder();
      
      result.append(" ").append(this.getName());
      result.append(" ").append(this.getMaxPlayers());
      return result.substring(1);
   }


   
   //==========================================================================
   
   public static final String PROPERTY_MAXPLAYERS = "maxPlayers";
   
   private int maxPlayers;

   public int getMaxPlayers()
   {
      return this.maxPlayers;
   }
   
   public void setMaxPlayers(int value)
   {
      if (this.maxPlayers != value) {
      
         int oldValue = this.maxPlayers;
         this.maxPlayers = value;
         getPropertyChangeSupport().firePropertyChange(PROPERTY_MAXPLAYERS, oldValue, value);
      }
   }
   
   public Game withMaxPlayers(int value)
   {
      setMaxPlayers(value);
      return this;
   } 

   
   //==========================================================================
   
   public static final String PROPERTY_TESTGAME = "testGame";
   
   private boolean testGame;

   public boolean isTestGame()
   {
      return this.testGame;
   }
   
   public void setTestGame(boolean value)
   {
      if (this.testGame != value) {
      
         boolean oldValue = this.testGame;
         this.testGame = value;
         getPropertyChangeSupport().firePropertyChange(PROPERTY_TESTGAME, oldValue, value);
      }
   }
   
   public Game withTestGame(boolean value)
   {
      setTestGame(value);
      return this;
   } 

   
   /********************************************************************
    * <pre>
    *              many                       one
    * Game ----------------------------------- SettlersMap
    *              games                   map
    * </pre>
    */
   
   public static final String PROPERTY_MAP = "map";

   private SettlersMap map = null;

   public SettlersMap getMap()
   {
      return this.map;
   }

   public boolean setMap(SettlersMap value)
   {
      boolean changed = false;
      
      if (this.map != value)
      {
         SettlersMap oldValue = this.map;
         
         if (this.map != null)
         {
            this.map = null;
            oldValue.withoutGames(this);
         }
         
         this.map = value;
         
         if (value != null)
         {
            value.withGames(this);
         }
         
         getPropertyChangeSupport().firePropertyChange(PROPERTY_MAP, oldValue, value);
         changed = true;
      }
      
      return changed;
   }

   public Game withMap(SettlersMap value)
   {
      setMap(value);
      return this;
   } 

   public SettlersMap createMap()
   {
      SettlersMap value = new SettlersMap();
      withMap(value);
      return value;
   } 

   
   /********************************************************************
    * <pre>
    *              many                       one
    * Game ----------------------------------- GameManager
    *              games                   gameManager
    * </pre>
    */
   
   public static final String PROPERTY_GAMEMANAGER = "gameManager";

   private GameManager gameManager = null;

   public GameManager getGameManager()
   {
      return this.gameManager;
   }

   public boolean setGameManager(GameManager value)
   {
      boolean changed = false;
      
      if (this.gameManager != value)
      {
         GameManager oldValue = this.gameManager;
         
         if (this.gameManager != null)
         {
            this.gameManager = null;
            oldValue.withoutGames(this);
         }
         
         this.gameManager = value;
         
         if (value != null)
         {
            value.withGames(this);
         }
         
         getPropertyChangeSupport().firePropertyChange(PROPERTY_GAMEMANAGER, oldValue, value);
         changed = true;
      }
      
      return changed;
   }

   public Game withGameManager(GameManager value)
   {
      setGameManager(value);
      return this;
   } 

   public GameManager createGameManager()
   {
      GameManager value = new GameManager();
      withGameManager(value);
      return value;
   } 

   
   /********************************************************************
    * <pre>
    *              one                       many
    * Game ----------------------------------- Player
    *              activeGame                   players
    * </pre>
    */
   
   public static final String PROPERTY_PLAYERS = "players";

   private PlayerSet players = null;
   
   public PlayerSet getPlayers()
   {
      if (this.players == null)
      {
         return PlayerSet.EMPTY_SET;
      }
   
      return this.players;
   }

   public Game withPlayers(Player... value)
   {
      if(value==null){
         return this;
      }
      for (Player item : value)
      {
         if (item != null)
         {
            if (this.players == null)
            {
               this.players = new PlayerSet();
            }
            
            boolean changed = this.players.add (item);

            if (changed)
            {
               item.withActiveGame(this);
               getPropertyChangeSupport().firePropertyChange(PROPERTY_PLAYERS, null, item);
            }
         }
      }
      return this;
   } 

   public Game withoutPlayers(Player... value)
   {
      for (Player item : value)
      {
         if ((this.players != null) && (item != null))
         {
            if (this.players.remove(item))
            {
               item.setActiveGame(null);
               getPropertyChangeSupport().firePropertyChange(PROPERTY_PLAYERS, item, null);
            }
         }
      }
      return this;
   }

   public Player createPlayers()
   {
      Player value = new Player();
      withPlayers(value);
      return value;
   } 

   
   /********************************************************************
    * <pre>
    *              one                       many
    * Game ----------------------------------- Player
    *              observedGame                   visitors
    * </pre>
    */
   
   public static final String PROPERTY_VISITORS = "visitors";

   private PlayerSet visitors = null;
   
   public PlayerSet getVisitors()
   {
      if (this.visitors == null)
      {
         return PlayerSet.EMPTY_SET;
      }
   
      return this.visitors;
   }

   public Game withVisitors(Player... value)
   {
      if(value==null){
         return this;
      }
      for (Player item : value)
      {
         if (item != null)
         {
            if (this.visitors == null)
            {
               this.visitors = new PlayerSet();
            }
            
            boolean changed = this.visitors.add (item);

            if (changed)
            {
               item.withObservedGame(this);
               getPropertyChangeSupport().firePropertyChange(PROPERTY_VISITORS, null, item);
            }
         }
      }
      return this;
   } 

   public Game withoutVisitors(Player... value)
   {
      for (Player item : value)
      {
         if ((this.visitors != null) && (item != null))
         {
            if (this.visitors.remove(item))
            {
               item.setObservedGame(null);
               getPropertyChangeSupport().firePropertyChange(PROPERTY_VISITORS, item, null);
            }
         }
      }
      return this;
   }

   public Player createVisitors()
   {
      Player value = new Player();
      withVisitors(value);
      return value;
   }

   public GameState getState() {
      return state;
   }

   public void setState(GameState state) {
      this.state = state;
   }
}
