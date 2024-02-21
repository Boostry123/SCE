import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] matrix = {1, 2, 3};

        System.out.println(Arrays.toString(addNumberToArray(matrix,2)));


    }

    public static double[] addNumberToArray(double[] arr, double number) {
        double[] result = new double[arr.length];


        for(int j = 0 ; j < arr.length; j ++){
            result[j]= (arr[j])+number;
        }


        return result;
    }



    public static boolean isMatrixSymmetric(double[][] matrix) {
        boolean output = true;

        double[][] transposedMatrix = transposeMatrix(matrix);
        if(matrix.length == transposedMatrix.length){
            for(int i = 0 ; i < matrix.length; i++){
                if(output == false) {
                    break;
                }
                for(int j = 0 ; j < matrix.length; j ++){
                    output = (matrix[i][j] == transposedMatrix[i][j]) ? true : false;
                    if(output == false){
                        break;
                    }

                }


            }
        }



        return output;
    }

    public static double[][] transposeMatrix(double[][] matrix) {
        double[][] output = new double[matrix[0].length][matrix.length];

        for(int i = 0; i < matrix[0].length; i++){
            for(int j = 0 ; j < matrix.length; j++){
                output[i][j] = matrix[j][i];
            }
        }


        return output;
    }


}