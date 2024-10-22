import java.util.ArrayList;
import java.util.Collections;
import java.util.random.RandomGenerator;

public class Generate {

    final static RandomGenerator ran = RandomGenerator.of("Xoroshiro128PlusPlus");

    public static ArrayList<Integer> generateRandomInput(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("bad array length");
        }
        ArrayList<Integer> array = new ArrayList<>(n);
        for (int i = 1; i < n; i++) {
            array.add(i);
        }
        Collections.shuffle(array);
        return array;
    }

    public static ArrayList<Integer> generatePartiallySortedInput(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("bad array length");
        }
        ArrayList<Integer> array = new ArrayList<>(n);
        array.add(ran.nextInt(0, 100));
        for (int i = 1; i < n; i++) {
            array.add(array.get(i-1) + ran.nextInt(-95, 105));
        }
        return array;
    }

    public static ArrayList<Integer> generateMostlySortedInput(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("bad array length");
        }
        ArrayList<Integer> array = new ArrayList<>(n);
        array.add(ran.nextInt(0, 100));
        for (int i = 1; i < n; i++) {
            array.add(array.get(i-1) + ran.nextInt(-60, 140));
        }
        return array;
    }
}