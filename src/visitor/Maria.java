package visitor;

public class Maria extends Visitor {

    @Override
    public void visit(InnA innA) {
        System.out.println("泊まりたいのですが…");
        innA.stay();
    }

    @Override
    public void visit(InnB innB) {
        System.out.println("泊まりたいのですが…（切実な顔）");
       innB.stay(); 
    }

}
