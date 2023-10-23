//public class azaz {
//    public class Product {
//        private String name;
//        private int quantity;
//        private double tax;
//        private double price;
//        private int id;
//        static Product[] Products;
//
//        public static void setArraysize(int size){
//            Products = new Product[size];
//        }
//
//        public Product(String name, double price, int quantity, double tax, int id) {
//            this.name = name;
//            this.price = price;
//            this.quantity = quantity;
//            this.tax = tax;
//            this.id = id;
//        }
//
//        public void addProduct(){
//            boolean isAddedBefore = false;
//            for (int i = 0; i < Products.length; i++){ //if product was present in the array beforehand
//                if (Products[i] != null && Products[i].getId() == this.getId()) {
//                    isAddedBefore = true;
//                    System.out.println();
//                    System.out.println("----Product added before, Use updateQuantity() method to change number of same products----");
//                    System.out.println();
//                    break;
//                }
//            }
//            if (!isAddedBefore){ //if product was not present in the array
//                quantity = this.getQuantity();
//
//                for(int i =0; i < quantity; i++){
//                    if (!ArrayIsFull()){
//                        for (int j = 0; j < Products.length; j++){
//                            if (Products[j] == null){
//                                Products[j] = this;
//                                break;
//                            }
//                        }
//                    }
//                }
//            }
//
//        }
//
//
//        public void updateQuantity(int updatedQuantity ) {
//            boolean isAddedBefore = false;
//            boolean ArrayIsFull = false;
//            int finalQuantity = 0;
//            for (int i = 0; i < Products.length; i++){ //if product was present in the array beforehand
//                if (Products[i] != null && Products[i].getId() == this.getId()){
//                    isAddedBefore = true;
//
//                    int initialQuantity = this.getQuantity();
//
//                    if (updatedQuantity > initialQuantity) { //add products if updated quantity greater
//                        finalQuantity = updatedQuantity - initialQuantity;
//                        for (int j = 0; j < finalQuantity; j++) {
//                            if (!ArrayIsFull()){
//                                for (int k = 0; k < Products.length; k++) {
//                                    if (Products[k] == null) {
//                                        Products[k] = this;
//                                        break;
//                                    }
//                                }
//                            }else
//                                ArrayIsFull = true;
//                        }
//                        this.setQuantity(updatedQuantity);
//                    }
//                    else { //remove products if updated quantity smaller
//                        finalQuantity = updatedQuantity;
//                        int NoOfProductsToBeRemoved = initialQuantity - updatedQuantity;
//                        removeProduct(NoOfProductsToBeRemoved);
//                    }
//
//                    if (ArrayIsFull) {
//                        finalQuantity = countQuantity(this);
//                        this.setQuantity(finalQuantity);
//                        System.out.println();
//                        System.out.println("-----Maximum Products limit reached------" +
//                                "Maximum products that can be added have been added -----");
//                        System.out.println();
//                    }
//                    break;
//                }
//            }
//        }
//

//
//        public static void showProductsArray(){
//            for (int i = 0; i < Products.length; i++){
//                System.out.println(Products[i]);
//
//            }
//        }
//
//        public void showProducts() {
//
//            for (int i = 0; i < Products.length; i++) {
//                boolean isDuplicate = false;
//
//                for (int j = i + 1; j < Products.length; j++){
//                    if (Products[i] != null && Products[j] != null && Products[i].getId() == Products[j].getId())
//                        isDuplicate = true;
//                }
//                if (!isDuplicate && Products[i]!=null){
//                    System.out.println(Products[i]);
//
//                }
//
//            }
//        }
//        public void findProductById(int id){
//            int flag = 0;
//            for (int i = 0; i < Products.length; i++){
//                try {
//                    if (id == Products[i].getId()) {
//                        flag = 1;
//                        System.out.println("Product found: " + Products[i]);
//                    }
//                }catch (NullPointerException e){
//
//                }
//
//            }
//            if (flag == 0){
//                System.out.println("Product not found");
//            }
//
//        }
//
//        public void findProductByName(String name){
//            int flag = 0;
//            for (int i = 0; i < Products.length; i++){
//
//                try {
//                    if(name == Products[i].getName()){
//                        System.out.println("Product found: " + Products[i] );
//                        flag = 1;
//                    }
//
//                }catch(NullPointerException e){
//
//                }
//            }
//
//            if (flag == 0)
//                System.out.println("Product not found");
//
//
//        }
//
//        public void removeProduct(int quantity){
//            int id = this.getId();
//            int flag = 0;
//            for (int i = 0; i < quantity; i++) { //outer loop to keep count of no. of products to remove
//                for (int j = 0; j < Products.length; j++) {
//                    try {
//                        if (id == Products[j].getId()) {
//                            System.out.println("Product: " + Products[j].getName() + " removed");
//                            Products[j] = null;
//                            flag = 1;
//                            break;
//                        }
//                    } catch (NullPointerException e) {
//
//                    }
//                }
//            }
//            int updatedQuantity = this.getQuantity() - quantity;
//            this.setQuantity(updatedQuantity);
//            if (flag == 0){
//                System.out.println("Product Not found");
//            }
//        }
//
//        private boolean ArrayIsFull(){
//            int occupiedCounter = 0;
//            for (int i = 0; i < Products.length; i++){
//                if (Products[i] != null){
//                    occupiedCounter++;
//                }
//            }
//
//            if (occupiedCounter == Products.length - 1)
//                return true;
//            else
//                return false;
//        }
//
//        public double getPrice() {
//            return price;
//        }
//
//        public void updatePrice(double priceOfSingleItem){
//            double price = priceOfSingleItem * this.getQuantity();
//            this.setPrice(price);
//        }
//
//        public static void stockLevels(){
//            System.out.println("----------");
//            System.out.println("Product : Stock Left");
//            for (int i = 0; i < Products.length; i++) {
//                boolean isDuplicate = false;
//
//                for (int j = i + 1; j < Products.length; j++){
//                    if (Products[i] != null && Products[j] != null && Products[i].getId() == Products[j].getId())
//                        isDuplicate = true;
//                }
//                if (!isDuplicate && Products[i]!=null){
//                    System.out.println(Products[i].getName() + " : " + Products[i].getQuantity());
//
//                }
//
//            }
//        }
//
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        @Override
//        public String toString() {
//            return
//                    "name= " + name +
//                            ", price= " + price +
//                            ", quantity= " + quantity +
//                            ", tax= " + tax +
//                            ", id= " + id;
//        }
//
//        public int getQuantity() {
//            return quantity;
//        }
//
//        public void setQuantity(int quantity) {
//            this.quantity = quantity;
//        }
//
//        public double getTax() {
//            return tax;
//        }
//
//        public void setPrice(double price) {
//            this.price = price;
//        }
//
//        public void setTax(double tax) {
//            this.tax = tax;
//        }
//
//        public int getId() {
//            return id;
//        }
//
//        public void setId(int id) {
//            this.id = id;
//        }
//
//    }
//
//}
