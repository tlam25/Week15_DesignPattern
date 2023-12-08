import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    public static void main(String[] args) {
        // Tạo cây phả hệ từ ví dụ trong yêu cầu
        Person james = new Person("James", "30/12/1975", "Male");
        Person hana = new Person("Hana", "25/02/1978", "Female");
        Person ryan = new Person("Ryan", "10/03/1995", "Male");
        Person kai = new Person("Kai", "04/09/1996", "Male");
        Person jennifer = new Person("Jennifer", "21/05/1997", "Female");
        Person kaiChild1 = new Person("Child1", "19/06/2021", "Male");
        Person kaiChild2 = new Person("Child2", "17/11/2022", "Female");
        Person kaiChild3 = new Person("Child3", "19/06/2021", "Male");
        Person kaiChild4 = new Person("Child4", "17/11/2022", "Female");

        james.marryTo(hana);
        james.addChild(ryan);
        james.addChild(kai);
        kai.marryTo(jennifer);
        kai.addChild(kaiChild1);
        kai.addChild(kaiChild2);
        kai.addChild(kaiChild3);
        kai.addChild(kaiChild4);

        // Tìm tất cả các cá nhân không kết hôn trong danh sách phả hệ
        List<Person> unmarriedPeople = new ArrayList<>();
        findUnmarriedPeople(james, unmarriedPeople);
        System.out.println("Các cá nhân không kết hôn trong danh sách phả hệ:");
        for (Person person : unmarriedPeople) {
            System.out.println(person.getName());
        }

        // Tìm tất cả các cặp vợ chồng có hai con trong danh sách phả hệ
        List<Person> couplesWithTwoChildren = new ArrayList<>();
        findCouplesWithTwoChildren(james, couplesWithTwoChildren);
        System.out.println("Các cặp vợ chồng có hai con trong danh sách phả hệ:");
        for (Person person : couplesWithTwoChildren) {
            System.out.println(person.getName());
        }

        // Tìm tất cả các thế hệ mới nhất trong danh sách phả hệ
        List<Person> latestGeneration = new ArrayList<>();
        findLatestGeneration(james, latestGeneration);
        System.out.println("Các thế hệ mới nhất trong danh sách phả hệ:");
        for (Person person : latestGeneration) {
            System.out.println(person.getName());
        }
    }

    private static void findUnmarriedPeople(Person person, List<Person> unmarriedPeople) {
        if (!person.isMarried()) {
            unmarriedPeople.add(person);
        }
        List<Person> children = person.getChildren();
        for (Person child : children) {
            findUnmarriedPeople(child, unmarriedPeople);
        }
    }

    private static void findCouplesWithTwoChildren(Person person, List<Person> couplesWithTwoChildren) {
        List<Person> children = person.getChildren();
        if (person.isMarried() && children.size() == 2) {
            couplesWithTwoChildren.add(person);
        }
        for (Person child : children) {
            findCouplesWithTwoChildren(child, couplesWithTwoChildren);
        }
    }

    private static void findLatestGeneration(Person person, List<Person> latestGeneration) {
        List<Person> children = person.getChildren();
        if (children.isEmpty()) {
            latestGeneration.add(person);
        } else {
            for (Person child : children) {
                findLatestGeneration(child, latestGeneration);
            }
        }
    }
}
