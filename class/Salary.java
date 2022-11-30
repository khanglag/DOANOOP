import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary implements InOut {
    static Scanner scanner = new Scanner(System.in);
    private int indexSalary;
    private int someHolidays;
    private double overtime;
    private long totalSalary;

    public Salary() {
    }

    public Salary(int indexSalary,double overtime, int someHolidays, long totalSalary) {
        this.indexSalary = indexSalary;
        this.overtime = overtime;
        this.someHolidays = someHolidays;
        this.totalSalary = totalSalary;
    }

    public int getIndexSalary() {
        return indexSalary;
    }

    public void setIndexSalary(int indexSalary) {
        this.indexSalary = indexSalary;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        System.out.print("==> Enter a number of overtime: ");
        this.overtime = overtime;
    }

    public int getSomeHolidays() {
        return someHolidays;
    }

    public void setSomeHolidays(int someHolidays) {
        System.out.print("==> Enter a number of day-off: ");
        someHolidays = scanner.nextInt();
        this.someHolidays = someHolidays;
    }

    public long getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(long totalSalary) {
        this.totalSalary = totalSalary;
    }

    @Override
    public void input() {
        setSomeHolidays(someHolidays);
    }

    @Override
    public void output() {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        System.out.printf("|  %-20s|  %-20s|  %-20s|", indexSalary, someHolidays,
                formatter.format(totalSalary) + " VND");
        System.out.println();
    }

    public Long payRoll(Long baseSalary, int indexSalary) {
        totalSalary = (long) baseSalary * indexSalary * 30 - someHolidays * baseSalary + (long) (overtime*25000);
        return totalSalary;
    }

    @Override
    public String toString() {
        return indexSalary + "-" + someHolidays + "-" + totalSalary;
    }

}
