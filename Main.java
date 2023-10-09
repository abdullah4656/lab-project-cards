public class  Main {
    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.displayMenu();

        vendingMachine.insertMoney(10.0);

        vendingMachine.selectItem(2, 0);

        vendingMachine.restock(Item.SNICKERS, 2, 0);


    }
}