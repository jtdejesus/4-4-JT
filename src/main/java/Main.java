// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // Create a Scanner object
    System.out.println("Enter the side:");    
    double s = input.nextDouble(); // Use nextDouble() with correct casing
    
   double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6)); 
    
    System.out.printf("The area of the hexagon is %.2f%n", area);

    input.close();
  }
}