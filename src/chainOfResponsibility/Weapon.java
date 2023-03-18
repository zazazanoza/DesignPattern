package chainOfResponsibility;

public abstract class Weapon {
    private String name;
    private Weapon next;
    
    public Weapon(String name) {
        this.name = name;
    }

    public Weapon setNext(Weapon next) {
        this.next = next;
        return next;
    }

    public final void appear(Oomono oomono) {
        if (isAttackSuccessful(oomono)) {
            success(oomono);
        } else if (next != null) {
            next.appear(oomono);
        } else {
            failed(oomono);
        }
    }

    protected abstract boolean isAttackSuccessful(Oomono oomono);

    protected void success(Oomono oomono) {
        System.out.println(name + "が" + oomono + "を倒した！");
    }

    protected void failed(Oomono oomono) {
        System.out.println(oomono + "を倒せなかった……。");
    }

}
