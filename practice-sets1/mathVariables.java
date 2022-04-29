public class mathVariables {
    public static void main(String[] args) {
        int a, b, c, d, e, f, g;
        double x, y, z;
        String one, two, both;

        a = 10;
        b = 27;
        System.out.println("a is " + a + "and b is " + b);

        c = a + b;
        System.out.println("a+b is " + c);
        d = a - b;
        System.out.println("a - b is " + d);
        e = a * b;
        System.out.println("a * b is " + e);
        f = a / b;
        System.out.println("a / b is " + f);

        x = 1.1;
        System.out.println("\nx is " + x);
        y = x*x;
        System.out.println("x*x is " + y);

        one = "dog";
        two = "house";
        both = one + two;
        System.out.println(both);
    }
}