import queue.ArrayQueue;

//Author : Yanir Latyshev
//Assignment : 3
import set.SetUtils;
import set.SimpleSet;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //initializing first array and adding elements to it.
        SimpleSet<Double> testArray = new SimpleSet<>(5);
        System.out.println(testArray.isEmpty());
        testArray.add(1.0);
        testArray.add(2.0);
        testArray.add(3.0);
        testArray.add(4.0);
        testArray.add(5.0);
        testArray.add(6.0);

        //initializing second array and adding elements to it.
        SimpleSet<Double> testArray2 = new SimpleSet<>();
        testArray2.add(3.0);
        testArray2.add(4.0);
        testArray2.add(5.0);
        testArray2.add(6.0);
        testArray2.add(7.0);
        testArray2.add(8.0);


        //making new arrays of the type we want to make manipulations on.
        Double[] test1 = new Double[testArray.size()];
        Double[] test2 = new Double[testArray2.size()];

        //adding the elements from the generic object array to our new arrays.
        for(int i = 0; i < testArray.size(); i++){
            test1[i] = testArray.getElements(i);
        }
        for(int i = 0; i < testArray2.size(); i++){
            test2[i] = testArray2.getElements(i);
        }

        // this loop uses 2 arrays to make a union between them and returns an array back.
        /**
        Double[] resultUnion = SetUtils.union(test1, test2);
        for(int i = 0 ; i < resultUnion.length ; i++){
           System.out.println(resultUnion[i]);
        }
         **/

        //this loop uses 2 arrays to make an intersection between them and returns an array.
        /**
        Double[] resultIntersection = SetUtils.intersection(test1, test2);
        for(int i = 0 ; i < resultIntersection.length ; i++){
            System.out.println(resultIntersection[i]);
        }
         **/

        //this loop uses 2 arrays to make a difference between the test1 and test2 and return an array back.
        /**
        Double[] resultDifference = SetUtils.difference(test1, test2);
        for(int i = 0; i < resultDifference.length; i++){
            System.out.println(resultDifference[i]);
        }
         **/
        //this loop uses 2 arrays to make a Symetric difference between them and returns an array back.
        Double[] resultSymetricDifference = SetUtils.symetricDifference(test1,test2);
        for(int i = 0; i < resultSymetricDifference.length; i++){
            System.out.println(resultSymetricDifference[i]);
        }
        Double[] powerlist = {};
//        System.out.println(SetUtils.powerSet(powerlist));
    }



}