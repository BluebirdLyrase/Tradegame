 
package tradegame;
import java.util.Scanner;
public class Scan {
    int ScannerSwitch(int limit){
    int Desire ;  
    char StDesire = 0;
    do{      
    Scanner Sc = new Scanner(System.in);
    System.out.print("Choose a number between (1-"+limit+")>>>");
    StDesire = Sc.nextLine().charAt(0);
    switch(StDesire){
        case '1': Desire = 1 ; break ;
        case '2': Desire = 2 ; break ;  
        case '3': Desire = 3 ; break ;
        case '4': Desire = 4 ; break ;
        case '5': Desire = 5 ; break ;
        case '6': Desire = 6 ; break ;
        case '7': Desire = 7 ; break ;
        case '8': Desire = 8 ; break ;
        case '9': Desire = 9 ; break ;
        default : Desire = 0 ; break ;   
    } 
    }while(Desire<=0||Desire>limit);  
    System.out.println("-----------------------------------------------------");
    return Desire;
    }
    
    boolean ScannerDrinking(int PlayerAlcohol){
        
    if(PlayerAlcohol==0){
    System.out.println("You don't have any moonshine left");
    return false ;
    }else{   
    Scanner Sc2 = new Scanner(System.in);
    System.out.println("Press (Y/y) to continue drinking");
    char sc =  Sc2.nextLine().charAt(0);
    switch(sc){
        case 'Y' : case 'y' : 
            System.out.println("Now you have "+PlayerAlcohol+" moonshine");
            return true ;
        default :    return  false ;
    }
    }
    }

}
    

