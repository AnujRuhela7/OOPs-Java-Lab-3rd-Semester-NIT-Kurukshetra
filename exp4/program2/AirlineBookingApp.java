package exp4.program2;

import java.util.Scanner;

public class AirlineBookingApp
{
    private static final boolean[] firstClass = new boolean[5];
    private static final boolean[] economyClass = new boolean[5];

    private static int bookFirstClassTicket()
    {
        int firstClassVacantSeats = getFirstClassVacantSeats();
        if(firstClassVacantSeats > 0)
        {
            firstClass[firstClass.length - firstClassVacantSeats] = true;
            return firstClass.length - firstClassVacantSeats + 1;
        }
        else
        {
            return -1;
        }
    }

    private static int bookEconomyClassTicket()
    {
        int ecoClassVacantSeats = getEconomyClassVacantSeats();
        if(ecoClassVacantSeats > 0)
        {
            economyClass[economyClass.length - ecoClassVacantSeats] = true;
            return economyClass.length - ecoClassVacantSeats + 6;
        }
        else
        {
            return -1;
        }
    }

    private static int getFirstClassVacantSeats()
    {
        int vacantSeats = 0;
        for(boolean isVacant : firstClass)
        {
            if (!isVacant)
                vacantSeats++;
        }
        return vacantSeats;
    }

    private static int getEconomyClassVacantSeats()
    {
        int vacantSeats = 0;
        for(boolean isVacant : economyClass)
        {
            if (!isVacant)
                vacantSeats++;
        }
        return vacantSeats;
    }

    private static void generateBoardingPass(int seatAllocated, String classOpted)
    {
        System.out.println("||  BOARDING  PASS  ||");
        System.out.println("||  SEAT NO.  :  " + seatAllocated + "  ||");
        System.out.println("||  CLASS  :   " + classOpted + "  Class ||");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("||  Welcome to Automated Airline Reservation Application  || \n");
        System.out.println("Booking Choices Available : ");
        System.out.println("1) First Class : " + (getFirstClassVacantSeats() > 0 ? getFirstClassVacantSeats() + " Vacant Seats" : "No Vacant Seat"));
        System.out.println("2) Economy Class : " + (getEconomyClassVacantSeats() > 0 ? getEconomyClassVacantSeats() + " Vacant Seats" : "No Vacant Seat"));


        while(true)
        {
            System.out.print("Enter your choice ( 1 for First Class, 2 for Economy Class, 3 for exiting menu ) : ");
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1 :
                {
                    int seatAllocated = bookFirstClassTicket();
                    if(seatAllocated == -1)
                    {
                        System.out.println("All seats are already reserved in First Class. Reservation not successful!!");
                    }
                    else
                    {
                        generateBoardingPass(seatAllocated, "First");
                    }
                    break;
                }
                case 2 :
                {
                    int seatAllocated = bookEconomyClassTicket();
                    if(seatAllocated == -1)
                    {
                        System.out.println("All seats are already reserved in Economy Class. Reservation not successful!!");
                    }
                    else
                    {
                        generateBoardingPass(seatAllocated, "Economy");
                    }
                    break;
                }
                case 3 :
                {
                    System.exit(0);
                }
                default:
                {
                    System.out.println("Wrong Choice!!!");
                    System.out.println("Please enter again!!!");
                    break;
                }
            }

        }
    }

}