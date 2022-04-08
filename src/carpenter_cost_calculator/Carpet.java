package carpenter_cost_calculator;

/*
* Write a class with the Carpet. The class needs one field (instance variable) with name cost of type double.
* The class needs to have one constructor with parameter cost of type double and it needs to initialize the field.
* In case the cost parameters is less than 0 it needs to set the cost field value to 0.
*
* Write the following methods (instance methods):
* Method named getCost without any partameters, it needs to return the value of cost field
* */

public class Carpet {

    double cost;
    public Carpet (double cost){
        if (cost < 0){
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }
    public double getCost(){
        return this.cost;
    }
}
