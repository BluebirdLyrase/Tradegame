package tradegame;

public class A2_JackBlergen extends CityWaterflake implements Explorer {
    A2_JackBlergen(int PlayerMedical, int PlayerWeapon, int PlayerFood,
                    int PlayerJewelry, int PlayerMen, int PlayerGold){
    super(PlayerMedical,PlayerWeapon,PlayerFood,
            PlayerJewelry,PlayerMen,PlayerGold);
    System.out.println("[Person:Jack Blergen]");
    System.out.println("-GREET-");
    Greeting();
    System.out.println("-BYE-");
    }
    void Greeting(){
    System.out.println("(1) Can I ask you something ?"
            +"\n(2) How about a drink ?"
            +"\n(3) To Explor."
            +"\n(4) Let trade things to another things."
            +"\n(5) I need to go.");
            switch(ScannerSwitch(5)){
                case 1 : Asking(); break;
                case 2 : Drinking(); break;
                case 3 : Explor(); break;
                case 4 : System.out.println("People in Waterflake always like to trading things by things.");
                    FreeTrade(); break;
                default : break;
            }
    }
    void Drinking(){
    System.out.println("");
    Greeting();
    }
    void Asking(){
    System.out.println("(1) Tell me about Waterflake."
            + "\n(2) Tell me about Drylagoon."
            + "\n(3) Tell me about Redapple."
            + "\n(4) Tell me about yourself."
            + "\n(5) Let talk about something else.");
            switch(ScannerSwitch(5)){
                case 1 : System.out.println("-Waterflake-"); 
                         Asking(); break;
                case 2 : System.out.println("-Drylagoon-"); 
                         Asking(); break;
                case 3 : System.out.println("-Redapple-");
                         Asking(); break;
                case 4 : System.out.println("-Yourself-");
                         Asking(); break;
                case 5 : Greeting(); break;
            }
    }
    public void Explor(){
    
    }
    void FreeTrade(){
    System.out.println("(1) I want to trade Weapon to Food."
            + "\n(2) I want to trade Jewelry to Food."
            + "\n(3) Let talk about something else.");
            switch(ScannerSwitch(3)){
                case 1 : PlayerTrading("Weapon",4,PlayerWeapon);
           PlayerWeapon = QuantityTrade("-",PlayerWeapon,Quantity);
           Show("Weapon",PlayerWeapon);
           FreeTrade(); break;
                case 2 : PlayerTrading("Jewelry",10,PlayerJewelry);
           PlayerJewelry = QuantityTrade("-",PlayerJewelry,Quantity);
           Show("Jewelry",PlayerJewelry);
           FreeTrade(); break;
                case 3 : System.out.println("-GREET2-"); Greeting(); break;
            }
    }
    //Form Waterflake
    //He is Explors
}
