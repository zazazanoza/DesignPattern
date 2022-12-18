package iterator;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

        NekoName NekoName = new NekoName(4);
        NekoName.appendNeko(new Neko("neko"));
        NekoName.appendNeko(new Neko("tama"));
        NekoName.appendNeko(new Neko("omochi"));
        NekoName.appendNeko(new Neko("kawaii"));
        Iterator it = NekoName.iterator();
        while (it.hasNext()) {
            Neko Neko = (Neko)it.next();
            System.out.println(Neko.getName());
        }
        
        //ArrayListで実装
        var nekochans = new ArrayList<Neko>();

        nekochans.add(new Neko("NEKO"));
        nekochans.add(new Neko("TAMA"));
        nekochans.add(new Neko("OMOCHI"));
        nekochans.add(new Neko("KAWAII"));
        //add前にイテレータを宣言するとエラーになる
        var iterator = nekochans.iterator();
        while(iterator.hasNext()) {
        	System.out.println(iterator.next().getName());
        }
        
	}

}
