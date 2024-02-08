package day_13_inheritance.phone_task;

public class Samsung extends Iphone {
    public Samsung(String brand, String model, int size, double price, String color, long phoneNumber) {
        super(brand, model, size, price, color, phoneNumber);
    }

    @Override
    public void call() {
        super.call();
    }

    @Override
    public void text() {
        super.text();
    }



    @Override
    public String toString() {
        return super.toString();
    }
}
/*
2. Create a class named 'Samsung' with these specifications:
   Attributes:
       - Same as IPhone.

   Encapsulation:
       - Same conditions as IPhone.

   Constructor:
       - Same as IPhone.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - toString(): Prints the information of the Samsung object.
 */