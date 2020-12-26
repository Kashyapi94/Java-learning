public class Avgofarray

{

public static void main(String args[])

{

int array[]={1,2,3,4,5,6,7,8};

int avg=0;

int sum=0;

 

for(int i =0;i<array.length;i++)

{

sum= sum + array[i];

}

avg = sum/array.length;

System.out.println("Average = "+avg);

}

}