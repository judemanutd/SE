
public class OldTax implements TaxInterface {

	@Override
	public double calcTax(double amt) {
		return amt * 0.10;
	}
}
