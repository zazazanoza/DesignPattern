package template;

public class EightTax extends ConsumptionTax {

	private int price;

	public EightTax(int price) {
		this.price = price;
	}

	@Override
	public void beforeDisplay() {
		System.out.println(this.price + "円の商品をテイクアウトですね。");
	}

	@Override
	public int tax() {
		return (int) (price * 1.08);
	}

	@Override
	public void afterDisplay(int tax) {
		System.out.println(tax + "円となります。");
	}

}
