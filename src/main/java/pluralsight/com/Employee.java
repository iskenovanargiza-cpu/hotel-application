package pluralsight.com;

public class Employee {
    private int employeeId;
    private String named;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String named, String department, double payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.named = named;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getNamed() {
        return named;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getTotalPay() {
        (double regularHours * payRate) +(double overtimeHours * payRate *1.5);

    }
    public double getRegularHours() {
        if (hoursWorked > 40) {
            double regularHours = 40;
        }}
    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            double regularHours = 40;
            double overtimeHours = hoursWorked - regularHours;
            }
        }
}