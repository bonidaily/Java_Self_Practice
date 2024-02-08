package day_13_inheritance.state_task;

public class Florida extends State {
    public Florida(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        super(name, abbreviation, politicalParty, governor, senator, population);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
