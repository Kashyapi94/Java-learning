public class Specifvalue

{

              public static void main(String args[])

              {

                             int array[]={1,2,3,4,5,6,7,8};

                                           for(int i=0;i<array.length;i++)

                                           {

                                                          System.out.println(i);

                                           }

                             int element=5;

                             boolean result = false;

                             System.out.println("Check if the array contains value 5");

                                           for(int j =0;j<array.length;j++)

                                           {

                                                          if(j==element)

                                                          {

                                                          result = true;

                                                          break;

                                                          }

                                           }

                                           if(result)

                                                          {

                                                                        System.out.println(element+ " is found.");

                                                          }

                                            else

                                                          {

                                                              System.out.println(element+ " is not found.");

                                                          }

              }

}