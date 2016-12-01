import java.util.HashMap;
import java.util.List;

public class CheckoutCalculator {

	public int calculateTotalAmountAtCheckout(List<String> listOfitemCode) {
		
		return getPriceOfItem(listOfitemCode.get(0));
	}

	private int getPriceOfItem(String itemCode) {
		
		HashMap<String, Integer> itemPriceMapper = new HashMap<String, Integer>();
		
		itemPriceMapper.put("A", 100);
		itemPriceMapper.put("B", 200);
		itemPriceMapper.put("C", 300);
		
		return itemPriceMapper.getOrDefault(itemCode, 0);
	}

}
