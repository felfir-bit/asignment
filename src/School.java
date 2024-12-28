import java.util.ArrayList;
import java.util.List;

public class School {
    List<Person> members;

    public School() {
        this.members = new ArrayList<>();
    }


    public void addMember(Person member) {
        members.add(member);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        members.sort((p1, p2) -> p1.surname.compareTo(p2.surname)); // Сортировка по фамилии
        for (Person member : members) {
            sb.append(member.toString()).append("\n");
        }
        return sb.toString();
    }
}
