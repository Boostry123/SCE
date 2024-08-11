package employee;

public record AttendanceRecord(int ID,int totalWorkingDays,int daysPresent) {
    public AttendanceRecord(int ID, int totalWorkingDays, int daysPresent) {
        this.ID = ID;
        this.totalWorkingDays = totalWorkingDays;
        this.daysPresent = daysPresent;
    }

    public String calcAttendance() {
        return Integer.toString((daysPresent*100)/totalWorkingDays);
    }

    @Override
    public String toString() {
        return "the persentage of attendance : " + calcAttendance() + "%";
    }
}
