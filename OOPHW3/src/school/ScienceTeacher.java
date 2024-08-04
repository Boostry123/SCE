package school;

import java.util.Scanner;

/**
 * class that creates the Science teacher object.
 */
public class ScienceTeacher extends Teacher{
    public ScienceTeacher(String name, int age , double salary) {
        super(name,age,salary,"Science");
    }

    /**
     * generates a random question the teacher might ask , gives the user an option to answer with feedback.
     */
    @Override
    public void generateQuestion() {
        double randomMass = Math.random()*100;
        double randomAcceleration = Math.random()*10;
        double Force = randomMass * randomAcceleration;
        Scanner sc = new Scanner(System.in);
        System.out.println("what is the Force if the mass is: "+randomMass + "and the Acceleration is: " + randomAcceleration + "?");
        double userChoice = sc.nextDouble();
        if(userChoice == Force){
            System.out.println("Congrats you are correct");
        }else{
            System.out.println("You are not correct the answer is: " + Force);
        }

    }

    /**
     * prints an action to the console.
     */
    @Override
    public void teach(){
        System.out.println("The science teacher is teaching science." );
    }

    /**
     * prints an action to the console.
     */
    @Override
    public void work(){
        System.out.println("The science teacher is working. ");
    }

    @Override
    public String toString() {
        return "ScienceTeacher{" +
                "subject='" + subject + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
