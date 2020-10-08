import java.util.Scanner;
/**
 * Array example
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for user input
    Scanner input = new Scanner(System.in);

    final int NUM_MARKS = 5;

    //create an array with 5 spots
    double[] grades = new double[NUM_MARKS];

    //put the grades in an array using a loop
    for(int i = 0; i < grades.length; i++){
      //put something in the "i" location
      System.out.println("Please enter in grade " + (i + 1));
      grades[i] = input.nextDouble();
    }
    
    //create a variable to store the sum
    double sum = 0;

    //use a for loop to go through the array and add to the sum
    for(int i = 0; i < grades.length; i++){
      //add the grade to sum
      sum += grades[i];
    }

    //determine the average
    double average = sum / NUM_MARKS;

    //tell the user their average
    System.out.println("your average grade is " + average);
  }
}
