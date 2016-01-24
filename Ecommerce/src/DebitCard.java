
public class DebitCard implements PaymentMethod {

	@Override
	public void payment(int price) {
		System.out.println("Paid Using Debit Card :" + price);
	}

}
