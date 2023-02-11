package bridge;

public class ConcreIka implements ImplIka {

    @Override
    public String dive() {
        System.out.println("インクに潜った");
        return null;
    }

    @Override
    public String shoot() {
        System.out.println("攻撃した");
        return null;
    }

    @Override
    public String run() {
        System.out.println("移動した");
        return null;
    }

}
