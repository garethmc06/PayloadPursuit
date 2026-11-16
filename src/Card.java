

public class Card {

    // Variables for Card Rank and Suits, Also a random variable to randomise card object.
//    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
//    private static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private String rank, suit;

    // Constructor used to create random values for Cards.
    public Card(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }

    // Getter Methods
    public String getRank(){
        return rank;
    }
    public String getSuit(){
        return suit;
    }

    //Get Value methods, Jack to King is worth 10 points, Ace can be 11 or 1, will set a default value for ace to be 11;
    public int getValue(){
        if(rank.equals("Jack") ||
           rank.equals("Queen") ||
           rank.equals("King")){
            return 10;
        }

        if(rank.equals("Ace")){
            return 11;
        }

        return Integer.parseInt(rank);
    }

    // Return to String method
    public String toString(){
        return rank + " of " + suit ;
    }

//    public static void main(String [] args){
//        Card card = new Card("Jack", "spade");
//        System.out.println(card);
//    }

}
