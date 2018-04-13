
package tradegame;
public class A3_PriscillaRose extends CityWaterflake implements LaborBroker {
    A3_PriscillaRose(int PlayerMedical,int PlayerWeapon,int PlayerFood,
                      int PlayerJewelry,int PlayerMen,int PlayerGold){    
    super(PlayerMedical,PlayerWeapon,PlayerFood,
          PlayerJewelry,PlayerMen,PlayerGold);   
    
    System.out.println("[Npc:Priscilla Rose]"); ///////this constructor will have been called 3rd 
    System.out.println("Welcome to Heartwarming inn"); 
    Greeting();
    System.out.println("See you soon.");
    }
    
    
     void Greeting(){
            System.out.println("(1) Can I ask you something ?"
            + "\n(2) How about a drink ?"
            + "\n(3) I want a room to rest"
            + "\n(4) I want to hire men around here"        
            + "\n(5) Let trade things to another things."
            + "\n(6) I need to go.");
            
            switch(ScannerSwitch(6)){
                case 1 : Asking() ;break ;    
                case 2 : Drinking();break ;   
                case 3 : break ;   
                case 4 : HireMan();break ;   
                case 5 : FreeTrade(); break ;   
                case 6 : break ;   
                
            }
         
     
     }
     
     void Sleeping(){
     //player got Nightmare about halfBeastmonster
     }
     void Asking(){}
     void Drinking(){
     //she tell that Jack already death
     //Nightmare about halfBeastmonster
     }
     public void HireMan(){}
     void FreeTrade(){}
}
