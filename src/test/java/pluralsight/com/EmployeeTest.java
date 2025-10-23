package pluralsight.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void punchIn_shows_employee_start_time() {
        //arrange
        double time  = 8.00;
        Employee employeeTest = new Employee(12,"Pikachu","fo",100,0);

        //act
        employeeTest.punchIn(8.00);
        //assert
        assertEquals(time,time);

    }

    @Test
    void punchOut_shows_employee_end_time() {
        //arrange
        double time = 12.00;
        Employee employeeTest = new Employee(12,"Pikachu","fo",100,0);
        //act
        employeeTest.punchOut(12.00);
        //assert
        double hours = employeeTest.getRegularHours();
        assertEquals(time,hours);

    }
}