package day_13_inheritance.phone_task;

public class Iphone {

    private String brand;
    private String model;
    private int size;
    private double price;
    private String color;
    private long phoneNumber;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand.equalsIgnoreCase("null") || brand.isEmpty() || brand.isBlank()){
            System.err.println("Brand can not be null, empty or blank.");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model.equalsIgnoreCase("null") || model.isEmpty() || model.isBlank()){
            System.err.println("Model can not be null, empty or blank.");
            System.exit(1);
        }

        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {

        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.err.println("Price must be greater than zero");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.equalsIgnoreCase("null") || color.isEmpty() || color.isBlank()){
            System.err.println("Color can not be null, empty or blank.");
            System.exit(1);
        }
        this.color = color;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Iphone(String brand, String model, int size, double price, String color, long phoneNumber) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
        setPhoneNumber(phoneNumber);
    }


    public void call(){
        System.out.println("Calling the number: " + phoneNumber);
    }

    public void text(){
        System.out.println("Texting the number: " + phoneNumber);
    }

    public void faceTime(){
        System.out.println("Facetime with number: " + phoneNumber);
    }


    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}

/*
Phone Task Requirements:
1. Create a custom class named 'IPhone' with these specifications:
   Attributes:
       - brand: String
       - model: String
       - size: String
       - price: double
       - color: String

   Encapsulation:
       - All fields must be private with getters and setters.
       Conditions for Encapsulation:
           - The 'brand', 'model', and 'color' must not be null, empty, or blank.
           - The 'price' must be greater than zero.

   Constructor:
       - Add a constructor to initialize all fields.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - faceTime(phoneNumber): Display "facetiming with the number [phoneNumber]".
       - toString(): Prints the information of the IPhone object.
 */