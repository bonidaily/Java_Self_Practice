package day_13_inheritance.phone_task;

public class PhoneClients {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Apple", "Iphone", 14,1500,"Black",1234567893);
        iphone.call();
        iphone.text();
        iphone.faceTime();
        System.out.println(iphone);

        System.out.println("------------------------------------------------------------------------------------------");

        Samsung samsung = new Samsung("Samsung","Galaxy",9,1600,"White",214323423);
        samsung.call();
        samsung.text();
        System.out.println(samsung);

        System.out.println("-------------------------------------------------------------------------------------------");

        Nokia nokia = new Nokia("null","General",3,0,"Black",241343232);
        nokia.call();
        nokia.text();
        System.out.println(nokia);


    }

}
/*
4. Create a class named "PhoneClients":
   - Create multiple objects representing different phones.
   - Test the methods and variables of each object.
 */
