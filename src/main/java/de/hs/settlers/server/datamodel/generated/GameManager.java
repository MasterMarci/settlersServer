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
import de.hs.settlers.server.datamodel.generated.util.GameSet;

/**
    * 
    * @see <a href='../../../../../../../../../src/main/java/de/hs/settlers/server/datamodel/sdmlib/ModelGenerator.java'>ModelGenerator.java</a>/n */
   public  class GameManager implements SendableEntity
{

   
   //==========================================================================
   public Game createGame(String name, int maxPlayers, boolean testGame, SettlersMap p3 )
   {
      if(games == null) {
         games = new GameSet();
      }
      Game game = new Game().withName(name).withMaxPlayers(maxPlayers).withTestGame(testGame).withMap(p3);
      getGames().add(game);
      return game;
   }

   
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
   
      withoutGames(this.getGames().toArray(new Game[this.getGames().size()]));
      getPropertyChangeSupport().firePropertyChange("REMOVE_YOU", this, null);
   }

   
   /********************************************************************
    * <pre>
    *              one                       many
    * GameManager ----------------------------------- Game
    *              gameManager                   games
    * </pre>
    */
   
   public static final String PROPERTY_GAMES = "games";

   private GameSet games = null;
   
   public GameSet getGames()
   {
      if (this.games == null)
      {
         return GameSet.EMPTY_SET;
      }
   
      return this.games;
   }

   public GameManager withGames(Game... value)
   {
      if(value==null){
         return this;
      }
      for (Game item : value)
      {
         if (item != null)
         {
            if (this.games == null)
            {
               this.games = new GameSet();
            }
            
            boolean changed = this.games.add (item);

            if (changed)
            {
               item.withGameManager(this);
               getPropertyChangeSupport().firePropertyChange(PROPERTY_GAMES, null, item);
            }
         }
      }
      return this;
   } 

   public GameManager withoutGames(Game... value)
   {
      for (Game item : value)
      {
         if ((this.games != null) && (item != null))
         {
            if (this.games.remove(item))
            {
               item.setGameManager(null);
               getPropertyChangeSupport().firePropertyChange(PROPERTY_GAMES, item, null);
            }
         }
      }
      return this;
   }

   public Game createGames()
   {
      Game value = new Game();
      withGames(value);
      return value;
   } 
}
