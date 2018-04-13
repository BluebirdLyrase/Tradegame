
package tradegame;

interface Merchant {
    abstract void Trade();
    void PlayerSelling(String WhatIsIt,int HowMuch,int HowMany);
    void PlayerBuying(String WhatIsIt,int HowMuch);
}//interface
