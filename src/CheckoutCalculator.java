import java.util.HashMap;
import java.util.List;

public class CheckoutCalculator {

	public int calculateTotalAmountAtCheckout(List<String> listOfitemCode) {

		int totalPriceOfAllItems = 0;
		for (String itemCode : listOfitemCode) {
			totalPriceOfAllItems += getPriceOfItem(itemCode);

		}
		return totalPriceOfAllItems;
	}

	private int getPriceOfItem(String itemCode) {

		HashMap<String, Integer> itemPriceMapper = new HashMap<String, Integer>();

		itemPriceMapper.put("A", 100);
		itemPriceMapper.put("B", 200);
		itemPriceMapper.put("C", 300);

		return itemPriceMapper.getOrDefault(itemCode, 0);
	}

}
