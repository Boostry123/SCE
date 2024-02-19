import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[][] matrix = {{1,2,3},
                             {4,5,6}};

        for( double[] x: transposeMatrix(matrix)){
            System.out.println(Arrays.toString(x));
        }

    }



    public static double[][] transposeMatrix(double[][] matrix) {
        double[][] output = new double[matrix[0].length][matrix.length];




        return output;
    }



}