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
//    public static <E> E[] intersection(E[] set1, E[] set2) {
//        E[] result = set1;
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < set2.length; j++) {
//                if(result[i].equals(set2[j])){
//                    break;
//                }
//                else if ((j == set2.length - 1 )) {
//                    if((result[result.length-1] != set2[j])){
//                        for (int k = i; k < result.length - 1; k++) {
//                            result[k] = result[k + 1];
//                        }
//                        result = Arrays.copyOf(result, result.length - 1);
//                        i--;
//                    }
//                }
//            }
//        }
//        return result;
//    }

    /**
     * recives 2 arrays of same type ,will create a new array of same type and will return what's in A but will removes what ever is in B and A.
     * @param set1
     * @param set2
     * @param <E>
     * @return array of type E
     */
//    public static <E> E[] difference(E[] set1, E[] set2) {
//        E[] result = set1;
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < set2.length; j++) {
//                if(result[i].equals(set2[j])){
//                    for(int k = i; k < result.length-1; k++){
//                        result[k] = result[k+1];
//                    }
//                    result = Arrays.copyOf(result, result.length - 1);
//                    i--;
//                }
//            }
//        }
//        return result;
//    }

    /**
     * to make a symetric differenece this method will use previous method (union,intersection and difference) ,
     * will return a symetric difference array of set1 and set2.
     * @param set1
     * @param set2
     * @param <E>
     * @return array of type E.
     */
//    public static <E> E[] symetricDifference(E[] set1, E[] set2) {
//        E[] temp = union(set1,set2);
//        E[] temp2 = intersection(set1,set2);
//        E[] result = difference(temp,temp2);
//        return result;
//    }
//    public static <E> ArrayList<E[]> powerSet(E[] set) {
//
//    }
}
