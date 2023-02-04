package prototype;

import prototype.framework.Animal;

public class SoAndSo implements Animal {

    private String name;
    private String gobi;

    public SoAndSo(String name, String gobi) {
        this.name = name;
        this.gobi = gobi;
    }

    public void cry(String s) {
        System.out.println(name + "「" + s + this.gobi + "」");
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
