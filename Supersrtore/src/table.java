 class table extends furniture {
    String material;
    String shape;
    String dimensons;

     @Override
     public String getMaterial() {
         return material;
     }

     @Override
     public void setMaterial(String material) {
         this.material = material;
     }

     public String getShape() {
         return shape;
     }

     public void setShape(String shape) {
         this.shape = shape;
     }

     @Override
     public String getDimensons() {
         return dimensons;
     }

     @Override
     public String toString() {
         return "table{" +
                 "material='" + material + '\'' +
                 ", shape='" + shape + '\'' +
                 ", dimensons='" + dimensons + '\'' +
                 ", material='" + material + '\'' +
                 ", dimensons='" + dimensons + '\'' +
                 ", name='" + name + '\'' +
                 ", price=" + price +
                 ", tax=" + tax +
                 ", quantity=" + quantity +
                 ", id=" + id +
                 '}';
     }

     @Override
     public void setDimensons(String dimensons) {
         this.dimensons = dimensons;
     }

     public table(String name, double price, double tax, int quantity, int id, String material, String dimensons, String material1, String shape, String dimensons1) {
         super(name, price, tax, quantity, id, material, dimensons);
         this.material = material1;
         this.shape = shape;
         this.dimensons = dimensons1;
     }
 }
