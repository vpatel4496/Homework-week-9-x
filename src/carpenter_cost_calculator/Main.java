package carpenter_cost_calculator;

/*
*  The Carpet Company has asked you to write an application that calculator thr price of carpeting for rectangular rooms
*  To calculate the price, you multiply the area of the floor (width times length) by the price per square meter of carpets.
*  For example, the area of the floor that is 12 meters long and 10 meters wide is 120 square meters.
*  To cover the floor with a carpet that cost $8 per square meter would cost $960.*
*  TEST EXAMPLE
*  -> TEST CODE: Write below code in main method
*  Carpet carpet = new Carpet (3.5);
*  Floor floor = new Floor (2.75, 4.0);
*  Calculator calculator = new Calculator(floor, carpet);
*  System.out.println ("total=" + calculator.getTotalCost());
*  carpet = new Carpet(1.5);
*  floor = new Floor (5.4, 4.5);
*  calculator = new Calculator (floor, carpet);*
*  System.out.println("total = " + calculator.getTotalCost());
*  -> OUTPUT
*  total = 38.5
*  total = 36.45
*  NOTE: ALL method should be defined as public Not public static.
*  NOTE: In total, you have to write 4 classes.
*/
public class Main {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor (2.75, 4.0);
        Calculator calculator = new Calculator (floor, carpet);
        System.out.println("total=" + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor (5.4,4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total=" + calculator.getTotalCost());
    }
}
