package com.mycompany.problemsolving.customProjects;

import java.util.ArrayList;
import java.util.List;

public class StudentOperation {

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();

        //@INFO Now going to create indivisual student and add to students list
        Student student1 = new Student();
        student1.setName("Nipa");
        student1.setAge(23);
        student1.setGender("female");

        List<String> phoneList =new ArrayList<>();
        phoneList.add("123-4567");
        phoneList.add("987-654321");
        student1.setPhoneNumbers(phoneList);
        students.add(student1);

        Student student2 = new Student();
        student2.setName("Kibria");
        student2.setAge(22);
        student2.setGender("male");

        List<String> phoneList2 =new ArrayList<>();
        phoneList2.add("123-4567");
        phoneList2.add("987-654321");
        student2.setPhoneNumbers(phoneList2);
        students.add(student2);

        Student student3 = new Student();
        student3.setName("Nikola");
        student3.setAge(21);
        student3.setGender("male");

        List<String> phoneList3 =new ArrayList<>();
        phoneList3.add("123-4567");
        phoneList3.add("987-654321");
        student3.setPhoneNumbers(phoneList3);
        students.add(student3);

        Student student4 = new Student();
        student4.setName("Nila");
        student4.setAge(22);
        student4.setGender("female");
        List<String> phoneList4 =new ArrayList<>();
        phoneList4.add("123-4567");
        phoneList4.add("987-654321");
        student4.setPhoneNumbers(phoneList4);
        students.add(student4);

        Student student5 = new Student();
        student5.setName("Alala");
        student5.setAge(21);
        student5.setGender("male");
        List<String> phoneList5 =new ArrayList<>();
        phoneList5.add("123-4567");
        phoneList5.add("987-654321");
        student5.setPhoneNumbers(phoneList5);
        students.add(student5);

//        Student student6 = new Student();
//        student6.setName("Ruksana");
//        student6.setAge(22);
//        student6.setGender("female");
//        students.add(student6);

        return students;
    }

    public List<Student> getSanitisedStudents() {
       List<Student> students = this.getAllStudents();
       List<Student> specificStudents = new ArrayList<>();
       for (Student student : students) {
           if(student.getAge()<=22){
               specificStudents.add(student);
           }
       }
       return specificStudents;

    }
    public List<Student> getSanitisedStudentsWithGender() {
        List<Student> students = this.getAllStudents();

        Student student6 = new Student();
        student6.setName("Ruksana");
        student6.setAge(22);
        student6.setGender("female");

        List<String> phoneList6=new ArrayList<>();
        phoneList6.add("123-4567");
        phoneList6.add("987-654321");
        student6.setPhoneNumbers(phoneList6);
        students.add(student6);

        List<Student> specificStudents2= new ArrayList<>();
        for (Student student : students) {
            if(student.getGender().equals("female")){
                specificStudents2.add(student);
            }
        }

        return specificStudents2;
    }


}
