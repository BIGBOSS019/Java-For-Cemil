package AtHome;

public class Home2 {
    public static void main(String[] args) {
        MathUnits nathUnits = new MathUnits();


        int my_number = nathUnits.add(5, 10, 15);
        int my_number2 = nathUnits.add(2, 100, 30);
        int delenie_my_nunrs = nathUnits.division(11, 4, 1);
        int vicitanie_mnymum = nathUnits.substraction(10, 50,100);
        int sum_myNuns = my_number + my_number2;



        nathUnits.MyLtpl(10, 5, -4);


        System.out.println(my_number);
        System.out.println(my_number2);
        System.out.println(sum_myNuns);
        System.out.println(delenie_my_nunrs);
        System.out.println(vicitanie_mnymum);

    }
}


class MathUnits {
    int add(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    void MyLtpl(int x, int y, int z) {
        int product = x * y * z;
        System.out.println(product);
    }

    int division(int k, int s, int d) {
        int delenie = k / s / d;
        return delenie;
    }

    int substraction(int n, int j, int e){
        int subs = n - j - e;
        return subs;
    }




}
