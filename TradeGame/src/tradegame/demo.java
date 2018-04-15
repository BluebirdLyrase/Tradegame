
package tradegame;
///this Connect to Github
public class demo {
    static Player player = new Player();
    public static void main(String args[]){
        
        System.out.println("Story blaqqq");
        Waterflake();
        Drylagoon();
        Redapple();
        player.Ending(player.CheckEnding());
    }
    
        public static void Waterflake(){
            
                switch(player.ScannerSwitch(4)){
                    case 1 : System.out.println("Entering Lizza Good store");
                        A1_LizzaRobinhood Lizz = new A1_LizzaRobinhood(player.getMedical(),player.getWeapon(),player.getFood(),
                                                                       player.getJewelry(),player.getMen(),player.getGold());
                        player.setPlayerInventory(Lizz.PlayerMedical,Lizz.PlayerWeapon,Lizz.PlayerFood,
                                                     Lizz.PlayerMen,Lizz.PlayerJewelry,Lizz.PlayerGold );
                        player.ShowInventory();
                        Waterflake();
                        break;
                        
                    case 2 : A2_JackBlergen Jack = new A2_JackBlergen(player.getMedical(),player.getWeapon(),player.getFood(),
                                                                      player.getJewelry(),player.getMen(),player.getGold());
                        player.setPlayerInventory(Jack.PlayerMedical,Jack.PlayerWeapon,Jack.PlayerFood,
                                                  Jack.PlayerJewelry,Jack.PlayerMen,Jack.PlayerGold);
                        player.ShowInventory();
                        Waterflake();
                        break;
                        
                    case 3 :A3_PriscillaRose Rose = new A3_PriscillaRose(player.getMedical(),player.getWeapon(),player.getFood(),
                                                                       player.getJewelry(),player.getMen(),player.getGold());
                        player.setPlayerInventory(Rose.PlayerMedical,Rose.PlayerWeapon,Rose.PlayerFood,
                                                  Rose.PlayerJewelry,Rose.PlayerMen,Rose.PlayerGold);
                        player.ShowInventory();
                        Waterflake();
                        break;
                        
                    
                    case 4 :;
        }//switch
    }//medthod wtf

        public static void Drylagoon(){}        
        public static void Redapple(){}  
        
}//class


