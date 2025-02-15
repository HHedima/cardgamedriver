package edu.guilford;

public class Blackjack {
    // instance variables
    private Hand playerHand;
    private Hand dealerHand;
    private Deck deck;

    // constructor
    public Blackjack() {
        reset(true);
    }

    
    // getters
    public Hand getPlayerHand() {
        return playerHand;
    }

    public Hand getDealerHand() {
        return dealerHand;
    }

    public Deck getDeck() {
        return deck;
    }


    /**
     * resets the game by creating a new deck and shuffling it
     * also creates new hands for the player and dealer
     *
     * @param newDeck true for new deck, false for same deck
     */
    public void reset(boolean newDeck) {
        // create new deck
        if (newDeck) {
            deck = new Deck();
            deck.shuffle();
        }
        // create new hands
        playerHand = new Hand();
        dealerHand = new Hand();
    }

    /**
     * Deals two cards to player and dealer
     * Initializes new hands for player and dealer
     * Adds two cards to each hand from the deck.
     */
    public void deal() {
        playerHand = new Hand();
        dealerHand = new Hand();
        // deal two cards to each player
        // simplified
        for (int i = 0; i < 2; i++) {
            playerHand.addCard(deck.deal());
            dealerHand.addCard(deck.deal());
        }
    }

    /**
     * simulates player turn in blackjack
     * hits until total value is 16 or higher
     * 
     * @return true if players hand is 21 or less, false otherwise
     */
    public boolean playerTurn() {
        // player hits until total value is 16 or higher
        while (playerHand.getTotalValue() < 16) {
            playerHand.addCard(deck.deal());
        }
        return playerHand.getTotalValue() <= 21;

    }

        /**
     * simulates dealer turn in blackjack
     * hits until total value is 17 or higher
     * 
     * @return true if dealers hand is 21 or less, false otherwise
     */
    public boolean dealerTurn() {
        // dealer hits until total value is 17 or higher
        while (dealerHand.getTotalValue() < 17) {
            dealerHand.addCard(deck.deal());
        }
        return dealerHand.getTotalValue() <= 21;
    }

    // Override toString
    
    /**
     * returns string representation of  current game state
     * includes players and dealers hands and their total values
     *
     * @return A string representation of the player's and dealer's hands and their total values.
     */
    public String toString() {
        String result = "Player's Hand:\n";
        for (int i = 0; i < playerHand.size(); i++) {
            result += playerHand.getCard(i) + "\n";
        }
        result += "Player's Total: " + playerHand.getTotalValue() + "\n\n";
        result += "Dealer's Hand:\n";
        for (int i = 0; i < dealerHand.size(); i++) {
            result += dealerHand.getCard(i) + "\n";
        }
        result += "Dealer's Total: " + dealerHand.getTotalValue() + "\n\n";
        return result;
    }

}
