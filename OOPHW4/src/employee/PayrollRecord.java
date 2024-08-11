package employee;

public record PayrollRecord(int ID,double salary,double bonus,double tax)
{
    public PayrollRecord (int ID,double salary,double bonus,double tax){
        this.ID = ID;
        this.salary = salary;
        this.bonus = bonus;
        this.tax = tax;
    }

    public String calcSalary(){
        return Double.toString(salary+bonus-tax);
    }
    @Override
    public String toString(){
        return ID + "\n" + "The calculated salary is : " + calcSalary();
    }
}
