package template;

public abstract class ConsumptionTax {
	
	public abstract void beforeDisplay();
	public abstract int tax(); //小数点以下切り捨て
	public abstract void afterDisplay(int tax);

	public final void display() {
		beforeDisplay();
		afterDisplay(tax());
	}
}
