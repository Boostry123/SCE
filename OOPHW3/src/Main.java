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
        testArray2.add(3.0);
        testArray2.add(4.0);
        testArray2.add(5.0);
        testArray2.add(6.0);


        Double[] test1 = new Double[testArray.size()];
        Double[] test2 = new Double[testArray2.size()];

        for(int i = 0; i < testArray.size(); i++){
            test1[i] = testArray.getElements(i);
        }
        for(int i = 0; i < testArray2.size(); i++){
            test2[i] = testArray2.getElements(i);
        }

        Double[] result = SetUtils.union(test1, test2);
        for(int i = 0 ; i < result.length ; i++){
            System.out.println(result[i]);
        }
    }
}