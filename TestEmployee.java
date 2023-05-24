public class TestEmployee {
    
    public static void main(String[] args) {
        
        Employee John = new Employee(1, "John", "Weasley", 0);
        Employee James = new Employee(2, "James", "Potter", 0);

        John.setSalary(4500);
        James.setSalary(5000);
        System.out.println(" ");
        System.out.println("John's Salary: $" + John.getSalary());
        System.out.println("James's Salary: $" + James.getSalary());

        System.out.println(" ");
        System.out.println("John's Annual Salary: $" + John.getAnnualSalary());
        System.out.println("James's Annual Salary: $" + James.getAnnualSalary());

        John.raiseSalary(20);
        James.raiseSalary(20);
        System.out.println(" ");
        System.out.println("John's Salary after 20% raise: $" + John.getSalary());
        System.out.println("John's Salary after 20% raise: $" + James.getSalary());
        System.out.println(" ");
    }
}
