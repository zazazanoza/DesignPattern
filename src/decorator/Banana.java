package decorator;

public class Banana extends Decorate {
    
    @Override
    public void decoration() {
        System.out.println("バナナを用意した");
    }

    @Override
    public int getPrice() {
        return 200; //バナナは200円
    }

}
