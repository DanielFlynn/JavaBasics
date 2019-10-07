package academy.learnprogramming;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
	Account danielsAccount = new Account();

        System.out.println(danielsAccount.getAccountNumber());
        System.out.println(danielsAccount.getBalance());
        System.out.println(danielsAccount.getCustomerName());
        System.out.println(danielsAccount.getCustomerEmailAddress());
        System.out.println(danielsAccount.getCustomerPhoneNumber());

        Account jimsAccount = new Account("Jim", "jim@jimmail.com", "12234");
        System.out.println(jimsAccount.getCustomerEmailAddress() + " Email Address For " + jimsAccount.getCustomerName());

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 2500.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Jimmy", 25.00, "jimmy@test.com");
        System.out.println(person3.getName());

        Wall wall = new Wall();
        System.out.println(" area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }


}
