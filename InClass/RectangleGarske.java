public class RectangleGarske {

}

class Rectangle {
    // instance varaibles
    private double width;
    private double length;

    // constructor
    public Rectangle(double width, double lenght) {
        //this.width = width;
        setWidth(width);
        //this.length = length; // in set length method
        setLength(length);
    }

    //getter
    public void getWidth(double newWidth) {
        width = newWidth;
    }
    public void getLenght(double newLength) {
        width = newLength;
    }

    //setter
    public double setWidth() {
        return width;
    }
    public double setlength() {
        return length;
    }

    public String toString() {
        return "width: " + width + ", length: " + length;
    }

    //add functionaloty to rectangle class
    // 1. getArea
    // 2. getParameter
    // 3. expandWidth
    // 4. shrink
    // actions to object

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    public void expandWidth(double amount) {
        width = width + amount;
    }

    public boolean shrinkLength(double amount) {
        if (amount < length) {
            length = length - amount;
            return true;
        }
        return false;
    }

    public void setLength(double newLength) {
        if(newLength > 0)
            length = newLength;
    }

    public void setWidth(double newWidth) {
        if(newWidth > 0)
            length = newWidth;
    }

    // will all hve equals class
    public boolean equals(Rectangle other) {
        return this.width == other.width && this.length == other.length;
    }

}

class Driver {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3, 2);
        Rectangle r2 = new Rectangle(5, 10);
        double getArea = r1.getArea();
        double getPerimeter = r1.getPerimeter();

        // if (r1 == r2) // compare adresses
        //     System.out.println("Same");
        // else
        //     System.out.println("notSame");
        if (r1 == r2) // compare adresses
            System.out.println("Same");
        else
            System.out.println("notSame");

        boolean b = r1.equals(r2); // parameter calling object "this" (r1) and r2 "other"
    }
}