package prototype;

import prototype.framework.Animal;

public class Inu implements Animal {
    private String name;

    public Inu(String name) {
        this.name = name;
    }

    public void cry(String s) {
        System.out.println(name + "「" + s + "わん！！」");
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
