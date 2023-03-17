package visitor;

public class Main {

    public static void main(String[] args) {
        InnA innA = new InnA();
        InnB innB = new InnB();
        innA.accept(new Maria());
        innB.accept(new Maria());

    }

}
