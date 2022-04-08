package method_overloading;

/*
*   Test class to create objects and call the methods
*   Output:
*   SBI Rate of Interest: 8
*   ICICI Rate of Interest: 7
*   Axix Rate of Interest: 9
* */
public class Test {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        Axis a = new Axis();
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
        System.out.println("Axis Rate of Interest:" + a.getRateOfInterest());

    }
}
