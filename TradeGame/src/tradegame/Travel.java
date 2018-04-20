package tradegame;
public class Travel {
    
int PlayerMedical,PlayerWeapon,PlayerFood,PlayerMen,PlayerJewelry,PlayerGold;
boolean artifact;
String CityName;
Travel(int PlayerMedical,int PlayerWeapon,int PlayerFood,int PlayerMen,
       int PlayerJewelry,int PlayerGold,boolean artifact,String CityName){
    this.PlayerMedical = PlayerMedical;
    this.PlayerWeapon = PlayerWeapon;
    this.PlayerFood = PlayerFood;
    this.PlayerMen = PlayerMen;
    this.PlayerJewelry = PlayerJewelry;
    this.PlayerGold = PlayerGold;
    this.artifact = artifact;
    System.out.println("Traveling to "+CityName);
    switch(CityName){
        case "Drylagoon" : TravelingToDrylagoon(); break;
        case "Redapple" : TravelingToRedapple(); break;
    }
}

void TravelingToDrylagoon(){
    System.out.println("Approaching bandit");
    if(PlayerGold>=1000){
        System.out.println("You have lost 1000 Gold");
        System.out.println("The bandit has leave");
        PlayerGold = PlayerGold - 1000;
        System.out.println("Now you have "+PlayerGold+" gold");
    }else{
        if(PlayerWeapon>=15){
            System.out.println("fighting the bandit");
             System.out.println("You have lost 15 weapon");
            PlayerWeapon = PlayerWeapon - 15;
            System.out.println("Now you have "+PlayerWeapon+" weapon");
                    if(PlayerMedical>=10){
                        PlayerMedical = PlayerMedical - 10;
                         System.out.println("10 Medical supply have been used");
                        System.out.println("Now you have have "+PlayerMedical+" medical");
                    }else{
                    PlayerMen = 0;
                    System.out.println("You lose all your men");
                    }
        }else{
            if(PlayerMen>=15){
                System.out.println("You lose 15 men");
                PlayerMen = PlayerMen - 15;
                System.out.println("Now you have "+PlayerMen+" men");
            }else{
                System.out.println("You lose all Gold, Jewelry, Men, Weapon");
                PlayerGold = 0;
                PlayerJewelry = 0;
                PlayerMen = 0;
                PlayerWeapon = 0;
            }
        }
    }
    
}
void TravelingToRedapple(){
    if(artifact){
        System.out.println("You traveling with out any trouble");
    }else{
        System.out.println("Approaching Souless monster");
        if(PlayerWeapon>=20){
        System.out.println("fighting the Monster");
        System.out.println("You have lost 20 weapon");
        PlayerWeapon = PlayerWeapon - 20;
        System.out.println("Now you have "+PlayerWeapon+" weapon");
                    if(PlayerMedical>=10){
                        System.out.println("10 Medical supply have been used");
                        PlayerMedical = PlayerMedical - 10;
                        System.out.println("Now you have "+PlayerMedical+" medical");
                    }else{
                    PlayerMen = 0;
                    System.out.println("You lose all your men");
                    }
        }else{
            if(PlayerMen>=20){
            System.out.println("You lose 20 men");
            PlayerMen = PlayerMen - 20;
            System.out.println("Now you have "+PlayerMen+" men");
            }else{
                System.out.println("You lose all Weapon, Men, Food, Medical");
                PlayerWeapon = 0;
                PlayerMen = 0;
                PlayerFood = 0;
                PlayerMedical = 0;
            }
        }
    }
}
}//class travel 93
