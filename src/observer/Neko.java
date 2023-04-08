package observer;

import java.util.Random;

public class Neko extends Animal {
    private String[] cries = { "にゃー", "みゃー", "うにゃうにゃ", "ニャーニャー", "ミャオミャオ" };
    private String cry;
    
    @Override
    public String getCry() {
        return cry;
    }
    @Override
    public void cry() {
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            int index = rand.nextInt(cries.length);
            cry = cries[index];
            notifyObserbers();
        }

    }

}
