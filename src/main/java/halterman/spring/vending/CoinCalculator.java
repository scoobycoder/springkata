package halterman.spring.vending;

public class CoinCalculator implements VendingCalc {
	private double totalAmount;

	public void insertCoin(double coinAmount) {
		if (coinAmount != 0.01)
			totalAmount += coinAmount;
	}

	public double calcTotalAmount() {
		return totalAmount;
	}
}
