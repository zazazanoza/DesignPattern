package chainOfResponsibility;

public class L4K extends Weapon {

    public L4K(String name) {
        super(name);
        // TODO 自動生成されたコンストラクター・スタブ
    }

    @Override
    protected boolean isAttackSuccessful(Oomono oomono) {
        if(oomono== Oomono.BAKUDAN || oomono==Oomono.HEBI) {
            return true;
        }
        return false;
    }

}
