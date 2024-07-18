package set;

import java.util.Arrays;

public class SetUtils <E> {

public static E[] union(E[] set1, E[] set2){
    E[] result = Arrays.copyOf(set1,set1.length + set2.length);
    for(int i = 0, j = 0 ; i < set2.length ; i++){
        if(set1[i] == null){
            result[i] = set2[j];
            j++;
        }
    }
    return result;
}
}
