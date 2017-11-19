public class DeckClass{
	public static CardClass[] deck = new CardClass[52];
	
	public DeckClass() {
		// TODO Auto-generated constructor stub
		for(int i=0; i<4;i++) {
			for(int j=0; j<13; j++) {
			deck[i*13+j]= new CardClass(i,j);
			//System.out.println("The card's suit is: " + deck[i*13+j].suit + " and the card's rank is: " + deck[i*13+j].rank);
			}
		}
	}
	
	public static void printDeck() {
		for(CardClass a : deck ) {
			System.out.println("The deck contains:"+ a.rank + " of " + a.suit);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DeckClass();
		printDeck();
	}
}

