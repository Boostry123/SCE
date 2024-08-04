package school;

public class VicePrincipal extends Administrator {
    /**
     * constructor of the VicePrincipal .
     * @param name
     * @param age
     * @param salary
     */
    VicePrincipal(String name, int age, double salary){
        super(name,age,salary);
    }

    /**
     * prints an action to the colnsole.
     */
    @Override
    public void work(){
        System.out.println("The vice principal is working");
    }

    /**
     * prints an action to the console.
     */
    @Override
    public void manage() {
        System.out.println("The vice principal is assisting the principal.");
    }

    @Override
    public String toString() {
        return "VicePrinciple{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
