package bridge;

public class SrankIka extends AbstIka {

    SrankIka(ImplIka i) {
        super(i);
    }

    void attack() {
        impl.shoot();
        impl.dive();
        impl.shoot();
    }
    
}
