package school;

public class VicePrincipal extends Administrator {
    VicePrincipal(String name, int age, double salary){
        super(name,age,salary);
    }

    @Override
    public void work(){
        System.out.println("The vice principal is working");
    }

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
