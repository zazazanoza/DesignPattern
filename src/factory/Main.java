package factory;

import factory.framework.Factory;
import factory.framework.Pet;
import factory.neko.NekoFactory;

public class Main {

	public static void main(String[] args) {
		Factory factory = new NekoFactory();

		Pet p1 = factory.create("おもち");
		Pet p2 = factory.create("ちょこ");
		Pet p3 = factory.create("みんと");

		p1.mohumohu();
		p2.esayari();
		p2.esayari();
		p2.esayari();
		p2.esayari();
		p3.oyasumi();

		System.out.println("私の家のねこちゃんは " + ((NekoFactory) factory).getNekochans() + " です。");
	}

}
