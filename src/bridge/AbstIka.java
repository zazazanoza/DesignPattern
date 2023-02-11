package bridge;

public class AbstIka {
    ImplIka impl;

    AbstIka(ImplIka i) {
        this.impl = i;
    }

    void attack() {
        impl.shoot();
    }

    void escape() {
        impl.dive();
        impl.run();
    }

}
