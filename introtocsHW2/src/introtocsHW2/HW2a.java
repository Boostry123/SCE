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
 * @author Alon Kaya
 */
public class HW2a {
    /**
     * Compute the dot product of two arrays.
     *
     * @param arr1 The first array.
     * @param arr2 The second array.
     * @return The dot product of arr1 and arr2.
     */
    ///Code Completed ☺
    public static double dotProduct(double[] arr1, double[] arr2) {
        double output = 0;
        for( int i = 0; i < arr1.length; i++ ){
            output += arr1[i] * arr2[i];

        }

        return output;
    }


    /**
     * Additional function: Transpose a matrix.
     *
     * @param matrix The input matrix as a 2D array.
     * @return The transposed matrix.
     */
    ///Code Completed ☺
    public static double[][] transposeMatrix(double[][] matrix) {
        double[][] output = new double[matrix[0].length][matrix.length];

        for(int i = 0; i < matrix[0].length; i++){
            for(int j = 0 ; j < matrix.length; j++){
                output[i][j] = matrix[j][i];
            }
        }


        return output;
    }


    /**
     * Additional function: Check if a matrix is symmetric.
     *
     * @param matrix The input matrix as a 2D array.
     * @return True if the matrix is symmetric, false otherwise.
     */
    public static boolean isMatrixSymmetric(double[][] matrix) {
        boolean output = false;
        ///////Insert your code below this line. //////////////
        /*
        Check if a matrix is symmetric.
        A matrix is symmetric if it is equal to its transpose.

        Example:
        symmetricMatrix = {{1, 2, 3},
                           {2, 4, 5},
                           {3, 5, 6}}
        isMatrixSymmetric(symmetricMatrix) should return true
        */

        /////////All student code should be above this line.////////////////
        return output;
    }

    /**
     * Additional function: Multiply a matrix by a scalar.
     *
     * @param matrix The input matrix as a 2D array.
     * @param scalar The scalar to multiply the matrix by.
     * @return The resulting matrix after scalar multiplication.
     */
    public static double[][] scalarMultiplyMatrix(double[][] matrix, int scalar) {
        double[][] output = new double[matrix.length][matrix[0].length];
        ///////Insert your code below this line. //////////////
        /*
        Multiply a matrix by a scalar.
        Each element of the matrix is multiplied by the scalar.

        Example:
        originalMatrix = {{1, 2}, {3, 4}}
        scalarMultiplyMatrix(originalMatrix, 2) should return {{2, 4}, {6, 8}}
        */

        /////////All student code should be above this line.////////////////
        return output;
    }


    /**
     * Add a number to all values in an array.
     *
     * @param arr    The input array of doubles.
     * @param number The number to be added to all values in the array.
     * @return A new array where the number has been added to each element.
     */
    public static double[] addNumberToArray(double[] arr, double number) {
        double[] result = new double[arr.length];
        ///////Insert your code below this line. //////////////
    /*
    Add a number to all values in an array.

    Example:
    arr = {1.5, 2.5, 3.5}
    number = 2.0
    addNumberToArray(arr, number) should return a new array {3.5, 4.5, 5.5}
    */

        /////////All student code should be above this line.////////////////
        return result;
    }


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

        // Test dotProduct
        double[] dotArr1 = {1, 2, 3};
        double[] dotArr2 = {4, 5, 6};
        System.out.println(Math.abs(dotProduct(dotArr1, dotArr2) - 32) < 0.000001);


        // Test transposeMatrix
        double[][] transMatrix = {{1, 2, 3}, {4, 5, 6}};
        double[][] resultTransMatrix = transposeMatrix(transMatrix);
        double[][] expected1 = {{1, 4}, {2, 5}, {3, 6}};
        System.out.println(EqualMatrices(resultTransMatrix, expected1));


        // Test isMatrixSymmetric
        double[][] symmetricMatrix = {{1, 2, 3}, {2, 4, 5}, {3, 5, 6}};
        System.out.println(isMatrixSymmetric(symmetricMatrix));

        // Test scalarMultiplyMatrix
        double[][] originalMatrix = {{1, 2}, {3, 4}};
        double[][] scalarMultipliedMatrix = scalarMultiplyMatrix(originalMatrix, 2);
        double[][] expected2 = {{2, 4}, {6, 8}};
        System.out.println(EqualMatrices(scalarMultipliedMatrix, expected2));


        // Test addNumberToArray
        double[] arrToAdd = {1.5, 2.5, 3.5};
        double numberToAdd = 2.0;
        double[] resultArray = addNumberToArray(arrToAdd, numberToAdd);
        double[] expected3 = {3.5, 4.5, 5.5};
        System.out.println(Arrays.equals(resultArray, expected3));


    }
}






