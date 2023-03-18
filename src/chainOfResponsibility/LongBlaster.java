package chainOfResponsibility;

public class LongBlaster extends Weapon {

    public LongBlaster(String name) {
        super(name);
    }

    @Override
    protected boolean isAttackSuccessful(Oomono oomono) {
        if (oomono == Oomono.TOWER) {
            return true;
        }
        return false;
    }

}
