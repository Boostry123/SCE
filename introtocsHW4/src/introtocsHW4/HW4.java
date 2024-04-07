package introtocsHW4;

public class HW4 {
    /**
     * @param arr
     * @param c
     * @return
     */
    public static int interpolationSearch(char[] arr, char c){
        int counter = 0;
        int lowEnd = 0 ;
        int highEnd = arr.length -1;

        while ( c <= arr[lowEnd] && c >= arr[highEnd] && lowEnd <= highEnd){
            int probe = lowEnd + (highEnd - lowEnd) * (arr[lowEnd] - c) / (arr[lowEnd] - arr[highEnd]);

            if(highEnd == lowEnd){
                if(arr[lowEnd] == c){
                    return lowEnd;
                }else{
                    return -1;
                }
            }
            if(arr[probe] == c){
                System.out.println(" The amount of unsuccessful equalizations I've made is " + counter);
                return probe;

            }
            if(arr[probe] > c){
                counter++;
                lowEnd = probe+1;
            }else{
                counter++;
                highEnd = probe-1;
            }
        }
        return -1;
    }



    public static void main(String[] args) {

    // testing the interpolationSearch:
        char[] arr = {'z','m','Z','W','L','K','E','E','1'};
        System.out.println(" The index is " +interpolationSearch(arr, 'E'));
    }

}
