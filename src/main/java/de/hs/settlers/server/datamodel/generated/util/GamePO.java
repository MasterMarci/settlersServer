package de.hs.settlers.server.datamodel.generated.util;

import org.sdmlib.models.pattern.PatternObject;
import de.hs.settlers.server.datamodel.generated.Game;
import org.sdmlib.models.pattern.AttributeConstraint;
import de.hs.settlers.server.datamodel.generated.util.SettlersMapPO;
import de.hs.settlers.server.datamodel.generated.SettlersMap;
import de.hs.settlers.server.datamodel.generated.util.GamePO;
import de.hs.settlers.server.datamodel.generated.util.GameManagerPO;
import de.hs.settlers.server.datamodel.generated.GameManager;
import de.hs.settlers.server.datamodel.generated.util.PlayerPO;
import de.hs.settlers.server.datamodel.generated.Player;
import de.hs.settlers.server.datamodel.generated.util.PlayerSet;

public class GamePO extends PatternObject<GamePO, Game>
{

    public GameSet allMatches()
   {
      this.setDoAllMatches(true);
      
      GameSet matches = new GameSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((Game) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public GamePO(){
      newInstance(de.hs.settlers.server.datamodel.generated.util.CreatorCreator.createIdMap("PatternObjectType"));
   }

   public GamePO(Game... hostGraphObject) {
      if(hostGraphObject==null || hostGraphObject.length<1){
         return ;
      }
      newInstance(de.hs.settlers.server.datamodel.generated.util.CreatorCreator.createIdMap("PatternObjectType"), hostGraphObject);
   }
   public GamePO hasName(String value)
   {
      new AttributeConstraint()
      .withAttrName(Game.PROPERTY_NAME)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.hasAttr();
      
      return this;
   }
   
   public GamePO hasName(String lower, String upper)
   {
      new AttributeConstraint()
      .withAttrName(Game.PROPERTY_NAME)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.hasAttr();
      
      return this;
   }
   
   public GamePO createName(String value)
   {
      this.startCreate().hasName(value).endCreate();
      return this;
   }
   
   public String getName()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Game) getCurrentMatch()).getName();
      }
      return null;
   }
   
   public GamePO withName(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((Game) getCurrentMatch()).setName(value);
      }
      return this;
   }
   
   public GamePO hasMaxPlayers(int value)
   {
      new AttributeConstraint()
      .withAttrName(Game.PROPERTY_MAXPLAYERS)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.hasAttr();
      
      return this;
   }
   
   public GamePO hasMaxPlayers(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(Game.PROPERTY_MAXPLAYERS)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.hasAttr();
      
      return this;
   }
   
   public GamePO createMaxPlayers(int value)
   {
      this.startCreate().hasMaxPlayers(value).endCreate();
      return this;
   }
   
   public int getMaxPlayers()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Game) getCurrentMatch()).getMaxPlayers();
      }
      return 0;
   }
   
   public GamePO withMaxPlayers(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((Game) getCurrentMatch()).setMaxPlayers(value);
      }
      return this;
   }
   
   public GamePO hasTestGame(boolean value)
   {
      new AttributeConstraint()
      .withAttrName(Game.PROPERTY_TESTGAME)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.hasAttr();
      
      return this;
   }
   
   public GamePO createTestGame(boolean value)
   {
      this.startCreate().hasTestGame(value).endCreate();
      return this;
   }
   
   public boolean getTestGame()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Game) getCurrentMatch()).isTestGame();
      }
      return false;
   }
   
   public GamePO withTestGame(boolean value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((Game) getCurrentMatch()).setTestGame(value);
      }
      return this;
   }
   
   public SettlersMapPO hasMap()
   {
      SettlersMapPO result = new SettlersMapPO(new SettlersMap[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(Game.PROPERTY_MAP, result);
      
      return result;
   }

   public SettlersMapPO createMap()
   {
      return this.startCreate().hasMap().endCreate();
   }

   public GamePO hasMap(SettlersMapPO tgt)
   {
      return hasLinkConstraint(tgt, Game.PROPERTY_MAP);
   }

   public GamePO createMap(SettlersMapPO tgt)
   {
      return this.startCreate().hasMap(tgt).endCreate();
   }

   public SettlersMap getMap()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Game) this.getCurrentMatch()).getMap();
      }
      return null;
   }

   public GameManagerPO hasGameManager()
   {
      GameManagerPO result = new GameManagerPO(new GameManager[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(Game.PROPERTY_GAMEMANAGER, result);
      
      return result;
   }

   public GameManagerPO createGameManager()
   {
      return this.startCreate().hasGameManager().endCreate();
   }

   public GamePO hasGameManager(GameManagerPO tgt)
   {
      return hasLinkConstraint(tgt, Game.PROPERTY_GAMEMANAGER);
   }

   public GamePO createGameManager(GameManagerPO tgt)
   {
      return this.startCreate().hasGameManager(tgt).endCreate();
   }

   public GameManager getGameManager()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Game) this.getCurrentMatch()).getGameManager();
      }
      return null;
   }

   public PlayerPO hasPlayers()
   {
      PlayerPO result = new PlayerPO(new Player[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(Game.PROPERTY_PLAYERS, result);
      
      return result;
   }

   public PlayerPO createPlayers()
   {
      return this.startCreate().hasPlayers().endCreate();
   }

   public GamePO hasPlayers(PlayerPO tgt)
   {
      return hasLinkConstraint(tgt, Game.PROPERTY_PLAYERS);
   }

   public GamePO createPlayers(PlayerPO tgt)
   {
      return this.startCreate().hasPlayers(tgt).endCreate();
   }

   public PlayerSet getPlayers()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Game) this.getCurrentMatch()).getPlayers();
      }
      return null;
   }

   public PlayerPO hasVisitors()
   {
      PlayerPO result = new PlayerPO(new Player[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(Game.PROPERTY_VISITORS, result);
      
      return result;
   }

   public PlayerPO createVisitors()
   {
      return this.startCreate().hasVisitors().endCreate();
   }

   public GamePO hasVisitors(PlayerPO tgt)
   {
      return hasLinkConstraint(tgt, Game.PROPERTY_VISITORS);
   }

   public GamePO createVisitors(PlayerPO tgt)
   {
      return this.startCreate().hasVisitors(tgt).endCreate();
   }

   public PlayerSet getVisitors()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Game) this.getCurrentMatch()).getVisitors();
      }
      return null;
   }

}
