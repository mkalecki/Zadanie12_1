import java.util.TreeSet;

public class DataCalc {

    public static double calcAverage(TreeSet<Integer> numbersSet) {

        double sum = 0;
        for (Integer tmp : numbersSet) {
            sum = sum + tmp;
        }
        return sum / numbersSet.size();
    }

    public static TreeSet<Integer> largerThenAverageTreeSet(TreeSet<Integer> numbersSet) {
        TreeSet<Integer> largerThenAverage = new TreeSet<>();

        for (Integer tmp : numbersSet) {
            if (tmp > calcAverage(numbersSet))
                largerThenAverage.add(tmp);
        }
        return largerThenAverage;
    }
}
