package factory.neko;

import java.util.ArrayList;
import java.util.List;

import factory.framework.Factory;
import factory.framework.Pet;

public class NekoFactory extends Factory {
	private List<String> nekochans =new ArrayList<>();

	@Override
	protected Pet createPet(String name) {
		return new Neko(name);
	}

	@Override
	protected void registerPet(Pet pet) {
		nekochans.add(((Neko)pet).getName()); //ネコちゃんずに名前を登録する
	}
	public List getNekochans() {
		return nekochans;
	}

}
