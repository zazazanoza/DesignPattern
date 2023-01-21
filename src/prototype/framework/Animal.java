package prototype.framework;

public interface Animal extends Cloneable {
    public abstract void cry(String s); //鳴く　かわいい
    public abstract Animal createClone();
}
