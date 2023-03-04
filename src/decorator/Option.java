package decorator;

public abstract class Option extends Decorate {
    protected Decorate decorate;

    public Option(Decorate decorate) {
        this.decorate = decorate;
    }

}
