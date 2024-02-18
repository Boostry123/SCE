/*
 * Be sure to submit your work in a folder called introtocsHW1
 * 
 * Some words about submission:
 * Code that does not compile will receive a grade of 0.
 * Code must rigorously follow style guidelines. (15 points)
 *     Much of this has been done for you.  
 * https://www.oracle.com/java/technologies/javase/codeconventions-contents.html
 *
 * Code must work without bugs exactly as described in the API and assignment
 * instructions(50 points).
 * 
 * We use software to detect cheating.  
 * Copying from anywhere, online or otherwise, using chat GPT or similar 
 * software, or in any way collaborating with another student is cheating and 
 * will earn the student a grade of 0.
 * 
 * Questions regarding this assignment should be addressed to Dr. Neimand,
 * dovne@sce.ac.il
 */
package introtocsHW1;

//import static introtocsHW1.PartialSolution.ballInBox;

/**
 * This class includes a sampling of functions that every intro to CS student
 * should know how to implement.
 *
 * @author Yanir Latyshev , ID: 207325093
 */
public class HW1 {

    /**
     * The average of two numbers
     *
     * @param a The first number
     * @param b The second number
     * @return The average of a and b
     */

    /// Code Completed ☺
    public static double average(int a, int b) {
        double average;
        average = (double)(a+b)/2;

        return average;
    }


    /**
     * Converts miles to kilometers
     *
     * @param miles The number of miles
     * @return The conversion to kilometers
     */
    /// Code Completed ☺
    public static double milesToKilometer(double miles) {
        double kilometers;

        kilometers = miles* 1.60935;

        return kilometers;
    }

    /**
     * The absolute value of a number.
     *
     * @param x The number for which the absolute value is desired.
     * @return The absolute value of x.
     */
    /// Code Completed ☺
    public static double abs(double x) {
        double abs;

        abs = (x < 0) ? -x : x;

        return abs;
    }

    /**
     * Are the two values nearly equal to one another?
     *
     * @param x The first value.
     * @param y The second value.
     * @param error The margin of error allowed for numerical errors.
     * @return True if they are equal, false otherwise.
     */

    /// Code Completed ☺ (Note it is not accurate when margin is less than 0.4)
    public static boolean equals(double x, double y, double error) {

        boolean areEqual;

        double margin = Math.abs(error);


        areEqual = margin<=error ?  true : false;

        return areEqual;
    }

    /**
     * Determines weather or not an integer is prime.
     *
     * @param n The integer in question.
     * @return If n is prime then true, otherwise false.
     */

    ///Code Completed ☺
    public static boolean isPrime(int n) {

        boolean isPrime = true;

        if (n > 1){
            for (int i =2 ; i< 10 ; i++){
                if( i != n){
                    isPrime = (n%i == 0) ? false: true;
                }
            }
        }

        return isPrime;
    }

    /**
     * Gets the digit of the desired index in a number. For example, if num =
     * 5762, and ind = 2 then this method will return 7. If ind = 0, then this
     * method will return 2.
     *
     * @param num The number from which a digit is to be taken.
     * @param ind The index of the desired digit.
     * @return The digit in number num at index ind.
     */

    ///Code Completed ☺
    public static int digit(int num, int ind) {

        int digit = 0;

        if (ind > 0){
            for (int i = 0; i<ind; i++){
                num = num/10;
            }
        }
        digit = num%10;

        return digit;
    }

    /**
     * Finds the requested digit of a number in binary notation.
     *
     * @param num The number the digit is taken from.
     * @param ind the index of the desired digit.
     * @return the digit, true for 1, false for 0, and the given index.
     */

    ///Code Completed ☺
    public static boolean binaryDigit(int num, int ind) {
        boolean digit = false;
        int binary[] = new int[32];


        for(int i = 0 ; num >= 1; i++){
            if(num%2 != 0){
                binary[i] = 1;

            }else{
                binary[i] = 0;
            }
            num /= 2;
        }
        if(binary[ind] == 1){
            digit = true;
        }



        return digit;
    }

    /**
     * This method swaps the values of a and b, returning an array where the
     * first value is b and the second value is a.
     *
     * @param a The first value.
     * @param b The second value.
     * @return And array of {b, a}.
     */
    public static char[] swap(char a, char b) {
        char temp = a;
        a = b;
        b = temp;

        return new char[]{a, b};
    }

    /**
     * There are two locations, the pond, and the tree. There is a duck that
     * likes to walk from one, to the other, in either direction. At the end of
     * each walk, the duck is at the other location, whichever one the duck did
     * not start the walk at. If the duck goes for one walk, and starts at the
     * pond, then the duck finishes at the the tree. If the duck goes for two
     * walks, and starts at the tree, then the first walk takes the duck to the
     * pond, and the second walk takes the duck back to the tree.
     *
     * @param numWalks The total number of walks the duck takes. This should be
     * nonNegative.
     * @param startsAtPond True if the duck starts at the pond, and false if the
     * duck starts at the tree.
     * @return True if the duck finishes at the pond and false if the duck
     * finishes at the tree.
     */
    ///Code Completed ☺
    public static boolean duckWalk(int numWalks, boolean startsAtPond) {
        boolean atPond = startsAtPond;
        if(numWalks % 2 != 0 ){
            atPond = !(atPond);
        }
        return atPond;
    }

    /**
     * From binary representation to decimal
     *
     * @param binary The binary (base-2) representation of an integer
     * @return The decimal (base-10) representation of binary
     */
    ///Code Completed ☺ ( Note binary code has to end with 1 for example: 110)
    public static int binaryToDecimal(int binary) {
        int decimal =0;


        System.out.println(binary);

        for(int i = 0;binary > 0 ;i++){
            int tempBinary = binary%10;
            if(i < 1){
                if(tempBinary != 0){
                    decimal += 1;
                    binary /= 10;

                }else{
                    binary /= 10;
                }

            }else{

                if(tempBinary != 0){
                    int tempAddition = 1;
                    for(int j = 0; j<i ; j++){
                        tempAddition *= 2;
                    }
                    decimal += tempAddition;
                }

                binary /= 10;
            }
        }

        return decimal;
    }

    /**
     * From decimal (base-10) representation to binary (base-2) representation
     *
     * @param decimal The decimal (base-10) representation of an integer
     * @return The binary (base-2) representation of decimal
     */

    ///Code Completed ☺
    public static int decimalToBinary(int decimal) {
        int binary = 0;
        int mul =1;
        int digit;



        while(decimal > 0){
            digit = decimal%2;
            binary += mul * digit;
            decimal = decimal /2;
            mul *= 10;
        }


        return binary;
    }

    /**
     * Multiply two complex numbers (In linear algebra you learned to multiply
     * complex numbers.) Suppose we have two complex numbers z1 = Re1 + Im1 * i
     * and z2 = Re2 + Im2 * i Denote their multiplication by z3 = z1 * z2, where
     * z3 = Re3 + Im3 * i
     *
     * @param Re1 Real part of first number
     * @param Im1 Imaginary part of first number
     * @param Re2 Real part of second number
     * @param Im2 Imaginary part of second number
     * @return Re3, Im3, the real and imaginary parts of z3
     */
    ///Code Completed ☺
    public static double[] multiplyComplexNumbers(double Re1, double Im1,
                                                  double Re2, double Im2) {
        double Re3, Im3;
        Re3 = Re1 * Re2 - Im1 * Im2;
        Im3 = Re1* Im2 + Re2 * Im1;




        return new double[]{Re3, Im3};
    }

    /**
     * In a cell colony, each cell splits in two with every generation. Each
     * cell dies after 5 generations. This method determines how many cells
     * there are in the colony after a given number of generations.
     *
     * @param numGenerations The number of generations that transpire. This
     * should be nonnegative.
     * @param initialNumberOfCells The number of cells in the colony. This
     * should be nonnegative.
     * @return The number of cells in the colony after numGenerations
     * generations.
     */
    ///Code Completed ☺
    public static int numCells(int numGenerations, int initialNumberOfCells) {
        int numCells = initialNumberOfCells;
        int firstNumber = initialNumberOfCells;
        int secondNumber = initialNumberOfCells;
        while(numGenerations > 1){

            numCells = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = numCells;


            numGenerations--;

        }


        return numCells;
    }

    /**
     * Finds the number of coprime pairs in an interval of integers.
     *
     * @param from The smallest number in the interval.
     * @param to The end of the interval, exclusive.
     * @return The number of coprime pairs in the interval.
     */
    ///Code Completed ☺
    private static int coPrime(int from, int to) {
        int numCoPrimes = 0;


        for( int i = from; i< to ; i++){
            for(int j = i; j < i+1 ; j++){
                int m = j+1;
                int n = j;
                int r = m%n;

                while (r != 0){
                    m = n ;
                    n = r;
                    r = m%n;
                }
                if (n == 1){
                    numCoPrimes++;
                }

            }

        }

        return numCoPrimes;
    }

    /**
     * A ball moves an increment in a box.
     *
     * @param xLoc The x-locations of the ball.
     * @param yLoc The y-location of the ball.
     * @param xVel The x velocity of the ball.
     * @param yVel The y-velocity of the ball.
     * @param rightWall The x value of the right wall.
     * @param cieling The y value of the top wall.
     * @param diameter The diameter of the ball.
     * @return The balls new location and velocity values [xLoc, yLoc, xVel,
     * yVel]
     */
    public static Ball ballInBox(
            double xLoc, double yLoc, double xVel,
            double yVel, final int rightWall,
            final int cieling, final double diameter) {

        double radius = diameter ;

            if(xLoc >= rightWall-radius  || xLoc <= radius){
                xVel *= -1;


            }

            if(yLoc >= cieling - radius || yLoc <= radius){
                yVel *= -1;

            }


            yLoc += yVel;
            xLoc += xVel;




        return new Ball(diameter, xLoc, yLoc, xVel, yVel);
    }

    /**
     * Finds pi using a sampling of points against the unit circle.
     *
     * @param gridWidth The square root of the number of test points.
     * @return An approximation of pi.
     */

    public static double pi(int gridWidth) {
         double pi = 0;
         int pointsInsideCircle = 0;
         double step = 2.0 / (gridWidth -1);

         for(int i = 0; i < gridWidth; i++){
             for(int j = 0 ;j < gridWidth ; j++){
                 double x = -1 *i ;
                 double y = -1 * j;

                 if(x*x + y*y <=1){
                     pointsInsideCircle++;
                 }
             }


         }
         int totalSquares = (gridWidth -1) * (gridWidth -1);
         pi = 4.0 * pointsInsideCircle/totalSquares;




        return pi;
    }

    /**
     * Some helpful tests that students are strongly encouraged to run before
     * submission. Graders will apply different tests, so be sure your code is
     * robust. You are encouraged to write your own additional testing.
     */
    public static void runTests() {
        System.out.println("average test 1: " + (average(5, 7) == 6)
                + "\naverage test 2: " + (average(1, 2) == 1.5));
        System.out.println(
                "milesToKilometers test 1: (should be 16.0935) answer is: "
                + milesToKilometer(10)
                + "\nmilesToKilometers test 2: (should be 5.632725) answer is: "
                + milesToKilometer(3.5));

        System.out.println("abs test 1: " + (abs(7) == 7) + "\nabs test 2: "
                + equals(abs(-0.4), 0.4, 1e-14));
        System.out.println("equal test 1: " + equals(3, 3.000001, 1e-2)
                + "\nequal test 2: " + !equals(3, 12, 1e-7));
        System.out.println("isPrime test 1: " + !isPrime(9)
                + "\nisPrime test 2: " + isPrime(5));
        System.out.println("getDigit test 1: " + (digit(5762, 2) == 7)
                + "\ngetDigit test 2: " + (digit(5762, 0) == 2));
        System.out.println("swap test: " + (swap('c', 'q')[0] == 'q'
                && swap('c', 'q')[1] == 'c'));
        System.out.println("duckWalk test 1: " + !duckWalk(1, true)
                + "\nduckWalk test 2: " + !duckWalk(2, false));

        System.out.println("binaryToDecimal test 1: " + (binaryToDecimal(101)
                == 5) + "\nbinaryToDecimal test 2: " + (binaryToDecimal(1010)
                == 10));
        System.out.println("decimalToBinary test 1: " + (decimalToBinary(5)
                == 101) + "\ndecimalToBinary test 2: " + (decimalToBinary(10)
                == 1010));
        System.out.println("multiplyComplexNumbers test 1: "
                + ((multiplyComplexNumbers(0, 1, 0, 1)[0] == -1)
                && (multiplyComplexNumbers(0, 1, 0, 1)[1] == 0)));

        System.out.println("numCells test 1: " + (numCells(3, 1) == 3)
                + "\nnumCells test 2: " + (numCells(6, 1) == 13));
        System.out.println("test for coPrime: " + coPrime(3,7));

        Ball ballInBox = ballInBox(4, 20, -10, -5, 600, 400, 30);
        System.out.println("ballInBox: " + (equals(ballInBox.loc.x, 10, 1e-13)
                && equals(ballInBox.vel.x, 10, 1e-13))
        );

        System.out.println("pi test: " + equals(pi(10_000), Math.PI, 1e-4));
    }

    /**
     * This should let you watch the ball bounce around the box using the code
     * you wrote. It's a great tool to test your code, and see how simple code
     * you write, can play a greater roll in a group project.
     */
    public static void watchBall() {

        final int diameter = 30, cieling = 400, rightWall = 600;

        Vec2d initLoc = new Vec2d(40, 50), initVel = new Vec2d(2, 1.5);
        
        new Graphic("Ball in Box", 
                new MovingPicture("ball.jpg", 
                        0, diameter,
                diameter, initLoc) {
             private Vec2d vel = initVel;
                    
            @Override
            public void update() {
                Ball ball = ballInBox(
                        loc.x, 
                        loc.y, 
                        vel.x, 
                        vel.y, 
                        rightWall, 
                        cieling, 
                        diameter);
                loc = ball.loc;
                vel = ball.vel;
            }
            
        });
        
    }

    public static void main(String[] args) {
        System.out.println(average(2,5));
        runTests();
        watchBall();
    }

}
