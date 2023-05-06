package flyweight;

import java.util.HashMap;

public class ManualFactory {
    private HashMap<String, Manual> pool = new HashMap<>();
    private static ManualFactory singleton = new ManualFactory();

    private ManualFactory() {
    }

    public static ManualFactory getInstance() {
        return singleton;
    }

    public synchronized void useManual(String title) {
        Manual manual = (Manual) pool.get(title);
        if (manual == null) {
            manual = new Manual(title);
            pool.put(title, manual);
        }
        System.out.println(title + "の手順書を確認した。");
    }

    public void printManualList() {
        for (Manual m : pool.values()) {
            m.print();
        }
    }

}
