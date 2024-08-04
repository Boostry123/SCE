package school;

import java.util.Scanner;

/**
 * English teacher class
 */
public class EnglishTeacher extends Teacher {
    EnglishTeacher(String name, int age,double salary){
        super(name,age,salary,"English");
    }

    /**
     * completes the abstract Wrok function for parent class.
     */
    @Override
    public void work() {
        System.out.println("the english teacher is working.");
    }

    /**
     * prints something related to the class.
     */
    public void teach(){
        System.out.println("the english teacher is teaching english.");
    }

    /**
     * generates a question
     */
    @Override
    public void generateQuestion() {
        Scanner sc = new Scanner(System.in);
        String[] randomWords = {"cat", "dog", "tree", "book", "cup", "sun", "moon", "star", "car", "house"};
        String[] randomQuestion = {"Spell", "Define", "Use in a sentence", "Rhyme with", "Antonym of", "Synonym of"};
        int randomForWords = (int)(Math.random()*randomWords.length);
        int randomForQuestions = (int)(Math.random()*randomQuestion.length);
        System.out.println( randomQuestion[randomForQuestions ==0? randomForQuestions : randomForQuestions-1]+ " "+randomWords[randomForWords ==0? randomForWords : randomForWords-1]);
        String userChoice = sc.nextLine();
        System.out.println(userChoice);

    }


    @Override
    public String toString() {
        return "EnglishTeacher{" +
                "subject='" + subject + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
