package MokitoExamples;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class MokkitoDemo {
    EmployeeService employeeService;
    @Before
    public void setUp() {
        employeeService = Mockito.mock(EmployeeService.class);
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.setEmployeeService(employeeService);
    }
}
