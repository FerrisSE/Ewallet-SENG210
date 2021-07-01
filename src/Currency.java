
public class Currency {
	public double rate;
	public String name;
	// Current Rates as of 6/68/2021
	public double Euro_rate = 0.84;		
	public double BritishPound_rate = 0.72;
	public double IndianRupee_rate = 0.74;
	public double AustralianDollar_rate = 1.32;
	public double CanadianDollar_rate = 1.23;
	
	
	public double set_rate(int selection_num) {
		double rate;
		
		//sets the rate to Euros
		if (selection_num == 0) {
			rate = Euro_rate;
		}
		
		if (selection_num == 1) {
			rate = BritishPound_rate;
		}
		
		
		
	}
}
