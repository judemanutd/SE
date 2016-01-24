public class CardReader {

	Card card;

	public void setCard(Card card) {
		this.card = card;
	}

	public boolean checkPin(int pin) {
		return card.getPin() == pin;
	}

	public int getCardNo() {
		return card.getCardNo();
	}
}
