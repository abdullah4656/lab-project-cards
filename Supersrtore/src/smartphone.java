 class smartphone extends electronics {
    String operatingsystem;
    String cameraresolution;
    String storage;

     public String getOperatingsystem() {
         return operatingsystem;
     }

     public void setOperatingsystem(String operatingsystem) {
         this.operatingsystem = operatingsystem;
     }

     public String getCameraresolution() {
         return cameraresolution;
     }

     public void setCameraresolution(String cameraresolution) {
         this.cameraresolution = cameraresolution;
     }

     @Override
     public String toString() {
         return "smartphone{" +
                 "operatingsystem='" + operatingsystem + '\'' +
                 ", cameraresolution='" + cameraresolution + '\'' +
                 ", storage='" + storage + '\'' +
                 ", consumption=" + consumption +
                 ", warranty='" + warranty + '\'' +
                 ", name='" + name + '\'' +
                 ", price=" + price +
                 ", tax=" + tax +
                 ", quantity=" + quantity +
                 ", id=" + id +
                 '}';
     }

     public String getStorage() {
         return storage;
     }

     public void setStorage(String storage) {
         this.storage = storage;
     }

     public smartphone(String name, double price, double tax, int quantity, int id, double consumption, String warranty, String operatingsystem, String cameraresolution, String storage) {
         super(name, price, tax, quantity, id, consumption, warranty);
         this.operatingsystem = operatingsystem;
         this.cameraresolution = cameraresolution;
         this.storage = storage;
     }
 }
