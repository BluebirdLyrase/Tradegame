package tradegame;
public class Travel {
    
int PlayerMedical,PlayerWeapon,PlayerFood,PlayerMen,PlayerJewelry,PlayerGold;
boolean artifact;
String CityName;
Travel(int PlayerMedical,int PlayerWeapon,int PlayerFood,int PlayerMen,
       int PlayerJewelry,int PlayerGold,boolean artifact,String CityName){
    //this();
    this.PlayerMedical = PlayerMedical;
    this.PlayerWeapon = PlayerWeapon;
    this.PlayerMen = PlayerMen;
    this.PlayerJewelry = PlayerJewelry;
    this.PlayerGold = PlayerGold;
    this.artifact = artifact;
    switch(CityName){
        case "Drylagoon" : TravelingToDrylagoon(); break;
        case "Redapple" : TravelingToRedapple(); break;
    }
}

Travel(){
    System.out.println("Traveling to "+CityName);
}

void TravelingToDrylagoon(){
    System.out.println("Approaching bandit");
    if(PlayerGold>=1000){
        System.out.println("The bandit has leave");
        PlayerGold = PlayerGold - 1000;
        System.out.println("Now you have "+PlayerGold+" gold");
    }else{
        if(PlayerWeapon>=15){
            System.out.println("fight");
            PlayerWeapon = PlayerWeapon - 15;
            System.out.println("Now you have "+PlayerWeapon+" weapon");
                    if(PlayerMedical>=10){
                        PlayerMedical = PlayerMedical - 10;
                        System.out.println("Now you have have "+PlayerMedical+" medical");
                    }else{
                    PlayerMen = 0;
                    System.out.println("You lose all your men");
                    }
        }else{
            if(PlayerMen>=15){
                System.out.println("dead");
                PlayerMen = PlayerMen - 15;
                System.out.println("Now you have "+PlayerMen+" men");
            }else{
                System.out.println("fuk up");
                System.out.println("You lose all Gold, Jewelry, Men, Weapon");
                PlayerGold = 0;
                PlayerJewelry = 0;
                PlayerMen = 0;
                PlayerWeapon = 0;
            }
        }
    }
    
}
void TravelingToRedapple(){
    if(artifact){
        System.out.println("to city");
    }else{
        System.out.println("Approaching souless monster");
        if(PlayerWeapon>=20){
        System.out.println("fight");
        PlayerWeapon = PlayerWeapon - 20;
        System.out.println("Now you have "+PlayerWeapon+" weapon");
                    if(PlayerMedical>=10){
                        PlayerMedical = PlayerMedical - 10;
                        System.out.println("Now you have "+PlayerMedical+" medical");
                    }else{
                    PlayerMen = 0;
                    System.out.println("You lose all your men");
                    }
        }else{
            if(PlayerMen>=20){
            System.out.println("dead");
            PlayerMen = PlayerMen - 20;
            System.out.println("Now you have "+PlayerMen+" men");
            }else{
                System.out.println("fuk up");
                System.out.println("You lose all Weapon, Men, Food, Medical");
                PlayerWeapon = 0;
                PlayerMen = 0;
                PlayerFood = 0;
                PlayerMedical = 0;
            }
        }
    }
}
//ในการเรียนกใช้คลาสนี้ ต้องส่งพารามิเตอร์ที่จำเป็นมาเห็บไว้ในตัวแปรของคลาสนี้ ได้แก่ 
//Medical,Weapon,Food,Men,Jewelry,Gold,artifact[0] และ ค่าString ที่บอกว่าเดินทางไปเมืองไหน
    
//คอนตั้กเตอร์แรกรับค่าทั้งหมดที่กล่าวไว้ข้างต้น และ ใส่ค่าให้ตัวแกรในคลาสนี้ เท่ากับ ในพารามิเตอร์
//คอนตั้งเตอร์ที่ 2 ให้เรียกด้วย This(ค่าString ที่บอกว่าเดินทางไปเมืองไหน); บนคอนตั้กเตอร์แรก บรรทักแรก
 
   //ในthis(ค่าString ที่บอกว่าเดินทางไปเมืองไหน) ให้ปริ้น Traveling to + ค่าString ที่บอกว่าเดินทางไปเมืองไหน(Drylagoon or Red apple)
    
//ต่อมาหลังจากที่เรียก This() เสร็จแล้ว ให้ใช้ switch( ค่าString ที่บอกว่าเดินทางไปเมืองไหน
    //โดยมีเคส "Drylagoon" //อย่าลืม break;
    //และเคส "Redapple"
    
//สร้าง medthod TravelingToDrylagoon และ  TravelingToRedapple
 //เคส Drylagoon เรียก medthod TravelingToDrylagoon
 //เคส Redapple เรียก medthod TravelingToRedapple
 
// medthod TravelingToDrylagoon
    //print บอกว่ามี bandit เรียกค่าไถ่ x 
    // ถ้าไม่พอจะเกิดการต่อสู้จน(หากมี Weapon ตามที่กำหนด) Weapon = หักตามนั้น ถ้า Weapon ไม่พออีก(หากมีMen ตามที่กำหนด) Men = หักตามนั้น
        //ถ้าไม่พอสักอย่าง(จนมาถึง else สุดท้าย) ให้หักทั้ง weapon,men,gold,jewery = 0 
    
 // medthod TravelingToRedapple
    //ถ้า artifact[0] เป็น Tu เข้า if ผ่านไปโดยไม่มีไรเกิดขึ้น ถ้าเป็น false เข้า else
    //else แรก บอกว่าเจอ Souless Monster แล้วทำ of else ซ้อนกันเหมือน TravelingToDrylagoon
    //***แต่ ตอนหัก else สุดท้ายเปลี่ยนจาก jewery = 0  เป็น Food = 0
    
    /////////////หากเข้า if ที่ Weapon มากพอ ให้เช็ค medical ว่ามีพอนึเปล่า พ้ามีพอให้หักไปตามนั้น ถ้าไม่พอ men = 0
    
}//class travel
