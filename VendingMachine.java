public class VendingMachine {
    private Inventory inventory;
    private double balance;

    public VendingMachine(){
        this.inventory = new Inventory();
        this.balance = 0.0;
    }

    public void displayMenu() {
        System.out.println("Vending Machine Menu:");
        inventory.display();
    }
    public void insertMoney(double amount) {
        balance += amount;
    }
    public void selectItem(int row, int col) {
        Item selectedItem = inventory.getItem(row, col);
        if (selectedItem != null) {
            if (balance >= selectedItem.getPrice()) {
                balance -= selectedItem.getPrice();
                System.out.println("You selected: " + selectedItem.getName());
                System.out.println("Your change: $" + balance);
            } else {
                System.out.println("Insufficient balance. Please insert more money.");
            }
        } else {
            System.out.println("Invalid item selection.");
        }
    }

    public void restock(Item item, int row, int col) {
        inventory.restock(item, row, col);
        System.out.println("Restocked " + item.getName() + " at " + row + "," + col);
    }
}
