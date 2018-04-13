
package tradegame;
public class A3_PriscillaRose extends CityWaterflake implements LaborBroker {
    A3_PriscillaRose(){
    System.out.println("[Npc:Priscilla Rosed]"); ///////this constructor will have been called 3rd 
    System.out.println("Welcome to Heartwarming inn"); 
    Greeting();
    System.out.println("See you around.");
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
                case 2 : break ;   
                case 3 : break ;   
                case 4 : break ;   
                case 5 : break ;   
                case 6 : break ;   
                
            }
         
     
     }
     
     
     void Asking(){}
     void Drinking(){}
     public void HireMan(){}
}
