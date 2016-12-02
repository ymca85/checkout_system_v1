import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CheckoutCalculatorShould {

	@Test
	public void return_amount_100_for_item_A() {

		CheckoutCalculator checkoutCalculator = new CheckoutCalculator();
		List<String> listOfItemCode = Arrays.asList("A");
		assertEquals(100, checkoutCalculator.calculateTotalAmountAtCheckout(listOfItemCode));

	}
	
	@Test
	public void return_amount_200_for_item_B() {

		CheckoutCalculator checkoutCalculator = new CheckoutCalculator();
		List<String> listOfItemCode = Arrays.asList("B");
		assertEquals(200, checkoutCalculator.calculateTotalAmountAtCheckout(listOfItemCode));

	}
	
	@Test
	public void return_amount_300_for_item_C() {

		CheckoutCalculator checkoutCalculator = new CheckoutCalculator();
		List<String> listOfItemCode = Arrays.asList("C");
		assertEquals(300, checkoutCalculator.calculateTotalAmountAtCheckout(listOfItemCode));

	}
	
	@Test
	public void return_amount_300_for_item_A_B() {

		CheckoutCalculator checkoutCalculator = new CheckoutCalculator();
		List<String> listOfItemCode = Arrays.asList("A", "B");
		assertEquals(300, checkoutCalculator.calculateTotalAmountAtCheckout(listOfItemCode));

	}
	
	@Test
	public void return_amount_180_for_item_A_A_with_discounted_price_90() {

		CheckoutCalculator checkoutCalculator = new CheckoutCalculator();
		List<String> listOfItemCode = Arrays.asList("A", "A");
		assertEquals(180, checkoutCalculator.calculateTotalAmountAtCheckout(listOfItemCode));

	}
	
	@Test
	public void return_amount_360_for_item_B_B_with_discounted_price_180() {

		CheckoutCalculator checkoutCalculator = new CheckoutCalculator();
		List<String> listOfItemCode = Arrays.asList("B", "B");
		assertEquals(360, checkoutCalculator.calculateTotalAmountAtCheckout(listOfItemCode));

	}

}
