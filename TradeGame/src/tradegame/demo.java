
package tradegame;
///this Connect to Github
public class demo {
    static Player player = new Player();
    public static void main(String args[]){
        
        System.out.println("Story blaqqq");
        Waterflake();
        System.out.println(player.drunk[0]+""+""+player.drunk[1]);
        Drylagoon();
        System.out.println(player.drunk[2]+""+""+player.drunk[3]);
        System.out.println(player.getMagic(0)+""+""+player.getMagic(1));
        //Redapple();
        //player.Ending(player.CheckEnding());
    }
    
        public static void Waterflake(){
            
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
                                                     Lizz.PlayerMen,Lizz.PlayerJewelry,Lizz.PlayerGold,Lizz.PlayerAlcohol );
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
                        player.setArtifact(0);
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
                        player.setPlayerInventory(Rose.PlayerMedical,Rose.PlayerWeapon,Rose.PlayerFood,
                                                  Rose.PlayerJewelry,Rose.PlayerMen,Rose.PlayerGold,Rose.PlayerAlcohol);
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
                
                switch(player.ScannerSwitch(4)){
                    case 1 : B1_HelenaAshley Helen = new B1_HelenaAshley(player.getFood(),player.getJewelry(),player.getWeapon(),player.getMedical(),
                                                                        player.getMen(),player.getGold(),player.getAlcohol(),player.drunk[2],player.getMagic(0));
                        player.setPlayerInventory(Helen.PlayerFood,Helen.PlayerJewelry,Helen.PlayerWeapon,
                                        Helen.PlayerMedical,Helen.PlayerMen,Helen.PlayerGold,Helen.PlayerAlcohol);
                        player.ShowInventory();
                        player.setDrunk(Helen.drinking,2);
                        player.setMagic(Helen.PlayerMagic[0],0);
                        Drylagoon();
                        break;
                    ////////////////////////////////////////////////////////////////////////////////////////////////////
                    case 2 : B2_MickerGorn Mick = new B2_MickerGorn(player.getFood(),player.getJewelry(),player.getWeapon(),player.getMedical(),
                                                                    player.getMen(),player.getGold(),player.getAlcohol(),player.drunk[3],player.getMagic(0),player.getMagic(1));
                        player.setPlayerInventory(Mick.PlayerFood,Mick.PlayerJewelry,Mick.PlayerWeapon,
                                                  Mick.PlayerMedical,Mick.PlayerMen,Mick.PlayerGold,Mick.PlayerAlcohol);
                        player.ShowInventory();
                        player.setDrunk(Mick.drinking,3);
                        player.setMagic(Mick.PlayerMagic[1],1);
                        Drylagoon();
                        break;
                    ////////////////////////////////////////////////////////////////////////////////////////////////////
                    case 3 : B3_KalonShield Kalon = new B3_KalonShield(player.getFood(),player.getJewelry(),player.getWeapon(),
                                                                       player.getMedical(),player.getMen(),player.getGold(),player.getAlcohol());
                        player.setPlayerInventory(Kalon.PlayerFood,Kalon.PlayerJewelry,Kalon.PlayerWeapon,
                                                  Kalon.PlayerMedical,Kalon.PlayerMen,Kalon.PlayerGold,Kalon.PlayerAlcohol);
                        player.ShowInventory();
                        Drylagoon();
                        break;
                    ////////////////////////////////////////////////////////////////////////////////////////////////////
                    case 4 :;
                }
        }        
        public static void Redapple(){
                
                switch(player.ScannerSwitch(4)){
                    case 1 : C1_GabrielSnyder Gabriel = new C1_GabrielSnyder(player.getFood(),player.getJewelry(),player.getWeapon(),player.getMedical(),
                                                                             player.getMen(),player.getGold(),player.getAlcohol(),player.drunk[4],player.getMagic(1));
                    player.setPlayerInventory(Gabriel.PlayerFood,Gabriel.PlayerJewelry,Gabriel.PlayerWeapon,
                                              Gabriel.PlayerMedical,Gabriel.PlayerMen,Gabriel.PlayerGold,Gabriel.PlayerAlcohol);
                    player.setDrunk(Gabriel.drinking,4);
                    player.ShowInventory();
                    Redapple();
                    break;
                ////////////////////////////////////////////////////////////////////////////////////////////////////
                case 2 : C2_FoxPocketwatch Fox = new C2_FoxPocketwatch(player.getFood(),player.getJewelry(),player.getWeapon(),
                                                                           player.getMedical(),player.getMen(),player.getGold(),player.getAlcohol());
                    player.setPlayerInventory(Fox.PlayerFood,Fox.PlayerJewelry,Fox.PlayerWeapon,
                                              Fox.PlayerMedical,Fox.PlayerMen,Fox.PlayerGold,Fox.PlayerAlcohol);
                    player.ShowInventory();
                    Redapple();
                    break;
                ////////////////////////////////////////////////////////////////////////////////////////////////////
                case 3 : C3_BlueLyrase Blue = new C3_BlueLyrase(player.getFood(),player.getJewelry(),player.getWeapon(),player.getMedical(),
                                                                player.getMen(),player.getGold(),player.getAlcohol(),player.drunk[5]);
                    player.setPlayerInventory(Blue.PlayerFood,Blue.PlayerJewelry,Blue.PlayerWeapon,
                                              Blue.PlayerMedical,Blue.PlayerMen,Blue.PlayerGold,Blue.PlayerAlcohol);
                    player.setDrunk(Blue.drinking,5);
                    player.ShowInventory();
                    Redapple();
                    break;
                ////////////////////////////////////////////////////////////////////////////////////////////////////
                case 4 :;
                }
        }  
        
}//class


