
public class CreditCard implements PaymentMethod {

	@Override
	public void payment(int price) {
		System.out.println("Paid Using Credit Card :" + price);
	}

}
