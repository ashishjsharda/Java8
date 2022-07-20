import java.util.stream.LongStream;

public class Accumulator {
    public long total = 0;
    public void add(long value) { total += value; }

    public static long sideEffectSum(long n) {
        Accumulator accumulator = new Accumulator();
        LongStream.rangeClosed(1, n).forEach(accumulator::add);
        return accumulator.total;
    }

    public static void main(String[] args) {
        System.out.println(sideEffectSum(30));

    }
}
