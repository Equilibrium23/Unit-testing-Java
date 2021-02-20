package equilibrium.UnitTesingJava.mock;

import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SalaryCalculatorServiceTest
{
    @Mock
    private TaskManagementSystem taskManagementSystem;

    private String employeeName;
    private BigDecimal employeeBaseSalary;
    private Employee employee;
    private SalaryCalculatorService salaryCalculatorService;


    public SalaryCalculatorServiceTest()
    {
        employeeName = "John";
        employeeBaseSalary = BigDecimal.valueOf(2000);
        employee = new Employee(employeeName,employeeBaseSalary);

    }

    @BeforeAll
    void init() {
        MockitoAnnotations.openMocks(this);
        salaryCalculatorService = new SalaryCalculatorService(taskManagementSystem); ;
    }

    @Test
    public void shouldReturnBasePlus500()
    {
        Mockito.when(taskManagementSystem.countFinishedTasksForEmployee(employee)).thenReturn(15);

        BigDecimal salary = salaryCalculatorService.calculateSalary(employee);

        Assertions.assertEquals(salary,employee.getBaseSalary().add(BigDecimal.valueOf(500)));
    }
    @Test
    public void shouldReturnBasePlus1000()
    {
        Mockito.when(taskManagementSystem.countFinishedTasksForEmployee(employee)).thenReturn(25);

        BigDecimal salary = salaryCalculatorService.calculateSalary(employee);

        Assertions.assertEquals(salary,employee.getBaseSalary().add(BigDecimal.valueOf(1000)));
    }
    @Test
    public void shouldReturnOnlyBase()
    {
        Mockito.when(taskManagementSystem.countFinishedTasksForEmployee(employee)).thenReturn(0);

        BigDecimal salary = salaryCalculatorService.calculateSalary(employee);

        Assertions.assertEquals(salary,employee.getBaseSalary());
    }


}