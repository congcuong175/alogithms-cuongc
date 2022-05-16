public class Bai21calSalary {
    //Bai 21 Đệ qui
    public double calSalary(double salary, int n) {
        if (n == 0) {
            return salary;
        }
        return calSalary(salary * 1.1, n - 1);
    }

    //Bai 21 Không đệ qui
    public double calSalary2(double salary, int n) {
        for (int i = 0; i < n; i++) {
            salary *= 1.1;
        }
        return salary;
    }
}
