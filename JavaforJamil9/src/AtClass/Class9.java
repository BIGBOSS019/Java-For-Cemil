package AtClass;

public class Class9 {
    public static void main(String[] args) {
        package Object outerandinner;
        outerandinner;

        public class House {
            public static void main(String[] args) {
                Outer outer = new Outer();
                outer.test();
            }
        }

        class Outer {
            int outer_x = 100;
            int outer_x_2 = 200;

            void test() {
                Inner inner = new Inner();
                inner.display();
            }
        }

        class Inner {
            void display() {
                System.out.println(outer_x);
            }
        }
    }
}
