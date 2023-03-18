package chainOfResponsibility;

public class Main {

    public static void main(String[] args) {
        Weapon wakaba = new Wakaba("わかばシューター");
        Weapon longBlaster = new LongBlaster("ロングブラスター");
        Weapon primeshooter = new PrimeShooter("プライムシューター");
        Weapon l4K = new L4K("リッター4K");

        wakaba.setNext(longBlaster).setNext(primeshooter).setNext(l4K);

        Oomono[] oomonos = Oomono.values();
        for (Oomono oomono : oomonos) {
            wakaba.appear(oomono);
        }
    }
}
