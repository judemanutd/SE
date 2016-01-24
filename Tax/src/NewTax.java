
public class NewTax implements TaxInterface {

	@Override
	public double calcTax(double amt) {
		NewAPI tax = new NewAPI();
		return tax.taxcalculation(amt);
	}

}
