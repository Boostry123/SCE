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
        double[][] output = {
                {matrix[0][0],matrix[1][0]},
                {matrix[0][1],matrix[1][1]},
                {matrix[0][2],matrix[1][2]}
        };



        return output;
    }



}