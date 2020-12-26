import java.util.*;

class Largest

{

              public static void main(String[] args)

              {

                             Scanner x = new Scanner(System.in);

                             Scanner y = new Scanner(System.in);

                             Scanner z = new Scanner(System.in);

 

                             System.out.println("Please enter any 3 numbers: ");

 

                             int input1 = x.nextInt();

                             int input2 = y.nextInt();

                             int input3 = z.nextInt();

 

                                           if(input1 > input2 & input1 > input3)

                                           {

                                                          System.out.println("The largest number is "+input1);

                                           }

                                           else if(input2 > input1 & input2 > input3)

                                           {

                                                          System.out.println("The largest number is "+input2);

                                           }

                                           else

                                           {

                                                          System.out.println("The largest number is "+input3);

                                           }

              }

}