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
public class C2_FoxPocketwatch extends CityRedapple implements Guardian {
    
    C2_FoxPocketwatch(int PlayerMedical,int PlayerWeapon,int PlayerFood,
                      int PlayerJewelry,int PlayerMen,int PlayerGold,int PlayerAlcohol){    
    super(PlayerMedical,PlayerWeapon,PlayerFood,
          PlayerJewelry,PlayerMen,PlayerGold,PlayerAlcohol);    
    System.out.println("[Person:Fox Pocketwatch]");
    System.out.println("Fox: -GREET-"); 
    Greeting();
    System.out.println("Fox: -BYE-");
    }

    void Greeting(){
    System.out.println("(1) -ASKING-"
            + "\n(2) -DRINKING-"
            + "\n(3) -PROMOTION-"
            + "\n(4) -REPORT-"
            + "\n(5) I need to go.");
            switch(ScannerSwitch(5)){
                case 1 : Asking(); break;
                case 2 : Drinking(); break;
                case 3 : Promotion(); break;
                case 4 : Report(); break;
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
                case 1 : System.out.println("Fox: -WATERFLAKE-");
                         Asking(); break;
                case 2 : System.out.println("Fox: -DRYLAGOON-");
                         Asking(); break;
                case 3 : System.out.println("Fox: -REDAPPLE-");
                         Asking(); break;
                case 4 : System.out.println("Fox: -HERSELF-");
                         Asking(); break;
                case 5 : Greeting(); break;
            }
    }
    void Drinking(){
    System.out.println("-DRINKING-");
    Greeting();
    }
    void Promotion(){}    
    public void Report(){}
}
