/*
 * Be sure to submit your work in a folder called introtocsHW3
 *
 * Some words about submission:
 * Code that does not compile will receive a grade of 0.
 * Code must rigorously follow style guidelines. (15 points)
 * Code must work without bugs exactly as described in the API and assignment instructions(50 points).
 *
 * We use software to detect cheating.
 * Copying from anywhere, online or otherwise, using chat GPT or similar
 * software, or in any way collaborating with another student is cheating and
 * will earn the student a grade of 0.
 *
 * Questions regarding this assignment should be addressed in the moodle forum.
 * Questions about this assignment sent in mail would not be responded
 *
 */
package introtocsHW3;

import java.util.Arrays;
/**
 * This class includes a set of Search Algorithms functions
 * Important note: I remind you that good coding practice should avoid code redundancy, you should have nearly all methods at 5-10 lines or fewer.
 * If you need to write longer methods, you should break them up into multiple smaller methods.
 *
 * @author Yael Veksler
 */
//Assignment : 3 b
// Author : Yanir Latychev ID:207325093

public class HW3b {
    public static int findCarOwner(int[] carNumbers, String[] owners){
        for(int i = 0; i < owners.length-1; i++){
            owners[i] = owners[i].toLowerCase();
        }


        for(int i = 0 ;i < owners.length-1; i++){
            int counter = 0;
            for(int j = 0 ; j < owners[i].length()-1; j++){

                for(int k = j+1 ; k < owners[j].length()-1; k++){
                    char tempChar = owners[i].charAt(j);
                    if(tempChar == owners[i].charAt(k)){
                        counter++;
                    }
                }
                if(counter < 1){
                    return carNumbers[i];
                }


            }
        }
        return -1;
    }

    public static String findSubstring(String str){
        String maxSubstring = "";
        int maxLength = 0;

        String currentSubstring = "";
        int currentLength = 0;
        if(str!=null){
            currentSubstring += str.charAt(0);
            currentLength++;
        }

        for(int i = 1; i < str.length() ; i++){
            if((str.charAt(i) - currentSubstring.charAt(currentSubstring.length()-1) == 1) || (currentSubstring.charAt(currentSubstring.length()-1) == '9' && str.charAt(i)=='0')){

                currentSubstring += str.charAt(i);
                currentLength++;
            }else{
                if(currentLength > maxLength){
                    maxSubstring = currentSubstring;
                    maxLength = currentLength;
                }
                currentLength=1;
                currentSubstring=""+str.charAt(i);
            }
        }
        if(currentLength> maxLength){
            maxSubstring = currentSubstring;
        }
        return maxSubstring;
    }

    /**
     * @param arr
     * @param k
     * @param step
     * @return
     */
    public static int jumpSearch(int[] arr, int k, int step){
        int low = 0;
        int high = arr.length;
        return jumpSearch(arr, k ,step, low, high);
    }

    /**
     * @param arr
     * @param k
     * @param step
     * @param low
     * @param high
     * @return
     */
    public static int jumpSearch(int[] arr, int k, int step,int low, int high){
        if(arr[low] == k){
            return low;
        }else if(arr[low] < k) {
            low += step;
        }
        else if(arr[low] >= k){
            high=low;
            low=low-step;
            for(int i = low, j = 0 ; i < high-1; i++,j++){
                if(arr[i] >= k){
                    return low+j;
                }
            }
        }
        return jumpSearch(arr, k, step,low, high);
    }

    public static int ternarySearch(int[] arr, int num){
        int step = arr.length / 3;
        if(arr[step] >= num){
            for(int i = 0; i < step-1; i++){
                if(arr[i] == num){
                    return i;
                }else{
                    return -1;
                }
            }
        }else if(arr[step*2-1] >= num){
            for(int i = step; i < step*2-1; i++){
                if(arr[i] == num){
                    return i;
                }else{
                    return -1;
                }
            }
        }else{
            for(int i = step*2; i < arr.length-1; i++){
                if(arr[i] == num){
                    return i;
                }
            }
        }
        return -1;
    }
    ///////Insert your code here. //////////////

    /**
     * OOPex1.src.Main method for testing the implemented functions.
     */
    public static void main(String[] args) {
        System.out.println("---------------Q1---------------------");
        // Sample car numbers and owners data
        int[] carNumbers = {12345, 65432, 21897, 90876, 76408};
        String[] owners = {"adar", "Erez", "Omer", "sapir", "tamar"};

        // Test the findCarOwner function
        int carNumber = findCarOwner(carNumbers, owners);

        // Display the result
        if (carNumber != -1) {
            System.out.println("Car number of the first owner with a valid name: " + carNumber);
        } else {
            System.out.println("No valid owner name found.");
        } //Output: 21897

        System.out.println("---------------Q2---------------------");
        System.out.println(findSubstring("125637891")); // Output: 789
        System.out.println(findSubstring("123567890127891")); // Output: 56789012
        System.out.println(findSubstring("34512348901234")); // Output: 8901234

        System.out.println("---------------Q3---------------------");
        int[] arr1 = {-15, -5, -2, 1, 3, 7, 15, 48, 97};
        int[] arr2 = {-15, -5, 3, 7, 15, 97, 100};
        int k1 = 15, k2 = 12;
        int stepSize = 3;

        System.out.println("Amount of elements smaller than 15: " + jumpSearch(arr1, k1, stepSize)); // Output: 6
        System.out.println("Amount of elements smaller than 12: " + jumpSearch(arr2, k2, stepSize)); // Output: 4

        System.out.println("---------------Q4---------------------");
        int[] arr3 = {-15, -5, -2, 1, 3, 7, 15, 48, 97};
        int[] arr4 = {-15, -5, 3, 7, 15, 97};
        int num1 = 15;
        int num2 = 12;

        System.out.println(ternarySearch(arr3, num1)); // Output: 6
        System.out.println(ternarySearch(arr4, num2)); // Output: -1

        System.out.println("---------------Q5---------------------");
        char[] arr5 = {'z', 'm', 'Z', 'W', 'L', 'K', 'E', 'E', '1'};
        char[] arr6 = {'w', 'w', 't', 't', 'p', 'm', 'l', 'k', 'X', 'H', '@', '8', '+'};
        char c1 = 'E';
        char c2 = 'h';

        //System.out.println(interpolationSearch(arr5, c1)); // Output: The amount of unsuccessful equalizations I've made is 6
        // 6
        //System.out.println(interpolationSearch(arr6, c2)); // Output: -1

    }
}
