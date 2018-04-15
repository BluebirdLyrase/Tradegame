
package tradegame;
public class C3_BlueLyrase extends CityRedapple implements Merchant,LaborBroker{
    
    
    C3_BlueLyrase (int PlayerMedical,int PlayerWeapon,int PlayerFood,
                      int PlayerJewelry,int PlayerMen,int PlayerGold){    
    super(PlayerMedical,PlayerWeapon,PlayerFood,
          PlayerJewelry,PlayerMen,PlayerGold);    
    System.out.println("[Person:Lizza Robinhood]");
    System.out.println("Lizza: Welcome to Lizza Good store What can I help you?"); 
    Greeting();
    System.out.println("Lizza: See you around.");
    }

    void Greeting(){} 
    void Asking(){}
    void Drinking(){}
    void Promotion(){}  
    public void Trade(){}
    //Everything same as Gabriel but he buy everything
    public void PlayerSelling(String WhatIsIt,int HowMuch,int HowMany){}
    public void PlayerBuying(String WhatIsIt,int HowMuch){}
    public void Explor(){}
    public void HireMan(){}
    void Blackmarket(){}
}
