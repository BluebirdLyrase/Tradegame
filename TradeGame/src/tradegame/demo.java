package tradegame;
///this Connect to Github
public class demo {
    static Player player = new Player();
    public static void main(String args[]){ 
        System.out.println("[CommonEnding:End the game with 5000 gold]");
        System.out.println("[BadEnding:End the game with Blow 5000 gold]");
        System.out.println("[TruenEnding:End the game with all artifact]");
        Waterflake();
        Travel t = new Travel(player.getMedical(),player.getWeapon(),player.getFood(),player.getJewelry(),
                              player.getMen(),player.getGold(),player.getArtifact(0),"Drylagoon");
        player.setPlayerInventory(t.PlayerMedical,t.PlayerWeapon,t.PlayerFood,
                                                     t.PlayerMen,t.PlayerJewelry,t.PlayerGold,player.getAlcohol());
        Drylagoon();
        Travel t2 = new Travel(player.getMedical(),player.getWeapon(),player.getFood(),player.getJewelry(),
               player.getMen(),player.getGold(),player.getArtifact(0),"Redapple");
        player.setPlayerInventory(t2.PlayerMedical,t2.PlayerWeapon,t2.PlayerFood,
                                                     t2.PlayerMen,t2.PlayerJewelry,t2.PlayerGold,player.getAlcohol());
        Redapple();
        boolean JokeEnding = player.drunk[0]&&player.drunk[1]&&player.drunk[2]&&
                             player.drunk[3]&&player.drunk[4]&&player.drunk[5];
        boolean TrueEnding = player.getArtifact(0)&&player.getArtifact(1)&&player.getArtifact(2);
        player.Ending(JokeEnding,TrueEnding,player.getGold());
        ThankYou xxx = new ThankYou();
        
    }
    
        public static void Waterflake(){
                System.out.println("-------------------------------------");
                System.out.println("Choose Where to go"
                        + "\n(1)Lizza Good store"
                        + "\n(2)Waterfalke river"
                        + "\n(3)Heartwarming inn"
                        + "\n(4)Travel to Drylagoon");
            
                switch(player.ScannerSwitch(4)){
                    case 1 : System.out.println(">>>Entering Lizza Good store<<<");
A1_LizzaRobinhood Lizz = new A1_LizzaRobinhood(player.getMedical(),player.getWeapon(),player.getFood(),
player.getJewelry(),player.getMen(),player.getGold(),player.getAlcohol());
                        player.setPlayerInventory(Lizz.PlayerMedical,Lizz.PlayerWeapon,Lizz.PlayerFood,
                                                  Lizz.PlayerJewelry,Lizz.PlayerMen,Lizz.PlayerGold,Lizz.PlayerAlcohol );
                        player.ShowInventory();
                        Waterflake();
                        break;
                    ////////////////////////////////////////////////////////////////////////////////////////////////////   
                    case 2 : 
                        System.out.println(">>>Traveling to Waterfalke river<<<");
                        if(player.getArtifact(0)){
                        System.out.println("'Jack is gone'");    
                        }else{
                        A2_JackBlergen Jack = new A2_JackBlergen(player.getMedical(),player.getWeapon(),player.getFood(),
                        player.getJewelry(),player.getMen(),player.getGold(),player.getAlcohol()
                                                                      ,player.getSingleTimeEvent(0),player.drunk[0]);
                        player.setPlayerInventory(Jack.PlayerMedical,Jack.PlayerWeapon,Jack.PlayerFood,Jack.PlayerJewelry,
                                                    Jack.PlayerMen,Jack.PlayerGold,Jack.PlayerAlcohol);
                        player.setArtifact(0,Jack.Necklace);
                        player.setSingleTimeEvent(0);
                        player.setDrunk(Jack.drinking,0);
                        player.ShowInventory();
                        }
                        Waterflake();
                        break;
                    ////////////////////////////////////////////////////////////////////////////////////////////////////       
                    case 3 :
                        System.out.println(">>>Entering Heartwarming inn<<<");
   A3_PriscillaRose Rose = new A3_PriscillaRose(player.getMedical(),player.getWeapon(),player.getFood(),player.getJewelry(),
   player.getMen(),player.getGold(),player.getAlcohol(),player.drunk[1]);
                        player.setPlayerInventory(Rose.PlayerMedical,Rose.PlayerWeapon,Rose.PlayerFood,Rose.PlayerJewelry,
                                                    Rose.PlayerMen,Rose.PlayerGold,Rose.PlayerAlcohol);
                        player.ShowInventory();
                        player.setDrunk(Rose.drinking,1);
                        Waterflake();
                        break;
                    ////////////////////////////////////////////////////////////////////////////////////////////////////
                    case 4 :
                    System.out.println("Traveling to Drylagoon");    
                        break;  
        }//switch              
    }//medthod wtf
        public static void Drylagoon(){
            System.out.println("-------------------------------------");  
             System.out.println("Choose Where to go"
                        + "\n(1)Old Magic School"
                        + "\n(2)Blacksmite Store"
                        + "\n(3)Drylagoon Guardhouse"
                        + "\n(4)Travel to Redapple");
            
                switch(player.ScannerSwitch(4)){
                    case 1 :                        
                        if(player.getArtifact(1)){
                        System.out.println("'The door is lock'");    
                        }else{
                        System.out.println(">>>Entering Old MaGic School<<<");    
B1_HelenaAshley Helen = new B1_HelenaAshley(player.getMedical(),player.getWeapon(),player.getFood(),player.getJewelry(),
                         player.getMen(),player.getGold(),player.getAlcohol(),player.drunk[2],player.getMagic(0));
                        player.setPlayerInventory(Helen.PlayerMedical,Helen.PlayerWeapon,Helen.PlayerFood,
                                        Helen.PlayerJewelry,Helen.PlayerMen,Helen.PlayerGold,Helen.PlayerAlcohol);
                        player.setArtifact(1,Helen.Knowledge);
                        player.setDrunk(Helen.drinking,2);
                        player.setMagic(Helen.PlayerMagic[0],0);
                        player.ShowInventory();
                                }
                        Drylagoon();
                        break;
                    ////////////////////////////////////////////////////////////////////////////////////////////////////
                    case 2 : 
                        if(player.reported[0]){
                         System.out.println("He has gone");
                        }else{
                        System.out.println(">>>Blacksmite Stroe<<<");    
B2_MickerGorn Mick = new B2_MickerGorn(player.getMedical(),player.getWeapon(),player.getFood(),player.getJewelry(),player.getMen(),
player.getGold(),player.getAlcohol(),player.drunk[3],player.getMagic(0),player.getMagic(1),player.report[0]);
                        player.setPlayerInventory(Mick.PlayerMedical,Mick.PlayerWeapon,Mick.PlayerFood,
                                                  Mick.PlayerJewelry,Mick.PlayerMen,Mick.PlayerGold,Mick.PlayerAlcohol);
                        player.ShowInventory();
                        player.setDrunk(Mick.drinking,3);
                        player.setMagic(Mick.PlayerMagic[1],1);
                        player.report[0] = Mick.report;
                        }
                        Drylagoon();
                        break;
                    ////////////////////////////////////////////////////////////////////////////////////////////////////
                    case 3 : 
                        System.out.println(">>>Entering Drylagoon Guardhouse<<<");    
B3_KalonShield Kalon = new B3_KalonShield(player.getMedical(),player.getWeapon(),player.getFood(),
player.getJewelry(),player.getMen(),player.getGold(),player.getAlcohol(),player.report[0],player.reported[0]);
                        player.setPlayerInventory(Kalon.PlayerMedical,Kalon.PlayerWeapon,Kalon.PlayerFood,
                        Kalon.PlayerJewelry,Kalon.PlayerMen,Kalon.PlayerGold,Kalon.PlayerAlcohol);
                        player.ShowInventory();
                        player.reported[0] = Kalon.reported ;
                        Drylagoon();
                        break;
                    ////////////////////////////////////////////////////////////////////////////////////////////////////
                    case 4 :;
                }
        }        
        public static void Redapple(){
            System.out.println("-------------------------------------");  
                 System.out.println("Choose Where to go"
                        + "\n(1)The Hunter Hub"
                        + "\n(2)Redapple Guardhouse"
                        + "\n(3)The Black store"
                        + "\n(4)End the game");
                
                switch(player.ScannerSwitch(4)){

                    case 1 : 
                        if(player.getArtifact(2)){
                        System.out.println("'He is gone'");    
                        }else{
                     System.out.println(">>>Entering The Hunter Hub<<");           
C1_GabrielSnyder Gabriel = new C1_GabrielSnyder(player.getMedical(),player.getWeapon(),player.getFood(),player.getJewelry(),
 player.getMen(),player.getGold(),player.getAlcohol(),player.drunk[4],player.getMagic(1));
                    player.setPlayerInventory(Gabriel.PlayerMedical,Gabriel.PlayerWeapon,Gabriel.PlayerFood,
                                              Gabriel.PlayerJewelry,Gabriel.PlayerMen,Gabriel.PlayerGold,Gabriel.PlayerAlcohol);
                    player.setDrunk(Gabriel.drinking,4);
                    player.ShowInventory();
                    player.setArtifact(2,Gabriel.Dragonegg);
                                }
                    Redapple();
                    break;
                ////////////////////////////////////////////////////////////////////////////////////////////////////
                case 2 : 
                     System.out.println(">>>Entering Redapple Guardhouse<<<");   
            C2_FoxPocketwatch Fox = new C2_FoxPocketwatch(player.getMedical(),player.getWeapon(),player.getFood(),
            player.getJewelry(),player.getMen(),player.getGold(),player.getAlcohol(),player.report[1],player.reported[1]);
                    player.setPlayerInventory(Fox.PlayerMedical,Fox.PlayerWeapon,Fox.PlayerFood,
                                              Fox.PlayerJewelry,Fox.PlayerMen,Fox.PlayerGold,Fox.PlayerAlcohol);
                    player.reported[1] = Fox.reported;
                    player.ShowInventory();
                    Redapple();
                    break;
                ////////////////////////////////////////////////////////////////////////////////////////////////////
                case 3 : 
                     if(player.reported[1]){
                    System.out.println("He has gone");
                    }else{
                    System.out.println(">>>Entering The Black Store<<<");      
            C3_BlueLyrase Blue = new C3_BlueLyrase(player.getMedical(),player.getWeapon(),player.getFood(),player.getJewelry(),
            player.getMen(),player.getGold(),player.getAlcohol(),player.drunk[5],player.report[1]);
                    player.setPlayerInventory(Blue.PlayerMedical,Blue.PlayerWeapon,Blue.PlayerFood,
                                              Blue.PlayerJewelry,Blue.PlayerMen,Blue.PlayerGold,Blue.PlayerAlcohol);
                    player.report[1] = Blue.report ;
                    player.setDrunk(Blue.drinking,5);
                    player.ShowInventory();
                     }
                    Redapple();
                    break;
                ////////////////////////////////////////////////////////////////////////////////////////////////////
                case 4 :;
                }
        }
}//class 193
