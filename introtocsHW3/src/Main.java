public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 32, 12, 4, 8};
        System.out.println("Max value in array: " + findMax(arr)); // Max value in array: 32
    }
    public static int findMax(int[] arr){
        int max = findMax(arr, arr.length-1, arr[arr.length-1]);
        return max;
    }
    private static int findMax(int[] arr,int x,int Max){
        if(x == 0){
            return Max;

        }
        if(arr[x] > Max){
            Max = arr[x];
            return findMax(arr,x-1,Max);
        }
        return findMax(arr,x-1,Max);


    }
}


