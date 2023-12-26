import java.util.Scanner;
class Car
{
        public String make;
        public String model;
        
        public Car(String make, String model)
        {
                this.make = make;
                this.model = model;
        }

        public String drive()
        {
                return "The car is being driven.";
        
        }
}

class Sedan extends Car
{
        private String color;

        public Sedan(String make, String model, String color)
        {
                super(make, model);
                this.color = color;
        }

        @Override
        public String drive()
        {
                return String.format("The %s sedan %s %s is being driven", color, super.make, super.model);
        }
}

class SUV extends Car
{
        private String capacity;

        public SUV(String make, String model, String capacity)
        {
                super(make, model);
                this.capacity = capacity;
        }

        @Override
        public String drive()
        {
                return String.format("The %s %s SUV with %s seating capacity is being driven", super.make, super.model, capacity);
        }
}

public class Main
{
        public static void main(String[] args)
        {
                Scanner input = new Scanner(System.in);
                int n = input.nextInt();
                input.nextLine();
                for(int i=0;i<n;i++)
                {
                        String[] tokens = input.nextLine().split(" ");
                        String carType = tokens[0];
                        String make = tokens[1];
                        String model = tokens[2];
                        String param = tokens[3];
                        Car car;
                        if(carType.equals("sedan"))
                        {
                                car = new Sedan(make, model, param);
                        }
                        else
                        {
                                car = new SUV(make, model, param);
                        }
                        System.out.println(car.drive());
                }
                input.close();
        }
}