class cards {
  final   String rank;
   final String suit;

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public cards(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }
    public String toString(){
        return String.format("%s of %s",this.rank,this.suit);
    }
}