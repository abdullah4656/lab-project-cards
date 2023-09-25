class deck {
    cards[] card=new cards[52];
    String[] suits ={"Clubs","Hearts","Diamond","spades"};
    String[] rank ={"Ace","2","3","4","5","6","7","8","9","10","jack","Queen","King"};
    public deck(deck[] cards, String[] suits, String[] rank) {
        //this.cards = cards;
        this.suits = suits;
        this.rank = rank;
    }
    deck() {
        int counter = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                card[counter++] = new cards(suits[i], rank[j]);
            }
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 52; i++) {
            sb.append(card[i] + "\n");
        }
        return sb.toString();
    }
}

