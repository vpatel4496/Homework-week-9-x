package carpenter_cost_calculator;

/*
* 1. Write a class with the name Floor. The class need teo fields (instance variable)
* with name width and length of type double
* The class need to have one constructor with parameters width and length of type double
* and it needs to initialize the fields.
* In case the width parameter is less than 0 it needs to set the width field value to 0, in case the
* length parameters is less then 0 it needs to set the length field value to 0.
* Write the following methods (instance methods):
* Method anmed getArea without any parameters, it needs to return the calculated area (width * length).
* */

public class Floor {
    double width;
    double length;

    public Floor(double width, double length){
        if (width < 0){
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0){
        this.length = 0;
        } else {
        this.length = length;
        }
    }
    public double getArea(){
    return this.width * this.length;
    }
}