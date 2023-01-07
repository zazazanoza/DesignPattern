package factory.framework;

public abstract class Factory {
	public final Pet create(String name) {
		Pet p = createPet(name);
		registerPet(p);
		return p;
	}
	
	protected abstract Pet createPet(String name);
	protected abstract void registerPet(Pet pet);

}
