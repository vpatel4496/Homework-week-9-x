package encapsulation;

public class Encapsulate {

    // Private variable declared these can only be accessed by public method of class
    private String name;
    private int rollNo;
    private int age;

    // Set method for name to access private variable name
    public void setName(String name){
        this.name = name;
    }
    // Get method for name to access private variable age
    public String getName(){
        return name;
    }
    // Get method for roll to access private variable rollNo
    public int getRollNO(){
        return rollNo;
    }
    // Set method for roll to access private variable rollNo
    public void setRollNo(int rollNo){
        this.rollNo= rollNo;
    }
    // Get method for age to access private variable age
    public int getAge(){
        return age;
    }
    // Set method for age to access private variable age
    public void setAge(int age){
        this.age = age;
    }
}
