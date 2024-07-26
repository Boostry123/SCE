import queue.ArrayQueue;
import set.SetUtils;
import set.SimpleSet;
public class Main {
    public static void main(String[] args) {
        SimpleSet<Double> testArray = new SimpleSet<>(5);
        System.out.println(testArray.isEmpty());
        testArray.add(1.0);
        testArray.add(2.0);
        testArray.add(3.0);
        testArray.add(4.0);
        testArray.add(5.0);
        testArray.add(6.0);


        SimpleSet<Double> testArray2 = new SimpleSet<>();
        testArray.add(3.0);
        testArray.add(4.0);
        testArray.add(5.0);
        testArray.add(6.0);

        System.out.println(testArray.getElements());

        Double[] test1 = (testArray.getElements());
        Double[] test2 = (testArray2.getElements());
        Double[] result = SetUtils.union(test1, test2);
        for(int i = 0 ; i < result.length ; i++){
            System.out.println(result[i]);
        }
    }
}