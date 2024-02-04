package day_07_class_objects;

public class ItemCilents {

    public static void main(String[] args) {

        Item item1 = new Item();
        item1.itemName = "Snickers";
        item1.unitPrice = 25.5;
        item1.quantity = 40;

        System.out.println(item1);

        System.out.println(" -----------------------------------------");

        Item item2 = new Item();
        item2.itemName = "MgZs";
        item2.quantity = 2;
        item2.unitPrice = 35000D;



        System.out.println(item2);


    }

}
