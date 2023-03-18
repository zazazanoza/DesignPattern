package chainOfResponsibility;

public class Wakaba extends Weapon {
    
    public Wakaba(String name) {
        super(name);
        // TODO 自動生成されたコンストラクター・スタブ
    }
    @Override
    protected boolean isAttackSuccessful(Oomono oomono) {
        if (oomono == Oomono.MOGURA) {
            return true;
        }
        return false;

    }

}
