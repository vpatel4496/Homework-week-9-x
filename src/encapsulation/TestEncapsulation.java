package encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        // Setting values of the variables
        obj.setName("Vimal");
        obj.setAge(44);
        obj.setRollNo(51);
        // Displaying values of the variables
        System.out.println("Prime's name: " + obj.getName());
        System.out.println("Prime's age: " + obj.getAge());
        System.out.println("Prime's rollNo: " + obj.getRollNO());
        // Direct access of rollNo is not possible due to encapsulation
        // System.out.println("Prime's rillNo: " + obj.geekName);

    }
}
