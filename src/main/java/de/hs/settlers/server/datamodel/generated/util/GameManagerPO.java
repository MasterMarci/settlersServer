package de.hs.settlers.server.datamodel.generated.util;

import de.hs.settlers.server.datamodel.generated.SettlersMap;
import org.sdmlib.models.pattern.PatternObject;
import de.hs.settlers.server.datamodel.generated.GameManager;
import de.hs.settlers.server.datamodel.generated.util.GamePO;
import de.hs.settlers.server.datamodel.generated.Game;
import de.hs.settlers.server.datamodel.generated.util.GameManagerPO;
import de.hs.settlers.server.datamodel.generated.util.GameSet;

public class GameManagerPO extends PatternObject<GameManagerPO, GameManager>
{

    public GameManagerSet allMatches()
   {
      this.setDoAllMatches(true);
      
      GameManagerSet matches = new GameManagerSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((GameManager) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public GameManagerPO(){
      newInstance(de.hs.settlers.server.datamodel.generated.util.CreatorCreator.createIdMap("PatternObjectType"));
   }

   public GameManagerPO(GameManager... hostGraphObject) {
      if(hostGraphObject==null || hostGraphObject.length<1){
         return ;
      }
      newInstance(de.hs.settlers.server.datamodel.generated.util.CreatorCreator.createIdMap("PatternObjectType"), hostGraphObject);
   }
   
   //==========================================================================
   
   public void createGame(String name, int maxPlayers, boolean testGame, SettlersMap p3)
   {
      if (this.getPattern().getHasMatch())
      {
          ((GameManager) getCurrentMatch()).createGame(name, maxPlayers, testGame, p3);
      }
   }

   public GamePO hasGames()
   {
      GamePO result = new GamePO(new Game[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(GameManager.PROPERTY_GAMES, result);
      
      return result;
   }

   public GamePO createGames()
   {
      return this.startCreate().hasGames().endCreate();
   }

   public GameManagerPO hasGames(GamePO tgt)
   {
      return hasLinkConstraint(tgt, GameManager.PROPERTY_GAMES);
   }

   public GameManagerPO createGames(GamePO tgt)
   {
      return this.startCreate().hasGames(tgt).endCreate();
   }

   public GameSet getGames()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((GameManager) this.getCurrentMatch()).getGames();
      }
      return null;
   }

}
