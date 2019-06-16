import java.util.ArrayList;

public class Geldrueckgeber {

	/**
	 * Alle Münzen und Scheine mit ihrem Wert in Cent die wir zur Auszahlung verwenden können.
	 */
	final private static ArrayList<Double> lBillsAndCoins = new ArrayList<Double>();
	
	static {

		lBillsAndCoins.add(50000d); // Fünfhundert Euro
		lBillsAndCoins.add(20000d); // zweihundert Euro
		lBillsAndCoins.add(10000d); // Hundert Euro

		lBillsAndCoins.add(5000d); // Fünfzig Euro
		lBillsAndCoins.add(2000d); // Zwanzig Euro
		lBillsAndCoins.add(1000d); // Zehn Euro

		lBillsAndCoins.add(500d); // Fünf Euro
		lBillsAndCoins.add(200d); // Zwei Euro
		lBillsAndCoins.add(100d); // Ein Euro

		lBillsAndCoins.add(50d); // Fünfzig Cent
		lBillsAndCoins.add(20d); // Zwanzig Cent
		lBillsAndCoins.add(10d); // Zehn Cent

		lBillsAndCoins.add(5d); // Fünf Cent
		lBillsAndCoins.add(2d); // Zwei Cent
		lBillsAndCoins.add(1d); // Ein Cent
	}

	// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		float fAmount = (float) 88.88;
		
		

	}

}
