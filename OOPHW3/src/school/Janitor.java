package school;

/**
 * Janitor class.
 */
public class Janitor extends SupportStaff{
    Janitor(String name,int age,double salary){
        super(name,age,salary);
    }

    /**
     * prints an action to the console.
     */
    @Override
    public void work() {
        System.out.println("The janitor is working");
    }

    /**
     * prints random required item list to the console.
     */
    @Override
    public void support() {
        String[] items = {"item #1","item #2","item #3","item #4","item #5","item #6","item #7","item #8","item #9","item #10"};
        for(int i = 0; i < items.length; i++){
            System.out.println(items[i] + ", amount :"+(int)(Math.random()*10));
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
