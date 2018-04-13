
package tradegame;
public class demo {
    static Player player = new Player();
    public static void main(String args[]){
        
        System.out.println("Story blaqqq");
        Waterflake();
        

    }
    
        public static void Waterflake(){
            
                switch(player.ScannerSwitch(4)){
                    case 1 : System.out.println("Entering Lizza Good store");
                        A1_LizzaRobinhood Lizz = new A1_LizzaRobinhood();
                        player.setPlayerInventory(Lizz.PlayerMedical,Lizz.PlayerWeapon,Lizz.PlayerFood,
                                                    Lizz.PlayerMen,Lizz.PlayerJewelry,Lizz.PlayerGold );
                        player.SetNpcRelation(0,true);
    //System.out.println(    player.GetNpcRelation(0));
                        player.ShowInventory();
                        break;
                    case 2 : //jack
                    case 3 : //someone
                    case 4 : ChooseCity();break;
        }//switch
    }//medthod wtf

        public static void Drylagoon(){}        
        public static void Redapple(){}  
        
        public static void ChooseCity(){   
        System.out.println("choose mata fuker");
                    player.Ending(player.CheckEnding());
                    switch(player.ScannerSwitch(3)){
                    case 1 : Waterflake();
                    case 2 : //Dralagoon
                    case 3 : //Redapple
                        }
        }//medthod CC
    
    
}//class


