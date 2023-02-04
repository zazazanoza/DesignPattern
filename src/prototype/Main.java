package prototype;

import java.util.Scanner;

import prototype.framework.Animal;
import prototype.framework.Manager;

public class Main {
    public static void main(String[] args) {

        //直接newする場合
        Animal a1 = new Inu("カモミール");
        Animal a2 = new Neko("みんと");
        Animal a3 = new Neko("らべんだー");
        a1.cry("hello world");
        a2.cry("hello world");
        a3.cry("hello world");

        System.out.println("");

        Manager manager = new Manager();
        Inu ceylon = new Inu("セイロン");
        Neko cashe = new Neko("かしゅかしゅ");
        Neko darjeeling = new Neko("だーじりん");
        manager.register("ceylon dog", ceylon);
        manager.register("cashe cashe cat", cashe);
        manager.register("darjeeling cat", darjeeling);

        //ここから先はNekko,Inuクラスが変更になっても影響を受けない
        Animal p1 = manager.create("ceylon dog");
        p1.cry("はろーわーるど");
        Animal p2 = manager.create("cashe cashe cat");
        p2.cry("はろーわーるど");
        Animal p3 = manager.create("darjeeling cat");
        p3.cry("はろーわーるど");

        //新たにセイロンインスタンスを作成する（この例の場合はp1を使えばいいと思うけど・・・）
        Animal p4 = manager.create("ceylon dog");
        p4.cry("いぬぬ");

        System.out.println("");

        //ユーザが語尾を決められる
        Scanner sc = new Scanner(System.in);
        System.out.println("はつかぜの語尾を決めてください");
        SoAndSo hatsukaze = new SoAndSo("はつかぜ", sc.next());
        manager.register("hatsukaze", hatsukaze);

        System.out.println("まゆみの語尾を決めてください");
        SoAndSo mayumi = new SoAndSo("まゆみ", sc.next());
        manager.register("mayumi", mayumi);

        Animal s1 = manager.create("hatsukaze");
        s1.cry("はろーわーるど");
        Animal s2 = manager.create("mayumi");
        s2.cry("はろーわーるど");

    }
}
