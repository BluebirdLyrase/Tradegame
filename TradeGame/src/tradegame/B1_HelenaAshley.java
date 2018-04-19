/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradegame;
public class B1_HelenaAshley extends CityDrylagoon implements Explorer {
    boolean Knowledge ;
    B1_HelenaAshley(int PlayerMedical,int PlayerWeapon,int PlayerFood,
                      int PlayerJewelry,int PlayerMen,int PlayerGold,int PlayerAlcohol
                        ,boolean drinking,boolean PlayerMagic0){    
    super(PlayerMedical,PlayerWeapon,PlayerFood,
          PlayerJewelry,PlayerMen,PlayerGold,PlayerAlcohol);
    this.drinking = drinking;
    this.PlayerMagic[0] = PlayerMagic0;
    System.out.println("[Person:Helena Ashley]");
    System.out.println("Helena: -GREET-"); 
    Greeting();
    System.out.println("Helena: -BYE-");
    }
    
    void Greeting(){
    System.out.println("(1) -ASKING-"
            + "\n(2) -DRINKING-"
            + "\n(3) -MAGIC TEACH-"
            + "\n(4) I need to go.");
            switch(ScannerSwitch(4)){
                case 1 : Asking(); break;
                case 2 : Drinking(); break;
                case 3 : MagicTeach(); break;
                case 4 : break;
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
                this.drinking = true ;
                Explor();
            }
    }
    Greeting();
    }
    void MagicTeach(){
    if(PlayerMagic[0]){System.out.println("learn lewl");
    }else{
    PlayerMagic[0] = true ;
    }
    Greeting();
    }
    public void Explor(){
        
        System.out.println("Helena: I gonna go and find that grimoire, you want to join ?"
                         + "\n(1) yes, sure."
                         + "\n(2) no thank you.");
        
    switch(ScannerSwitch(2)){
        case 1 : FindingGrimoire(); break ;
        case 2 : System.out.println("Helena : Sorry to bother you.");
    }
    }
    void FindingGrimoire(){
        if(PlayerMen>=25){
        System.out.println("'You found grimoire'"); 
        LearningSecretMagic();
        }else{ 
        System.out.println("Error 404 not found");
        }
    }
    void LearningSecretMagic(){
        if(PlayerMagic[0])Knowledge = true ;
    }
    
}
