import java.util.HashMap;
import java.util.List;

public class CheckoutCalculator {

	private HashMap<String, Integer> itemPriceMapper = new HashMap<String, Integer>();
	
	public CheckoutCalculator() {
		itemPriceMapper.put("A", 100);
		itemPriceMapper.put("B", 200);
		itemPriceMapper.put("C", 300);
	}
	
	public int calculateTotalAmountAtCheckout(List<String> listOfitemCode) {

		int totalPriceOfAllItems = 0;
		for (String itemCode : listOfitemCode) {
			totalPriceOfAllItems += getPriceOfItem(itemCode);

		}
		return totalPriceOfAllItems;
	}

	private int getPriceOfItem(String itemCode) {
		return itemPriceMapper.getOrDefault(itemCode, 0);
	}

}
