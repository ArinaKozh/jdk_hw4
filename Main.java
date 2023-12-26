public class Main {
    public static void main(String[] args) {

        EmployeeList dir = new EmployeeList();

        Employee employee1 = new Employee(1,666333,"Dima",5);
        Employee employee2 = new Employee(2,777,"Anna",1);
        Employee employee3 = new Employee(3,987654,"Oleg",7);
        Employee employee4 = new Employee(4,123123,"Dima",5);

        dir.addEmployee(employee1);
        dir.addEmployee(employee2);
        dir.addEmployee(employee3);
        dir.addEmployee(employee4);
        System.out.println(dir);
        System.out.println();

        System.out.println(dir.searchByExperience(5));

        System.out.println();
        System.out.println(dir.searchPhoneNumberByName("Dima"));

        System.out.println();
        System.out.println(dir.searchByServiceNumber(3));

        System.out.println();
        Employee employee5 = new Employee(5,111,"Pavel",10);
        dir.addEmployee(employee5);

        System.out.println(dir);
    }

}