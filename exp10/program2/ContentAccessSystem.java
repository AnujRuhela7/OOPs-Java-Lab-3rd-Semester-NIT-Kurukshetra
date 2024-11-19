package exp10.program2;

public class ContentAccessSystem
{
    public void checkAgeForContent(String contentName, int userAge, int requiredAge) throws AgeRestrictionException
    {
        if (userAge < requiredAge)
        {
            throw new AgeRestrictionException("Access denied - You must be at least " + requiredAge + " years old to view '" + contentName + "'.");
        }
        else
        {
            System.out.println("Access granted! Enjoy watching '" + contentName + "'.");
        }
    }

    public static void main(String[] args)
    {
        ContentAccessSystem system = new ContentAccessSystem();

        System.out.println("Test Case 1: User meets the age requirement");
        try
        {
            system.checkAgeForContent("18+ Movie", 20, 18); // User age is 20, required age is 18
        }
        catch (AgeRestrictionException e)
        {
            System.err.println(e.getMessage());
        }

        System.out.println("\nTest Case 2: User does not meet the age requirement");
        try
        {
            system.checkAgeForContent("18+ Movie", 16, 18); // User age is 16, required age is 18
        }
        catch (AgeRestrictionException e)
        {
            System.err.println(e.getMessage());
        }

        System.out.println("\nTest Case 3: User meets a higher age requirement");
        try
        {
            system.checkAgeForContent("21+ Show", 25, 21); // User age is 25, required age is 21
        }
        catch (AgeRestrictionException e)
        {
            System.err.println(e.getMessage());
        }

        System.out.println("\nTest Case 4: User does not meet a higher age requirement");
        try
        {
            system.checkAgeForContent("21+ Show", 19, 21); // User age is 19, required age is 21
        }
        catch (AgeRestrictionException e)
        {
            System.err.println(e.getMessage());
        }
    }
}