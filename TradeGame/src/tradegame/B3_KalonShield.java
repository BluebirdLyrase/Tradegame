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
public class B3_KalonShield extends CityDrylagoon implements Guardian  {
    
    B3_KalonShield (int PlayerMedical,int PlayerWeapon,int PlayerFood,
                      int PlayerJewelry,int PlayerMen,int PlayerGold){    
    super(PlayerMedical,PlayerWeapon,PlayerFood,
          PlayerJewelry,PlayerMen,PlayerGold);    
    System.out.println("[Person:Kalon Shield]");
    System.out.println("Kalon: -GREET-"); 
    Greeting();
    System.out.println("Kalon: -BYE-");
    }
    
    void Greeting(){
    System.out.println("(1) -ASKING-"
            + "\n(2) -DRINKING-"
            + "\n(3) -MAGIC TEACH-"
            + "\n(4) -REPORT-"
            + "\n(5) I need to go.");
            switch(ScannerSwitch(5)){
                case 1 : Asking(); break;
                case 2 : Drinking(); break;
                case 3 : MagicTeach(); break;
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
                case 1 : System.out.println("Kalon: -WATERFLAKE-");
                         Asking(); break;
                case 2 : System.out.println("Kalon: -DRYLAGOON-");
                         Asking(); break;
                case 3 : System.out.println("Kalon: -REDAPPLE-");
                         Asking(); break;
                case 4 : System.out.println("Kalon: -HERSELF-");
                         Asking(); break;
                case 5 : Greeting(); break;
            }
    }
    void Drinking(){
    System.out.println("-DRINKING-");
    Greeting();
    }
    void MagicTeach(){}
    public void Report(){}
    //report about Micker want to murder Helena
    //report about Helena have Life Magic mutent potion 
}
