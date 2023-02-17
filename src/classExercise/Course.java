
package classExercise;

import java.util.ArrayList;

public class Course {

    ArrayList<Student> student = new ArrayList<>();

    int age;
    String name;

    String courseName;
    int maxStudents;
    byte qualityRatingOutOf10;

    @Override
    public String toString() {
        return "Course{" +
                "student=" + student +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", courseName='" + courseName + '\'' +
                ", maxStudents=" + maxStudents +
                ", qualityRatingOutOf10=" + qualityRatingOutOf10 +
                '}';
    }
}

