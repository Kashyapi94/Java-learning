import java.util.Scanner;

public class Float{

 

   

  public static void main(String[] args)

    {

        Scanner in = new Scanner(System.in);

 

        System.out.print("Input floating-point number: ");

        float x = in.nextFloat();

        System.out.print("Input floating-point another number: ");

        float y = in.nextFloat();

              System.out.println(x);

              System.out.println(y);

    

              if (x == y)

        {

            System.out.println("They are the same up to three decimal japlaces");

        }

        else

        {

            System.out.println("They are different");

        }

    }

}