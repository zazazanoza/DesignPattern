package abstractFactory;

import abstractFactory.abstractWeapon.MainWeapon;
import abstractFactory.abstractWeapon.SpecialWeapon;
import abstractFactory.abstractWeapon.SubWeapon;
import abstractFactory.abstractWeapon.Weapon;

public class Main {

    public static void main(String[] args) {

        //わかばシューター
        Weapon weapon = Weapon.getWeapon("abstractFactory.wakabaWeapon.WakabaShooter");
        
        //この2行だけ見たらFactoryパターン
        MainWeapon m = weapon.createMainWeapon();
        m.useMain();
        
        SubWeapon s = weapon.createSubWeapon();
        s.useSub();
        SpecialWeapon sp = weapon.createSpecialWeapon();
        sp.useSpecial();
        
            
    }

}
