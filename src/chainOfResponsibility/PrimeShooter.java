package chainOfResponsibility;

public class PrimeShooter extends Weapon {

    public PrimeShooter(String name) {
        super(name);
    }

    @Override
    protected boolean isAttackSuccessful(Oomono oomono) {
        if(oomono==Oomono.BAKUDAN) {
            return true;
        }
        return false;
    }

}
