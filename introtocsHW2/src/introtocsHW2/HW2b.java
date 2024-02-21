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
 * @author Yanir latyshev | 207325093
 */

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

    //Not yet Completed
    public static double[][] multiplyMatrices(double[][] matrix1, double[][] matrix2) {
        double[][] arr = new double[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix2[0].length; i++) {         //iterates through the amount of 'columns' in matrix2
            for (int j = 0; j < matrix1.length; j++) {        //iterates through the amount of 'rows' in matrix1
                for (int k = 0; k < matrix1.length; k++) { // iterates through the amount of 'rows' in matrix1
                    arr[i][j] += matrix1[j][k] * matrix2[k][j];
                }
            }

        }
        for( double[] x : arr){
            System.out.println(Arrays.toString(x));
        }
        return arr;
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
//        System.out.println(Math.abs(vectorMagnitude(vectorMag) - 5.0) < 0.000001);

        // Test isVectorOrthogonalToMatrix
        double[] orthogonalVector = {1, 2};
        double[] orthogonalMatrix = {2, -1};
//        System.out.println(isVectorsOrthogonal(orthogonalVector, orthogonalMatrix));

        // Test countRowsWithEvenElements
        double[] arr = {2, 4, 6};
//        System.out.println(checkIfEven(arr));

        // Test countRowsWithEvenElements
        double[][] evenElementMatrix = {{2, 4, 6}, {8, 10, 12}, {14, 16, 18}};
//        System.out.println(Math.abs(countRowsWithEvenElements(evenElementMatrix) - 3) < 0.000001);


        // Test addNumberToMatrix
        double[][] matrixToAdd = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
        double numberToAddToMatrix = 2.0;
//        double[][] resultMatrixAdd = addNumberToMatrix(matrixToAdd, numberToAddToMatrix);
        double[][] expected2 = {{3.0, 4.0, 5.0}, {6.0, 7.0, 8.0}};
//        System.out.println(EqualMatrices(resultMatrixAdd, expected2));

        String id = "54370042";
//        System.out.println(idBikoret(id).equals("54370042-1"));

        String id2 = "ABC12#777#xyD?EHz!555";
        int[] expected3 = {8,3,6,4};
//        System.out.println(Arrays.equals(countCharacters(id2), expected3));

        char [][] charMat = {{'a','b','c','d'},{'e','f','g','h'},{'w','x','y','z'}};
        String word = "efg";
        int[] expected4 = {0,1,0};
//        System.out.println(Arrays.equals(findString(charMat, word), expected4));
    }
}


