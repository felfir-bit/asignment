public class Person {
    String name;
    String surname;
    int age;
    boolean gender; // true = мужчина, false = женщина

    // Конструктор
    public Person(String name, String surname, int age, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    // Переопределяем метод toString для вывода информации
    @Override
    public String toString() {
        String genderStr = (gender) ? "Male" : "Female";
        return "Hi, I am " + name + " " + surname + ", a " + age + "-year-old " + genderStr + ".";
    }
}
