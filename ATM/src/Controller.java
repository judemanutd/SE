
public class Controller {

	CardReader cardReader;
	BankAccount bankAcconut;
	Machine machine;
	String accNo;
	Display display;

	public Controller(BankAccount bankAcconut, float total, int thousand, int hundred, int fiveHundred, int ten) {
		this.bankAcconut = bankAcconut;
		display = new Display();
		cardReader = new CardReader();
		machine = new Machine(display, total, thousand, fiveHundred, hundred, ten);
	}

	public boolean insert(Card card, int pin) {
		cardReader.setCard(card);
		if (cardReader.getCardNo() == bankAcconut.getCardNo()) {

			if (cardReader.checkPin(pin)) {
				accNo = bankAcconut.getAccNo();
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public void receipt() {
		if (accNo != null)
			display.out("Current Balance in account number " + accNo + " is " + " Rs " + bankAcconut.getBalance());
		else
			display.out("Invalid");
	}

	public boolean withdraw(float amount) {
		if (accNo != null) {
			if (machine.getTotal() > amount) {
				machine.dispense((int) amount);
				return bankAcconut.withdraw(amount);
			} else
				return false;
		} else
			return false;
	}

	public float checkBalance() {
		if (accNo != null)
			return bankAcconut.getBalance();
		else
			return 0;
	}

}
