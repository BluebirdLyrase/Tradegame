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
    System.out.println("[Person:Jack Blergen]");
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
        System.out.println("DRINKING-1");
        PlayerAlcohol--;
        if(ScannerDrinking(PlayerAlcohol)){
            System.out.println("DRINKING-2");
            PlayerAlcohol--;
            if(ScannerDrinking(PlayerAlcohol)){
                System.out.println("DRINKING-3");
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
                case 1 : System.out.println("artifacts"); 
                         Asking(); break;
                case 2 : System.out.println("artifact in this river-"); 
                         Asking(); break;
                case 3 : System.out.println("Yourself");
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
        System.out.println("'At night Jack comeback and give you $!!#$!%@% "
                + "\n you never see him agian...'");
        Necklace = true ;
        }
    }
    void FreeTrade(){
        ///it is basic trade not really freetrade
    System.out.println("(1) I want your weapon."
            + "\n(2) Let talk about something else.");
            switch(ScannerSwitch(2)){ 
                case 1 : 
                if(FreeWeaponGave){
                System.out.println("I gave you every Weapon I have.");
                }else{
                PlayerWeapon = PlayerWeapon  + 10;  
                FreeWeaponGave = true ;
                }    
                case 2 : System.out.println("So, what now ?"); Greeting(); break;
            }
    }
    //Form Waterflake
    //He is Explors
}
