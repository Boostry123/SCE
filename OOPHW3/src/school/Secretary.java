package school;

public class Secretary extends SupportStaff{
    /**
     * constructor for the secretary class.
     * @param name
     * @param age
     * @param salary
     */
    public Secretary(String name,int age,double salary) {
        super(name,age,salary);
    }

    /**
     * prints an action to the console.
     */
    @Override
    public void work() {
        System.out.println("the secretary is working");
    }

    /**
     * prints random generated student list with grades.
     */
    @Override
    public void support() {
        String[] studentNames = new String[30];
        for(int i = 1; i <= studentNames.length; i++){
            studentNames[i-1] = "student #"+ String.valueOf(i);
            System.out.println(studentNames[i-1] + ", grade:" + (int)(Math.random()*100));
        }

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
