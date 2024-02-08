package day_13_inheritance.person_task;

public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'';
    }
}
