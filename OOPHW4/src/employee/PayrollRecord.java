//Assignment : 4
//Author : Yanir latyshev
package employee;

/**
 * @param ID
 * @param salary
 * @param bonus
 * @param tax
 */
public record PayrollRecord(int ID,double salary,double bonus,double tax)
{
    public PayrollRecord (int ID,double salary,double bonus,double tax){
        this.ID = ID;
        this.salary = salary;
        this.bonus = bonus;
        this.tax = tax;
    }

    /**
     * calculate sthe total salary of employee after taxes.
     * @return String
     */
    public String calcSalary(){
        return Double.toString(salary+bonus-tax);
    }

    /**
     * @return String
     */
    @Override
    public String toString(){
        return ID + "\n" + "The calculated salary is : " + calcSalary();
    }
}
