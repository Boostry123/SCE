package school;

public class Principal extends Administrator{
    Principal(String name,int age,double salary){
        super(name,age,salary);
    }

    /**
     * prints an action to the console.
     */
    @Override
    public void manage() {
        System.out.println("The principal is working. ");
    }

    /**
     * prints an action to the console.
     */
    public void work(){
        System.out.println("The principal is managing the school.");
    }

    @Override
    public String toString() {
        return "Principal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
