package set;

import java.util.Arrays;

public class SetUtils <E> {


    public static <E> E[] union(E[] set1, E[] set2){
        E[] result = Arrays.copyOf(set1,(set1.length+set2.length));
        for(int i=0,j=0; i<result.length; i++){
            if(result[i]!=set2[j] && result[i]==null){
                result[i]=set2[j];
                j++;
            }
        }
        return result;
    }
    public static <E> E[] intersection(E[] set1, E[] set2) {
        E[] result = set1;

            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < set2.length; j++) {
                    if(result[i].equals(set2[j])){
                        break;
                    }
                    else if ((j == set2.length - 1 )) {
                        if((result[result.length-1] != set2[j])){
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
}
