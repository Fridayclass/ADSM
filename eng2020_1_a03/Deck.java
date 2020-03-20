package eng2020_1_a03;
import java.util.*;


public class Deck {
static Deck deck = null;
private Deck( ) {	
cards = new ArrayList<Card>( );
// build the deck
Suit[] suits = {Suit.SPADES, Suit.HEARTS, Suit.CLUBS,Suit.DIAMONDS};

for(Suit suit: suits) {
for(int i = 2; i <= 14; i++) {
cards.add(new Card(suit, i));
}

}

// shuffle it!
Collections.shuffle(cards, new Random( ));
}

public static Deck getInstance() {
	if(deck==null) {
	deck = new Deck();
	return deck;
}else
	return deck;
	}

public static void print( ) {
for(Card card: cards) {
card.print( );
}
}
private static List<Card> cards;
}
