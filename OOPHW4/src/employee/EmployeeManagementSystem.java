package employee;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        LeaveRecord leave1 = new LeaveRecord(111111,2,1);
        LeaveRecord leave2 = new LeaveRecord(222222,3,1);
        PayrollRecord pay1 = new PayrollRecord(333333,20000,1000,150);
        PayrollRecord pay2 = new PayrollRecord(444444,10000,1000,150);
        EmployeeRecord employee1 = new EmployeeRecord(555555,"Bob",29,"IT","IT");
        EmployeeRecord employee2 = new EmployeeRecord(666666,"Bob",29,"IT","IT");
        AttendanceRecord atten1 = new AttendanceRecord(777777,28,24);
        AttendanceRecord atten2 = new AttendanceRecord(888888,28,23);
        System.out.println(leave1.toString());
        System.out.println(leave2.toString());
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(atten1.toString());
        System.out.println(atten2.toString());
        System.out.println(pay1.toString());
        System.out.println(pay2.toString());
    }
}
