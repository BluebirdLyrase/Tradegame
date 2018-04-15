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
public class C2_FoxPocketwatch extends CityRedapple implements Guardian {
    
    C2_FoxPocketwatch(int PlayerMedical,int PlayerWeapon,int PlayerFood,
                      int PlayerJewelry,int PlayerMen,int PlayerGold){    
    super(PlayerMedical,PlayerWeapon,PlayerFood,
          PlayerJewelry,PlayerMen,PlayerGold);    
    System.out.println("[Person:Lizza Robinhood]");
    System.out.println("Lizza: Welcome to Lizza Good store What can I help you?"); 
    Greeting();
    System.out.println("Lizza: See you around.");
    }

    void Greeting(){} 
    void Asking(){}
    void Drinking(){}
    void Promotion(){}    
    public void Report(){}
}
