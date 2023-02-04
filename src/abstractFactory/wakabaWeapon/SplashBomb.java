package abstractFactory.wakabaWeapon;

import abstractFactory.abstractWeapon.SubWeapon;

public class SplashBomb extends SubWeapon {

    @Override
    public void useSub() {
        System.out.println("ぽーん…ばん！");
    }

}
