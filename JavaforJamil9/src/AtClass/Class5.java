package AtClass;

public class Class5 {

    public static void main(String[] args) {
        Class4.User u = new Class4.User();

        u.setUsername("Eliyevv_019");
        u.setPassword("12345");
        u.setAge("14");
        u.setName("Cemil");
        u.setSurname("Eliyev");
        u.setGender("Men");

        System.out.println("Username: " + u.getUsername());
        System.out.println("----------------");
        System.out.println("Password: " + u.getPassword());
        System.out.println("----------------");
        System.out.println("Age: " + u.getAge());
        System.out.println("----------------");
        System.out.println("Name: " + u.getName());
        System.out.println("----------------");
        System.out.println("Surname: " + u.getSurname());
        System.out.println("----------------");
        System.out.println("Gender: " + u.getGender());
    }
}