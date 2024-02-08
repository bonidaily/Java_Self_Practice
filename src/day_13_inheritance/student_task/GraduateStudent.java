package day_13_inheritance.student_task;

public class GraduateStudent extends Student {
    public GraduateStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        System.out.println(getName() + " is graduated from " + getSchoolName());
    }

    @Override
    public String toString() {
        return super.toString() + "}";
    }
}

