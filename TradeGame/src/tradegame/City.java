package tradegame;
import java.util.Scanner ;
abstract class City extends Scan {
    int PlayerMedical,PlayerWeapon,PlayerFood,PlayerJewelry,PlayerMen,PlayerGold;
    int MedicalPrice = 10 ;
    int WeaponPrice = 10;
    int FoodPrice = 10; 
    int JewelryPrice = 10; 
    int Manprice = 10; 
    int Quantity,TotalPrice  ;
    String Name ; 
    static Player player = new Player();
    
    abstract void Asking();  
    abstract void Drinking();
    abstract void Greeting();
    
    char ScannerSwitch(){
    String Desire ;
    Scanner Sc = new Scanner(System.in);
    System.out.print("Choose your action >>>>> ");
    Desire = Sc.nextLine();
    System.out.println("-----------------------------------------------------");
    return Desire.charAt(0);
    }
    int ScannerTrade(){///to set Quantity for merchant , Scan other int
    Scanner Sc2 = new Scanner(System.in);
    return Sc2.nextInt();
    }
    void GoldSetter(String check){
    if(check.equals("+")) PlayerGold = TotalPrice+PlayerGold;
    else PlayerGold = PlayerGold-TotalPrice;    
    }
    int QuantitySetter(String check,int PlayerQuantity){
    if(check.equals("+")) return  PlayerQuantity+Quantity;
    else return PlayerQuantity-Quantity;
    }
    void Show(String WhatIsIt,int HowMany){
    System.out.println("Now you have "+HowMany+" "+WhatIsIt);
    }
    
    

}
