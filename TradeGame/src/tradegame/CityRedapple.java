package tradegame;
abstract class CityRedapple extends City {
    
    CityRedapple(int PlayerMedical,int PlayerWeapon,int PlayerFood,
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
    
    public void PlayerPromotion(String WhatIsIt,int HowMuch,String NpcName){
    System.out.println("10 "+WhatIsIt+" for "+HowMuch*10+" gold");          
    System.out.println(NpcName+": How many pack do you want?");
    do{
    System.out.println(WhatIsIt+" Pack>>>");
    Quantity = ScannerTrade()*10;
    if(Quantity==0)System.out.println(NpcName+": So, What do you want");
    TotalPrice = Quantity*HowMuch;
    if(TotalPrice>PlayerGold){
    System.out.println(NpcName+": That is not enough gold");}
    }while(TotalPrice>PlayerGold);
    GoldSetter("-");
    Show("Gold",PlayerGold);
    }
abstract void  Promotion();    
}//31
