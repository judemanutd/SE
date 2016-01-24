
public class EComsite {

	PaymentMethod pm;

	public boolean choosePaymentMethod(String ch) {

		if (ch == "Credit Card") {
			pm = new CreditCard();
		} else if (ch == "COD") {
			pm = new COD();
		} else if (ch == "Debit Card") {
			pm = new DebitCard();
		} else
			return false;
		return true;
	}

	public void makePayment(int price) {
		pm.payment(price);
	}

}
