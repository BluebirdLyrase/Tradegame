package tradegame;
abstract class CityDrylagoon extends City {
    boolean[] PlayerMagic = {false,false};
 CityDrylagoon (int PlayerMedical,int PlayerWeapon,int PlayerFood,
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
abstract void  MagicTeach();    
}//16
