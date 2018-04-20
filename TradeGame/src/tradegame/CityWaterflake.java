package tradegame;

abstract class CityWaterflake extends City {
CityWaterflake(){System.out.print("[City:Waterflake]_");}
CityWaterflake(int PlayerMedical,int PlayerWeapon,int PlayerFood,
              int PlayerJewelry,int PlayerMen,int PlayerGold,int PlayerAlcohol){
    this.PlayerMedical = PlayerMedical ;
    this.PlayerWeapon =  PlayerWeapon ;
    this.PlayerFood = PlayerFood ;
    this.PlayerJewelry = PlayerJewelry ;
    this.PlayerMen = PlayerMen ;
    this.PlayerGold = PlayerGold;
    this.PlayerAlcohol = PlayerAlcohol;
    ShowInventory();
}
abstract  void FreeTrade();

int QuantityTrade(String check,int PlayerQuantity,int HowMany){
    if(check.equals("+")) return  PlayerQuantity + HowMany;
    else return PlayerQuantity-HowMany;
    }
public void PlayerTrading(String WhatYouGive,int HowManyYouGet,int HowManyYouHave){
    System.out.println("1 "+WhatYouGive+" for "+HowManyYouGet+" food"); 
    System.out.println("How many do you want to trade"); 
    do{
    System.out.println(WhatYouGive+" Quantity>>>");
    Quantity=ScannerTrade(); //for Scan amount of goods player want to trade
    if(Quantity==0)System.out.println("I see that you dont really want to trade with me.");
    if(Quantity>HowManyYouHave){//Happening when player type more amount of Goods then he have
    System.out.println("Sorry, but look like you have only "+WhatYouGive+" to trade. "
            + "\n you may change the quantity of "+WhatYouGive+".");
    }
    }while(Quantity>HowManyYouHave);
    PlayerFood = QuantityTrade("+",PlayerFood,HowManyYouGet*Quantity);
    Show("Food",PlayerFood);//show player Food
    }
}//36
