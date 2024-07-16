import queue.ArrayQueue;

public class Main {
    public static void main(String[] args) {
        ArrayQueue testArray = new ArrayQueue();


        for(int i = 0; i < 20 ; i++){
            System.out.println(testArray.enqueue(5));
        }
        System.out.println(testArray.size());
    }
}