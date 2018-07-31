import java.util.Random;
import java.util.TreeSet;

public class TreeSetOfRandomInteger {

    public static TreeSet<Integer> generator(int size, int bound) {

        Random generator = new Random();

        TreeSet<Integer> numbersSet = new TreeSet<Integer>();
        Integer number;
        do {
            number = generator.nextInt(bound);
            numbersSet.add(number);
        } while (numbersSet.size() <= size);

        return numbersSet;
    }
}
