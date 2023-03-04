package decorator;

public class AlazanOption extends Option {

    public AlazanOption(Decorate decorate) {
        super(decorate);
    }

    @Override
    public void decoration() {
        decorate.decoration();
        System.out.println("アラザンをかけた");
    }

    @Override
    public int getPrice() {
        return decorate.getPrice() + 50;
    }

}
