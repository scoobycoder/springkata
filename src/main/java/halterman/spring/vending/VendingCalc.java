package halterman.spring.vending;

public interface VendingCalc {
	public void insertCoin(double coinAmount);
	
	public double calcTotalAmount();
}
