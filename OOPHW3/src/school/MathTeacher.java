package school;

import java.util.Scanner;

public class MathTeacher extends Teacher{
    MathTeacher(String name,int age,double salary){
        super(name,age,salary,"Mathematics");
    }

    /**
     * prints an action to the console.
     */
    @Override
    public void work() {
        System.out.println("The math teacher is working");
    }

    /**
     * prints an action to the console.
     */
    @Override
    public void teach(){
        System.out.println("The math teacher is teaching");
    }

    /**
     * generates a question that this class might ask.
     * give the user an option to answer the question with feedback.
     */
    @Override
    public void generateQuestion() {
        int num1 = (int) Math.random()*10;
        int num2 = (int) Math.random()*10;
        Scanner sc = new Scanner(System.in);
        System.out.println("calculate :" + num1 + " + " + num2);
        int userChoice = sc.nextInt();
        if(userChoice == num1*num2){
            System.out.println("you are correct!");
        }else{
            System.out.println("you are not correct! the answer is:" + num1*num2);
        }
    }

    @Override
    public String toString() {
        return "MathTeacher{" +
                "subject='" + subject + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
