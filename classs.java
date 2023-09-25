class circle{
    double radius;
    double pi;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getRadius() {
        return radius;
    }

    public double getPi() {
        return pi;
    }

    circle(double radius, double pi) {
        setRadius(radius);
        setPi(pi);
    }

    public double area()
    {
        return radius * radius * pi;
    }

    // Define a method to compare two circles and return the smaller one
    public  double smallerCircle(circle c1, circle c2) {
        if (c1.area() < c2.area())
            return c1.area();
        else
            return c2.area();
    }
}

public class classs {
    public static void main(String[] args) {
        circle c1 = new circle(3, 3.14);
        circle c2 = new circle(4, 3.14);

        System.out.println("Area of the first circle is " + c1.area());
        System.out.println("Area of the second circle is: " + c2.area());

        // Find and print the smaller circl
        System.out.println("The smaller circle has a radius of "+c2.smallerCircle (c1,c2));
    }
}
