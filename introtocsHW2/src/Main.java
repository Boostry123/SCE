import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[][] matrix = {{1, 2, 3},
                            {2, 4, 5},
                            {3, 5, 6}};
        System.out.println(isMatrixSymmetric(matrix));


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