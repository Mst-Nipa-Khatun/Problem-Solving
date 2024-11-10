package com.mycompany.problemsolving.customProjects;
import java.util.Arrays;
import java.util.List;


public class Student {
    private String name;
    private int age;
    private String gender;
    private String Address;
    private List<String> phoneNumbers;


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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "\n Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", Address='" + Address + '\'' +
                ", phoneNumbers=" + ( phoneNumbers!=null ? phoneNumbers.toString():" Motu ") +
                '}';
    }
}
