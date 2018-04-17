/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
}

//Everyone in Drylagoon can use magic
abstract void  MagicTeach();    
}
