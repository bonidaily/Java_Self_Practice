package day_12_encapsulation;

public class Candy {

    private String band;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity <= 0){
            System.err.println("The quantity can not set to zero or negative value");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0) {
            System.err.println("The price can not be negative");
            System.exit(1);
        }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public Candy(String band, int quantity, double price, boolean hasPeanuts) {
        setBand(band);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    public String toString() {
        String updatedPrice = price == 0 ? "free" : ("$" + price);
        return "Candy{" +
                "band= " + band + '\'' +
                ", quantity= " + quantity +
                ", price= " + updatedPrice +
                ", hasPeanuts= " + hasPeanuts +
                '}';
    }
}
/*
4. Create a custom class named Candy with the following specifications:

	Attributes:
		brand
		quantity
		price
		hasPeanuts

	Ensure encapsulation for all fields.
		Conditions:
			The price of candy cannot be set to a negative value.
			The quantity of candy cannot be set to zero or a negative value.

	Add a constructor that allows the user to set all fields during object creation.

	Actions:
		toString(): Displays the brand, unit price, and quantity when the object is printed. If the price is zero, display "free" instead of 0.

	Create another class named CandyClients, create multiple candy objects, and test each function of the candy object.


 */