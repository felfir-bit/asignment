public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("John", "Doe", 20, true);
        student1.addGrade(85);
        student1.addGrade(90);

        Student student2 = new Student("Jane", "Smith", 22, false);
        student2.addGrade(88);
        student2.addGrade(92);


        Teacher teacher1 = new Teacher("Alice", "Johnson", 40, false, "Mathematics", 15, 50000);
        Teacher teacher2 = new Teacher("Bob", "Williams", 50, true, "Science", 12, 55000);

        School school = new School();
        school.addMember(student1);
        school.addMember(student2);
        school.addMember(teacher1);
        school.addMember(teacher2);


        System.out.println(school);


        System.out.println("Student 1 GPA: " + student1.calculateGPA());
        System.out.println("Student 2 GPA: " + student2.calculateGPA());


        teacher1.giveRaise(10);
        System.out.println("Teacher 1 new salary: " + teacher1.salary);
    }
}
