package de.hs.settlers.server.datamodel.generated.util;

import org.sdmlib.models.pattern.PatternObject;
import de.hs.settlers.server.datamodel.generated.Team;
import org.sdmlib.models.pattern.AttributeConstraint;
import de.hs.settlers.server.datamodel.generated.util.PlayerPO;
import de.hs.settlers.server.datamodel.generated.Player;
import de.hs.settlers.server.datamodel.generated.util.TeamPO;
import de.hs.settlers.server.datamodel.generated.util.PlayerSet;

public class TeamPO extends PatternObject<TeamPO, Team>
{

    public TeamSet allMatches()
   {
      this.setDoAllMatches(true);
      
      TeamSet matches = new TeamSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((Team) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public TeamPO(){
      newInstance(de.hs.settlers.server.datamodel.generated.util.CreatorCreator.createIdMap("PatternObjectType"));
   }

   public TeamPO(Team... hostGraphObject) {
      if(hostGraphObject==null || hostGraphObject.length<1){
         return ;
      }
      newInstance(de.hs.settlers.server.datamodel.generated.util.CreatorCreator.createIdMap("PatternObjectType"), hostGraphObject);
   }
   public TeamPO hasName(String value)
   {
      new AttributeConstraint()
      .withAttrName(Team.PROPERTY_NAME)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.hasAttr();
      
      return this;
   }
   
   public TeamPO hasName(String lower, String upper)
   {
      new AttributeConstraint()
      .withAttrName(Team.PROPERTY_NAME)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.hasAttr();
      
      return this;
   }
   
   public TeamPO createName(String value)
   {
      this.startCreate().hasName(value).endCreate();
      return this;
   }
   
   public String getName()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Team) getCurrentMatch()).getName();
      }
      return null;
   }
   
   public TeamPO withName(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((Team) getCurrentMatch()).setName(value);
      }
      return this;
   }
   
   public PlayerPO hasTeammates()
   {
      PlayerPO result = new PlayerPO(new Player[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(Team.PROPERTY_TEAMMATES, result);
      
      return result;
   }

   public PlayerPO createTeammates()
   {
      return this.startCreate().hasTeammates().endCreate();
   }

   public TeamPO hasTeammates(PlayerPO tgt)
   {
      return hasLinkConstraint(tgt, Team.PROPERTY_TEAMMATES);
   }

   public TeamPO createTeammates(PlayerPO tgt)
   {
      return this.startCreate().hasTeammates(tgt).endCreate();
   }

   public PlayerSet getTeammates()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Team) this.getCurrentMatch()).getTeammates();
      }
      return null;
   }

}
