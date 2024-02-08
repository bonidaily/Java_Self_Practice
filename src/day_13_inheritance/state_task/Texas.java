package day_13_inheritance.state_task;

import day_13_inheritance.state_task.State;

public class Texas extends State {
    public Texas(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        super(name, abbreviation, politicalParty, governor, senator, population);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
