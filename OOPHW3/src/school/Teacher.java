package school;

public abstract class Teacher extends Employee {
    protected final String subject;

    /**
     * Constructor for the Teacher class.
     * @param name
     * @param age
     * @param salary
     * @param subject
     */
    Teacher(String name,int age, double salary,String subject){
        super(age,name,salary);
        this.subject = subject;
    }

    /**
     * abstract function of Teach() for the child to do.
     */
    public abstract void teach();

    /**
     * abstract function for the child.
     */
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
