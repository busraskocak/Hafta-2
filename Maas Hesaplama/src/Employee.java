public class Employee {
    //Nitelikler
    String name;
    double salary;
    int workHours;
    int hireYears;

    //Constructor Metot
    Employee(String name, double salary, int workHours, int hireYears) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYears = hireYears;
    }

    //Vergi hesaplayan metot
    public double tax() {
        if (this.salary >= 1000) {
            return salary * 0.03; // Çalışanın maaşı 1000'den fazlaysa uygulanacak vergi
        } else {
            return 0.0;
        }
    }

    //Bonus Metot
    public double bonus() {
        int extraHours = this.workHours - 40;  // 40 saatten fazla çalışıyorsa saat başı 30 tl bonus
        if (extraHours > 0) {
            return 30 * extraHours;
        } else {
            return 0.0;
        }
    }

    //Maaş artışı
    public double raiseSalary() {
        int year = 2021 - this.hireYears;
        if (year < 10) {   //10 yıldan az çalışıyorsa %5 zam
            return salary * 0.5;
        } else if (year > 9 && year < 20) { // 9'dan yıldan fazla,20 yıldan az çalışıyorsa %10 zam
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }

    }

    public void toString(Employee employee1) {
        System.out.println("Name :" + employee1.name);
        System.out.println("Salary :" + employee1.salary);
        System.out.println("Work Hours : " + employee1.workHours);
        System.out.println("Hire Years : " + employee1.hireYears);
        System.out.println("Tax : " + employee1.tax());
        System.out.println("Bonus :" + +employee1.bonus());
        System.out.println("Raise Salary : " + employee1.raiseSalary());
        double totalSalary = employee1.salary - employee1.tax() + employee1.bonus();
        System.out.println("Total Salary with bonus and tax :" + totalSalary);
        System.out.println("Total Salary with the raise of salary :" + (employee1.salary + employee1.raiseSalary()));

    }


}
