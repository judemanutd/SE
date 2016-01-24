
public class Client {

	public static void main(String[] args) {

		Card card = new Card(1234, 123456);
		BankAccount bankaccount = new BankAccount(1234, 123456, "987654321", 15000);

		Controller controller = new Controller(bankaccount, 10000, 10, 8, 40, 200);

		System.out.println("Card Verified:" + controller.insert(card, 1234));

		System.out.println("Current Balance:" + controller.checkBalance());
		System.out.println("Transaction Successful:" + controller.withdraw(8000));

		System.out.println("Current Balance:" + controller.checkBalance());
		controller.receipt();

		System.out.println("");

		System.out.println("Transaction Successful:" + controller.withdraw(200));
		System.out.println("Current Balance:" + controller.checkBalance());

		controller.receipt();
	}

}
