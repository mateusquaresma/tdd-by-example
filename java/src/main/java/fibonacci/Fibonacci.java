package fibonacci;

public class Fibonacci {
    public static int fib(int position) {
        if (position == 0)
            return 0;
        if (position == 1)
            return 1;

        return fib(position - 2) + fib(position - 1);
    }
}
