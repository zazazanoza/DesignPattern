package factory.framework;

public abstract class Pet {
	public String name; //なまえ
	public int onaka; //空腹度
	public abstract void mohumohu(); //もふもふする
	public abstract void esayari(); //ごはんをあげる
	public abstract void oyasumi(); //おやすみする
	public abstract String getName();
}
