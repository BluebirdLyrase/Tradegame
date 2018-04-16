

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
}

//merchant of Redapple have a promotion for buy goods with correct quentity
abstract void  Promotion();    
}
