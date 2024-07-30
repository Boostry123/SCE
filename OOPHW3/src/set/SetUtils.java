package set;
//Author : Yanir Latyshev
//Assignment : 3

import java.util.Arrays;

public class SetUtils <E> {


    /**
     * recives 2 arrays of same type and does a union on them and returns the result array.
     * @param set1
     * @param set2
     * @param <E>
     * @return array of type E
     */
    public static <E> E[] union(SimpleSet<E> set1, SimpleSet<E> set2){
        E[] result = Arrays.copyOf((set1.getElements().length >= set2.getElements().length) ? set1.getElements() : set2.getElements(),Math.max(set1.size(),set2.size()));
        E[] smallerArray = Arrays.copyOf((set1.getElements().length < set2.getElements().length) ? set1.getElements() : set2.getElements(),Math.min(set1.size(),set2.size()));
        for(int i = 0; i < smallerArray.length; i++){
            for(int j = 0; j < result.length; j++){
                if(smallerArray[i].equals(result[j])){
                    break;
                }else if((result.length-1) == j){
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = smallerArray[i];
                }
            }


        }


        return result;
    }
    public static <E> E[] intersection(SimpleSet<E> set1, SimpleSet<E> set2) {
        E[] result = Arrays.copyOf(set1.getElements(), set1.size());
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < set2.size(); j++) {
                if(result[i].equals(set2.getElements()[j])){
                    break;
                }
                else if ((j == set2.size() - 1 )) {
                    if((result[result.length-1] != set2.getElements()[j])){
                        for (int k = i; k < result.length - 1; k++) {
                            result[k] = result[k + 1];
                        }
                        result = Arrays.copyOf(result, result.length - 1);
                        i--;
                    }
                }
            }
        }
        return result;
    }

    /**
     * recives 2 arrays of same type ,will create a new array of same type and will return what's in A but will removes what ever is in B and A.
     * @param set1
     * @param set2
     * @param <E>
     * @return array of type E
     */
    public static <E> E[] difference(SimpleSet<E> set1,SimpleSet<E> set2) {
        E[] result = Arrays.copyOf(set1.getElements(), set1.size());
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < set2.size(); j++) {
                if(result[i].equals(set2.getElements()[j])){
                    for(int k = i; k < result.length-1; k++){
                        result[k] = result[k+1];
                    }
                    result = Arrays.copyOf(result, result.length - 1);
                    i--;
                }
            }
        }
        return result;
    }

    /**
     * to make a symetric differenece this method will use previous method (union,intersection and difference) ,
     * will return a symetric difference array of set1 and set2.
     * @param set1
     * @param set2
     * @param <E>
     * @return array of type E.
     */
    public static <E> E[] symetricDifference(SimpleSet<E> set1, SimpleSet<E> set2) {
        E[] temp = union(set1,set2);
        SimpleSet<E> newSet1 = new SimpleSet<>(temp.length);
        for (int i = 0; i < temp.length; i++) {
            newSet1.add(temp[i]);
        }
        E[] temp2 = intersection(set1,set2);
        SimpleSet<E> newSet2 = new SimpleSet<>(temp2.length);
        for (int i = 0; i < temp2.length; i++) {
            newSet2.add(temp2[i]);
        }
        E[] result = difference(newSet1,newSet2);
        return result;
    }
    public static <E> E[][] powerSet(SimpleSet<E> set) {
        E[][] newArray = (E[][]) new Object[(int) Math.pow(set.size(),2)][];




        return newArray;
    }
}
