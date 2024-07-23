package set;

import java.util.Arrays;

public class SetUtils <E> {


    public static <E> E[] union(E[] set1, E[] set2){
        E[] result = Arrays.copyOf(set1,set1.length-1+set2.length-1);
        System.out.println(result);
        return result;
}
}
