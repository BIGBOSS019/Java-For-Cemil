package AtHome;

public class Home5 {

    static class Library {
        String name;

        Library(String name) {
            this.name = name;
        }

        class Book {
            String title;

            Book(String title) {
                this.title = title;
            }

            void showInfo() {
                System.out.println("Library: " + name + ", Book: " + title);
            }
        }
    }

    static class Computer {
        static class Info {
            static void about() {
                System.out.println("This is a computer.");
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            Library lib = new Library("My Library");
            Library.Book bk = lib.new Book("Funny Stories");
            bk.showInfo();

            Computer.Info.about();
        }
    }
}
