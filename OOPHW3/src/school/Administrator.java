package school;

public abstract class Administrator extends Employee {

    public Administrator(String name,int age,double salary){
        super(age, name, salary);
    }
    public abstract void manage();

    @Override
    public String toString() {
        return "Administrator{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
