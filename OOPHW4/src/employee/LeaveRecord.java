//Assignment : 4
//Author : Yanir latyshev
package employee;

/**
 * Creating a record for the leaves, with a calcLeaves method
 * @param ID
 * @param totalLeaves
 * @param leaveTakes
 */
public record LeaveRecord(int ID,int totalLeaves,int leaveTakes) {
    public LeaveRecord(int ID, int totalLeaves, int leaveTakes) {
        this.ID = ID;
        this.totalLeaves = totalLeaves;
        this.leaveTakes = leaveTakes;
    }

    /**
     * calculates the percentage of leaves for the employee.
     * @return String
     */
    public String calcLeaves(){
        return Integer.toString(totalLeaves - leaveTakes);
    }

    @Override
    public String toString() {
        return ID + "the total leaves remaining are : " + calcLeaves();
    }
}
