public class Teacher extends Person {
    String subject;
    int yearsOfExperience;
    int salary;


    public Teacher(String name, String surname, int age, boolean gender, String subject, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }


    public void giveRaise(double percentage) {
        this.salary += (salary * percentage / 100);
    }


    @Override
    public String toString() {
        return super.toString() + " I teach " + subject + ".";
    }
}
