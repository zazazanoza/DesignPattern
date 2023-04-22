package memento;

import java.util.Scanner;

import memento.game.HighAndLow;
import memento.game.Memento;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HighAndLow HandL = new HighAndLow(1000);
        Memento memento = HandL.createMemento();

        while (true) {
            System.out.println("所持金：" + HandL.getMoney());
            System.out.println("N(ext) : E(xit) : S(ave) : L(oad)?");
            String s = sc.next();

            if (s.equals("E")) {
                break;
            } else if (s.equals("S")) {
                memento = HandL.createMemento();
                System.out.println("セーブしました。ゲームを続行します。");
            } else if (s.equals("L")) {
                HandL.restoreMemento(memento);
                System.out.println("所持金：" + HandL.getMoney() + "　をロードしました。ゲームを続行します。");
            }
            HandL.bet();
        }
        System.out.println(HandL.getMoney() + "円で終了します。");

    }

}
