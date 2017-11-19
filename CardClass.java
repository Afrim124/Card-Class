
public class CardClass {
	public String suit;
	public String rank;
	final String[] suits = {"cloves","hearts","spades","diamonds"};
	final String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
	
	public CardClass(int suit, int rank) {
		// TODO Auto-generated constructor stub
		this.suit = suits[suit];
		this.rank = ranks[rank];
	}
	
	//public static void printCard() {
	//	System.out.println("The card's suit is: " + suit + " and the card's rank is: " + rank);
	//			
	//}

}
