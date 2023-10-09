public enum Item {

    COKE("Coke", 1.50),
    PEPSI("PEPSI",1.25),
    SNICKERS("Snickers",1.75);

    private String name;
    private double price;
    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
