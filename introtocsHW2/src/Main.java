import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[][] matrix = {{1,2,3},
                             {4,5,6},
                             {7,8,9}};

        for( double[] x: transposeMatrix(matrix)){
            System.out.println(Arrays.toString(x));
        }

    }

/*
{{1,4},{2,5},{3,6}}

 */

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