package Class2;

public class Employee {
    public String name;
    public double salary;
    private int workHours, hireYear;

    Employee(int hireYear, int workHours, double salary, String name) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary >= 1000) {
            return salary * 0.03;
        }
        return 0.0;
    }

    public double bonus() {
        int extraHours = this.workHours - 40;
        if (extraHours > 0) {
            return 30 * extraHours;
        }
        return 0.0;
    }

    public double incrase() {
        int year = 2024 - hireYear;
        if (year < 10) {
            return salary * 0.05;
        } else if (year >= 10 && year < 20) {
            return salary * 0.1;
        } else {
            return salary * 0.15;
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Tax: " + tax() + "\n" +
                "Bonus: " + bonus() + "\n" +
                "Increase Salary: " + incrase() + "\n" +
                "Total Salary: " + (salary - tax() + bonus()) + "\n" +
                "Total Salary with the raise of salary: " + (salary + incrase());
    }
}
