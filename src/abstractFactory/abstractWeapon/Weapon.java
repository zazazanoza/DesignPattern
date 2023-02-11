package abstractFactory.abstractWeapon;

public abstract class Weapon {
    public static Weapon getWeapon(String classname) {
        Weapon weapon = null;
        try {
            //weapon = (Weapon) Class.forName(classname).newInstance(); //Java9から非推奨
            weapon = (Weapon) Class.forName(classname).getDeclaredConstructor().newInstance();

        } catch (ClassNotFoundException e) {
            System.out.println("クラス" + classname + "が存在しません");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return weapon;
    }
    
    public abstract MainWeapon createMainWeapon();
    public abstract SubWeapon createSubWeapon();
    public abstract SpecialWeapon createSpecialWeapon();
    
    
}
