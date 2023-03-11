package visitor;

public interface Inn {
    public abstract void stay();
    public abstract void accept(Visitor v);
}
