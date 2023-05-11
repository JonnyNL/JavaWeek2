public class EmployeeTest {
    
    public static void main(String[] args) {
        
        Employee John = new Employee(1, "John", "Weasley", 0);
        Employee James = new Employee(2, "James", "Potter", 0);

        John.setSalary(4500);
        James.setSalary(5000);
        System.out.println(John.getSalary());
        System.out.println(James.getSalary());

        System.out.println(John.getAnnualSalary());
        System.out.println(James.getAnnualSalary());

        John.raiseSalary(20);
        James.raiseSalary(20);
        System.out.println(John.getSalary());
        System.out.println(James.getSalary());
    }
}
