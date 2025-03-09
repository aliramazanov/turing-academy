package module02.lesson02principles;

import java.util.Objects;

public class Teacher extends Person {
    private String subject;

    public Teacher(int id, String name, int age, String subject) {
        super(id, name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        if (!super.equals(o)) return false;

        Teacher teacher = (Teacher) o;

        return Objects.equals(subject, teacher.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subject);
    }

    @Override
    public String toString() {
        int id = getId();
        String name = super.getName();
        int age = super.getAge();
        return "Teacher --> id: %d, name: %s, age: %d, subject: '%s'".formatted(id, name, age, subject);
    }
}
