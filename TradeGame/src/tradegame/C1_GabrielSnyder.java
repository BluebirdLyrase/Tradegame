package tradegame;
public class C1_GabrielSnyder extends CityRedapple implements Merchant,Explorer {
    boolean MagicRequirtoExplor,Dragonegg ;
    int JewelryPrice = 20;
    C1_GabrielSnyder(int PlayerMedical,int PlayerWeapon,int PlayerFood,
                      int PlayerJewelry,int PlayerMen,int PlayerGold,
                      int PlayerAlcohol,boolean drinking,boolean PlayerMagic1){    
    super(PlayerMedical,PlayerWeapon,PlayerFood,
          PlayerJewelry,PlayerMen,PlayerGold,PlayerAlcohol);  
    MagicRequirtoExplor = PlayerMagic1;
    this.drinking = drinking;
    MagicRequirtoExplor = PlayerMagic1;
    System.out.println("[Person:Gabriel Snyder]");
    System.out.println("Gabriel: -GREET-"); 
    Greeting();
    System.out.println("Gabriel: -BYE-");
    }
    
    void Greeting(){
    System.out.println("(1) -ASKING-"
            + "\n(2) -DRINKING"
            + "\n(3) -PROMOTION-"
            + "\n(4) -TRADE-"
            + "\n(5) I want ho hunt the dragon with you"
            + "\n(6) I need to go.");
            switch(ScannerSwitch(6)){
                case 1 : Asking(); break;
                case 2 : Drinking(); break;
                case 3 : Promotion(); break;
                case 4 : Trade(); break;
                case 5 : Explor(); break;
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
                case 1 : System.out.println("Gabriel: -WATERFLAKE-");
                         Asking(); break;
                case 2 : System.out.println("Gabriel: -DRYLAGOON-");
                         Asking(); break;
                case 3 : System.out.println("Gabriel: -REDAPPLE-");
                         Asking(); break;
                case 4 : System.out.println("Gabriel: -HIMSELF");
                         Asking(); break;
                case 5 : Greeting(); break;
            }
    }
    void Drinking(){
    System.out.println("-DRINKING");
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
    void  Promotion(){
    System.out.println("You can buy 10 medical with a half price(10/50 gold)"
            + "\n(1) I want to buy some medical."
            + "\n(2) Let talk about something else.");
            switch(ScannerSwitch(2)){
                case 1 :
                        PlayerPromotion("Medical",MedicalPrice/2,"Gabriel");
                        PlayerMedical = QuantitySetter("+",PlayerMedical);
                        Show("Medical",PlayerMedical);
                        Promotion();
                        break;
                case 2 : Greeting();
            }
    }
    public void Trade(){
    System.out.println("[Your Gold : "+PlayerGold+" ]");    
    System.out.println("(1) I want to buy some food(1/"+FoodPrice+"gold)"
            + "\n(2) I want to buy some jewelry(1/"+JewelryPrice+"gold)"
            + "\n(3) I want to buy some medical supply(1/"+MedicalPrice+"gold)"   
            + "\n(4) I want to buy some weapon supply(1/"+WeaponPrice+"gold)"  
            + "\n(5) I want to sell some Jewelry(1/"+(JewelryPrice/2)+"gold),[You have:"+PlayerJewelry+" Jewelry]"    
            + "\n(6) Let talk about something else");
            switch(ScannerSwitch(6)){
            ////PLAYER BUYING
                case 1 : PlayerBuying("Food",super.FoodPrice);
                         PlayerFood = QuantitySetter("+",PlayerFood);
                         Show("Food",PlayerFood);
                         Trade(); break;
                case 2 : PlayerBuying("Jewelry",this.PlayerJewelry);
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
            ////PLAYER SELLING
                case 5 : PlayerSelling("Jewelry",(this.JewelryPrice/2),PlayerJewelry);
                         PlayerJewelry = QuantitySetter("-",PlayerJewelry);
                         Show("Jewelry",PlayerJewelry);
                         Trade(); break;
                case 6 : System.out.println("Gabriel: -GREET2-");
                         Greeting(); break;
            }
    }
    //sell cheap jewelry but he buy only jewelry 
    
    public void PlayerBuying(String WhatIsIt,int HowMuch){
    System.out.println("1 "+WhatIsIt+" for "+HowMuch+" gold");          
    System.out.println("Gabriel: How many do you want?");
    do{
    System.out.println(WhatIsIt+" Quantity>>>");
    Quantity = ScannerTrade();
    if(Quantity==0)System.out.println("Gabriel: -TRADE2-");
    TotalPrice = Quantity*HowMuch;
    if(TotalPrice>PlayerGold){
    System.out.println("Gabriel: -TRADE3-");}
    }while(TotalPrice>PlayerGold);
    GoldSetter("-");
    Show("Gold",PlayerGold);
    }
    public void PlayerSelling(String WhatIsIt,int HowMuch,int HowManyYouHave){
    System.out.println("1 "+WhatIsIt+" for "+HowMuch+" gold");
    System.out.println("Gabriel: -TRADE4-");
    do{
    System.out.println(WhatIsIt+" Quantity>>>");
    Quantity = ScannerTrade();
    if(Quantity==0)System.out.println("Gabriel: -TRADE5-");
    TotalPrice = Quantity*HowMuch;
    if(Quantity>HowManyYouHave){
    System.out.println("Gabriel: -TRADE6-");
    }
    }while(Quantity>HowManyYouHave);
    GoldSetter("+");
    Show("Gold",PlayerGold);
    }
    public void Explor(){
        if(MagicRequirtoExplor){
        System.out.println("You found and Fight the dragon.");
        System.out.println("You got dragon's egg, but the Monster Hunter dead.");
        Dragonegg = true ;
        }
        else
        {
        System.out.println("You found nothing in the forest.");
        }
    }
}//161
