package Challenges.argCollections;

import java.util.Collections;
import java.util.List;

public class StudentManagement {
    private List<Student> students;
    public void addStudent(Student student){
       Collections.addAll(students, student);
    }
    public boolean removeStudent(Student student){
        return Collections.replaceAll(students, student, null);
    }

    public Student getStudent(int id){
        for(Student s: students){
            if(s.getId() == id){
                return s;
            }
        }
        return null;
    }



}
