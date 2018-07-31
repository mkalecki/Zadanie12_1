import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {

        TreeSet<Integer> numbersSet = TreeSetOfRandomInteger.generator(50,1000);

//        System.out.println(numbersSet);

        System.out.println("Najmniejsza wylosowana liczba: " + numbersSet.first());
        System.out.println("Największa wylosowana liczba: " + numbersSet.last());

        Double average = DataCalc.calcAverage(numbersSet);
        System.out.println("średnia to: " + average);

        TreeSet<Integer> largerThenAverage = DataCalc.largerThenAverageTreeSet(numbersSet);
        System.out.println("Liczby większe od średniej to:" + largerThenAverage);
        System.out.println("/z ciekawości/ rozmiar zbioru większych od średniej: " + largerThenAverage.size());



    }
}
