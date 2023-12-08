import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String dateOfBirth;
    private String gender;
    private Person spouse;
    private List<Person> children = new ArrayList<>();

    /**
     * Constructor.
     */
    public Person(String name, String dateOfBirth, String gender) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.children = new ArrayList<>();
        this.spouse = null;
    }

    /**
     * marryTo.
     */
    public void marryTo(Person spouse) {
        this.spouse = spouse;
    }

    /**
     * addChild.
     */
    public void addChild(Person child) {
        this.children.add(child);
    }

    /**
     * isMarried.
     */
    public boolean isMarried() {
        return (spouse != null);
    }

    /**
     * getChildren.
     */
    public List<Person> getChildren() {
        return this.children;
    }

    /**
     * getName.
     */
    public String getName() {
        return this.name;
    }
}