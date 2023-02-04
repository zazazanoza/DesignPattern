package strategy;

import strategy.mainWeapons.Take;
import strategy.mainWeapons.Wakaba;
import strategy.specialWeapons.GreatBarrier;
import strategy.specialWeapons.KillerWail5_1;

public class Main {

    public static void main(String[] args) {

        Player p1 = new Player(new Wakaba(), new GreatBarrier());
        Player p2 = new Player(new Take(), new KillerWail5_1());

        p1.fight();
        p2.fight();

    }

}
