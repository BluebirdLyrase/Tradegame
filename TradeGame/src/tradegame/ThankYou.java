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
public class ThankYou {
    
    ThankYou(){
    this("Thank For Playing");
    }
    
    ThankYou(String TQ){
    int i = 5 ;
    while(i>0){
    System.out.println("*****************");
    i--;
    }    
    System.out.println(TQ);    
    i = 5 ;
    while(i>0){
    System.out.println("*****************");
    i--;
    }    
    }
    
}
