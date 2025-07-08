package AtClass;

public class Class5 {

        public static void main(String[] args) {
                Class4.User u = new Class4.User();

            u.setUsername("Eliyevv_019");
            u.setPassword("12345");
            u.getAge(14);
            u.getName(Cemil);
            u.getSurname(Eliyev);
            u.getGender(Men);

            System.out.println("Username: " + u.getUsername());
            System.out.println("----------------");
            System.out.println("Password: " + u.getPassword());
            System.out.println("----------------");
            System.out.println("Age: " + u.getAge());
            System.out.println("----------------");
            System.out.println("Age: " + u.getName());
            System.out.println("----------------");
            System.out.println("Age: " + u.getSurname());
            System.out.println("----------------");
            System.out.println("Age: " + u.getGender());
        }
    }

