package introtocsHW4;
import java.util.Arrays;
import java.util.Scanner;

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


    /**
     * @param array
     * @param a
     * @param b
     * @return returns an array with swaped variables.
     */
    /// Functions used for Question 6 (Game):
    public static int[] swap (int[] array,int a,int b){
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
        return array;
    }

public static boolean isValidMove (int[] array, int a,int b){
        boolean state = true;
        if(a<0 || b>array.length-1 || a != b-1){
            state = false;
        }
        return state;
}

public static boolean isSorted (int[] array){

        for(int i = 0, j = 1; i< array.length-1 ; i++,j++){
                if(array[i] < array[j]){
                    return false;
            }
        }
        return true;
}
private static int[] makeArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr.length == 5){
                int rnd = (int)(Math.random()*10);
                arr[i] = rnd;
            }else if(arr.length == 6){
                int rnd = (int)(Math.random()*10+5);
                arr[i] = rnd;
            }else{
                int rnd = (int)(Math.random()*10+10);
                arr[i] = rnd;
            }

        }
        return arr;
}

public static int[] getNumbersForDifficulty (int a){
        int[]inValid = null;
        switch (a){
            case(1): int[] arr1 = new int[5];
            arr1 = makeArray(arr1);
            return arr1;

            case(2): int[] arr2 = new int[6];
            arr2 = makeArray(arr2);
            return arr2;

            case(3): int[] arr3 = new int[7];
            arr3 = makeArray(arr3);
            return arr3;

        }
        return inValid;

}

public static int selectDifficulty (){
        int num = 0;
    Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.println("Select Difficulty:");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");
        System.out.println("Enter your Choice: ");
        num = scanner.nextInt();
        if(num == 1 || num == 2 || num == 3){
            break;
        }
    }


    return num;
}

public static int getMoves (int[] arr){
        int insertionSort = insertionSort(Arrays.copyOf(arr,arr.length));
        int bubbleSortReverse = bubbleSortReverse(Arrays.copyOf(arr,arr.length));
        return (insertionSort * bubbleSortReverse) / 2;

}
private static void displayArray ( int[] arr){
        int counter = 0;
        for(int i : arr){
            System.out.println(counter + ": " + i);
            counter++;
        }
}

public static void playSortingChallenge (){
    System.out.println("Welcome to Number Sorting Challenge!");
    int difficulty = selectDifficulty();

    int[] arr = getNumbersForDifficulty(difficulty);
    int moves = getMoves(arr);
    while(isSorted(arr) || moves < 5){
        arr = getNumbersForDifficulty(difficulty);
        moves = getMoves(arr);


    }


    while(moves > 0){
        if(isSorted(arr)){
            displayArray(arr);
            break;
        }
        Scanner scanner = new Scanner(System.in);
        displayArray(arr);
        System.out.println("Moves left : " + moves);
        System.out.println("Choose index a: ");
        int numA = scanner.nextInt();
        System.out.println("Choose index b: ");
        int numB = scanner.nextInt();

        if(isValidMove(arr,numA,numB)){
            arr = swap(arr,numA,numB);
            moves--;
        }

    }
    if(isSorted(arr)){

        System.out.println("Congratulations! You sorted the numbers in descending order!");
    }else{
        System.out.println("Out of moves! Game over.");
    }
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
        System.out.println("Q4: " +bubbleSortReverse(arr4));
        playSortingChallenge();
    }



}
