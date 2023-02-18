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
    
    public void fight() {
        main.useMain();
        special.useSpecial();
    }

    public void setMain(MainWeapon main) {
        this.main = main;
    }

}
