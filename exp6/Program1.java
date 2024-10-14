package exp6;
import java.util.Calendar;

class MyDate
{
    private int year;
    private int month;
    private int day;

    public MyDate()
    {
        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    // Constructor with elapsed time since January 1, 1970
    public MyDate(long elapsedTime)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(elapsedTime);
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    // Constructor with specified year, month, and day
    public MyDate(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear()
    {
        return year;
    }

    public int getMonth()
    {
        return month;
    }

    public int getDay()
    {
        return day;
    }

    // Method to set a new date using elapsed time
    public void setDate(long elapsedTime)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(elapsedTime);
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
    }
}

public class Program1
{
    public static void main(String[] args)
    {
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);

        System.out.println("Date 1:");
        System.out.println("Year: " + date1.getYear());
        System.out.println("Month: " + (date1.getMonth() + 1)); // 0-based to 1-based
        System.out.println("Day: " + date1.getDay());

        System.out.println("\nDate 2:");
        System.out.println("Year: " + date2.getYear());
        System.out.println("Month: " + (date2.getMonth() + 1)); // 0-based to 1-based
        System.out.println("Day: " + date2.getDay());
    }
}