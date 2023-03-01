package JavaOOP.constructorExercise;

public class Student {
        public String name;
        public int age;

        public Student(String name, int age) {
            System.out.println("Constructing");
            this.name = name;
            this.age = age;
            System.out.println("Constructed");
        }

    public Student( int age) {
        this.age = age;
        System.out.println("Constructed student object with age: " + age);
    }

    public Student(String name) {
        System.out.println("Constructing student object with name " + name);
        this.name = name;
        System.out.println("Constructed");
    }

    public Student() {
        System.out.println("I have no parameters");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
