package school;

public abstract class Teacher extends Employee {
    protected final String subject;

    Teacher(String name,int age, double salary,String subject){
        super(age,name,salary);
        this.subject = subject;
    }
    public abstract void teach();
    public abstract void generateQuestion();

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
