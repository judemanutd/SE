
public class Client {
	public static void main(String args[]) {
		TaxInterface tax = new NewTax();
		System.out.println("Tax amount is " + tax.calcTax(2500));
	}

}
