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

		int countOfItemA = getCountOfItemA(listOfitemCode);
		if (countOfItemA >= 2) {
			totalPriceOfAllItems = updateTootalPriceAtCheckout(totalPriceOfAllItems, countOfItemA);
		}
		
		int countOfItemB = getCountOfItemB(listOfitemCode);
		if(countOfItemB >=2) {
			totalPriceOfAllItems = totalPriceOfAllItems + (180 * countOfItemB) - (getPriceOfItem("B") * countOfItemB);
		}
		
		return totalPriceOfAllItems;
	}

	private int getCountOfItemB(List<String> listOfitemCode) {
		int countOfItemB = 0;
		for (String itemCode : listOfitemCode) {
			if (itemCode.equals("B")) {
				countOfItemB++;
			}
		}
		return countOfItemB;
	}

	private int updateTootalPriceAtCheckout(int totalPriceOfAllItems, int countOfItemA) {
		totalPriceOfAllItems = totalPriceOfAllItems + (90 * countOfItemA) - (getPriceOfItem("A") * countOfItemA);
		return totalPriceOfAllItems;
	}

	private int getCountOfItemA(List<String> listOfitemCode) {
		int countOfItemA = 0;
		for (String itemCode : listOfitemCode) {
			if (itemCode.equals("A")) {
				countOfItemA++;
			}
		}
		return countOfItemA;
	}

	private int getPriceOfItem(String itemCode) {
		return itemPriceMapper.getOrDefault(itemCode, 0);
	}

}
