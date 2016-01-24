
public class COD implements PaymentMethod {

	@Override
	public void payment(int price) {
		System.out.println("Paid Using COD :" + price);
	}

}
