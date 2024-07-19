import queue.ArrayQueue;
import set.SetUtils;
import set.SimpleSet;
public class Main {
    public static void main(String[] args) {
        SimpleSet<Integer> testArray = new SimpleSet<>(5);
        System.out.println(testArray.isEmpty());
        testArray.add(1);
        testArray.add(2);
        testArray.add(3);
        testArray.add(4);
        testArray.add(5);
        testArray.add(6);


        SimpleSet<Integer> testArray2 = new SimpleSet<>();
        testArray.add(3);
        testArray.add(4);
        testArray.add(5);
        testArray.add(6);


        Integer[] result = SetUtils.union(testArray.getElements(),testArray2.getElements());
        for(Integer i : result){
            System.out.println(i);
        }
    }
}