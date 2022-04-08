package carpenter_cost_calculator;

    /*
    *  Write a class with the name Calculator. The class needs two fields (instance variable) with name floor of type
    * Floor and carpet of type Carpet.
    * The class need to have one constructor with parameters floor of type Floor and carpet of type Carpet and
    * it need to initialize the fields.
    * Write the following methods (instance methods);
    * Method name get TotalCost without any parameters, it need to return the calculated total cost to cover
    * the floor with a carpet.
    */
    public class Calculator {
        Floor floor;
        Carpet carpet;

        public Calculator(Floor floor, Carpet carpet) {
            this.floor = floor;
            this.carpet = carpet;
        }

        public double getTotalCost() {
            return floor.getArea() * carpet.getCost();

        }
    }


