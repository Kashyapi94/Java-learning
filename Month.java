import java.util.Scanner;

public class Month

{

public static void main(String[] args)

{

Scanner x = new Scanner(System.in);

System.out.println("Enter any month: ");

String mon = x.nextLine();

 

switch(mon)

{

case "January":

              System.out.println("31 days");

              break;

case "February":

              System.out.println("28 days");

              break;

case "March":

              System.out.println("31 days");

              break;

case "April":

              System.out.println("30 days");

              break;

case "May":

              System.out.println("31 days");

              break;

case "June":

              System.out.println("30 days");

              break;

case "July":

              System.out.println("31 days");

              break;

case "August":

              System.out.println("31 days");

              break;

case "September":

              System.out.println("30 days");

              break;

case "October":

              System.out.println("31 days");

              break;

case "November":

              System.out.println("30 days");

              break;

case "December":

              System.out.println("31 days");

              break;

 

}

 

}

}

 