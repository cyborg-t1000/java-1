package hw5;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov", "Cleaner", "a@a.com", "+79011234567", 30000, 39);
        employees[1] = new Employee("Petrov", "CEO", "g@a.com", "+79011234564", 31000, 29);
        employees[2] = new Employee("Sidorov", "Driver", "d@a.com", "+79011254567", 32000, 19);
        employees[3] = new Employee("Smirnov", "Developer", "c@a.com", "+79031234567", 33000, 44);
        employees[4] = new Employee("Putin", "CEO Deputy", "b@a.com", "+79016234567", 30400, 55);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                System.out.println(employees[i].toString());
            }
        }
    }

}
