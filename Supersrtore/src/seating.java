 class seating extends furniture {
    String material;
    String capacity;
    String dimensions;

     @Override
     public String getMaterial() {
         return material;
     }

     @Override
     public void setMaterial(String material) {
         this.material = material;
     }

     public String getCapacity() {
         return capacity;
     }

     public void setCapacity(String capacity) {
         this.capacity = capacity;
     }

     public String getDimensions() {
         return dimensions;
     }

     public void setDimensions(String dimensions) {
         this.dimensions = dimensions;
     }

     @Override
     public String toString() {
         return "seating{" +
                 "material='" + material + '\'' +
                 ", capacity='" + capacity + '\'' +
                 ", dimensions='" + dimensions + '\'' +
                 ", material='" + material + '\'' +
                 ", dimensons='" + dimensons + '\'' +
                 ", name='" + name + '\'' +
                 ", price=" + price +
                 ", tax=" + tax +
                 ", quantity=" + quantity +
                 ", id=" + id +
                 '}';
     }

     public seating(String name, double price, double tax, int quantity, int id, String material, String dimensons, String material1, String capacity, String dimensions) {
         super(name, price, tax, quantity, id, material, dimensons);
         this.material = material1;
         this.capacity = capacity;
         this.dimensions = dimensions;
     }
 }
