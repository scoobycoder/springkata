package halterman.spring.vending;

import java.util.ArrayList;

public interface VendItem {

	public ArrayList<String> vend(ArrayList<String> itemBinList, double currentAmount);
	
}
