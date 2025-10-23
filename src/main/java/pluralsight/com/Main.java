package pluralsight.com;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Employee employee = new Employee(12,"Pikachu","fo",100,0);
        employee.punchIn(8.00);
//        Thread.sleep(10000);
        employee.punchOut(9.00);
        System.out.println(employee.getRegularHours());
        
    }

}
