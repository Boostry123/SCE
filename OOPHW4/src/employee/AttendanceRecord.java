//Assignment : 4
//Author : Yanir latyshev
package employee;

/**
 * @param ID
 * @param totalWorkingDays
 * @param daysPresent
 */
public record AttendanceRecord(int ID,int totalWorkingDays,int daysPresent) {
    public AttendanceRecord(int ID, int totalWorkingDays, int daysPresent) {
        this.ID = ID;
        this.totalWorkingDays = totalWorkingDays;
        this.daysPresent = daysPresent;
    }

    /**
     * Calcultes the percentage of the employee attendance.
     * @return String
     */
    public String calcAttendance() {
        return Integer.toString((daysPresent*100)/totalWorkingDays);
    }

    /**
     * toString
     * @return String
     */
    @Override
    public String toString() {
        return "the persentage of attendance : " + calcAttendance() + "%";
    }
}
