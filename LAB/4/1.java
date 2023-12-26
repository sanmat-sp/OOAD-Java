import java.util.Scanner;


public class BikeRental
{
        public static int calculateCharges(int days)
        {
                int charge = 0;
                if(days>0)
                {
                        if(days<=5)
                        {
                                charge = 500 * days;
                        }
                        else if (days<= 10)
                        {
                                charge = (5*500) + ((days-5)*400);
                        }
                        else
                        {
                                charge = (5*500)+(5*400)+((days-10)*200);
                        }
                }
                return charge;
        }

        public static void main(String[] args)
        {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                for(int i=0;i<n;i++)
                {
                        int days = sc.nextInt();
                        int charges=calculateCharges(days);
                        System.out.println(charges);
                }
                sc.close();      
        }
}