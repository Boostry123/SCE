package school;

import java.util.Objects;

public abstract class Employee {
    protected int age;
    protected String name;
    protected double salary;
    public Employee(int age, String name, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    /**
     * set for name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * set for salary
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * set for age
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * get age
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     * get name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * get salary
     * @return
     */
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    /**
     * checks if objects are equal according to type and fields
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name);
    }


    /**
     * an abstract function
     */
    public abstract void work();
}
