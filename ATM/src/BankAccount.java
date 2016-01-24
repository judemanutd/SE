
public class BankAccount {
	int pin;
	int cardNo;
	String accNo;
	float balance;

	public BankAccount(int pin, int cardNo, String accNo, float balance) {
		this.pin = pin;
		this.cardNo = cardNo;
		this.accNo = accNo;
		this.balance = balance;
	}

	public int getPin() {
		return pin;
	}

	public int getCardNo() {
		return cardNo;
	}

	public String getAccNo() {
		return accNo;
	}

	public float getBalance() {
		return balance;
	}

	public boolean withdraw(float amount) {
		if (balance > amount) {
			balance = balance - amount;
			return true;
		} else {
			return false;
		}
	}
}
