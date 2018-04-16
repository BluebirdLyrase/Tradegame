
package tradegame;
public class C3_BlueLyrase extends CityRedapple implements Merchant,LaborBroker{
    
    int JewelryPrice = 20;
    C3_BlueLyrase (int PlayerMedical,int PlayerWeapon,int PlayerFood,
                      int PlayerJewelry,int PlayerMen,int PlayerGold,int PlayerAlcohol){    
    super(PlayerMedical,PlayerWeapon,PlayerFood,
          PlayerJewelry,PlayerMen,PlayerGold,PlayerAlcohol);    
    System.out.println("[Person:Blue Lyrase]");
    System.out.println("Blue: -GREET-"); 
    Greeting();
    System.out.println("Blue: -BYE-");
    }

    void Greeting(){
    System.out.println("(1) -ASKING-"
            + "\n(2) -DRINKING-"
            + "\n(3) -PROMOTION-"
            + "\n(4) -TRADE-"
            + "\n(5) -Blackmarket"
            + "\n(6) I need to go.");
            switch(ScannerSwitch(6)){
                case 1 : Asking(); break;
                case 2 : Drinking(); break;
                case 3 : Promotion(); break;
                case 4 : Trade(); break;
                case 5 : Blackmarket(); break;
                case 6 : break;
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
    Greeting();
    }
    void Promotion(){}  
    public void Trade(){
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
                case 1 : PlayerBuying("Food",PlayerFood);
                         PlayerFood = QuantitySetter("+",PlayerFood);
                         Show("Food",PlayerFood);
                         Trade(); break;
                case 2 : PlayerBuying("Jewelry",PlayerJewelry);
                         PlayerFood = QuantitySetter("+",PlayerJewelry);
                         Show("Jewelry",PlayerJewelry);
                         Trade(); break;
                case 3 : PlayerBuying("Medical",PlayerMedical);
                         PlayerMedical = QuantitySetter("+",PlayerMedical);
                         Show("Medical",PlayerMedical);
                         Trade(); break;
                case 4 : PlayerBuying("Weapon",PlayerWeapon);
                         PlayerWeapon = QuantitySetter("+",PlayerWeapon);
                         Show("Weapon",PlayerWeapon);
                         Trade(); break;
                case 5 : PlayerSelling("Food",(PlayerFood/2),PlayerFood);
                         PlayerFood = QuantitySetter("-",PlayerFood);
                         Show("Food",PlayerFood);
                         Trade(); break;
                case 6 : PlayerSelling("Jewelry",(PlayerJewelry/2),PlayerJewelry);
                         PlayerJewelry = QuantitySetter("-",PlayerJewelry);
                         Show("Jewelry",PlayerJewelry);
                         Trade(); break;
                case 7 : PlayerSelling("Medical",(PlayerMedical/2),PlayerMedical);
                         PlayerMedical = QuantitySetter("-",PlayerMedical);
                         Show("Medical",PlayerMedical);
                         Trade(); break;
                case 8 : PlayerSelling("Weapon",(PlayerWeapon/2),PlayerWeapon);
                         PlayerWeapon = QuantitySetter("-",PlayerWeapon);
                         Show("Weapon",PlayerWeapon);
                         Trade(); break;
                case 9 : System.out.println("Blue: -GREET2-");
                         Greeting(); break;
            }
    }
    //Everything same as Gabriel but he buy everything
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
    public void PlayerSelling(String WhatIsIt,int HowMuch, int HowManyYouHave){
    System.out.println("1 "+WhatIsIt+" for "+HowMuch+" gold"); 
    System.out.println("Blue: -TRADE4-");
    do{
    System.out.println(WhatIsIt+" Quantity>>>");
    Quantity = ScannerTrade();
    if(Quantity==0)System.out.println("Blue: -TRADE5-");
    TotalPrice = Quantity*HowMuch;
    if(Quantity>HowManyYouHave){
    System.out.println("Blue: -TRADE6-");
    }
    }while(Quantity>HowManyYouHave);
    }
    public void Explor(){}
    public void HireMan(){}
    void Blackmarket(){}
}
