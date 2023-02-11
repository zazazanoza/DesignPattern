package bridge;

public class Main {
    public static void main(String[] args) {
        AbstIka a1 = new AbstIka(new ConcreIka());
        SrankIka a2 = new SrankIka(new ConcreIka());

        a1.attack();
        System.out.println("==============");
        a2.attack();
    }
}
