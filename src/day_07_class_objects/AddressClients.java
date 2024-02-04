package day_07_class_objects;

public class AddressClients {

    public static void main(String[] args) {

        Address address1 = new Address();
        address1.buildingNumber = 7925;
        address1.street = "Jones Branch Dr";
        address1.city = "McLean";
        address1.state = "VA";
        address1.zipCode = 22012;

        System.out.println(address1);

        System.out.println("---------------------------------------------------------------------");

        Address address2 = new Address();
        address2.buildingNumber = 32;
        address2.state = "Sweden";
        address2.zipCode = 26132;
        address2.street = "Jarnvagsgatan";
        address2.city = "Landskrona";

        System.out.println(address2);



    }

}
