import java.util.Scanner;

public class Squaring {
  
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    int count = 0;
    long SENTINEL = 1000000;
   
    int number = 0;
    
    while(number == 0 || number == 1)
    {
      System.out.println("Please enter an integer greater than 1: ");
      
      while(!scan.hasNextInt())
      {
        String garbage = scan.nextLine();
        System.out.println(garbage + " is not a valid input!\nPlease enter an integer greater than 1: ");
      }
      number = Math.abs( scan.nextInt() );
      scan.nextLine(); 
    } 
    
    double squarePrediction =  Math.log( ( Math.log(1000000) ) / ( Math.log(number) ) ) / Math.log(2)  ;
    int x = (int) Math.ceil(squarePrediction);
    
    System.out.println("I predict that it will take " + x + " squarings to exceed 1 million\n");
    
    int num = number;
    long squaredTotal = num * num;
    
    while(squaredTotal < SENTINEL)
    {
      System.out.println(squaredTotal);
      squaredTotal = squaredTotal * squaredTotal; 
      count++;
    }
    
    count++;
    System.out.println(squaredTotal);
    System.out.println(num + " exceeded 1,000,000 after " + count + " squarings.");
    
  }
}



