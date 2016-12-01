
public class CheckoutCalculator {

	public int calculateTotalAmountAtCheckout(String itemCode) {
		if (itemCode.equals("A")) {
			return 100;
		} else if (itemCode.equals("B")) {
			return 200;
		}
		return 0;
	}

}
