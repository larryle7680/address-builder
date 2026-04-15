package com.pluralsight;
import java.util.Scanner;

public class AddressBuilderApp {
    //importing Scanner/String Builder in class
    static Scanner theScanner = new Scanner(System.in);
    static StringBuilder stringGlue = new StringBuilder();

    //Main
    public static void main(String[] args) {
        String name = askQuestion("What is your name?");
        String billingStreet = askQuestion("What is your street?");
        String city = askQuestion("What is your city?");
        String state = askQuestion("What is your state?");
        String zip = askQuestion("What is your zip code?");

        createAddress(name,billingStreet,city,state
        ,zip);

        System.out.println(stringGlue);





    }
    //Question Method
    public static String askQuestion(String question) {
        System.out.println(question);
        return theScanner.nextLine();
    }

    public static void createAddress(String name, String billingStreet, String city,String state,String zip){
        stringGlue.append("---Your Billing Address---\n");
        stringGlue.append("Name:" + name + "\n");
        stringGlue.append("Billing Street:" + billingStreet + "\n");
        stringGlue.append("City:" + city + "\n");
        stringGlue.append("State:" + state + "\n");
        stringGlue.append("Zip:" + zip + "\n");

    }
}
