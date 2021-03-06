package tradegame;

public class B2_MickerGorn extends CityDrylagoon implements Merchant {
    boolean report;
    int WeaponPrice = 5;
    B2_MickerGorn (int PlayerMedical,int PlayerWeapon,int PlayerFood,
                      int PlayerJewelry,int PlayerMen,int PlayerGold,int PlayerAlcohol,
                      boolean drinking,boolean PlayerMagic0,boolean  PlayerMagic1,boolean report){    
        
    super(PlayerMedical,PlayerWeapon,PlayerFood,
          PlayerJewelry,PlayerMen,PlayerGold,PlayerAlcohol);    
    this.report = report;
    this.drinking = drinking;
    this.PlayerMagic[0] = PlayerMagic0 ;
    this.PlayerMagic[1] = PlayerMagic1 ;
    System.out.println("[Person:Micker Gorn]");
    System.out.println("Micker: -GREET-"); 
    Greeting();
    System.out.println("Micker: -BYE-");
    }
    
    void Greeting(){
    System.out.println("(1) -ASKING-"
            + "\n(2) -DRINKING-"
            + "\n(3) -MAGIC TEACH(Light)-"
            + "\n(4) -TRADE-"
            + "\n(5) I need to go.");
            switch(ScannerSwitch(5)){
                case 1 : Asking(); break;
                case 2 : Drinking(); break;
                case 3 : MagicTeach(); break;
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
                case 1 : System.out.println("Micker: -WATERFLAKE-");
                         Asking(); break;
                case 2 : System.out.println("Micker: -DRYLAGOON-");
                         Asking(); break;
                case 3 : System.out.println("Micker: -REDAPPLE-");
                         Asking(); break;
                case 4 : System.out.println("Micker: -HIMSELF-");
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
                System.out.println("Micker: I kill Helena husbend just for a couple of gold form somekind of rebel");
                PlayerAlcohol--;
                this.drinking = true ;
                report = true ;
            }
        }
    }
    Greeting();
    }  
    void  MagicTeach(){
        
    if(PlayerMagic[0]){
        if(PlayerMagic[1]){      
            System.out.println("already learn");
        }else{
            System.out.println("you have learn light magic");
            PlayerMagic[1] = true ;
        }
    
    }else{
    System.out.println("Micker: You need to learn basic magic first ");
    }
    Greeting();
    }
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
                case 4 : PlayerBuying("Weapon",this.WeaponPrice);
                         PlayerWeapon = QuantitySetter("+",PlayerWeapon);
                         Show("Weapon",PlayerWeapon);
                         Trade(); break;
                case 5 : PlayerSelling("Food",(super.FoodPrice/2),PlayerFood);
                         PlayerFood = QuantitySetter("-",PlayerFood);
                         Show("Food",PlayerFood);
                         Trade(); break;
                case 6 : PlayerSelling("Jewelry",(super.JewelryPrice/2),PlayerJewelry);
                         PlayerJewelry = QuantitySetter("-",PlayerJewelry);
                         Show("Jewelry",PlayerJewelry);
                         Trade(); break;
                case 7 : PlayerSelling("Medical",(super.MedicalPrice/2),PlayerMedical);
                         PlayerMedical = QuantitySetter("-",PlayerMedical);
                         Show("Medical",PlayerMedical);
                         Trade(); break;
                case 8 : PlayerSelling("Weapon",(this.WeaponPrice/2),PlayerWeapon);
                         PlayerWeapon = QuantitySetter("-",PlayerWeapon);
                         Show("Weapon",PlayerWeapon);
                         Trade(); break;
                case 9 : System.out.println("Micker: -GREET2-");
                         Greeting(); break;
    }
    }
    public void PlayerSelling(String WhatIsIt,int HowMuch, int HowManyYouHave){
    System.out.println("1 "+WhatIsIt+" for "+HowMuch+" gold"); 
    System.out.println("Micker: -TRADE4-");
    do{
    System.out.println(WhatIsIt+" Quantity>>>");
    Quantity = ScannerTrade();
    if(Quantity==0)System.out.println("Micker: -TRADE5-");
    TotalPrice = Quantity*HowMuch;
    if(Quantity>HowManyYouHave){
    System.out.println("Micker: -TRADE6-");
    }
    }while(Quantity>HowManyYouHave);
    }
    public void PlayerBuying(String WhatIsIt,int HowMuch){
    System.out.println("1 "+WhatIsIt+" for "+HowMuch+" gold");          
    System.out.println("Micker: -TRADE1-");
    do{
    System.out.println(WhatIsIt+" Quantity>>>");
    Quantity = ScannerTrade();
    if(Quantity==0)System.out.println("Micker: -TRADE2-");
    TotalPrice = Quantity*HowMuch;
    if(TotalPrice>PlayerGold){
    System.out.println("Micker: -TRADE3-");
    }
    }while(TotalPrice>PlayerGold);
    GoldSetter("-");
    Show("Gold",PlayerGold);
    }
}//163