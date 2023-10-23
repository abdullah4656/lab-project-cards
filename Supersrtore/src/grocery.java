import java.util.Arrays;

public class grocery extends  Product {
    String expirydate;

    float nutrition;

    public String getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(String expirydate) {
        this.expirydate = expirydate;
    }

    public float getNutrition() {
        return nutrition;
    }

    public void setNutrition(float nutrition) {
        this.nutrition = nutrition;
    }

    public grocery(String name, double price, double tax, int quantity, int id, String expirydate, float nutrition) {
        super(name, price, tax, quantity, id);
        this.expirydate = expirydate;
        this.nutrition = nutrition;

    }

    @Override
    public String toString() {
        return "grocery{" +
                "expirydate='" + expirydate + '\'' +
                ", nutrition=" + nutrition +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", tax=" + tax +
                ", quantity=" + quantity +
                ", id=" + id +
                ", size=" + size +
                ", products=" + Arrays.toString(product) +
                '}';
    }
}
