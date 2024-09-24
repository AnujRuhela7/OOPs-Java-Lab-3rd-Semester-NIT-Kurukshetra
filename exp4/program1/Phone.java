package exp4.program1;

import java.time.Year;

public class Phone
{
    private String make;
    private String model;
    private int year;

    Phone(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake()
    {
        return make;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public boolean isObsolete()
    {
        int currentYear = Year.now().getValue();
        return (currentYear - this.year) > 10;
    }
}