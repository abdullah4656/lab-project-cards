
public class Universaltemplate {
    public static void main(String[] args) {
        Product p=new Product("",0,0,0,0);
        Product addmobile=new smartphone("Xiaomi",50000,5000,1,1,18,"1 year","Andriod","64mp","128GB");
       Product addgrocery=new grocery("Energydrink",100.0,10.0,1,2,"12/04/2024",235);
       Product addfurniture=new furniture("Table",1000,300,1,3,"Wood","2D");
       p.addproduct(addmobile);
    p.addproduct(addgrocery);
p.addproduct(addfurniture);
p.removeproduct(addfurniture);
 p.showproduct();
//p.searchProductbyid(1);
//p.searchbyname("Table");

    }}
