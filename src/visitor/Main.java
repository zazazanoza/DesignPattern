package visitor;

public class Main {

    public static void main(String[] args) {
        Maria maria = new Maria();
        maria.visit(new InnA());
        maria.visit(new InnB());
    }

}
