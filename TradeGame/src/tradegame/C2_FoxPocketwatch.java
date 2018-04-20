package tradegame;

public class C2_FoxPocketwatch extends CityRedapple implements Guardian {
 boolean report , reported ;
    C2_FoxPocketwatch(int PlayerMedical,int PlayerWeapon,int PlayerFood,
                      int PlayerJewelry,int PlayerMen,int PlayerGold,int PlayerAlcohol
                      ,boolean report,boolean reported){    
    super(PlayerMedical,PlayerWeapon,PlayerFood,
          PlayerJewelry,PlayerMen,PlayerGold,PlayerAlcohol);  
    this.report = report;
    this.reported = reported;
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
    System.out.println("-NOT DRINKING-");
    Greeting();
    }
    void Promotion(){
    System.out.println("Fox:I am not a merchant.");
    Greeting();
    }    
    public void Report(){
    if(report){
        System.out.println("(1) Report."
                         + "\n(2) noting.");
        switch(ScannerSwitch(2)){
            case 1 : 
                if(reported){
                    System.out.println("Already report");
                }else{
                    System.out.println("You have report about the Black merchant");
                    PlayerGold = PlayerGold + 1000;
                    Show("Gold",PlayerGold);
                    reported = true;
                }
                break;
            case 2 :
        }
    }else{
        System.out.println("There is noting to report.");
    }
    Greeting();
    }
}//80
