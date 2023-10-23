public class Product {
    String name;
    double price;
    double tax;
    int quantity;
    int id;
    int size = 0;
    int sizemax = 10;
    Product[] product = new Product[sizemax];
    public Product(String name, double price, double tax, int quantity, int id) {
        this.name = name;
        this.price = price;
        this.tax = tax;
        this.quantity = quantity;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getTax() {
        return tax;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return String.format("%d %d %d %d %s", id, quantity, tax, price, name);
    }
    public void addproduct(Product p) {
        if (size < sizemax)
            product[size] = p;
    size++;
    }public void removeproduct(Product p){
for(int i=0;i<size;i++){
    if(product[i]==p)
        product[i]=null;
}
    }
    public void showproduct() {
        try {
            if (product[size] == null) {
                for (int i = 0; i < size; i++) {
                    System.out.println("INVENTORY:"+product[i]);
                }
            } else {
                System.out.println("maximum limit reached");
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }}
    public void searchProductbyid(int id) {
        try {
            int index = -1;
            for (int i = 0; i < size; i++) {
                if (product[i].getId() == id) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                System.out.println("Product found  : " + product[index]);
            } else {
                System.out.println("Product with id="+id+"not found!");
            }
        }
    catch (NullPointerException n){
        System.out.println("Nullpointer exception");
    }
    }
public void searchbyname(String name) {
    try {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (product[i].getName() == name)
                index = i;
        }
        if (index != -1) {
            System.out.println("Product found:" + product[index]);
        } else {
            System.out.println("Product with name: "+name+ "Not found");
        }

    } catch (NullPointerException n) {
        System.out.println("NullpointerException");
    }
}
}
