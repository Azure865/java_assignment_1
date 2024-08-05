package test;

public class Sum {
    public int Sums(int a, int b) {
        return a + b;
    }
    public double Sums(double a, double b) {
        return a + b;
    }
    public int Sums(int a, int b, int c) {
        return a + b + c;
    }
}

class Main{

    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println(s.Sums(1, 2));
        System.out.println(s.Sums(12,344,123));
        System.out.println(s.Sums(2323.12, 123.23));
    }

}
