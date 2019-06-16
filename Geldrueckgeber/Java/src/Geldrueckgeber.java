import java.util.ArrayList;
import java.util.HashMap;

class BillOrCoin {

	final public int iValue;
	final public String strDisplayName;

	public BillOrCoin(int iValue, String strDisplayName) {

		this.iValue = iValue;
		this.strDisplayName = strDisplayName;
	}
}

public class Geldrueckgeber {

	/**
	 * Alle Münzen und Scheine mit ihrem Wert in Cent die wir zur Auszahlung
	 * verwenden können.
	 */
	final private static ArrayList<BillOrCoin> lBillsAndCoins = new ArrayList<BillOrCoin>();

	static {

		lBillsAndCoins.add(new BillOrCoin(50000, "Fünfhundert Euro"));
		lBillsAndCoins.add(new BillOrCoin(20000, "Zweihundert Euro"));
		lBillsAndCoins.add(new BillOrCoin(10000, "Hundert Euro"));

		lBillsAndCoins.add(new BillOrCoin(5000, "Fünfzig Euro"));
		lBillsAndCoins.add(new BillOrCoin(2000, "Zwanzig Euro"));
		lBillsAndCoins.add(new BillOrCoin(1000, "Zehn Euro"));

		lBillsAndCoins.add(new BillOrCoin(500, "Fünf Euro"));
		lBillsAndCoins.add(new BillOrCoin(200, "Zwei Euro"));
		lBillsAndCoins.add(new BillOrCoin(100, "Ein Euro"));

		lBillsAndCoins.add(new BillOrCoin(50, "Fünfzig Cent"));
		lBillsAndCoins.add(new BillOrCoin(20, "Zwanzig Cent"));
		lBillsAndCoins.add(new BillOrCoin(10, "Zehn Cent"));

		lBillsAndCoins.add(new BillOrCoin(5, "Fünf Cent"));
		lBillsAndCoins.add(new BillOrCoin(2, "Zwei Cent"));
		lBillsAndCoins.add(new BillOrCoin(1, "Ein Cent"));
	}

	// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	/**
	 * 
	 * @param fAmount
	 * @return
	 */
	private static HashMap<BillOrCoin, Integer> getBillsAndCoinsCount(float fAmount) {
		return null;
	}

	// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		float fAmount = 88.88f;

		var result = getBillsAndCoinsCount(fAmount);

		for (BillOrCoin boc : result.keySet()) {

			System.out.println(String.format("{0}: {1}", boc.strDisplayName, result.get(boc)));
		}
	}
}
