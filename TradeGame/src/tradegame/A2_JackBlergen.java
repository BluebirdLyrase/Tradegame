package tradegame;

public class A2_JackBlergen extends CityWaterflake implements Explorer {
    boolean FreeWeaponGave = false ;
    int WeaponPrice = 5;
    int ExplorCost = 4000 ;
    boolean Necklace = false;
    A2_JackBlergen(int PlayerMedical, int PlayerWeapon, int PlayerFood,
                    int PlayerJewelry, int PlayerMen, int PlayerGold , int PlayerAlcohol
                    ,boolean FreeWeaponGave,boolean drinking){
        
    super(PlayerMedical,PlayerWeapon,PlayerFood,
            PlayerJewelry,PlayerMen,PlayerGold,PlayerAlcohol);
    this.drinking = drinking;
    this.FreeWeaponGave = FreeWeaponGave ;
    System.out.println("[NPC:Jack Blergen]");
    System.out.println("Jack: ....");
    Greeting();
    System.out.println("...");
    }
    
    void Greeting(){
    System.out.println("Jack: What do you want form the old man?");
    System.out.println("(1) Can I ask you something ?"
            +"\n(2) How about a drink ?"
            +"\n(3) I want to hire you get that artifact for me[require:"+ExplorCost+" gold]."
            +"\n(4) Let trade things to another things."
            +"\n(5) I need to go.");
            switch(ScannerSwitch(5)){
                case 1 : Asking(); break;
                case 2 : Drinking(); break;
                case 3 : Explor(); break;
                case 4 : System.out.println("Jack: I still have some unused weapon if you want.");
                FreeTrade(); break;
                default : break;
            }
    }
    
    void Drinking(){
    System.out.println("-DRINKING-");
    //1 tell Lizz secret 2 tell his real pass 3 tell his secret <<< inw wizard
    if(ScannerDrinking(PlayerAlcohol)){
        System.out.println("Jack:Have you see the women in the store yet ?"
                + "\n Once i see her tranform to  a souless monster at night in the forest.");
        PlayerAlcohol--;
        if(ScannerDrinking(PlayerAlcohol)){
            System.out.println("Jack:Do you believed that I once saw the tears of the Witch?"
                    + "\n I saw her crying four ... maybe three years ago.");
            PlayerAlcohol--;
            if(ScannerDrinking(PlayerAlcohol)){
                System.out.println("Jack:Once upon a time, there is a great and powerful wizard"
                        + "\n seeking for artifacts of the old world. He and his men dive into this river"
                        + "\n And never comeback. In reality I may retired don't you think?");
                PlayerAlcohol--;
                this.drinking = true ;
                                }
                             }
                        }
    Greeting();
    }
    
    void Asking(){
    System.out.println("(1) Tell me about artifacts."
            + "\n(2) Tell me about the artifact in this river."
            + "\n(3) Tell me about yourself"
            + "\n(4) Let talk about something else.");
            switch(ScannerSwitch(4)){
                case 1 : System.out.println("Jack: Artifacts is the old things for the old world before adn during invasion."
                        + "As soon as you get one you need to sent it to the guardian"); 
                         Asking(); break;
                case 2 : System.out.println("Jack: Once I dive down into this river by fallowing the rumour"
                        + "\nI saw a little shiny thing, but I didn't have enough mana to reach it"
                        + "\nsuch a shame."); 
                         Asking(); break;
                case 3 : System.out.println("Jack: Me? I used to be the Explorer but I lost everything during "
                        + "searching artifact in this river, then I end up here. Fishing for food day to day."
                        + "Sleeping on a pile useless weapon.");
                         Asking(); break;
                case 4 : Greeting(); break;
            }
    }
    public void Explor(){
        if(ExplorCost>PlayerGold){System.out.println("Jack: Look like you don't have enough gold for that young boy.");
        Asking();
        }else{
        System.out.println("Jack: Finally someone with the eyes");
        PlayerGold = PlayerGold - ExplorCost ;
        System.out.println("'At night Jack comeback and give you a gold necklace "
                + "\n and no one ever see him agian...'");
        Necklace = true ;
        }
    }
    void FreeTrade(){
    System.out.println("(1) I want your weapon."
            + "\n(2) Let talk about something else.");
            switch(ScannerSwitch(2)){ 
                case 1 : 
                if(FreeWeaponGave){
                System.out.println("I gave you every Weapon I have.");
                }else{
                System.out.println("You can have all of it. They have no use for me anymore");
                PlayerWeapon = PlayerWeapon  + 10;  
                FreeWeaponGave = true ;
                break ;
                }    
                case 2 : System.out.println("So, what now ?"); Greeting(); break;
            }
    }
}//109
