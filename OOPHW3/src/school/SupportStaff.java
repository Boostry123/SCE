package school;

public abstract class SupportStaff extends Employee {
    SupportStaff(String name,int age,double salary){
        super(age, name, salary);
    }
    public abstract void support();

    @Override
    public String toString() {
        return "SupportStaff{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}