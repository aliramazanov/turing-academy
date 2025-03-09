package module02.lesson02principles;

public class Application {
    public static void main(String[] args) {
        Student studentOne = new Student(0, "Ali", 26, 95.0);
        Student studentTwo = new Student(1, "Nino", 23, 95.0);
        Teacher teacherOne = new Teacher(2, "Tom", 28, "Java Programming");

        System.out.println(studentOne);
        System.out.println(studentTwo);
        System.out.println(teacherOne);
    }
}
