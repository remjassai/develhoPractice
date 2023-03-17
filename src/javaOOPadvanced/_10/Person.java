package javaOOPadvanced._10;

import java.util.Objects;

public class Person {
    // Create a class called "Person" with fields for name, age, and address.
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //Override the `toString()` method in the Person class
    // to display the object's name, age, and address in a user-friendly format.


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
    //Override the `hashCode()` method in the Person class
    // to generate a unique hash code
    // based on the object's name, age, and address.
    @Override
    public int hashCode(){
        return Objects.hash(name, age, address);
    }
}
