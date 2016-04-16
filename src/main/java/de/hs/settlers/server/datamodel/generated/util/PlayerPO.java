package de.hs.settlers.server.datamodel.generated.util;

import org.sdmlib.models.pattern.PatternObject;
import de.hs.settlers.server.datamodel.generated.Player;
import org.sdmlib.models.pattern.AttributeConstraint;
import de.hs.settlers.server.datamodel.generated.util.TeamPO;
import de.hs.settlers.server.datamodel.generated.Team;
import de.hs.settlers.server.datamodel.generated.util.PlayerPO;
import de.hs.settlers.server.datamodel.generated.util.GamePO;
import de.hs.settlers.server.datamodel.generated.Game;

public class PlayerPO extends PatternObject<PlayerPO, Player>
{

    public PlayerSet allMatches()
   {
      this.setDoAllMatches(true);
      
      PlayerSet matches = new PlayerSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((Player) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public PlayerPO(){
      newInstance(de.hs.settlers.server.datamodel.generated.util.CreatorCreator.createIdMap("PatternObjectType"));
   }

   public PlayerPO(Player... hostGraphObject) {
      if(hostGraphObject==null || hostGraphObject.length<1){
         return ;
      }
      newInstance(de.hs.settlers.server.datamodel.generated.util.CreatorCreator.createIdMap("PatternObjectType"), hostGraphObject);
   }
   public PlayerPO hasName(String value)
   {
      new AttributeConstraint()
      .withAttrName(Player.PROPERTY_NAME)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.hasAttr();
      
      return this;
   }
   
   public PlayerPO hasName(String lower, String upper)
   {
      new AttributeConstraint()
      .withAttrName(Player.PROPERTY_NAME)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.hasAttr();
      
      return this;
   }
   
   public PlayerPO createName(String value)
   {
      this.startCreate().hasName(value).endCreate();
      return this;
   }
   
   public String getName()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Player) getCurrentMatch()).getName();
      }
      return null;
   }
   
   public PlayerPO withName(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((Player) getCurrentMatch()).setName(value);
      }
      return this;
   }
   
   public PlayerPO hasPassword(String value)
   {
      new AttributeConstraint()
      .withAttrName(Player.PROPERTY_PASSWORD)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.hasAttr();
      
      return this;
   }
   
   public PlayerPO hasPassword(String lower, String upper)
   {
      new AttributeConstraint()
      .withAttrName(Player.PROPERTY_PASSWORD)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.hasAttr();
      
      return this;
   }
   
   public PlayerPO createPassword(String value)
   {
      this.startCreate().hasPassword(value).endCreate();
      return this;
   }
   
   public String getPassword()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Player) getCurrentMatch()).getPassword();
      }
      return null;
   }
   
   public PlayerPO withPassword(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((Player) getCurrentMatch()).setPassword(value);
      }
      return this;
   }
   
   public PlayerPO hasOnline(boolean value)
   {
      new AttributeConstraint()
      .withAttrName(Player.PROPERTY_ONLINE)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.hasAttr();
      
      return this;
   }
   
   public PlayerPO createOnline(boolean value)
   {
      this.startCreate().hasOnline(value).endCreate();
      return this;
   }
   
   public boolean getOnline()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Player) getCurrentMatch()).isOnline();
      }
      return false;
   }
   
   public PlayerPO withOnline(boolean value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((Player) getCurrentMatch()).setOnline(value);
      }
      return this;
   }
   
   public PlayerPO hasStatus(String value)
   {
      new AttributeConstraint()
      .withAttrName(Player.PROPERTY_STATUS)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.hasAttr();
      
      return this;
   }
   
   public PlayerPO hasStatus(String lower, String upper)
   {
      new AttributeConstraint()
      .withAttrName(Player.PROPERTY_STATUS)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.hasAttr();
      
      return this;
   }
   
   public PlayerPO createStatus(String value)
   {
      this.startCreate().hasStatus(value).endCreate();
      return this;
   }
   
   public String getStatus()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Player) getCurrentMatch()).getStatus();
      }
      return null;
   }
   
   public PlayerPO withStatus(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((Player) getCurrentMatch()).setStatus(value);
      }
      return this;
   }
   
   public TeamPO hasTeam()
   {
      TeamPO result = new TeamPO(new Team[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(Player.PROPERTY_TEAM, result);
      
      return result;
   }

   public TeamPO createTeam()
   {
      return this.startCreate().hasTeam().endCreate();
   }

   public PlayerPO hasTeam(TeamPO tgt)
   {
      return hasLinkConstraint(tgt, Player.PROPERTY_TEAM);
   }

   public PlayerPO createTeam(TeamPO tgt)
   {
      return this.startCreate().hasTeam(tgt).endCreate();
   }

   public Team getTeam()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Player) this.getCurrentMatch()).getTeam();
      }
      return null;
   }

   public GamePO hasActiveGame()
   {
      GamePO result = new GamePO(new Game[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(Player.PROPERTY_ACTIVEGAME, result);
      
      return result;
   }

   public GamePO createActiveGame()
   {
      return this.startCreate().hasActiveGame().endCreate();
   }

   public PlayerPO hasActiveGame(GamePO tgt)
   {
      return hasLinkConstraint(tgt, Player.PROPERTY_ACTIVEGAME);
   }

   public PlayerPO createActiveGame(GamePO tgt)
   {
      return this.startCreate().hasActiveGame(tgt).endCreate();
   }

   public Game getActiveGame()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Player) this.getCurrentMatch()).getActiveGame();
      }
      return null;
   }

   public GamePO hasObservedGame()
   {
      GamePO result = new GamePO(new Game[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(Player.PROPERTY_OBSERVEDGAME, result);
      
      return result;
   }

   public GamePO createObservedGame()
   {
      return this.startCreate().hasObservedGame().endCreate();
   }

   public PlayerPO hasObservedGame(GamePO tgt)
   {
      return hasLinkConstraint(tgt, Player.PROPERTY_OBSERVEDGAME);
   }

   public PlayerPO createObservedGame(GamePO tgt)
   {
      return this.startCreate().hasObservedGame(tgt).endCreate();
   }

   public Game getObservedGame()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Player) this.getCurrentMatch()).getObservedGame();
      }
      return null;
   }

}
