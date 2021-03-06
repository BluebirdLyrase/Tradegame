
package tradegame;
public class C3_BlueLyrase extends CityRedapple implements Merchant,LaborBroker{
boolean report;
    
    int MedicalPrice = 1 ;
    int WeaponPrice = 1;
    int FoodPrice = 1; 
    int JewelryPrice = 1; 
    int Manprice = 1; 
    C3_BlueLyrase (int PlayerMedical,int PlayerWeapon,int PlayerFood,int PlayerJewelry,
                    int PlayerMen,int PlayerGold,int PlayerAlcohol,boolean drinking,boolean report){    
    super(PlayerMedical,PlayerWeapon,PlayerFood,
          PlayerJewelry,PlayerMen,PlayerGold,PlayerAlcohol);
    this.report = report;
    this.drinking=drinking;
    System.out.println("[Person:Blue Lyrase]");
    System.out.println("Blue: -GREET-"); 
    Greeting();
    System.out.println("Blue: -BYE-");
    }

    void Greeting(){
    System.out.println("(1) -ASKING-"
            + "\n(2) -DRINKING-"
            + "\n(3) Black market"
            + "\n(4) -TRADE-"
            + "\n(5) I need to go.");
            switch(ScannerSwitch(5)){
                case 1 : Asking(); break;
                case 2 : Drinking(); break;
                case 3 : Promotion(); break;
                case 4 : Trade(); break;
                case 5 : break;
            }
    } 
    void Asking(){
    System.out.println("(1) Tell me about Waterflake."
            + "\n(2) Tell me about Drylagoon."
            + "\n(3) Tell me about Redapple."
            + "\n(4) Tell me about yourself."
            + "\n(5) Let talk about something else.");
            switch(ScannerSwitch(5)){
                case 1 : System.out.println("Blue: -WATERFLAKE-");
                         Asking(); break;
                case 2 : System.out.println("Blue: -DRYLAGOON-");
                         Asking(); break;
                case 3 : System.out.println("Blue: -REDAPPLE-");
                         Asking(); break;
                case 4 : System.out.println("Blue: -HIMSELF-");
                         Asking(); break;
                case 5 : Greeting(); break;
            }
    }
    void Drinking(){
    System.out.println("-DRINKING-");
    if(ScannerDrinking(PlayerAlcohol)){
        System.out.println("-DRINKING1-");
        PlayerAlcohol--;
        if(ScannerDrinking(PlayerAlcohol)){
            System.out.println("-DRINKING2-");
            PlayerAlcohol--;
            if(ScannerDrinking(PlayerAlcohol)){
                System.out.println("-DRINKING3-");
                PlayerAlcohol--;
                this.drinking = true ;
            }
        }
    }
    Greeting();
    }
    void Promotion(){
    System.out.println("Blue : Just keep it under lock and key then let do our business");       
    System.out.println("[Your Gold : "+this.PlayerGold+" ]");    
    System.out.println("(1) I want to buy some food(1/"+this.FoodPrice+"gold)"
            + "\n(2) I want to buy some jewelry(1/"+this.JewelryPrice+"gold)"
            + "\n(3) I want to buy some medical supply(1/"+this.MedicalPrice+"gold)"   
            + "\n(4) I want to buy some weapon supply(1/"+this.WeaponPrice+"gold)"
            + "\n(5) I want to hire some outcast(1/"+this.Manprice+"gold)"
            + "\n(6) Let talk about something else.");
            switch(ScannerSwitch(6)){
                case 1 : PlayerBuying("Food",this.FoodPrice);
                         PlayerFood = QuantitySetter("+",PlayerFood);
                         Show("Food",PlayerFood);
                         Promotion(); break;
                case 2 : PlayerBuying("Jewelry",this.JewelryPrice);
                         PlayerJewelry = QuantitySetter("+",PlayerJewelry);
                         Show("Jewelry",PlayerJewelry);
                         Promotion(); break;
                case 3 : PlayerBuying("Medical",this.MedicalPrice);
                         PlayerMedical = QuantitySetter("+",PlayerMedical);
                         Show("Medical",PlayerMedical);
                         Promotion(); break;
                case 4 : PlayerBuying("Weapon",this.WeaponPrice);
                         PlayerWeapon = QuantitySetter("+",PlayerWeapon);
                         Show("Weapon",PlayerWeapon);
                         Promotion(); break;
                case 5 : HireMan();break;
                case 6 : Greeting(); break;
    }  
    report = true;
    }
    public void Trade(){
    System.out.println("[Your Gold : "+PlayerGold+" ]");    
    System.out.println("(1) I want to buy some food(1/"+super.FoodPrice+"gold)"
            + "\n(2) I want to buy some jewelry(1/"+super.JewelryPrice+"gold)"
            + "\n(3) I want to buy some medical supply(1/"+super.MedicalPrice+"gold)"   
            + "\n(4) I want to buy some weapon supply(1/"+super.WeaponPrice+"gold)"      
            + "\n(5) Let talk about something else");
            switch(ScannerSwitch(5)){
                case 1 : PlayerBuying("Food",super.FoodPrice);
                         PlayerFood = QuantitySetter("+",PlayerFood);
                         Show("Food",PlayerFood);
                         Trade(); break;
                case 2 : PlayerBuying("Jewelry",super.JewelryPrice);
                         PlayerJewelry = QuantitySetter("+",PlayerJewelry);
                         Show("Jewelry",PlayerJewelry);
                         Trade(); break;
                case 3 : PlayerBuying("Medical",super.MedicalPrice);
                         PlayerMedical = QuantitySetter("+",PlayerMedical);
                         Show("Medical",PlayerMedical);
                         Trade(); break;
                case 4 : PlayerBuying("Weapon",super.WeaponPrice);
                         PlayerWeapon = QuantitySetter("+",PlayerWeapon);
                         Show("Weapon",PlayerWeapon);
                         Trade(); break; 
                case 5 : System.out.println("Blue: -GREET2-");
                         Greeting(); break;
            }
    }
    public void PlayerSelling(String WhatIsIt,int HowMuch,int Howmany){
    //He does not buy anything form player
    }
    
    public void PlayerBuying(String WhatIsIt,int HowMuch){
    System.out.println("1 "+WhatIsIt+" for "+HowMuch+" gold");          
    System.out.println("Blue: -TRADE1-");
    do{
    System.out.println(WhatIsIt+" Quantity>>>");
    Quantity = ScannerTrade();
    if(Quantity==0)System.out.println("Blue: -TRADE2-");
    TotalPrice = Quantity*HowMuch;
    if(TotalPrice>PlayerGold){
    System.out.println("Blue: -TRADE3-");
    }
    }while(TotalPrice>PlayerGold);
    GoldSetter("-");
    Show("Gold",PlayerGold);
    }
    public void HireMan(){
    System.out.println("Blue: How many slave do you want to buy?");    
    do{   
    System.out.println("Men Quantity>>>");
    Quantity=ScannerTrade(); //for Scan amount of goods player want to Buy
    if(Quantity==0)System.out.println("Blue: Look like you don't want any slave.");
    TotalPrice = Quantity*Manprice; // will be use in GoldSetter(-)
    if(TotalPrice>PlayerGold){//type more amount of Good then he can afford it 
    System.out.println("Blue: Sorry, that is not enough gold to hire "+Quantity+" amount of men. "
              + "\n you may change that number or go away.");
    }
    }while(TotalPrice>PlayerGold);
    GoldSetter("-");// - mean to decresed 
    Show("Gold",PlayerGold);//show player gold
    PlayerMen = QuantitySetter("+",PlayerMen);
    Show("Men",PlayerMen);
    Promotion();
    }
}//168
