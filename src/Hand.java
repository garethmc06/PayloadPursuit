public class Hand {

    private Card[] cards;
    private int cardCount;


    public Hand(){
        this.cards = new Card[52];
        cardCount = 0;
    }

    public void addCard(Card card){
       if(cardCount < cards.length){
           cards[cardCount] = card;
           cardCount++;
       }

    }

    public int getCardCount(){
        return cardCount;
    }

    public void displayHand(){
        for(int i = 0; i <cardCount; i++){
            System.out.println(cards[i]);
        }
    }

    public int calculateTotal(){
        int total = 0;
        for(int i = 0; i < cardCount; i++){
            total += cards[i].getValue();
        }
        return total;
    }

    public static void main(String[ ]args){
        Deck deck = new Deck();
        Hand hand = new Hand();

        hand.addCard(deck.drawCard());
        hand.addCard(deck.drawCard());
        hand.addCard(deck.drawCard());

        hand.displayHand();

        System.out.println("Cards in Hand: " + hand.getCardCount());
        System.out.println("Total: " + hand.calculateTotal());

    }


}
