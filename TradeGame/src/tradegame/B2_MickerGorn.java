/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradegame;

/**
 *
 * @author 6030213005
 */
public class B2_MickerGorn extends CityDrylagoon implements Merchant {
    //he will ask you to kill helena when he drink with you by posion her while drinking
    B2_MickerGorn (int PlayerMedical,int PlayerWeapon,int PlayerFood,
                      int PlayerJewelry,int PlayerMen,int PlayerGold){    
    super(PlayerMedical,PlayerWeapon,PlayerFood,
          PlayerJewelry,PlayerMen,PlayerGold);    
    System.out.println("[Person:Lizza Robinhood]");
    System.out.println("Lizza: Welcome to Lizza Good store What can I help you?"); 
    Greeting();
    System.out.println("Lizza: See you around.");
    }
    
    void Greeting(){
    System.out.println("(1) -ASKING-"
            + "\n(2) -DRINKING-"
            + "\n(3) -MAGIC TEACH-"
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
    Greeting();
    }
    void  MagicTeach(){}
    public void Trade(){}
    public void PlayerSelling(String WhatIsIt,int HowMuch,int HowMany){}
    public void PlayerBuying(String WhatIsIt,int HowMuch){}
}
