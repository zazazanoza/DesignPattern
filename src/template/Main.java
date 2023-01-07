package template;

public class Main {

	public static void main(String[] args) {
		ConsumptionTax t1 = new TenTax(100);
		ConsumptionTax t2 = new EightTax(100);
		
		t1.display();
		t2.display();

	}

}
