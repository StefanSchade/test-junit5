package demoapplication;

public class MyMain {


    public static void main(String[] args) {
        System.out.println("this is the main class");

        Customer cus = new Customer("Tim");

        Account acc = new Account(cus, 1000.98);

        System.out.println(acc.getBalance());

    }
}
