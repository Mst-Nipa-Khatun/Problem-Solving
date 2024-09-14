package com.mycompany.problemsolving.customProjects;

import java.util.List;

public class StudentOperationTest {
    public static void main(String[] args) {
        StudentOperation st = new StudentOperation();
        List<Student> stundentList= st.getAllStudents();

        System.out.println(stundentList);

        List<Student> sanitisedStudent=st.getSanitisedStudents();
        System.out.println(sanitisedStudent);

        List<Student> sanitisedGenderStudent=st.getSanitisedStudentsWithGender();
        System.out.println(sanitisedGenderStudent);


    }
}
