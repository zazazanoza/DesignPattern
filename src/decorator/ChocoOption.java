package decorator;

public class ChocoOption extends Option {

    public ChocoOption(Decorate decorate) {
        super(decorate);
    }

    @Override
    public void decoration() {
        decorate.decoration();
        System.out.println("チョココーティングした");
    }

    @Override
    public int getPrice() {
        return decorate.getPrice() + 100;
    }

}
