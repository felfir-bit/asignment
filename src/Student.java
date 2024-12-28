import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    static int studentCount = 0;
    int studentID;
    List<Integer> grades;


    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.studentID = ++studentCount;
        this.grades = new ArrayList<>();
    }


    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateGPA() {
        if (grades.isEmpty()) return 0.0;
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }


    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + studentID + ".";
    }
}
