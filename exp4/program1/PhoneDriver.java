package exp4.program1;

public class PhoneDriver
{
    public static void main(String[] args)
    {
        Phone phone1 = new Phone("Apple", "iPhone X", 2017);
        Phone phone2 = new Phone("Samsung", "Galaxy S10", 2019);
        Phone phone3 = new Phone("Nokia", "Nokia 3310", 2000);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3 + "\n");

        System.out.println(phone1.getModel() + " is obsolete: " + phone1.isObsolete());
        System.out.println(phone2.getModel() + " is obsolete: " + phone2.isObsolete());
        System.out.println(phone3.getModel() + " is obsolete: " + phone3.isObsolete() + "\n");

        phone1.setYear(2010);
        System.out.println("Updated " + phone1.getModel() + " year to " + phone1.getYear());
        System.out.println(phone1.getModel() + " is now obsolete: " + phone1.isObsolete() + "\n");
    }
}