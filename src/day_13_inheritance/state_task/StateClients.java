package day_13_inheritance.state_task;

public class StateClients {

    public static void main(String[] args) {

        Florida florida = new Florida("Florida","FD","Democrats",
                "John Kenny","James G",500000);
        System.out.println(florida);

        System.out.println("------------------------------------------------------------------------------------------");

        California california = new California("California","CA","Republicans",
                "Scott Evans","Arbon Shehu",250000);
        System.out.println(california);

        System.out.println("------------------------------------------------------------------------------------------");

        Virginia virginia = new Virginia("Virginia","V","Democrats","Eliot Angel",
                "Medlin M",50000);
        System.out.println(virginia);

        System.out.println("------------------------------------------------------------------------------------------");

        Texas texas = new Texas("Texas","","Democrats","Brown G",
                "",50000);
        System.out.println(texas);



    }

}
