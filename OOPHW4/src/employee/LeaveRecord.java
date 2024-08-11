package employee;

public record LeaveRecord(int ID,int totalLeaves,int leaveTakes) {
    public LeaveRecord(int ID, int totalLeaves, int leaveTakes) {
        this.ID = ID;
        this.totalLeaves = totalLeaves;
        this.leaveTakes = leaveTakes;
    }

    public String calcLeaves(){
        return Integer.toString(totalLeaves - leaveTakes);
    }

    @Override
    public String toString() {
        return ID + "the total leaves remaining are : " + calcLeaves();
    }
}
