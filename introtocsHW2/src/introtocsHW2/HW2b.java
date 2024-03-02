/*
 * Be sure to submit your work in a folder called introtocsHW2
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
package introtocsHW2;
import java.util.Arrays;


/**
 * This class includes a set of functions building on strings, arrays, and 2D arrays
 * Important note: I remind you that good coding practice should avoid code redundancy, you should have nearly all methods at 5 lines or fewer.
 * If you need to write longer methods, you should break them up into multiple smaller methods.
 *
 * */
 //Assignment:2
 // @author Yanir latyshev | 207325093


public class HW2b {
    //YOU SHOULD WRITE YOUR CODE BELOW THIS LINE!
    // Code Completed ☺
    public static String arrayToString(int[] arr){
      String arrAsString = "";
      for( int x : arr){
          arrAsString += x;
      }

      return arrAsString;
    };



    public static double[][] multiplyMatrices(double[][] matrix1, double[][] matrix2) {

        double[][] arr = new double[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {         //iterates through the amount of 'rows' in matrix1
            for(int j = 0 ; j < matrix2[0].length; j++){                // iterates through the amount of 'columns' in matrix2
                for(int k = 0 ; k < matrix1[0].length; k++){
                    arr[i][j] += matrix1[i][k] * matrix2[k][j];

                }
            }


        }
        for( double[] x : arr){
            System.out.println(Arrays.toString(x));
        }
        return arr;
    }

    //Code Completed ☺
    public static double vectorMagnitude(double[] vector){
        double step1 = 0;
        double resault = 0;
        for( double x : vector){
            step1 += Math.pow(x,2);
        }
        resault = Math.sqrt(step1);
        return resault;
    }

    //This method has been added for the isVectorOrthogonal method.
    public static double dotProduct(double[] arr1, double[] arr2) {
        double output = 0;
        for( int i = 0; i < arr1.length; i++ ){
            output += arr1[i] * arr2[i];

        }

        return output;
    }

    //Code completed ☺
    public static boolean isVectorsOrthogonal (double[] vector1, double[] vector2){
        return (dotProduct(vector1 , vector2) == 0); //The method dotProduct is written just above this method.
    }

    public static boolean checkIfEven (double[] arr) {
        boolean result = false;
        for(double x : arr){
            result = x%2 == 0;
        }
        return result;
    }

    public static int countRowsWithEvenElements (double[][] arr){
        int counter = 0;

        for(int i = 0 ; i < arr.length; i++){
            counter += (checkIfEven(arr[i]) ? 1 : 0);
        }
        return counter;
    }

    //This method has been added from HW2a for the use in addNumberToMatrix method.
    public static double[] addNumberToArray(double[] arr, double number) {
        double[] result = new double[arr.length];


        for(int j = 0 ; j < arr.length; j ++){
            result[j]= (arr[j])+number;
        }


        return result;
    }

    public static double[][] addNumberToMatrix(double[][] matrix, double number){
        for(int i = 0; i<matrix.length; i++){
            matrix[i] = addNumberToArray(matrix[i], number);
        }
        return matrix;
    }

    public static String idBikoret(String id){
        int newId = Integer.parseInt(id);
        int resault = 0 , count = 0;

        for(int i = 0 ; i < 8 ; i++){
            if(String.valueOf(newId).length() % 2 == 1){
                resault += newId%10;
                newId /= 10;
            }else{
                int temp = (newId%10) *2;
                resault += temp%10;
                temp /= 10;
                resault += temp;
                newId /= 10;
            }


        }
        while(resault % 10 != 0) {
            resault += 1;
            count++;
        }

        return String.valueOf(id+ "-" + Integer.toString(count));
    }

    //Code completed ☺
    public static  int[] countCharacters(String id){
        int[] result = {0,0,0,0};
        char[] idNew = id.toCharArray();
        for(int i = 0 ; i < id.length() ; i++){
            char temp = idNew[i];
            if(Character.isDigit(temp)){
                result[0]++;
            }else if(Character.isLowerCase(temp)){
                result[1]++;
            }else if(Character.isUpperCase(temp)){
                result[2]++;
            }else{
                result[3]++;
            }
        }
        return result;
    }

    public static char[][] transposeMatrix(char[][] matrix) {
        char[][] output = new char[matrix[0].length][matrix.length];

        for(int i = 0; i < matrix[0].length; i++){
            for(int j = 0 ; j < matrix.length; j++){
                output[i][j] = matrix[j][i];
            }
        }


        return output;
    }

    //Code completed;
public static  int[] findString(char[][] charMat, String word){
        int[] result = {0,0,0};
        char[][] charMatTran = transposeMatrix(charMat);
        for(int i = 0 ; i < charMat.length ; i++){
            String tempWord = String.valueOf(charMat[i]);
            if(tempWord.contains(word) ){
                if(i >0){
                    result[0] = 0;
                    result[1]=i;
                    return result;
                }

            }
            String tempWordColumns = String.valueOf(charMatTran[i]);
            if(tempWordColumns.contains(word) ){
                result[0] = 1;
                if(i > 0){
                    result[0] = 1;
                    result[1] = i;
                    return result;
                }
            }else{
                result[0] = -1;
            }

        }
        return result;
}


    //YOU SHOULD WRITE YOUR CODE ABOVE THIS LINE!

    public static void printMatrix(double[][] matrix) {
        String output = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                output = output + matrix[i][j] + " ";
            }
        }
        System.out.println(output);
    }
    public static boolean EqualMatrices(double[][] matrix1, double[][] matrix2) {
        // Check if the dimensions of both matrices are the same
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            return false;
        }

        // Iterate through each element and compare
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if (Math.abs(matrix1[i][j] - matrix2[i][j]) > 0.000001) {
                    return false; // Found a pair of elements that are not equal
                }
            }
        }
        return true;
    }
    /**
     * Main method for testing the implemented functions.
     */
    public static void main(String[] args) {
        // Test arrayToString
        int[] arrToString = {1, 2, 3};
        System.out.println(arrayToString(arrToString).equals("123"));

        double[][] matrix1 = {{1, 2},
                             {3, 4}};
        double[][] matrix2 = {{5, 6},
                             {7, 8}};
        double[][] expected = {{19,22}, {43,50}};
        System.out.println(EqualMatrices(multiplyMatrices(matrix1, matrix2), expected));

        // Test vectorMagnitude
        double[] vectorMag = {3, 4};
        System.out.println(Math.abs(vectorMagnitude(vectorMag) - 5.0) < 0.000001);

        // Test isVectorOrthogonalToMatrix
        double[] orthogonalVector = {1, 2};
        double[] orthogonalMatrix = {2, -1};
        System.out.println(isVectorsOrthogonal(orthogonalVector, orthogonalMatrix));

        // Test countRowsWithEvenElements
        double[] arr = {2, 4, 6};
        System.out.println(checkIfEven(arr));

        // Test countRowsWithEvenElements
        double[][] evenElementMatrix = {{2, 4, 6}, {8, 10, 12}, {14, 16, 18}};
        System.out.println(Math.abs(countRowsWithEvenElements(evenElementMatrix) - 3) < 0.000001);


        // Test addNumberToMatrix
        double[][] matrixToAdd = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
        double numberToAddToMatrix = 2.0;

        double[][] resultMatrixAdd = addNumberToMatrix(matrixToAdd, numberToAddToMatrix);
        double[][] expected2 = {{3.0, 4.0, 5.0}, {6.0, 7.0, 8.0}};
        System.out.println(EqualMatrices(resultMatrixAdd, expected2));

        String id = "54370042";
        System.out.println(idBikoret(id).equals("54370042-1"));

        String id2 = "ABC12#777#xyD?EHz!555";
        int[] expected3 = {8,3,6,4};
        System.out.println(Arrays.equals(countCharacters(id2), expected3));

        char [][] charMat = {{'a','b','c','d'},{'e','f','g','h'},{'w','x','y','z'}};
        String word = "efg";
        int[] expected4 = {0,1,0};
        System.out.println(Arrays.equals(findString(charMat, word), expected4));
    }
}


