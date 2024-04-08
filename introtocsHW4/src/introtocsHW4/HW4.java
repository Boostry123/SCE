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

    /**
     * @param arr
     * @return the number of swaps made
     */
    public static int insertionSort(int[] arr){
        int counter = 0;
        for ( int i = 1; i < arr.length; i ++){
            int value = arr[i];
            while (i > 0 && arr[i-1] < value){
                arr[i] = arr[i-1];
                counter++;
                i = i-1;
            }
            arr[i] = value;
        }
        return counter;
    }

    /**
     * @param arr
     * @return the amount of object swaps made
     */
    public static int bubbleSort(char[] arr){
        int counter = 0;
        int result = bubbleSort(arr,0,0,counter);
        return result;
    }

    /**
     * makes arr.length **2 iterations and swaps the array to be descending
     * @param arr
     * @param i
     * @param stopPoint
     * @param counter
     * @return the amount of swaps made
     */
    public static int bubbleSort(char[] arr, int i,int stopPoint,int counter){
        if(stopPoint== Math.pow(arr.length,2)){
            return counter;
        }
        if(i >= arr.length-1){
            i =0;
        }
        if(arr[i] > arr[i+1]){
            stopPoint++;
            counter++;
            char tmp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = tmp;
        }else{
            stopPoint++;
        }
        i++;
        return bubbleSort(arr,i,stopPoint,counter);
    }


    /**
     * @param arr
     *      * @param i
     *      * @param stopPoint
     *      * @param counter
     * @return the amount of swaps made
     */
    public static int bubbleSortReverse(int[] arr){
        int stopPoint = 0;
        int counter = 0;
        int i = 0;
        while(stopPoint != Math.pow(arr.length,2)){
            if(i >= arr.length-1){
                i =0;
            }
            if(arr[i+1] > arr[i]){
                stopPoint++;
                counter++;
                int tmp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = tmp;
            }else{
                stopPoint++;
            }
            i++;

        }
        return counter;

    }








    public static void main(String[] args) {

    // testing the interpolationSearch:
        char[] arr = {'z','m','Z','W','L','K','E','E','1'};
        System.out.println("Q1: "+"The index is " +interpolationSearch(arr, 'E'));
    // testing the insertionSort:
        int[] arr2 = {24 ,10 ,15 ,25 ,13 ,7 ,19 ,4 ,21};
        System.out.println("Q2: "+ insertionSort(arr2));
    // testing the bubbleSort:
        char[] arr3 =  { 'Y', 'K', 'P', 'Z', 'N', 'H', 'T', 'E', 'V'};
        System.out.println("Q3: "+ bubbleSort(arr3));
    // testing the bubbleSortReverse:
        int[] arr4 = {24 ,10 ,15 ,25 ,13 ,7 ,19 ,4 ,21};
        System.out.println(bubbleSortReverse(arr4));
    }



}
