package strategy;

import strategy.mainWeapons.MainWeapon;
import strategy.specialWeapons.SpecialWeapon;

public class Player {
    
    private MainWeapon main;
    private SpecialWeapon special;
    
    Player(MainWeapon main,SpecialWeapon special){
        this.main = main;
        this.special = special;
    }
    
    void fight() {
        main.useMain();
        special.useSpecial();
    }

}
