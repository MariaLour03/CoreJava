package com.perscholas.polymorphism_interface;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {

        KidUser kidObj1 = new KidUser(10,"Kids");
        KidUser kidObj2 = new KidUser(18,"Fiction");
        kidObj1.registerAccount();
        kidObj1.requestBook();
        kidObj2.registerAccount();
        kidObj2.requestBook();
        AdultUser adultObj1 = new AdultUser(5,"Kids");
        AdultUser adultObj2 = new AdultUser(23,"Fiction");
        adultObj1.registerAccount();
        adultObj1.requestBook();
        adultObj2.registerAccount();
        adultObj2.requestBook();

    }
}
