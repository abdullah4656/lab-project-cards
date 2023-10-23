import java.util.Arrays;

public class electronics extends Product {
    @Override
    public String toString() {
        return "electronics{" +
                ", name='" + name + '\'' +
                "consumption=" + consumption +
                ", warranty='" + warranty + '\'' +

                ", price=" + price +
                ", tax=" + tax +
                ", quantity=" + quantity +
                ", id=" + id +

                ", products=" + Arrays.toString(product) +
                '}';
    }

    double consumption;
     String warranty;
    public electronics(String name, double price, double tax, int quantity, int id, double consumption, String warranty) {
        super(name, price, tax, quantity, id);
        this.consumption = consumption;
        this.warranty = warranty;
    }
    public double getConsumption() {
        return consumption;
    }
    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }
}
