package pluralsight.com;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getNamed() {
        return name;
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
        return getRegularHours() + getOvertimeHours();

    }
    public double getRegularHours() {
        if (hoursWorked < 40) && if (hoursWorked > 40) {
            return 40; }
    }

    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            double regularHours = 40;
            return hoursWorked - regularHours;
            }

}}