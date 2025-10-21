package pluralsight.com;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Employee employee = new Employee(12,"Pikachu","fo",100,10);
        employee.punchIn();
        Thread.sleep(10000);
        employee.punchOut();
        System.out.println(employee.getRegularHours());
        
    }

}
