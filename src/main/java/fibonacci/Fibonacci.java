package fibonacci;

/**
 * Static utility function provide utility to calculate fibonacci array.
 */
class Fibonacci {
    static long[] fibonacciGenerator(int n) throws InvalidArgumentException{
        if (n < 0) throw new InvalidArgumentException();

        // Process the fibonacci array.
        long[] ret = new long[n];
        if (n > 0) {
            ret[0] = 0;
        }

        if (n > 1) {
            ret[1] = 1;
        }

        long l = 0, r = 1;
        for (int i = 2; i < n; i++) {
            r = l + r;
            l = r - l;
            ret[i] = r;
            // If r < 0 then integer overflow happens.
            if (r < 0) throw new InvalidArgumentException();
        }
        return ret;
    }
}
