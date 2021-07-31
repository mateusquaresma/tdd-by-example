package triangle;

public class Triangle {

    private final int a;
    private final int b;
    private final int c;

    public Triangle(int a, int b, int c) {
        boolean valid = (a + b > c && a + c > b && b + c > a);
        if (!valid)
            throw new RuntimeException();

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isEquilateral() {
        return a == b && a == c;
    }

    public boolean isIsosceles() {
        return (a == b || a == c || b == c);
    }


    public boolean isScalene() {
        return (a != b && a != c && b != c);
    }
}
