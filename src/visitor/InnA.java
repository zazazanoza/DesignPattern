package visitor;

public class InnA implements Inn {
    public void stay() {
        System.out.println("満員です、ごめんなさい。");
    }
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
