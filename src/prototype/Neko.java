package prototype;

import prototype.framework.Animal;

public class Neko implements Animal {
    private String name;

    public Neko(String name) {
        this.name = name;
    }

    public void cry(String s) {
        System.out.println(name + "「" + s + "にゃん」");
    }

    public Animal createClone() {
        Animal p = null;
        try {
            p = (Animal) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
