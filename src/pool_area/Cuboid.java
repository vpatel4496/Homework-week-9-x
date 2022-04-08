package pool_area;

/*
    *   2. Write a class with the name Cuboid that extends Rectangle class. The class needs one field (instance variable)
    *   with anme height of type double.
    *   The class needs to have one constructor with three parameters width, lenth, and height all of type double.
    *   It needs to call the parent constructor and initialize a height field.
    *   Write the following methods (instance methods)
    *   Method named getHeight without any parameters, it needs to return the value of height field.
    *   Method named fetVolume without any parameters, it needs to return the calculated volume.
    *   To calculate volume, multiply the area with height.
    */
public class Cuboid extends Rectangle {
    double height;

    public Cuboid(double width, double length, double height) {
        super (width, length);
        this.height = height;
        if (this.height < 0) {
            this.height = 0;
        }
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return (getArea() * getHeight());
    }
}