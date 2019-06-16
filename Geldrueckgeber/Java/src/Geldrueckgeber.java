import java.util.ArrayList;

class BillOrCoin {

	final public int Value;
	final public String DisplayName;
	public int Count = 0;

	public BillOrCoin(int iValue, String strDisplayName) {

		this.Value = iValue;
		this.DisplayName = strDisplayName;
	}

	@Override
	public String toString() {
		return DisplayName;
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
	private static ArrayList<BillOrCoin> getBillsAndCoinsCount(float fAmount) {

		// Umrechnen in einheitliche Basis Cent
		int iAmount = (int) (fAmount * 100);

		ArrayList<BillOrCoin> lResult = new ArrayList<BillOrCoin>();

		for (BillOrCoin boc : lBillsAndCoins) {

			int iCount = (int) (iAmount / boc.Value);

			if (iCount > 0) {

				boc.Count = iCount;
				lResult.add(boc);

				iAmount = iAmount - (iCount * boc.Value);
			}
		}

		return lResult;
	}

	// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

//		float fAmount = 888.88f;
//		float fAmount = 543.21f;
		float fAmount = 123.45f;

		var result = getBillsAndCoinsCount(fAmount);

		System.out.println(String.format("Betrag: %s €", fAmount));

		for (BillOrCoin boc : result) {

			System.out.println(
					String.format("%-20s: %s (%5s) €", boc.DisplayName, boc.Count, (float)(boc.Count * boc.Value) / 100));
		}
	}
}
