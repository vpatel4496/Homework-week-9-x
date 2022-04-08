package homework;

/*
*   Point
*   you have to represent a point in 2d space. Write a class with the name Point. The class needs two fields
*   (Instance variable) with name x and y of type int.
*   The class need to have two constructor. The first constructor doesn't have any parameters (no-arg constructor)
*   The second constructor has parameters x and y type of int and it needs to initialize the fields.
*   Write the following methods (instance methods);
*   * Method named get X without any parameters, it needs to return the value of x field.
*   * Method named get y without any parameters, it needs to return the value of y field.
*   * Method named set X with one parameters of type int, it needs to set the value of x field.
*   * Method named set Y with one parameters of typr int, it needs to set the value of y field.
*   * Method named distance without any parameters, it needs to return the distance between this Point and Point 0,0
*   * Method named distance with two parameters, x, y both of type int, it needs to return the distance between this
*        Point and Point x,y as double.
*   * Method named distance with parameter another of type Point, it needs to return the distance between this
*   Point and Point x,y as double.
*   * Method named distance with two parameters another of type Point, it needs to return the distance between this
*   point and another Point as double.
*   How to find the distance between two points?
*   To find a distance between points A(xA,yA) and b(xB, yB), we use the formula:
*   d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
*   Where √ represents square root.
*   TEST EXAMPLE
*   → TEST CODE:  Write the below code into the main method.
*   Point first = new Point(6, 5);
*   Point second = new Point(3, 1);
*   System.out.println("distance(0,0)= " + first.distance());
*   System.out.println("distance(second)= " + first.distance(second));
*   System.out.println("distance(2,2)= " + first.distance(2, 2));
*   Point point = new Point();
*   System.out.println("distance()= " + point.distance());
*   OUTPUT
*   distance(0,0)= 7.810249675906654* distance(second)= 5.0
*   distance(2,2)= 5.0
*   distance()= 0.0
*   NOTE: Use Math.sqrt to calculate the square root √.
*   NOTE: Try to avoid duplicated code.
*   NOTE: All methods should be defined as public NOT public static.
*   NOTE: In total, you have to write 7 methods.
*/

public class Point {
    // Instance variable
    int x;
    int y;

    // Constructor with zero args
    Point(){
    }
    // parameterised constructor
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int a){
        this.x = a;
    }
    public void setY(int b) {
        this.y = b;
    }
    public double distance(){
        return distance(0, 0);
    }
    public double distance (int x, int y){
        return Math.sqrt((x - getX()) * (x - getX()) + (y - getY()) * (y - getY()));
    }
    public double distance(Point secondPoint) {
        return distance(secondPoint.x, secondPoint.y);
    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point (3, 1);
        System.out.println("distance (0,0)=" + first.distance());
        System.out.println("distance (second)= " + first.distance (second));
        System.out.println("distnace(2,2)= " + first. distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}

