import java.util.ArrayList;
import java.util.stream.Collectors;

public class EmployeeList {
    ArrayList<Employee> employees;

    public EmployeeList() {
        this.employees = new ArrayList<>();
    }
    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public ArrayList<Employee> searchByExperience(int workExperience){
        ArrayList<Employee> res = employees.stream().filter(employee -> employee.getWorkExperience() == workExperience).collect(Collectors.toCollection(ArrayList::new));
        return  res;
    }
    public ArrayList<Integer> searchPhoneNumberByName(String name){
        ArrayList<Integer> res = new ArrayList<>();
        for (Employee employee : this.employees) {
            if (employee.getName().equals(name)) {
                res.add(employee.getPhoneNumber());
            }
        }
        return res;
    }
    public Employee searchByServiceNumber(int serviceNumber) {
        Employee res = (Employee) employees.stream().filter(employee -> employee.getServiceNumber() == serviceNumber).toArray()[0];
        return  res;
    }

}
