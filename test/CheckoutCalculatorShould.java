import static org.junit.Assert.*;

import org.junit.Test;

public class CheckoutCalculatorShould {

	@Test
	public void return_amount_100_for_item_A() {

		CheckoutCalculator checkoutCalculator = new CheckoutCalculator();
		assertEquals(100, checkoutCalculator.calculateTotalAmountAtCheckout("A"));

	}
	
	@Test
	public void return_amount_200_for_item_B() {

		CheckoutCalculator checkoutCalculator = new CheckoutCalculator();
		assertEquals(200, checkoutCalculator.calculateTotalAmountAtCheckout("B"));

	}

}
