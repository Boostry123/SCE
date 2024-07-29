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
        testArray2.add(8.0);



        // this loop uses 2 objects of type SimpleSet to make a union between their elements and returns an array back.

        Object[] resultUnion = SetUtils.union(testArray, testArray2);
        System.out.println("##### Union #####");
        for(int i = 0 ; i < resultUnion.length ; i++){
           System.out.println(resultUnion[i]);
        }
        System.out.println();


        //this loop uses 2 object of type SimpleSet to make an intersection between their elements and returns an array.

        Object[] resultIntersection = SetUtils.intersection(testArray, testArray2);
        System.out.println("##### Intersection #####");
        for(int i = 0 ; i < resultIntersection.length ; i++){
            System.out.println(resultIntersection[i]);
        }
        System.out.println();


        //this loop uses 2 objects of type SimpleSet to make a difference between the Array1 to Array2 and return an array back.

        Object[] resultDifference = SetUtils.difference(testArray, testArray2);
        System.out.println("##### Difference A/B #####");
        for(int i = 0; i < resultDifference.length; i++){
            System.out.println(resultDifference[i]);
        }
        System.out.println();

        //this loop uses Object of type SimpleSet to make a Symetric difference between them and returns an array back.

        Object[] resultSymetricDifference = SetUtils.symetricDifference(testArray,testArray2);
        System.out.println("##### Symetric Difference #####");
        for(int i = 0; i < resultSymetricDifference.length; i++){
            System.out.println(resultSymetricDifference[i]);
        }
        System.out.println();

        Object[] powerlist = {};
//        System.out.println(SetUtils.powerSet(powerlist));

    }



}