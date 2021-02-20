package equilibrium.UnitTesingJava.mock;

import java.math.BigDecimal;

public class SalaryCalculatorService
{
    TaskManagementSystem taskManagementSystem;

    public  SalaryCalculatorService(TaskManagementSystem taskManagementSystem)
    {
        this.taskManagementSystem = taskManagementSystem;
    }
    public BigDecimal calculateSalary(Employee employee)
    {
        int finishedTasks = taskManagementSystem.countFinishedTasksForEmployee(employee);
        BigDecimal bonus = BigDecimal.ZERO;
        if (finishedTasks >= 10 && finishedTasks < 20)
        {
            bonus = new BigDecimal("500");
        } else if (finishedTasks >= 20)
        {
            bonus = new BigDecimal("1000");
        }

        return employee.getBaseSalary().add(bonus);
    }

}
