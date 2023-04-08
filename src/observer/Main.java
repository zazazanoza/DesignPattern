package observer;

public class Main {

    public static void main(String[] args) {
        Neko neko = new Neko();
        Observer watashi = new Kainushi();
        neko.addObserver(watashi);
        neko.cry();
    }

}
