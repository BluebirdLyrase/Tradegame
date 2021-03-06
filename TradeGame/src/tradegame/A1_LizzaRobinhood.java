package tradegame;
public class A1_LizzaRobinhood extends CityWaterflake implements Merchant{
    int FoodPrice = 2;
    int JewelryPrice = 50;
    A1_LizzaRobinhood(int PlayerMedical,int PlayerWeapon,int PlayerFood,
                      int PlayerJewelry,int PlayerMen,int PlayerGold,int PlayerAlcohol){    
    super(PlayerMedical,PlayerWeapon,PlayerFood,
          PlayerJewelry,PlayerMen,PlayerGold,PlayerAlcohol);
    System.out.println("[NPC:Lizza Robinhood]");
    System.out.println("Lizza: Welcome to Lizza Good store What can I help you?"); 
    Greeting();
    System.out.println("Lizza: See you around.");
    }
    void Greeting(){
    System.out.println("(1) Can I ask you something ?"
            + "\n(2) How about a drink ?"
            + "\n(3) Let me see your wares."
            + "\n(4) Let trade things to another things."
            + "\n(5) I need to go.");
            switch(ScannerSwitch(5)){
            case 1 : Asking() ; break ;
            case 2 : Drinking(); break ;
            case 3 : System.out.println("Lizza: I have a cheap flesh foods for just "+FoodPrice+" gold per 1 food "
                        + "\n and i always buy Jewelry for highest price "+JewelryPrice+" to each jewelry you have"); 
                Trade(); 
                break ;
            case 4 : System.out.println("Lizza: People in Waterflake always like to trading things by things");
            FreeTrade() ;
            case 5 :   break ; 
    }
    }
    void Asking(){
    System.out.println("(1) Tell me about Waterflake."
            + "\n(2) Tell me about Drylagoon."
            + "\n(3) Tell me about Redapple."
            + "\n(4) Tell me about yourself."
            + "\n(5) Let talk about something else.");
    
    switch(ScannerSwitch(5)){
    case 1 : System.out.println("Lizza: Waterflake is a small village that have been rebuilt by The Great Resurrection "
            + "\nNo one know what this place look like in the past. Everything have been destroy during The Invasion"
            + "\nThere is rumour that some artifacts buried under the Waterflake river await to be discovered"); 
    Asking();
    break ;
    case 2 : System.out.println("Lizza : I dont know much about Drylagoon but I have "
            + "heard that everyone in Drylagoon can cast a spell ");
    Asking();
    break ;
    case 3 : System.out.println("Lizza: If you ask me where is the largest and most beautiful village I ever visited."
            + "\nThe answer will be Redapple, but there is rumor that the Souless beasts form Silvergreen forest"
            + "\nhave attacked Redapple since 2 weeks. It might me dangerouse if you decide to go there." );
    Asking();
    break ;
    case 4 : System.out.println("Lizza: My name is Lizza Robinhood.Once I was a Wandering Merchant like you."
            + "\nTravelling and meeting many people are very interesting in those day"
            + "\nUntil I arrived here in Waterflake.I found peace here in a small greeny village"
            + "\nEverybody seem friendly and never lack of kindess."
            + "\nI might be fall in love with this place. don't you think ?"
            + "\nOr maybe I just want somewhere to have a long rest.");   
    Asking();
    break ;
    case 5 : ; Greeting(); break ;
    }
    }
    void Drinking(){
    System.out.println("Lizza: Sorry, but I do not want to drink for some reason.");
    Greeting();
    }
    public void  Trade(){
    System.out.println("[Your Gold : "+PlayerGold+" ]");    
    System.out.println("(1) I want to buy some food(1/"+FoodPrice+"gold)"
            + "\n(2) I want to buy some jewelry(1/"+JewelryPrice+"gold)"
            + "\n(3) I want to buy some medical supply(1/"+MedicalPrice+"gold)"   
            + "\n(4) I want to buy some weapon supply(1/"+WeaponPrice+"gold)"  
            + "\n(5) I want to sell some Food(1/"+(FoodPrice/2)+"gold),[You have:"+PlayerFood+" Food]"
            + "\n(6) I want to sell some Jewelry(1/"+(JewelryPrice/2)+"gold),[You have:"+PlayerJewelry+" Jewelry]"
            + "\n(7) I want to sell some medical(1/"+(MedicalPrice/2)+"gold),[You have:"+PlayerMedical+" Medical]"
            + "\n(8) I want to sell some weapon(1/"+(WeaponPrice/2)+"gold),[You have:"+PlayerWeapon+" Weapon]"      
            + "\n(9) Let talk about something else");
    switch(ScannerSwitch(9)){
      /////PLAYER BUYING      
        case 1 :PlayerBuying("Food",this.FoodPrice);
             PlayerFood = QuantitySetter("+",PlayerFood);
             Show("Food",PlayerFood);
             Trade();
    break ;   
        case 2 :PlayerBuying("Jewelry",this.JewelryPrice);
             PlayerJewelry = QuantitySetter("+",PlayerJewelry);
             Show("Jewelry",PlayerJewelry);
             Trade(); 
    break ; 
        case 3 :PlayerBuying("Medical",super.MedicalPrice);
             PlayerMedical = QuantitySetter("+",PlayerMedical);
             Show("Medical",PlayerMedical);
             Trade(); 
    break ;   
        case 4 :PlayerBuying("Weapon",super.WeaponPrice);
             PlayerWeapon = QuantitySetter("+",PlayerWeapon);
             Show("Weapon",PlayerWeapon);
             Trade();  
    break ;     
    /////PLAYER SELLING 
        case 5 :PlayerSelling("Food",(this.FoodPrice/2),PlayerFood);
            PlayerFood = QuantitySetter("-",PlayerFood);
            Show("Food",PlayerFood);
            Trade(); 
    break ; 
        case 6 :PlayerSelling("Jewelry",(this.JewelryPrice/2),PlayerJewelry);
            PlayerJewelry = QuantitySetter("-",PlayerJewelry);
            Show("Jewelry",PlayerJewelry);
            Trade();
    break ; 
        case 7 :PlayerSelling("Medical",(super.MedicalPrice/2),PlayerMedical);
            PlayerMedical = QuantitySetter("-",PlayerMedical);
            Show("Medical",PlayerMedical);
            Trade();
    break ;   
        case 8 :PlayerSelling("Weapon",(super.WeaponPrice/2),PlayerWeapon);
            PlayerWeapon = QuantitySetter("-",PlayerWeapon);
            Show("Weapon",PlayerWeapon);
            Trade();
    break ; 
        case 9 : System.out.println("So, what can I help you?");
        Greeting();   
    break;
    }
    }  
    void FreeTrade(){
        
    System.out.println("(1) I want to trade Jewelry to Food(1/30),[You have:"+PlayerJewelry+" Jewelry]"
            + "\n(2) I want to trade Medical to Food(1/6),[You have:"+PlayerMedical+" Medical]"  
            + "\n(3) I want to trade Weapon to Food(1/6),[You have:"+PlayerWeapon +" Weapon]"        
            + "\n(4) Let talk about something else");
    
    switch(ScannerSwitch(4)){
        case 1 : 
           PlayerTrading("Jewelry",30,PlayerJewelry);
           PlayerJewelry = QuantityTrade("-",PlayerJewelry,Quantity);
           Show("Jewelry",PlayerJewelry);
           FreeTrade();
            break;
        case 2 : 
           PlayerTrading("Medical",6,PlayerMedical);
           PlayerMedical = QuantityTrade("-",PlayerMedical,Quantity);
           Show("Medical",PlayerMedical);
           FreeTrade();
            break;
        case 3 : 
           PlayerTrading("Weapon",6,PlayerWeapon);
           PlayerWeapon = QuantityTrade("-",PlayerWeapon,Quantity);
           Show("Weapon",PlayerWeapon);
           FreeTrade();
            break;
        case 4 :System.out.println("So, what can I help you?"); Greeting() ;break;
    }
    }
    /////////////////////////////////////////////////////////////////////////
    public void PlayerBuying(String WhatIsIt,int HowMuch){ 
    System.out.println("1 "+WhatIsIt+" for "+HowMuch+" gold");          
    System.out.println("Lizza: How many do you want?");    
    do{   
    System.out.println(WhatIsIt+" Quantity>>>");
    Quantity=ScannerTrade(); //for Scan amount of goods player want to Buy
    if(Quantity==0)System.out.println("Lizza: I see that you dont want any "+WhatIsIt); //if player type 0 amount of goods 
    TotalPrice = Quantity*HowMuch; // to set amount of player's gold that will be use in GoldSetter(-)
    if(TotalPrice>PlayerGold){//Happening when player type more amount of Good then he can afford it 
    System.out.println("Lizza: Sorry, but that is not enough gold to buy "+Quantity+WhatIsIt+". "
              + "\n you may change the quantity of "+WhatIsIt);
    }
    }while(TotalPrice>PlayerGold);
    GoldSetter("-");// - mean to decresed player gold that setgold() mean to set new amount of player gold
    Show("Gold",PlayerGold);//show player gold
    }
    public void PlayerSelling(String WhatIsIt,int HowMuch,int HowManyYouHave){
    System.out.println("1 "+WhatIsIt+" for "+HowMuch+" gold"); 
    System.out.println("Lizza: How many do you want to sell?"); 
    do{
    System.out.println(WhatIsIt+" Quantity>>>");
    Quantity=ScannerTrade(); //for Scan amount of goods player want to sell
    if(Quantity==0)System.out.println("Lizza: I see that you dont really want to sell "+WhatIsIt+".");//0 amount of goods 
    TotalPrice = Quantity*HowMuch; //to set  amount of player's gold that will be use in GoldSetter(+)
    if(Quantity>HowManyYouHave){//Happening when player type more amount of Good then he have
    System.out.println("Lizza: Sorry, but look like you have only "+WhatIsIt+" to sell. "
            + "\n you may change the quantity of "+WhatIsIt+".");
    }
    }while(Quantity>HowManyYouHave);
    GoldSetter("+");//+ increse
    Show("Gold",PlayerGold);//show player gold
    }
    }//190
