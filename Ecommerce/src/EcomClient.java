
public class EcomClient {

	public static void main(String args[]) {

		Item item = new Item();

		EComsite ecom = new EComsite();
		ecom.choosePaymentMethod("COD");

		ecom.makePayment(item.getPrice());
	}
}
