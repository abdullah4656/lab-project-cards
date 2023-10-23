import java.util.Arrays;

class laptop extends  electronics{
    String processor;
    String ram;
    String screendimensions;

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getScreendimensions() {
        return screendimensions;
    }

    public void setScreendimensions(String screendimensions) {
        this.screendimensions = screendimensions;
    }

    @Override
    public String toString() {
        return "laptop{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", screendimensions='" + screendimensions + '\'' +
                ", consumption=" + consumption +
                ", warranty='" + warranty + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", tax=" + tax +
                ", quantity=" + quantity +
                ", id=" + id +
                ", size=" + size +
                ", products=" + Arrays.toString(product) +
                '}';
    }

    public laptop(String name, double price, double tax, int quantity, int id, double consumption, String warranty, String processor, String ram, String screendimensions) {
        super(name, price, tax, quantity, id, consumption, warranty);
        this.processor = processor;
        this.ram = ram;
        this.screendimensions = screendimensions;
    }
}
