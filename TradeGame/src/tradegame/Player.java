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
public class Player extends Scan {
    
    private int Alcohol = 5 ;
    private int Medical = 10 ;
    private int Weapon = 10  ;
    private int Food = 10  ;
    private int Men = 10  ;
    private int Jewelry = 10  ;
    private int Days = 0  ;
    private int Gold = 10000 ;
    private boolean[] Artifact = {false,false,false};
    private boolean ArtifactCheck = Artifact[0]&&Artifact[1]&&Artifact[2];
    private String[] ArtifactName ={"-Waterflake Ancient Necklace","-Soul Magic Knownage","-Dragon's egg"};
    private String[] ShowInventoryName = {"Gold","Medical","Weapon","Food","Jewelry","Manpower","Alcohol"};
    boolean[] drunk = {false,false,false,false,false,false,}; 
    //[0] Jack
    //[1] Priscilla Rose
    //[2] Helena
    //[3] Micker
    //[4] Gabriel
    //[5] Blue
    private boolean[] SingleTimeEvent = {false};
    //[0] Jack free Weapon
    private boolean[] Magic = {false,false};
    //[0]Helena
    //[1] Micker
    void ShowInventory(){
        System.out.println("[Supply]");
        int[] ShowInventoryQuantity = {Gold,Medical,Weapon,Food,Jewelry,Men,Alcohol};
        for(int i = 0 ; i<=6 ;i++){
        System.out.println(ShowInventoryName[i]+":"+ShowInventoryQuantity[i]);
        }
        
        if(Artifact[0]||Artifact[1]||Artifact[2]){
        System.out.println("[Artifact]");
        int i = 0;
        while(i<=2){
            if(Artifact[i]){System.out.println(ArtifactName[i]);}
        i++;
        }
        }
    }
    
    int getAlcohol(){
    return Alcohol ;
    }
    
////////////////////////////////////////////////////////////
    int getMedical(){
    return Medical ;
    }
 /////////////////////////////////////////////////////////// 
    int getFood(){
    return Food ;
    }  
 ///////////////////////////////////////////////////////////   
    int getWeapon(){
    return Weapon ;
    }
 ///////////////////////////////////////////////////////////      
    int getMen(){
    return Men ;
    }
 ///////////////////////////////////////////////////////////      
    int getJewelry(){
    return Jewelry;
    }
 ///////////////////////////////////////////////////////////      
    int getDays(){////
    return Days ;
    }
 ///////////////////////////////////////////////////////////      
    int getGold(){
    return Gold ;
    }
    //////////////////////////////////////////////////
    void setPlayerInventory(int Medical,int Weapon,int Food,int Men,int Jewelry,int Gold,int Alcohol ){
    this.Medical = Medical ;
    this.Weapon = Weapon  ;
    this.Food = Food  ;
    this.Men = Men  ;
    this.Jewelry = Jewelry  ;
    this.Gold = Gold ;
    this.Alcohol =Alcohol ;
    }
    
    char CheckEnding(){
    //switch  
    char ending = 0;
    return ending;
    }
    
    void Ending(char ending){
    switch(ending){
        case '0' : //do nothing
    
    }
    }
    
    void setArtifact(int position){
    Artifact[position] = true;
    }
    
    boolean getArtifact(int position){
    return Artifact[position];
    }
    
    void setSingleTimeEvent(int position){
    SingleTimeEvent[position] = true;
    }
    
    boolean getSingleTimeEvent(int position){
    return SingleTimeEvent[position];
    }
    
    void setDrunk(boolean drinking,int position){
    drunk[position] = drinking ;
    }
    
    void setMagic(boolean Magic,int position){
    this.Magic[position] = Magic ;
    }
            
    boolean getMagic(int position){
    return Magic[position];
    }
}
