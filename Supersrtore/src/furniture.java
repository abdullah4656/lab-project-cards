import java.util.Arrays;

public class furniture extends Product {
    String material;
    String dimensons;

    @Override
    public String toString() {
        return "furniture{" +
                "material='" + material + '\'' +
                ", dimensons='" + dimensons + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", tax=" + tax +
                ", quantity=" + quantity +
                ", id=" + id +
                ", products=" + Arrays.toString(product) +
                '}';
    }

    public furniture(String name, double price, double tax, int quantity, int id, String material, String dimensons) {
        super(name, price, tax, quantity, id);
        this.material = material;
        this.dimensons = dimensons;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDimensons() {
        return dimensons;
    }

    public void setDimensons(String dimensons) {
        this.dimensons = dimensons;
    }


}
