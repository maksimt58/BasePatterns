package basepatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ITDepartment {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }

    public  void work(){
        System.out.println("It department is work");
        for (Employee employee : employees) {
            employee.doWork();
        }

    }
}
