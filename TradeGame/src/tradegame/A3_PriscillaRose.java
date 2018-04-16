
package tradegame;
public class A3_PriscillaRose extends CityWaterflake implements LaborBroker {
    A3_PriscillaRose(int PlayerMedical,int PlayerWeapon,int PlayerFood,
                      int PlayerJewelry,int PlayerMen,int PlayerGold,int PlayerAlcohol){    
    super(PlayerMedical,PlayerWeapon,PlayerFood,
          PlayerJewelry,PlayerMen,PlayerGold,PlayerAlcohol);   
    
    System.out.println("[Npc:Priscilla Rose]"); ///////this constructor will have been called 3rd 
    System.out.println("Rose: Welcome to Heartwarming inn"); 
    Greeting();
    System.out.println("Rose: See you soon.");
    }
    
    
     void Greeting(){
            System.out.println("(1) Can I ask you something ?"
            + "\n(2) How about a drink ?"
            + "\n(3) I want a room to rest"
            + "\n(4) I want to hire men around here"
            + "\n(5) I want to buy some moonshine."        
            + "\n(6) Let trade things to another things."
            + "\n(7) I need to go.");
            
            switch(ScannerSwitch(7)){
                case 1 : Asking() ;break ;    
                case 2 : Drinking();break ;   
                case 3 : Sleeping() ;break ;   
                case 4 : HireMan();break ;
                case 5 : Buymoonshine();break;
                case 6 : FreeTrade(); break ;   
                case 7 : break ;   
                
            }
         
     
     }
     
     void Sleeping(){
     //player got Nightmare about halfBeastmonster
     }
     void Asking(){
     
     }
     void Drinking(){
     // 1 she tell that Jack already death
     //Nightmare about halfBeastmonster
     }
     public void HireMan(){   
    System.out.println("1 men for "+Manprice+" gold");          
    System.out.println("Rose: How many men do you want to hire?");    
    do{   
    System.out.println("Men Quantity>>>");
    Quantity=ScannerTrade(); //for Scan amount of goods player want to Buy
    if(Quantity==0)System.out.println("Rose: Look like you dont want to hire men around here."); //if player type 0 amount of goods 
    TotalPrice = Quantity*Manprice; // to set amount of player's gold that will be use in GoldSetter(-)
    if(TotalPrice>PlayerGold){//Happening when player type more amount of Good then he can afford it 
    System.out.println("Rose: Sorry, that is not enough gold to hire "+Quantity+" amount of men. "
              + "\n you may change that number.");
    }
    }while(TotalPrice>PlayerGold);
    GoldSetter("-");//Goldsetter will use variable in this class by itself - mean to decresed player gold that setgold() mean to set new amount of player gold
    Show("Gold",PlayerGold);//show player gold
    PlayerMen = QuantitySetter("+",PlayerMen);
    Show("Men",PlayerMen);
    }    
     
    
     void Buymoonshine(){
    System.out.println("1 bottle of moonshrine for "+Alcoholprice+" gold");          
    System.out.println("Rose: How many men do you want handsome?");    
    do{   
    System.out.println("moonshrine Quantity>>>");
    Quantity=ScannerTrade(); //for Scan amount of goods player want to Buy
    if(Quantity==0)System.out.println("Rose: Look like you dont want to be drunk haha."); //if player type 0 amount of goods 
    TotalPrice = Quantity*Alcoholprice; // to set amount of player's gold that will be use in GoldSetter(-)
    if(TotalPrice>PlayerGold){//Happening when player type more amount of Good then he can afford it 
    System.out.println("Rose: Sorry, that is not enough gold for the "+Quantity+" drink. "
              + "\n you may drink less than that.");
    }
    }while(TotalPrice>PlayerGold);
    GoldSetter("-");//Goldsetter will use variable in this class by itself - mean to decresed player gold that setgold() mean to set new amount of player gold
    Show("Gold",PlayerGold);//show player gold         
    PlayerAlcohol = QuantitySetter("+",PlayerAlcohol); 
    Show("Moonshine",PlayerAlcohol); 
     }
     void FreeTrade(){
     //Alcohol to food 
     //   1 ----->  10 food
     }
}
