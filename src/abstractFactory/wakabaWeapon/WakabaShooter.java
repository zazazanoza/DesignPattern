package abstractFactory.wakabaWeapon;

import abstractFactory.abstractWeapon.MainWeapon;
import abstractFactory.abstractWeapon.SpecialWeapon;
import abstractFactory.abstractWeapon.SubWeapon;
import abstractFactory.abstractWeapon.Weapon;

public class WakabaShooter extends Weapon {

    @Override
    public MainWeapon createMainWeapon() {
        // TODO 自動生成されたメソッド・スタブ
        return new Wakaba();
    }

    @Override
    public SubWeapon createSubWeapon() {
        // TODO 自動生成されたメソッド・スタブ
        return new SplashBomb();
    }

    @Override
    public SpecialWeapon createSpecialWeapon() {
        // TODO 自動生成されたメソッド・スタブ
        return new GreatBarrier();
    }

}
