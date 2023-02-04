package prototype.framework;

import java.util.HashMap;

//Manegerクラスでnewしたくない　というモチベーション
public class Manager {
    private HashMap<String, Animal> showcase = new HashMap<>();

    public void register(String name, Animal proto) {
        showcase.put(name, proto);
    }

    public Animal create(String protoname) {
        Animal p = (Animal) showcase.get(protoname);
        return p.createClone();
    }
}
