package factory.neko;

import factory.framework.Pet;

public class Neko extends Pet {

	public Neko(String name) {
		System.out.println("ねこちゃんを飼いました。名前は" + name + "です。");
		this.name = name;
		this.onaka = 0;
	}

	@Override
	public void mohumohu() {
		System.out.println(this.name + "をもふもふしました。");
	}

	@Override
	public void esayari() {
		if (this.onaka < 3) {
			System.out.println(this.name + "にネコ缶をあげました。");
			this.onaka++;
		} else {
			System.out.println(this.name + "にちゅーるをあげました。食べすぎ注意！");
		}
	}

	@Override
	public void oyasumi() {
		System.out.println(this.name + "、おやすみなさい");
		this.onaka = 0; //寝たら満腹度がゼロになる
	}

	@Override
	public String getName() {
		return this.name;
	}

}
