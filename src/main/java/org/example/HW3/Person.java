package org.example.HW3;

public class Person {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Person (String fullName, String position, String email, String phone,
            int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        return "Name: " + fullName +"\nPosition: " + position + "\nEmail: " +
                    email + "\nPhone: " + phone + "\nSalary: " + salary + "\nAge: " + age +"\n";
    }
    public int getAge() {
        return age;
    }
}
