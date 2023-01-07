package template;

public class TenTax extends ConsumptionTax {

	private int price;

	public TenTax(int price) {
		this.price = price;
	}

	@Override
	public void beforeDisplay() {
		System.out.println(this.price + "円の商品を店内でお召し上がりですね。");
	}

	@Override
	public int tax() {
		return (int) (price * 1.1);
	}

	@Override
	public void afterDisplay(int tax) {
		System.out.println(tax + "円となります。");
	}

}
