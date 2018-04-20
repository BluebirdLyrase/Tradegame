package tradegame;
public class A3_PriscillaRose extends CityWaterflake implements LaborBroker {
    A3_PriscillaRose(int PlayerMedical,int PlayerWeapon,int PlayerFood,int PlayerJewelry
                            ,int PlayerMen,int PlayerGold,int PlayerAlcohol,boolean drinking){    
    super(PlayerMedical,PlayerWeapon,PlayerFood,
          PlayerJewelry,PlayerMen,PlayerGold,PlayerAlcohol);   
    this.drinking = drinking ;
    System.out.println("[Npc:Priscilla Rose]"); 
    System.out.println("Rose: Welcome to Heartwarming inn."); 
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
    Greeting();
     }
    void Asking(){
    System.out.println("(1) Tell me about yourself"
                      +"\n(2) Tell me about this place"
                      +"\n(3) Let talk about something else.");
                      switch(ScannerSwitch(3)){
                          case 1 : System.out.println("Rose: -ASKING1-");
                                   Asking(); break;
                          case 2 : System.out.println("Rose: -ASKING2-");
                                   Asking(); break;
                          case 3 : Greeting(); break;
                      }
     }
    void Drinking(){
    System.out.println("-DRINKING-");
    // 1 she tell that Jack already death
    if(ScannerDrinking(PlayerAlcohol)){
        System.out.println("-DRINKING1-");
        PlayerAlcohol--;
        if(ScannerDrinking(PlayerAlcohol)){
            System.out.println("2 years ago there is a broken wizard who lived and dead near the river");
            PlayerAlcohol--;
                if(ScannerDrinking(PlayerAlcohol)){
                System.out.println("-DRINKING3");
                PlayerAlcohol--;
                this.drinking = true ;
                    }
            }
    }
    Greeting();
    //Nightmare about halfBeastmonster
     }
    public void HireMan(){   
    System.out.println("1 men for "+Manprice+" gold");          
    System.out.println("Rose: How many men do you want to hire?");    
    do{   
    System.out.println("Men Quantity>>>");
    Quantity=ScannerTrade(); //for Scan amount of goods player want to Buy
    if(Quantity==0)System.out.println("Rose: Look like you don't want to hire men around here."); //0 amount of goods 
    TotalPrice = Quantity*Manprice; // to set amount of player's gold that will be use in GoldSetter(-)
    if(TotalPrice>PlayerGold){//Happening when player type more amount of Good then he can afford it 
    System.out.println("Rose: Sorry, that is not enough gold to hire "+Quantity+" amount of men. "
              + "\n you may change that number.");
    }
    }while(TotalPrice>PlayerGold);
    GoldSetter("-");// - mean to decresed player gold 
    Show("Gold",PlayerGold);//show player gold
    PlayerMen = QuantitySetter("+",PlayerMen);
    Show("Men",PlayerMen);
    Greeting();
    }    
     
    
     void Buymoonshine(){
    System.out.println("1 bottle of moonshine for "+Alcoholprice+" gold");          
    System.out.println("Rose: How many men do you want handsome?");    
    do{   
    System.out.println("moonshine Quantity>>>");
    Quantity=ScannerTrade(); //for Scan amount of goods player want to Buy
    if(Quantity==0)System.out.println("Rose: Look like you dont want to be drunk haha."); //if player type 0 amount of goods 
    TotalPrice = Quantity*Alcoholprice; // to set amount of player's gold that will be use in GoldSetter(-)
    if(TotalPrice>PlayerGold){//Happening when player type more amount of Good then he can afford it 
    System.out.println("Rose: Sorry, that is not enough gold for the "+Quantity+" drink. "
              + "\n you may drink less than that.");
    }
    }while(TotalPrice>PlayerGold);
    GoldSetter("-");// - mean to decresed player gold 
    Show("Gold",PlayerGold);//show player gold         
    PlayerAlcohol = QuantitySetter("+",PlayerAlcohol); 
    Show("Moonshine",PlayerAlcohol); 
    Greeting();
     }
    void FreeTrade(){
         
    System.out.println("(1) I want to trade Moonshine to Food(1/10),[You have: "+PlayerAlcohol+" Alcohol]"
                       +"\n(2) Let talk about something else.");
    switch(ScannerSwitch(2)){
        case 1 : PlayerTrading("Alcohol",10,PlayerAlcohol);
                 PlayerAlcohol = QuantityTrade("-",PlayerAlcohol,Quantity);
                 Show("Alcohol",PlayerAlcohol);
                 FreeTrade(); break;
        case 2 : System.out.println("What can I help you ?");
                 Greeting(); break;
    }
     //Alcohol to food
     //   1 ----->  10 food
     }
}//124
