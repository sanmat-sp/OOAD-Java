
import java.util.Scanner;

public class Main
{
        public static void main(String[] args)
        {
                Scanner input = new Scanner(System.in);
                int N = input.nextInt();
                for(int i=1;i<=N;i++)
                {
                        String shape = input.next();
                        int radius = input.nextInt();
                        int height = input.nextInt();
                        if(shape.equals("CYLINDER"))
                        {
                                Cylinder c = new Cylinder(radius, height);
                                System.out.println((int) Math.ceil(c.area())+" "+(int)Math.ceil(c.volume()));
                        }
                        else if(shape.equals("CONE"))
                        {
                                Cone c = new Cone(radius, height);
                                System.out.println((int) Math.ceil(c.area())+ " "+(int)Math.ceil(c.volume()));
                              
                        }
                }
        }
}

class Circle
{
        protected int radius;
        
        public Circle(int radius)
        {
                this.radius = radius;
        }

        public double area()
        {
                return 3.14 * radius * radius;
        }
}

class Cylinder extends Circle
{
        protected int height;
        public Cylinder(int radius, int height)
        {
                super(radius);
                this.height = height;
        }

        @Override
        public double area()
        {
                return 2 * super.area() + 2 * 3.14 * radius * height;
        }

        public double volume()
        {
                double volume = 3.14 * radius * radius * height;
                return volume;
        }
}

class Cone extends Circle
{
        protected int height;
        public Cone(int radius, int height)
        {
                super(radius);
                this.height = height;
        }

        public double area()
        {
                return 3.14 * radius * (radius + Math.sqrt(height*height + radius*radius));
        }

        public double volume()
        {
                double volume = 3.14 * radius * radius * height/3.0;
                return volume;
        }
}