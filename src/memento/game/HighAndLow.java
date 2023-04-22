package memento.game;

import java.util.Random;
import java.util.Scanner;

public class HighAndLow {
    private int money;
    private Random random = new Random();
    private int dice1;
    private int dice2;

    public HighAndLow(int money) {
        this.money = money;
        dice2 = random.nextInt(13) + 1;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        Scanner scan = new Scanner(System.in);
        String inputChar;
        dice1 = dice2;
        dice2 = random.nextInt(13) + 1;
        String ans = dice1 > dice2 ? "L" : "H";

        System.out.println("現在のカードは" + dice1 + "です。");
        System.out.println("H(igh) or L(ow)");
        inputChar = scan.next();
        
        if (inputChar.equals(ans)) {
            System.out.println("めくったカードは" + dice2 + "です。");
            System.out.println("当たりです。");
            System.out.println("所持金が100円増えました。");
            money += 100;
        } else {
            System.out.println("めくったカードは" + dice2 + "です。");
            System.out.println("はずれです。");
            System.out.println("所持金が100円減りました。");
            money -= 100;
        }
    }
    
    public Memento createMemento() {
        return new Memento(money);
    }
    
    public void restoreMemento(Memento memento) {
        this.money = memento.money;
    }
}
