package de.hs.settlers.server.datamodel.generated.util;

import org.sdmlib.models.pattern.PatternObject;
import de.hs.settlers.server.datamodel.generated.SettlersMap;
import org.sdmlib.models.pattern.AttributeConstraint;
import de.hs.settlers.server.datamodel.generated.util.GamePO;
import de.hs.settlers.server.datamodel.generated.Game;
import de.hs.settlers.server.datamodel.generated.util.SettlersMapPO;
import de.hs.settlers.server.datamodel.generated.util.GameSet;

public class SettlersMapPO extends PatternObject<SettlersMapPO, SettlersMap>
{

    public SettlersMapSet allMatches()
   {
      this.setDoAllMatches(true);
      
      SettlersMapSet matches = new SettlersMapSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((SettlersMap) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public SettlersMapPO(){
      newInstance(de.hs.settlers.server.datamodel.generated.util.CreatorCreator.createIdMap("PatternObjectType"));
   }

   public SettlersMapPO(SettlersMap... hostGraphObject) {
      if(hostGraphObject==null || hostGraphObject.length<1){
         return ;
      }
      newInstance(de.hs.settlers.server.datamodel.generated.util.CreatorCreator.createIdMap("PatternObjectType"), hostGraphObject);
   }
   public SettlersMapPO hasName(String value)
   {
      new AttributeConstraint()
      .withAttrName(SettlersMap.PROPERTY_NAME)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.hasAttr();
      
      return this;
   }
   
   public SettlersMapPO hasName(String lower, String upper)
   {
      new AttributeConstraint()
      .withAttrName(SettlersMap.PROPERTY_NAME)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.hasAttr();
      
      return this;
   }
   
   public SettlersMapPO createName(String value)
   {
      this.startCreate().hasName(value).endCreate();
      return this;
   }
   
   public String getName()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((SettlersMap) getCurrentMatch()).getName();
      }
      return null;
   }
   
   public SettlersMapPO withName(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((SettlersMap) getCurrentMatch()).setName(value);
      }
      return this;
   }
   
   public GamePO hasGames()
   {
      GamePO result = new GamePO(new Game[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(SettlersMap.PROPERTY_GAMES, result);
      
      return result;
   }

   public GamePO createGames()
   {
      return this.startCreate().hasGames().endCreate();
   }

   public SettlersMapPO hasGames(GamePO tgt)
   {
      return hasLinkConstraint(tgt, SettlersMap.PROPERTY_GAMES);
   }

   public SettlersMapPO createGames(GamePO tgt)
   {
      return this.startCreate().hasGames(tgt).endCreate();
   }

   public GameSet getGames()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((SettlersMap) this.getCurrentMatch()).getGames();
      }
      return null;
   }

}
