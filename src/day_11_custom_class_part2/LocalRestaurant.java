package day_11_custom_class_part2;

public class LocalRestaurant {

    public static void main(String[] args) {

        Chef[] chefs = {
            new Chef("Arbon",1234,50,true),
                new Chef("Majlind",12345,45,true),
                new Chef("Lirik",123456,60,true)
        };

        Server[] servers ={
                new Server("Boni",2132,55,false),
                new Server("Pisi",2312,55,true),
                new Server("Kapo",444,32,true)
        };

        Restaurant restaurant = new Restaurant("Baba Laq","Gjakove",5);

        restaurant.hireChef(chefs);
        restaurant.hireServer(servers);

        System.out.println(restaurant);

    }

}
