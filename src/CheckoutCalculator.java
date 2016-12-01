import java.util.HashMap;

public class CheckoutCalculator {

	public int calculateTotalAmountAtCheckout(String itemCode) {
		
		return getPriceOfItem(itemCode);
	}

	private int getPriceOfItem(String itemCode) {
		
		HashMap<String, Integer> itemPriceMapper = new HashMap<String, Integer>();
		
		itemPriceMapper.put("A", 100);
		itemPriceMapper.put("B", 200);
		itemPriceMapper.put("C", 300);
		
		return itemPriceMapper.getOrDefault(itemCode, 0);
	}

}
