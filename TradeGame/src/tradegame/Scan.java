 
package tradegame;
import java.util.Scanner;
public class Scan {
    

    int ScannerSwitch(int limit){
    int Desire ;    
    do{      
    java.util.Scanner Sc = new java.util.Scanner(System.in);
    System.out.print("Choose a number between (1-"+limit+")>>>");
    Desire = Sc.nextInt();
    }while(Desire<=0||Desire>limit);     
     System.out.println("-----------------------------------------------------");
    return Desire;
    }

}
    

