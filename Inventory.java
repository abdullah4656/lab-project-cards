public class Inventory {
    private Item[][] items;

    public Inventory() {
        items = new Item[][]{
                {Item.COKE, Item.COKE, Item.COKE},
                {Item.PEPSI, Item.PEPSI, Item.PEPSI},
                {Item.SNICKERS, Item.SNICKERS, Item.SNICKERS}
        };
    }

    public Item getItem(int row, int col) {
        if (row >= 0 && row < items.length && col >= 0 && col < items[row].length) {
            return items[row][col];
        } else {
            return null;
        }
    }

    public void display() {
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.println(i + "," + j + ": " + items[i][j].getName() + " ($" + items[i][j].getPrice() + ")");
            }
        }
    }

    public void restock(Item item, int row, int col) {
        if (row >= 0 && row < items.length && col >= 0 && col < items[row].length) {
            items[row][col] = item;
        } else {
            System.out.println("Invalid restock location!");
        }
    }
}