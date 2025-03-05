public class Employee {
    String name, designation;
    int age;
    double salary;

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Vishnu";
        emp.designation = "Manager";
        emp.age = 17;
        emp.salary = 10000;

        System.out.println("Name: " + emp.name);
        System.out.println("Designation: " + emp.designation);
        System.out.println("Age: " + emp.age);
        System.out.println("Salary: " + emp.salary);
    }
}
