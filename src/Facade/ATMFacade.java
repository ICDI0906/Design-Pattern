package Facade;

public class ATMFacade {
	private Card card;
	private Money money;
	public ATMFacade() {
		this.card = new Card();
		this.money = new Money();
	}
	public void withdrawMoney() {
		card.read();
		money.withdraw();
		card.exit();
	}
}
