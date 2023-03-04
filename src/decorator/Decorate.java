package decorator;

public abstract class Decorate {

    public abstract void decoration(); //デコレーションする
    public abstract int getPrice(); //デコレーション単価を得る
    public void okaikei() {
        decoration();
        System.out.println(getPrice() + "円となります");
    }
}
