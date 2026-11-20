import java.util.Random;

public class Deck {

    private static final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private static final String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private Card[] deck;
    private int currentCard;
    private Random rand = new Random();

    public Deck(){
      deck = new Card[52];
      currentCard = 0;

      buildDeck();
      shuffle();
    }

    private void buildDeck(){ // Sets a random card value to each
        int index = 0;
        for(String suit: suits){
            for(String rank: ranks){
                deck[index] = new Card(rank, suit);
                index++;
            }
        }
    }

    private void shuffle(){
        for(int i = deck.length - 1; i > 0; i --){
            int j = rand.nextInt(i+1);

            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
        currentCard = 0;
    }

    public Card drawCard(){
        if(currentCard >= deck.length) {
            return null;
        }

        return deck[currentCard++];

    }

    public int cardsRemaining(){
         return deck.length - currentCard;
    } // Calculate the total amount of cards left

    public void reset(){  // This method restocks and reshuffles the deck every round
        buildDeck();// Simply it builds the deck, shuffles it, and sets the current card variable to 0;
        shuffle();
        currentCard = 0;
    }


    // !! Method Exclusively used for testing !!
    public void printDeck(){
        for(Card card: deck){ // Advanced for loop used to iterate through each card in the deck
            System.out.println(card);//print each card to console.
        }
    }


    public static void main(String[] args){
        Deck deck = new Deck();
        System.out.println("Before Shuffle");
        deck.printDeck();
        System.out.println("Card Drawn: " + deck.drawCard());
        deck.shuffle();
        System.out.println("Shuffled");
        deck.printDeck();

    }



}

