package visitor;

public class InnB implements Inn {
    public void stay() {
        System.out.println("ゆっくりしていってね！");
    }
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
