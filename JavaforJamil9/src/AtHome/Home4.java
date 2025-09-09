package AtHome;

import AtClass.Class4;

public class Home4 {

    public static void main(String[] args) {
        Home3.User u = new Home3.User();

        u.login("Eliyevv_019");
        u.main("hhhh@.gmail.com");
        u.age("14");


        System.out.println("Login: " + u.login());
        System.out.println("----------------");
        System.out.println("Main: " + u.main());
        System.out.println("----------------");
        System.out.println("Age: " + u.getAge());

    }
}