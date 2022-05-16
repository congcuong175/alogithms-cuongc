public class Bai22calMonth {
    //Bai 22
    public int calMonth(double money, double rate, int n) {
        double tongtien = money * Math.pow((1 + rate), n);
        if (tongtien - money > money) {
            return n;
        }
        return calMonth(money, rate, n + 1);
    }

    //Bai 22 Không đệ qui
    public int calMonth2(double money, double rate) {
        int n = 0;
        double tongtien = 0;
        while (tongtien - money < money) {
            n++;
            tongtien = money * Math.pow((1 + rate), n);

        }
        return n;
    }
}
