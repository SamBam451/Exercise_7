package com.company;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Sam", "078763@swcsd.us");
        Business_contact person2 = new Business_contact("Bob", "example@email.com", 1234567890);
        person1.display();
        person2.display();
     }
}
