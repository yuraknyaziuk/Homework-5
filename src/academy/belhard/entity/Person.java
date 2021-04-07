package academy.belhard.entity;

public class Person {
    protected String firstName;
    protected String lastName;
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }



}
