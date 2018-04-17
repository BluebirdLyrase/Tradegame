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
public class B1_HelenaAshley extends CityDrylagoon implements Explorer {
    
    B1_HelenaAshley(int PlayerMedical,int PlayerWeapon,int PlayerFood,
                      int PlayerJewelry,int PlayerMen,int PlayerGold,int PlayerAlcohol){    
    super(PlayerMedical,PlayerWeapon,PlayerFood,
          PlayerJewelry,PlayerMen,PlayerGold,PlayerAlcohol);    
    System.out.println("[Person:Helena Ashley]");
    System.out.println("Helena: -GREET-"); 
    Greeting();
    System.out.println("Helena: -BYE-");
    }


    
    void Greeting(){
    System.out.println("(1) -ASKING-"
            + "\n(2) -DRINKING-"
            + "\n(3) -MAGIC TEACH-"
            + "\n(4) -EXPLOR-"
            + "\n(5) I need to go.");
            switch(ScannerSwitch(5)){
                case 1 : Asking(); break;
                case 2 : Drinking(); break;
                case 3 : MagicTeach(); break;
                case 4 : Explor(); break;
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
                case 1 : System.out.println("Helena: -WATERFLAKE-");
                         Asking(); break;
                case 2 : System.out.println("Helena: -DRYLAGOON-");
                         Asking(); break;
                case 3 : System.out.println("Helena: -REDAPPLE-");
                         Asking(); break;
                case 4 : System.out.println("Helena: -HERSELF-");
                         Asking(); break;
                case 5 : Greeting(); break;
            }
    }
    void Drinking(){
    System.out.println("-DRINKING-");
    if(ScannerDrinking(PlayerAlcohol)){
        System.out.println("-DRINKING1-");
        PlayerAlcohol--;
        if(ScannerDrinking(PlayerAlcohol));
            System.out.println("-DRINKING2-");
            PlayerAlcohol--;
            if(ScannerDrinking(PlayerAlcohol)){
                System.out.println("-DRINKING3-");
                PlayerAlcohol--;
            }
    }
    Greeting();
    }
    void  MagicTeach(){}
    public void Explor(){}
}
