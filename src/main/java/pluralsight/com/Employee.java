package pluralsight.com;
import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name, department;
    private double payRate, hoursWorked, startTime;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.startTime = 0.0;

    }

    public double getTotalPay() {
        double regularPay = this.payRate * this.getRegularHours();

        double overtimePay = (this.payRate * 1.5) * this.getOvertimeHours();

        return regularPay + overtimePay;

    }
    public double getRegularHours() {
        if (this.hoursWorked <= 40) {
            return this.hoursWorked;
        } else {
            return 40;
        }
    }

    public double getOvertimeHours() {
            if (this.hoursWorked > 40) {
                return this.hoursWorked - 40;
            } else {
                return 0;
            }
    }
    public void punchIn(double aTime) {
        this.startTime= aTime;
    }
    public void punchOut(double bTime) {
        double hoursWorkShift = bTime - startTime;
        hoursWorked += hoursWorkShift;
    }
    public void punchIn() {
        LocalDateTime startTime = LocalDateTime.now();
        int hour = startTime.getHour();
        double min = startTime.getMinute();
        double sec = startTime.getSecond();
        double decimalMin  = min / 60;
        double decimalSec = sec / 3600;
        double decimalTime = hour + decimalMin + decimalSec;
        this.startTime = decimalTime;
        System.out.println(this.startTime);
    }
    public void punchOut() {
        LocalDateTime clockOutTime = LocalDateTime.now();
        int hour = clockOutTime.getHour();
        double min = clockOutTime.getMinute();
        double sec = clockOutTime.getSecond();
        double decimalMin  = min / 60;
        double decimalSec = sec/ 3600;
        double decimalTime = hour + decimalMin + decimalSec;
        double hoursWorkShift = decimalTime - startTime;
        hoursWorked += hoursWorkShift;
        System.out.println(decimalTime);
    }


}