package observer;

import java.util.HashMap;
import java.util.Map;

public class Kainushi implements Observer {
    private Map<String, String> catSounds = new HashMap<>();

    public Kainushi() {
        catSounds.put("にゃー", "みけ");
        catSounds.put("みゃー", "ここあ");
        catSounds.put("うにゃうにゃ", "おもち");
        catSounds.put("ニャーニャー", "たま");
        catSounds.put("ミャオミャオ", "あんず");
    }

    @Override
    public void update(Animal animal) {
        System.out.println(animal.getCry() + " ");
        System.out.println(catSounds.get(animal.getCry()) + "が鳴いてる！");
    }

}
