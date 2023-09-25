class rectangle{
    double length;
    double width;
    String name;
    public double getminrec(rectangle r1, rectangle r2){
        if(r1.area()>r2.area())
            return r2.area();
    else {
        return r1.area();
        }
    }

rectangle (double length , double width){
    setlength(length);
    setwidth(width);
    }
 public void setlength(double length){
     this.length=length;
 }
public void setwidth(double width){
     this.width=width;
}
public double getlength(){
     return length;

}
public double getwidth(){

     return width;
}
public  double area(){
     return length*width;
}
public double perimeter(){

     return (length+width)*2;
}
    public boolean overlap(rectangle r2) {
        double x1 = 10, y1 = 10;  // Assuming the origin (0, 0) for the first rectangle
        double x2 = 9; // X-coordinate of the second rectangle
        double y2 =  9 ;// Y-coordinate of the second rectangle

        if (x1 > x2 || y1 > y2) {
            // Rectangles overlap
            return false;
        } else {
            // Rectangles do not overlap
            return true;
        }

    }
}
public class firstClass {
    public static void main(String[] args) {
        rectangle r1=new rectangle(5,4 );
        rectangle r2=new rectangle(5,6);
      //  r1.name="Rectangle_1";
        //r2.name="Rectangle_2";
      System.out.println("AREA1="+r1.area());
        System.out.println("AREA2="+r2.area());
//        System.out.println("PEREIMETER="+r1.perimeter());
//        System.out.println("length="+r1.getlength());
//        System.out.println("width="+r1.getwidth());
        System.out.println("minimum rectangle="+r1.getminrec(r1,r2));
        System.out.println("Do rectangles overlaps?:"+r1.overlap(r2));
    }
    }
